package fr.iutvalence.java.projets.iutdefender;

/**
 * @author lamif
 *
 */
public class Coordonnee
{
	/**
	 * la composante X de la coordonnée (abscisse)
	 */
	private int x;
	/**
	 * la composante Y de la coordonnée (ordonnée)
	 */
	private int y;
	
	
	
	
	
	/**
	 * Constructeur de la classe Coordonnée
	 * @param x l'abscisse
	 * @param y l'ordonnée
	 */
	public Coordonnee(int x, int y)
	{
		super();
		this.setX(x);
		this.setY(y);
	}


	/**
	 * accesseur de la composante x de la coordonnée
	 * @return l'abscisse x 
	 */
	public int getX()
	{
		return this.x;
	}
	
	
	/**
	 * setter de l'abscisse x de la coordonnée
	 * @param x l'abscisse x
	 */
	public void setX(int x)
	{
		this.x = x;
	}


	/**
	 * accesseur de la composante y de la coordonnée
	 * @return l'ordonnée y
	 */
	public int getY()
	{
		return this.y;
	}


	/**
	 * setter de l'abscisse y de la coordonnée
	 * @param y l'ordonnée y 
	 */
	public void setY(int y)
	{
		this.y = y;
	}
	
	/**
	 * La methode equals de Coordonée
	 * @param c la coordonnée à comparer
	 * @return true si les objets sont les mêmes
	 */
	public boolean equals(Coordonnee c)
	{
		int cx = c.getX();
		int cy = c.getY();
		if (this.x == cx && this.y == cy) return true;
		else return false;
	}
	public String toString()
	{
		String res = "";
		res = res + "("+this.x+","+this.y+")";		
		return res;
	}
}
