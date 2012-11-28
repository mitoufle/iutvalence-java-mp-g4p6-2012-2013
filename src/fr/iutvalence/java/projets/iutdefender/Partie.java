package fr.iutvalence.java.projets.iutdefender;

import java.util.ArrayList;
import java.util.Calendar;

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
		//Calendar rightNow = Calendar.getInstance(); //creation d'un Calendar
		//long timer = rightNow.getTimeInMillis(); //création d'un timer initialisé 

		Coordonnee cfaux = new Coordonnee (0,0); 
		Monster mfaux = new Monster(0, 0, 0, 0, 0, cfaux); //création d'un monstre vide correspondant à une absence de cible
		int i = 0; // variable qui va permettre de mettre le bon nombre de monstre sur la map
		int go = 0;
		while (go < 20)
		{
			//	if (rightNow.getTimeInMillis() >= timer + 5) //la boucle s'excuteras toutes les 5 millisecondes.
			{
				go++;
				System.out.println("bla " + this.aLMonster.size());
				System.out.println("bla " + this.toString());
				if (this.aLMonster.size() == 0 && i < NBM)
				{
					i++;
					this.aLMonster.add(new Monster(100, 2, 1, 1, 30, this.table.depart)); //si il n'y a aucun monstre, on un crée un et on l'ajoute à l'arrayList
				}
				else //sinon on fait avancer les monstres
				{
					for (int j=0; j < this.aLMonster.size();j++ )
					{
						Coordonnee cm = this.aLMonster.get(j).getC();
						if (cm.equals(this.table.arrive))
						{
							this.p1.perdreHP(this.aLMonster.get(j).getDamage());
							this.aLMonster.remove(j);
						}

						else
						{
							avancer(this.aLMonster.get(j));	
						}
					}
					if ( i < NBM) // On rajoute des monstres sur la case départ tant qu'il n'y en a pas le nombre voulu.
					{
						this.aLMonster.add(new Monster(100, 2, 1, 1, 30, this.table.depart));
						i++;
					}
				}

				for (int k = 0; k < this.aLTower.size(); k++) // boucle pour faire cibler et tirer les tours
				{
					Monster m = this.aLTower.get(k).choisirCible(this);
					if (m.equals(mfaux))
						; // si la tour n'a pas de cible, il ne se passe rien
					else
						this.aLTower.get(k).tirer(this); // sinon elle crée un projectile
				}

				//	timer = rightNow.getTimeInMillis(); // si la boucle s'est efectué, on met a jour le timer
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
	 * Permet de déplacer le monstre
	 * 
	 * @param mo
	 *            le Monstre.
	 */
	public void avancer(Monster mo)
	{
		if (this.table.directionCase(mo.getC()) == DirectionMap.HAUT) mo.tourneHaut();
		else if (this.table.directionCase(mo.getC()) == DirectionMap.BAS) mo.tourneBas();
		else if (this.table.directionCase(mo.getC()) == DirectionMap.DROITE) mo.tourneDroite();
		else mo.tourneGauche();
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


