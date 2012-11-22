package fr.iutvalence.java.projets.iutdefender;

import java.util.ArrayList;


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
	 * l'ArrayList de projectile de la tour.
	 */
	private ArrayList  <Bullet> aLProjectile = new ArrayList<Bullet>();
	
	/**
	 * la cadence de tir d'une tour.
	 */
	private int rate;

	/**
	 * la portée d'une tour.
	 */
	private int range;

	/**
	/**
	 * le prix d'une tour.
	 */
	private int cost;
	
	/**
	 * les coordonnées d'une tour.
	 */
	private Coordonnee c; 
	
	// FIXME (F	public static Bullet tabBullet[];IXED)écrire un commentaire
	/**
	 * Constructeur de la classe Tower
	 * @param rate cadance de tir de la tour
	 * @param damage degats de la tour à chaques tirs
	 * @param range portée de tir de la tour
	 * @param cost prix de la tour
	 */
	public Tower(int rate, int damage, int range, int cost) {
		super();
		this.setRate(rate);
		this.setRange(range);
		this.setCost(cost);
	}

	/**
	 * Constructeur sans paramètre de la classe Tower.
	 * Crée une tour de rate 5, de range 4 et d'un cout de 100.
	 */
	public Tower() {
		super();
		this.setRate(5);
		this.setRange(4);
		this.setCost(100);
	}

	/**
	 * setter de l'attribut rate
	 * @param rate la cadence de génération de projectiles de la tour
	 */
	public void setRate(int rate)
	{
		this.rate = rate;
	}

	
	/**
	 * setter de l'attribut range
	 * @param range la portée de la tour
	 */
	public void setRange(int range)
	{
		this.range = range;
	}

	
	/**
	 * accesseur le l'attribut c.
	 * @return les coordonnées de la tour.
	 */
	public Coordonnee getC()
	{	
		return this.c;
	}


	/**
	 * setter de l'attribut c.
	 * @param c 
	 * 			les coordonnées de la tour.
	 */
	public void setC(Coordonnee c)
	{
		this.c = c;
	}
	


	
	
	
	/**
	 * setter de l'attribut cost
	 * @param cost le prix de la tour
	 */
	public void setCost(int cost)
	{
		this.cost = cost;
	}

	/**
	 * @return la cible du projectile
	 */
	// FIXME (FIXED)add method(s)
	
	public Monster choisirCible()
	{
		Coordonnee c = new Coordonnee(1,1);
		Monster m = new Monster(10 ,12 ,4 ,5 ,4 , c);
		return m;
	}
	
	/**
	 * creer un nouveau projectile sur une cible Monstre.
	 */
	public void tirer()
	{
		this.aLProjectile.add(new Bullet(10, 5 ,this.choisirCible()));
	}
}

