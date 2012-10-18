
package fr.iutvalence.java.projets.iutdefender;


// FIXME compléter le commentaire (donner des détails sur ce qu'est un projectile)
/**
 * la classe projectile.
 * @author lamif
 *
 */
//FIXME renommer la classe (elle ne représente qu'un seul projectile)
public class Bullets {

	/**
	 * la vitesse du projectile.
	 */
	// FIXME la vitesse d'un projectile change t'elle après sa création ?
	private int speed;
	
	
	/**
	 * La cible du projectile. 
	 */
	private Monsters target;

	public Bullets(int speed, Monsters target) {
		super();
		this.speed = speed;
		this.target = target;
	}
	
	
	
	
	
	// FIXME ajouter un accesseur en lecture pour l'attribut
	
	// FIXME redéfinir toString
	

}
