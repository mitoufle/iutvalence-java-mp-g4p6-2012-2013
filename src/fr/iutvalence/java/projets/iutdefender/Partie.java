package fr.iutvalence.java.projets.iutdefender;

import java.util.ArrayList;

/**
 * La classe partie dans laquelle vont intervenir nos algorithme de déroulement du jeu.
 * 
 * @author lamif - chevalgu
 * 
 */
public class Partie
{

	// FIXME refléchir au attributs qui doivent être finaux
	/**
	 * Le nombre de monstre qui doivent apparaître
	 */
	private final static int NBM = 5;

	/**
	 * le nombre de monstres qui sont morts au cours d'une partie.
	 */
	private int MonstresMorts;
	/**
	 *  Une arrayList qui contient les tours présentes dans la partie
	 */
	private ArrayList <Tower> aLTower = new ArrayList<Tower>();
	/**
	 * Une arrayList qui contient les monstres vivants présents dans la partie
	 */
	private ArrayList <Monster> aLMonster = new ArrayList<Monster>();
	/**
	 * La map sur laquelle sont placés les tours et les monstres
	 */
	public Map table;

	/**
	 * le joueur
	 */
	private Player p1;

	/**
	 * 
	 * Le constructeur de partie. Une partie est une succession de vagues de monstres
	 * sur une map.
	 * 
	 * @param table
	 *            La Map.
	 * @param p1
	 *            Le joueur.
	 * @param aLM
	 * 			  Une arraylist de monstres
	 * @param aLT
	 * 			  Une arraylist de tours
	 */
	public Partie(Map table, Player p1, ArrayList<Monster> aLM, ArrayList<Tower> aLT)
	{
		super();
		this.table = table;
		this.p1 = p1;
		this.aLMonster = aLM;
		this.aLTower = aLT;
	}


	/**
	 * démarre une partie d'IUT defender. créé les monstres et la fait avancer, fait tirer les tours, fait perdre de la vie aux monstres
	 */
	public void demarrer()
	{

		int cptavmonstre = 0;
		long timer = System.currentTimeMillis(); //création d'un timer initialisé 
		int i = 0; // variable qui va permettre de mettre le bon nombre de monstre sur la map
		while (this.p1.getLives() > 0 && this.MonstresMorts < NBM)
		{
			if (System.currentTimeMillis() >= timer + 100) //la boucle s'excuteras toutes les 5 millisecondes.
			{
				cptavmonstre++;
				timer = System.currentTimeMillis(); // si la boucle s'est efectué, on met a jour le timer
				System.out.println("bla " + this.aLMonster.size());
				System.out.println("bla " + this.toString());		
				if (cptavmonstre == 5)
				{
					avanceMonstres();
					cptavmonstre = 0;

					if (i < NBM) // On rajoute des monstres sur la case départ tant qu'il n'y en a pas le nombre voulu.
					{
						this.aLMonster.add(new Monster(100, 2, 1, 1, 30, this.table.depart));
						i++;
					}
				}
				tirerTour();
				avanceTousLesProjectiles();
				for (int a = 0; a< this.aLMonster.size(); a++)
				{
					if (this.aLMonster.get(a).getHP() <= 0)
					{
						this.aLMonster.remove(a);
						this.MonstresMorts++;
					}
				}
			}

			//scruter les commandes clavier
		}
	}

	/**
	 * getter de l'attribut aLMonster
	 * @return l'arraylist de monstres
	 */
	public ArrayList<Monster> getALMonster()
	{
		return this.aLMonster;
	}

	/**
	 * fait tirer toutes les tours.
	 */
	public void tirerTour()
	{
		for (int k = 0; k < this.aLTower.size(); k++) // boucle pour faire cibler et tirer les tours
		{
			for(int l = 0; l< this.aLMonster.size();l++)
		
			{			
				this.aLTower.get(k).tirer(this.aLTower.get(k).choisirCible(this.aLMonster)); // les tours essaient de tirer
			}
		}
	}

	/**
	 * 
	 */
	public void avanceTousLesProjectiles()
	{
		for (int i = 0; i < this.aLTower.size();i++)
		{
			this.aLTower.get(i).avanceProjectiles();
		}
	}

	/**
	 * Methode qui avance tous les monstres et les fait mourir.
	 */
	public void avanceMonstres()
	{
		for (int j=0; j < this.aLMonster.size();j++ )
		{
			if (this.aLMonster.get(j).getHP() <= 0)
			{
				this.aLMonster.remove(j);
			}
			Coordonnee cm = this.aLMonster.get(j).getC();
			if (cm.equals(this.table.arrive))
			{
				this.p1.perdreHP(this.aLMonster.get(j).getDamage());
				this.aLMonster.remove(j);
				this.MonstresMorts++;
			}

			else
			{
				this.aLMonster.get(j).avancer(this.table);	
			}
		}
	}


	/**
	 * Permet de poser une nouvelle tour sur la map
	 * @param x la coordonnée x de la tour à poser
	 * @param y la coordonnée y de la tour à poser
	 * @throws CoordInvalideException soulève l'exception quand les coordonnées entrés dépassent les limites de la map.
	 * @throws CaseNonModifiable soulève l'exception quand la case en question n'est pas modifiable
	 * @throws ArgentInsuffisant soulève l'exception quand le joueur n'a pas assez d'argent.
	 */
	public void creerTour (int x, int y) throws CoordInvalideException, CaseNonModifiable,  ArgentInsuffisant
	{
		this.table.modifierCase(x, y, ElementMap.TOUR);
		this.p1.payer(100);
	}

	public String toString()
	{
		String res = "";
		String cases = "|__|";

		for (int i = 0; i < this.table.getTable().length; i++)
		{
			Boolean monstresurcase = false;
			res = res + "\n";
			for (int j = 0; j < this.table.getTable()[0].length; j++) // lignes
			{


				if (this.table.getTable()[i][j] == ElementMap.CHEMIN)
				{
					if (this.aLMonster.size() != 0)
					{
						Coordonnee cTable = new Coordonnee(j, i);
						for (int k = 0; k < this.aLMonster.size(); k++)
						{
							Coordonnee coormonstre = this.aLMonster.get(k).getC();
							if (coormonstre.equals(cTable))
							{
								res = res + "|m|";
								monstresurcase = true;
							}
						}
						if (monstresurcase == false)
						{ 
							if (this.table.getTable2()[i][j] == DirectionMap.HAUT) res = res + "|^|";
							else if (this.table.getTable2()[i][j] == DirectionMap.BAS) res = res + "|!|";
							else if (this.table.getTable2()[i][j] == DirectionMap.GAUCHE) res = res + "|<|";
							else res = res + "|>|";
						}
					}
					else
					{
						if (this.table.getTable2()[i][j] == DirectionMap.HAUT) res = res + "|^|";
						else if (this.table.getTable2()[i][j] == DirectionMap.BAS) res = res + "|!|";
						else if (this.table.getTable2()[i][j] == DirectionMap.GAUCHE) res = res + "|<|";
						else res = res + "|>|";
					}
				}
				else if (this.table.getTable()[i][j] == ElementMap.DEPART)
				{
					
					res = res + "^^^";
				}
				else if (this.table.getTable()[i][j] == ElementMap.ARRIVE)
				{
					res = res + "~~~";
				}
				else if (this.table.getTable()[i][j] == ElementMap.CONSTRUCTIBLE)
				{
					res = res + cases;
				}
				else if (this.table.getTable()[i][j] == ElementMap.TOUR)
				{
					res = res + " TT ";
				}
			}
		}


		return res+"\n";
	}

}


