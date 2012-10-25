package fr.iutvalence.java.projets.iutdefender;

/**
 * La classe Map représente une carte sur laquelle les tours seront construites et les monstres se déplaceront.
 * 
 * @author lamif
 * 
 */
public class Map
{

	
	// FIXME redéfinir l'ensemble des constantes sous la forme d'une enumeration "ElementMap"
	/**
	 * Entier qui represente une parcelle constructible dans le tableau.
	 */
	public final static int CONSTRUCTIBLE = 0;

	/**
	 * Entier qui represente une parcelle de chemin dans le tableau.
	 */

	private final static int CHEMIN = 10;

	/**
	 * Entier qui represente une parcelle de chemin occupée par un monstre dans le tableau.
	 */

	private final static int CHEMINOCCUPE = 11;

	/**
	 * Entier qui represente le départ dans le tableau.
	 */

	private final static int DEPART = 2;

	/**
	 * Entier qui represente l'arrivée dans le tableau.
	 */

	private final static int ARRIVE = 3;

	/**
	 * Entier qui represente une tour dans le tableau.
	 */

	private final static int TOUR = 4;

	// FIXME ajouter des accesseeurs en lecture sur la taille de la map

	/**
	 * tableau bidimensionel représentant la carte. le 0,0 est en table[0][0]
	 */
	private int[][] table;

	// FIXME compléter le commentaire
	/**
	 * @param table
	 *            Le tableau correspondant à la map
	 */
	public Map(int[][] table)
	{
		super();
		this.table = table;
	}

	// FIXME ajouter un constructeur sans paramètre créant une map vide

	// FIXME écrire un commentaire
	public String toString()
	{

		String res = "";
		String cases = "|__|";

		for (int i = 0; i < this.table.length; i++)
		{
			res = res + "\n";
			for (int j = 0; j < this.table[0].length; j++) // lignes
			{

				if (this.table[i][j] == CHEMIN)
				{
					res = res + "| |";
				}
				else if (this.table[i][j] == CHEMINOCCUPE)
				{
					res = res + "| |";
				}
				else if (this.table[i][j] == DEPART)
				{
					res = res + "^^^";
				}
				else if (this.table[i][j] == ARRIVE)
				{
					res = res + "~~~";
				}
				else if (this.table[i][j] == CONSTRUCTIBLE)
				{
					res = res + cases;
				}
				else if (this.table[i][j] == TOUR)
				{
					res = res + " ŦŦ ";
				}
			}
		}

		return res;
	}

	/**
	 * méthode permettant d'obtenir le contenu d'une case de la grille
	 * 
	 * @param x
	 *            coordonnée en X
	 * @param y
	 *            coordonnée en Y
	 * @return un entier correspondant à l'element présent dans la case.
	 */
	// FIXME gérer les débordements avec une exception
	public int contenuCase(int x, int y)
	{
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
	 */
	// FIXME gérer les débordements avec une exception
	public void modifierCase(int x, int y, int contenu)
	{
		this.table[x][y] = contenu;
	}

	/**
	 * méthode permettant de rechercher les coordonnées du DEPART.
	 * 
	 * @return un tableau a deux éléments : les coordonnées x et y de la case départ.
	 */
	// FIXME si c'est important de le localiser, il faut en faire un attribut
	public int[] chercherDepart()
	{
		int[] coord =
			{ -1, -1 };
		for (int i = 0; i < this.table.length; i++)
		{
			for (int j = 0; j < this.table[0].length; j++)
			{
				if (this.table[i][j] == DEPART)
				{
					coord[0] = i;
					coord[1] = j;
					return coord;
				}
			}
		}
		return coord;
	}

	/**
	 * méthode permettant de rechercher les coordonnées de L'ARRIVE.
	 * 
	 * @return un tableau a deux éléments : les coordonnées x et y de la case arrivée.
	 */
	// FIXME si c'est important de le localiser, il faut en faire un attribut
	public int[] chercherArrivee()
	{
		int[] coord =
			{ -1, -1 };
		for (int i = 0; i < this.table.length; i++)
		{
			for (int j = 0; j < this.table[0].length; j++)
			{
				if (this.table[i][j] == ARRIVE)
				{
					coord[0] = i;
					coord[1] = j;
					return coord;
				}
			}
		}
		return coord;
	}
}
