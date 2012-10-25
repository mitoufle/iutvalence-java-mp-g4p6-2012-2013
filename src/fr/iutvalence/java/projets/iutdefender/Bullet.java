
package fr.iutvalence.java.projets.iutdefender;


// FIXME (FIXED)compléter le commentaire (donner des détails sur ce qu'est un projectile)
/**
 * la classe projectile. C'est l'objet qui est créé une fois que la tour a tirée.
 * cet objet se déplace jusqu'au monstre qu'il cible pour lui infliger des degats. 
 * @author lamif
 *
 */
//FIXME (FIXED) renommer la classe (elle ne représente qu'un seul projectile)
public class Bullet {

	/**
	 * la vitesse du projectile.
	 */
	// FIXME (FIXED) la vitesse d'un projectile change t'elle après sa création ?
	//La vitesse d'un objet ne change pas apres sa création mais tous les projectiles
	//n'ont pas la même vitesse.
	private int speed;
	
	
	/**
	 * La cible du projectile. 
	 */
	private Monster target;

	/**
	 * Constructeur de la classe Bullet.
	 * @param speed la vitesse du projectile.
	 * @param target la cible du projectile. 
	 */
	public Bullet(int speed, Monster target) {
		super();
		this.speed = speed;
		this.target = target;
	}

	/**
	 * Accesseur de l'atribut Speed.
	 * @return 
	 */
	public int getSpeed() {
		return speed;
	}

	/** 
	 * Accesseur de la classe cible.
	 * @return
	 */
	public Monster getTarget() {
		return target;
	}

	
	
	
	
	
	// FIXME (FIXED)ajouter un accesseur en lecture pour l'attribut
	
	// FIXME (FIXED)redéfinir toString
	
	public String toString(){
		return "un projectile X de vitesse "+speed+" qui vise un monstre.";
	}
}