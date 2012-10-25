package fr.iutvalence.java.projets.iutdefender;

/**
 * La classe Map représente une carte sur laquelle les tours seront construites et les monstres se déplaceront.
 * 
 * @author lamif
 * 
 */
public class Map
{
	

	// FIXME (FIXED) redéfinir l'ensemble des constantes sous la forme d'une enumeration "ElementMap"
	
	// FIXME (FIXED)ajouter des accesseeurs en lecture sur la taille de la map
	
	/**
	 * Un acceseur de la longueur Y de la map
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
	 * tableau bidimensionel représentant la carte. le 0,0 est en table[0][0]
	 */
	private ElementMap[][] table;

	// FIXME compléter le commentaire
	/**
	 * @param table
	 *            Le tableau correspondant à la map
	 */
	public Map(ElementMap[][] table)
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

				if (this.table[i][j] == ElementMap.CHEMIN)
				{
					res = res + "| |";
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
	 * @throws CoordInvalideException soulève l'exception quand les coordonnées entrés dépassent les limites de la map.
	 */
	// FIXME gérer les débordements avec une exception
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
	// FIXME gérer les débordements avec une exception
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
				if (this.table[i][j] == ElementMap.DEPART)
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
				if (this.table[i][j] == ElementMap.ARRIVE)
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
