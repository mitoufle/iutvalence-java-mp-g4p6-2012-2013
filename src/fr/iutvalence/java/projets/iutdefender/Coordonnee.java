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
		this.x = x;
		this.y = y;
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
	
	public String toString()
	{
		String res = "";
		res = res + "("+this.x+","+this.y+")";		
		return res;
	}

	
	
	
	
	@Override public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof Coordonnee) {
            Coordonnee that = (Coordonnee) other;
            result = (this.getX() == that.getX() && this.getY() == that.getY());
        }
        return result;
    }

    @Override public int hashCode() {
        return (41 * (41 + getX()) + getY());
    }
	
}
