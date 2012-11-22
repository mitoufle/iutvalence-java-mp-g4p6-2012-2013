
package fr.iutvalence.java.projets.iutdefender;

/**
 * la classe projectile. C'est l'objet qui est créé une fois que la tour a tirée.
 * cet objet se déplace jusqu'au monstre qu'il cible pour lui infliger des degats. 
 * @author lamif
 *
 */
public class Bullet{

	
	/**
	 * la vitesse du projectile.
	 */

	//La vitesse d'un objet ne change pas apres sa création mais tous les projectiles
	//n'ont pas la même vitesse.
	// FIXME (FIXED)alors déclarer l'attribut en final (même réflexions pour damage)
	private final int speed;
	
	
	/**
	 * dégats du projeoctile.
	 */
	private final int damage;
	
	
	/**
	 * La cible du projectile. 
	 */
	private final Monster target;

	/**
	 * Constructeur de la classe Bullet.
	 * @param speed la vitesse du projectile.
	 * @param damage les dégats du projectile.
	 * @param target la cible du projectile. 
	 */
	public Bullet(int speed, int damage, Monster target) 
	{
		super();
		this.speed = speed;
		this.damage = damage;
		this.target = target;
	}

	/**
	 * accesseur de l'attribut damage.
	 * @return les degats occasionnés par le projectile
	 */
	public int getDamage()
	{
		return this.damage;
	}
	
	
	
	
	/**
	 * Accesseur de l'atribut Speed.
	 * @return la vitesse du projectile
	 */
	public int getSpeed() 
	{
		return this.speed;
	}

	/** 
	 * Accesseur de la classe cible.
	 * @return la cible du projectile
	 */
	public Monster getTarget() 
	{
		return this.target;
	}
	
	public String toString(){
		return "un projectile X de vitesse "+this.speed+" qui vise un monstre.";
	}
}
