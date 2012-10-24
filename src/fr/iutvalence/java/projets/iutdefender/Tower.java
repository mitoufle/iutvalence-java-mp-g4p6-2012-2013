package fr.iutvalence.java.projets.iutdefender;

// FIXME détailler le commentaire
/**
 * la classe tour.
 * 
 * @author lamif
 * 
 */
public class Tower
{

	/**
	 * la cadence de tir d'une tour.
	 */
	private int rate;

	/**
	 * les degats par tirs d'une tour.
	 */
	private int damage;

	/**
	 * la portée d'une tour.
	 */
	private int range;

	/**
	 * le prix d'une tour.
	 */
	private int cost;

	// FIXME écrire un commentaire
	public Tower(int rate, int damage, int range, int cost)
	{
		super();
		this.rate = rate;
		this.damage = damage;
		this.range = range;
		this.cost = cost;
	}

	// FIXME add method(s)
}
