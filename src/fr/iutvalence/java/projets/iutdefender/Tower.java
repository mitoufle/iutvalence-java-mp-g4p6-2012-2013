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
	 * @param range portée de tir de la tour
	 * @param cost prix de la tour
	 * @param c les Coordonnés de la tour
	 */
	public Tower(int rate, int range, int cost, Coordonnee c) {
		super();
		this.rate = rate;
		this.range = range;
		this.cost = cost;
		this.c = c;
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
	 * @param p une partie 
	 * @return la cible du projectile
	 */
	// FIXME (FIXED)add method(s)
	
	public Monster choisirCible(Partie p)
	{
		Coordonnee c = new Coordonnee(0,0);
		Monster m = new Monster(0 ,0 ,0 ,0 ,0 , c);
		for(int i = 0;i < p.getALMonster().size();i++)
		{
			int mx = p.getALMonster().get(i).getC().getX();
			int my = p.getALMonster().get(i).getC().getY();
			for (int rx = 1; rx<this.range;rx++)
			{
				for (int ry = 1; ry< this.range;ry++)
				{
					Coordonnee cm = new Coordonnee(mx,my);
					Coordonnee ct = new Coordonnee(rx,ry);
					if (cm.equals(ct)) return m = p.getALMonster().get(i);
				}
			}
		}
		return m;
	}
	
	/**
	 * creer un nouveau projectile sur une cible Monstre.
	 * @param p une partie
	 */
	public void tirer(Partie p)
	{
		this.aLProjectile.add(new Bullet(10, 5 ,this.choisirCible(p)));
	}
	public String toString()
	{
		String res = "";
		res = res + "|__| range:"+ this.range +"\n";
		res = res + " ||  rate: "+this.rate+"\n";
		res = res + "-/\\- Coordonnées:"+this.c+"\n";
		return res;
	}
}

