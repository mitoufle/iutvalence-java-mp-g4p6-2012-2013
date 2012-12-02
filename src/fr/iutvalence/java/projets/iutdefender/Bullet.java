
package fr.iutvalence.java.projets.iutdefender;

import java.util.ArrayList;

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
	private Coordonnee cBullet;

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
		this.cBullet = c;
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
			ArrayList<DirectionMap> table = this.cBullet.chemin(this.target.getC());
			for (int i = 0; i < table.size(); i++)
			{
				if (this.target != null)
				{
					switch (table.get(i))
					{
						case BAS:					this.cBullet.setY(this.cBullet.getY() - RAF); 												break;
						case GAUCHE:				this.cBullet.setX(this.cBullet.getX() + RAF); 												break;
						case DROITE: 				this.cBullet.setX(this.cBullet.getX() - RAF); 												break;
						case DIAGHAUTGAUCHE: 		this.cBullet.setY(this.cBullet.getY() + RAF); this.cBullet.setX(this.cBullet.getX() + RAF); break;
						case DIAGHAUTDROITE: 		this.cBullet.setY(this.cBullet.getY() + RAF); this.cBullet.setX(this.cBullet.getX() - RAF); break;
						case DIAGBASGAUCHE: 		this.cBullet.setX(this.cBullet.getX() + RAF); this.cBullet.setY(this.cBullet.getY() - RAF); break;
						case DIAGBASDROITE: 		this.cBullet.setX(this.cBullet.getX() - RAF); this.cBullet.setY(this.cBullet.getY() - RAF); break;
						default: 					this.cBullet.setY(this.cBullet.getY() + RAF);												break;
					}

				
				this.target.perdreHP(this.damage);
				this.target = null;
				}
			}
		}
	}


	public String toString(){
		return "un projectile X de vitesse "+this.speed+" qui vise un monstre.";
	}
}
