
package fr.iutvalence.java.projets.iutdefender;

/**
 * la classe projectile. C'est l'objet qui est créé une fois que la tour a tirée.
 * cet objet se déplace jusqu'au monstre qu'il cible pour lui infliger des degats. 
 * @author lamif
 *
 */
/**
 * @author lamif
 *
 */
public class Bullet{


	/**
	 * la vitesse du projectile.
	 */

	//La vitesse d'un objet ne change pas apres sa création mais tous les projectiles
	//n'ont pas la même vitesse.
	private final static int RAF = 1;

	/**
	 * la vitesse du projectile
	 */
	private final int speed;

	/**
	 * dégats du projeoctile.
	 */
	private final int damage;


	/**
	 * La cible du projectile. 
	 */
	private Monster target;

	/**
	 * l'attribut coordonnée de la classe classe bullet.
	 */
	private Coordonnee c;

	/**
	 * Constructeur de la classe Bullet.
	 * @param speed la vitesse du projectile.
	 * @param damage les dégats du projectile.
	 * @param target la cible du projectile. 
	 * @param c Les coordonnées de la bullet
	 */
	public Bullet(int speed, int damage, Monster target, Coordonnee c) 
	{
		super();
		this.speed = speed;
		this.damage = damage;
		this.target = target;
		this.c = c;
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

	/**
	 * permet à un projectile de se déplacer vers sa cible et de lui infliger des degats
	 */
	public void atteindreCible()
	{
		if (this.target != null)
		{
			if (this.c.getX() > this.target.getC().getX()) 
			{ 
				this.c.setX(this.c.getX() - RAF);
			}
			else if (this.c.getX() == this.target.getC().getX());
			else this.c.setX(this.c.getX()+RAF);

			if (this.c.getY() > this.target.getC().getY())
			{

				this.c.setY(this.c.getY()-RAF);
			}
			else if (this.c.getY() == this.target.getC().getY());
			else this.c.setY(this.c.getY()+RAF);

			if (this.c.getX() == this.target.getC().getX() && this.c.getY() == this.target.getC().getY())
			{
				this.target.perdreHP(this.damage);
				if (this.target.getHP() <= 0)
				{
					this.target = null;
				}
			}
		}
	}


	public String toString(){
		return "un projectile X de vitesse "+this.speed+" qui vise un monstre.";
	}
}
