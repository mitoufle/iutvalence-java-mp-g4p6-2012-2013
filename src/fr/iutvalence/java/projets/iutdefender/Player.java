package fr.iutvalence.java.projets.iutdefender;

// FIXME détailler le commentaire
/**
 * classe joueur
 * 
 * @author lamif
 * 
 */
public class Player
{

	/**
	 * argent courant du joueur.
	 */
	private int money;

	/**
	 * nombre de vies que possède un joueur.
	 */
	private int lives;

	// FIXME écrire un commentaire
	/**
	 * Constructeur de la classe Player
	 * @param money l'argent que possède le joueur
	 * @param lives le nombre de vies que possède le joueur
	 */
	public Player(int money, int lives) {
		super();
		this.money = money;
		this.lives = lives;
	}

	
	
	/**
	 * @return retourne l'argent du joueur
	 */
	public int getMoney()
	{
		return this.money;
	}

	/**
	 * @param cout prix a payer
	 * @throws ArgentInsuffisant soulève l'exception quand le joueur n'a pas assez d'argent.
	 */
	public void payer(int cout) throws ArgentInsuffisant
	{
		if (this.money <  0)
		{
			throw new ArgentInsuffisant();
		}
		this.money -= cout;
		
	}

	/**
	 * 
	 * @param gain ajoute de l'argent au joueur
	 */
	
	public void gagnerArgent(int gain)
	{
		this.money += gain;
		
	}


	/**
	 * @return retourne les points de vie du joueur
	 */
	public int getLives()
	{
		return this.lives;
	}

	/**
	 * setter de l'atribut lives
	 * @param lives les vies du joueur
	 */
	
	public void setLives(int lives)
	{
		this.lives = lives;
	}




	
	// FIXME add method(s)

}
