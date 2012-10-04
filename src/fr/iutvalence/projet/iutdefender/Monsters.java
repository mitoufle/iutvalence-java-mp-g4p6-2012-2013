// FIXME rename package
package fr.iutvalence.projet.iutdefender;



/**
 * @author lamif
 *la classe monstre
 */
public class Monsters {

	/**
	 * Les points de vie actuels du monstre.
	 */
	private int hP;

	/**
	 *l'armure du monstre qui permet d'annuler une partie des dégats des tours.
	 */
	private int shield;

	
	/**
	 * La vitesse de déplacement du monstre.
	 */
	private int moveSpeed;

	
	/**
	 * Les points de vie qu'il est prévu que le monstre perde.
	 */
	private int antHP;

	
	/**
	 * L'argent que donne le monstre à sa mort.
	 */
	private int loot;


	public int getHP()  {  
		return hP;
	}
	public int getshield()
	{
		return shield;
	}
	public int getmovespd()
	{
		return moveSpeed;
	} 
	public int getantHP()  {  
		return antHP;
	}
	public int getloot()  {  
		return loot;
	}


	public void setHP(int mHP)  {  
		hP = mHP;
	}
	public void setshield(int mshield)
	{
		shield = mshield;
	}

	public void setmovespd(int mmovespd)
	{
		moveSpeed=mmovespd;
	} 
	public void setantHP(int mantHP)  {  
		antHP=mantHP;
	}

	public void setloot(int mloot)  {  
		loot=mloot;
	}
	public Monsters(int hP, int shield, int movespd, int antHP, int damage,
			int loot) {
		super();
		this.hP = hP;
		this.shield = shield;
		this.moveSpeed = movespd;
		this.antHP = antHP;
		this.loot = loot;
	}


	// FIXME add method(s)
}
