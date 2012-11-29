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
	private ArrayList<Bullet> aLProjectile = new ArrayList<Bullet>();
	
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
	 * @return l'array list de bullet attaché a une tour
	 */
	public ArrayList<Bullet> getaLProjetcile()
	{
		return this.aLProjectile;
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
	 * Permet à une tour de choisir une cible
	 * @param aLM une arraylist de monstres
	 * @return la cible du projectile
	 */
	// FIXME (FIXED) il vaudrait mieux passer en paramètres les monstres plutot que la partie
	public Monster choisirCible(ArrayList<Monster> aLM)
	{
		Coordonnee c = new Coordonnee(0,0);
		Monster m = new Monster(0 ,0 ,0 ,0 ,0 , c);
		for(int i = 0; i < aLM.size();i++)
		{
			int mx = aLM.get(i).getC().getX();
			int my = aLM.get(i).getC().getY();
			for (int rx = 0; rx<this.range;rx++)
			{
				for (int ry = 0; ry< this.range;ry++)
				{
					Coordonnee coorMonstre = new Coordonnee(mx,my);
					Coordonnee coordCaseVerifiee = new Coordonnee(this.getC().getX()+rx, this.getC().getY()+ry);
					if (coorMonstre.equals(coordCaseVerifiee)) return m = aLM.get(i);
				}
			}
		}
		//FIXME retourner null
		return m;
	}
	
	/**
	 * creer un nouveau projectile sur une cible Monstre.
	 * @param aLM une arraylist de monstres
	 */
	public void tirer(ArrayList<Monster> aLM)
	{
		Coordonnee c = new Coordonnee(0,0);
		Monster m = new Monster(0 ,0 ,0 ,0 ,0 , c);
		if (!this.choisirCible(aLM).equals(m))
		{
			this.aLProjectile.add(new Bullet(10, 100, this.choisirCible(aLM), this.c));
			for (int a = 0; a < this.aLProjectile.size(); a++)
			{
				if (this.aLProjectile.get(a).getTarget() == null)
				{
					this.aLProjectile.remove(a);
				}
			}

		}
	}	

	/**
	 * fait avancer tous les projectiles d'une tour.
	 */
	public void avanceProjectiles()
	{
		for (int i = 0; i < this.aLProjectile.size(); i++)
		{
			this.aLProjectile.get(i).atteindreCible();
		}
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

