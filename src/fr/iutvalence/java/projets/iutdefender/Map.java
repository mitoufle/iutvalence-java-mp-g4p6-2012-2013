package fr.iutvalence.java.projets.iutdefender;


/**
 * La classe Map représente une carte sur laquelle les tours seront construites et les monstres se déplaceront.
 * 
 * @author lamif
 * 
 */
public class Map
{
	/**
	 * taille standard de la map en X.
	 */
	private final static int TAILLEMAPX = 3;
	/**
	 * taille standard de la map en Y.
	 */
	private final static int TAILLEMAPY = 10;
	
	/**
	 * le tableau des bidimensionel des directions.
	 */
	private DirectionMap[][] table2;
	/**
	 * tableau bidimensionel représentant la carte. le 0,0 est en table[0][0]
	 */
	private ElementMap[][] table;
	/**
	 * Coordonnées de la case départ.
	 */
	public final Coordonnee depart;
	/**
	 * Coordonnée de la case arrivée.
	 */
	public final Coordonnee arrive;
	/**
	 * Un accesseur de la longueur Y de la map
	 * @return la longueur Y de la map
	 */
	public int getLongueurY()
	{
		return this.table.length;
		
	}
	
	/**
	 * Un acceseur de la largeur X de la map
	 * @return la largeur X de la map
	 */
	public int getLargeurX()
	{
		return this.table[0].length;
	}

	
	/**
	 * Constructeur de la classe Map
	 * @param table
	 *            Le tableau correspondant à la map et contenant des ElementMap
	 * @param table2
	 * 			  Le tableau de direction de la map
	 */
	public Map(ElementMap[][] table, DirectionMap[][] table2)
	{
		super();
		this.table = table;
		this.table2 = table2;		
		this.arrive = new Coordonnee(-1,-1);
		for (int i = 0; i < this.table.length; i++)
		{
			for (int j = 0; j < this.table[0].length; j++)
			{
				if (this.table[i][j] == ElementMap.ARRIVE)
				{
					this.arrive.setX(j);
					this.arrive.setY(i);
				}
			}
		}
		this.depart  = new Coordonnee(-1,-1);
		for (int i = 0; i < this.table.length; i++)
		{
			for (int j = 0; j < this.table[0].length; j++)
			{
				if (this.table[i][j] == ElementMap.DEPART)
				{
					this.depart.setX(j);
					this.depart.setY(i);
				}
			}
		}
	}


	/**
	 * constructeur permetant de creer une map vide
	 * @param dep les coordonnées de la case départ
	 * @param arr les coordonnées de la case arrivé
	 */
	public Map(Coordonnee dep, Coordonnee arr)
	{
		super();
		this.table = new ElementMap[TAILLEMAPY][TAILLEMAPX];
		this.table2 = new DirectionMap[TAILLEMAPY][TAILLEMAPX];
		this.depart = dep;
		this.arrive = arr;
	}

	
	
	
	
	
	
	
	/**
	 * getter de l'atribut table
	 * @return la table
	 */
	public DirectionMap[][] getTable2()
	{
		return this.table2;
	}

	/**
	 * getter de l'atribut table2
	 * @return la table2
	 */
	public ElementMap[][] getTable()
	{
		return this.table;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{

		String res = "";
		String cases = "|__|";

		for (int i = 0; i < this.table.length; i++)
		{
			res = res + "\n";
			for (int j = 0; j < this.table[0].length; j++) // lignes
			{

				if (this.table[i][j] == ElementMap.CHEMIN)
				{
					if (this.table2[i][j] == DirectionMap.HAUT) res = res + "|^|";
					else if (this.table2[i][j] == DirectionMap.BAS) res = res + "|!|";
					else if (this.table2[i][j] == DirectionMap.GAUCHE) res = res + "|<|";
					else res = res + "|>|";
				}
				else if (this.table[i][j] == ElementMap.DEPART)
				{
					res = res + "^^^";
				}
				else if (this.table[i][j] == ElementMap.ARRIVE)
				{
					res = res + "~~~";
				}
				else if (this.table[i][j] == ElementMap.CONSTRUCTIBLE)
				{
					res = res + cases;
				}
				else if (this.table[i][j] == ElementMap.TOUR)
				{
					res = res + " TT ";
				}
			}
		}

		return res+"\n";
	}

	
	/**
	 * @param c les Coordonnées de la case
	 * @return la direction dans la case
	 */
	public DirectionMap directionCase(Coordonnee c)
	{
		int x = c.getX();
		int y = c.getY();
		return this.table2[y][x];
	}
	
	
	/**
	 * méthode permettant d'obtenir le contenu d'une case de la grille
	 * 
	 * @param x
	 *            coordonnée en X
	 * @param y
	 *            coordonnée en Y
	 * @return l'element présent dans la case.
	 * @throws CoordInvalideException soulève l'exception quand les coordonnées entrés dépassent les limites de la map.
	 */
	public ElementMap contenuCase(int x, int y) throws CoordInvalideException
	{
		if ((x > this.table[0].length)||(y > this.table.length))
		{
			throw new CoordInvalideException();
		}
		return this.table[x][y];
	}

	/**
	 * méthode permettant de modifier le contenu d'une case de la grille
	 * 
	 * @param x
	 *            coordonnée en X
	 * @param y
	 *            coordonnée en Y
	 * @param contenu
	 *            : élément qu'on souhaite introduire dans la case.
	 * @throws CoordInvalideException soulève l'exception quand les coordonnées entrés dépassent les limites de la map.
	 * @throws CaseNonModifiable soulève une exception lorsque la case séléctionné n'est pas modifiable.
	 */

	public void modifierCase(int x, int y, ElementMap contenu) throws CoordInvalideException, CaseNonModifiable
	{
		if ((x > this.table[0].length)||(y > this.table.length))
		{
			throw new CoordInvalideException();
		}
		if (this.table[x][y] == ElementMap.CONSTRUCTIBLE)
		{
			this.table[x][y] = contenu;	
		}
		else throw new CaseNonModifiable();
	}
}
