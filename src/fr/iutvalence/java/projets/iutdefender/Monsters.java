package fr.iutvalence.java.projets.iutdefender;


// FIXME détailler le commentaire
/**
 * la classe monstre
 * @author lamif
 *
 */
// FIXME renommer la classe (elle ne représente qu'un seul monstre)
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


	// FIXME écrire un commentaire
	public int getHP()  {  
		return hP;
	}
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	public int getshield()
	{
		return shield;
	}
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	public int getmovespd()
	{
		return moveSpeed;
	} 
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	public int getantHP()  {  
		return antHP;
	}
	
	// FIXME écrire un commentaire
	public int getloot()  {  
		return loot;
	}

	// FIXME écrire un commentaire
	public void setHP(int mHP)  {  
		hP = mHP;
	}
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	public void setshield(int mshield)
	{
		shield = mshield;
	}

	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	public void setmovespd(int mmovespd)
	{
		moveSpeed=mmovespd;
	} 
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	public void setantHP(int mantHP)  {  
		antHP=mantHP;
	}

	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture
	public void setloot(int mloot)  {  
		loot=mloot;
	}
	
	
	// FIXME déplacer la définition des constructeurs avant celle des autres méthodes
	// FIXME respecter les conventions d'écriture (paramètres)
	public Monsters(int hP, int shield, int movespd, int antHP, int damage,
			int loot) {
		super();
		this.hP = hP;
		this.shield = shield;
		this.moveSpeed = movespd;
		this.antHP = antHP;
		this.loot = loot;
	}
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture (méthode, paramètres)
	// FIXME visibilité ?
	void initmonstre(Monsters M, Map T){
		while ( != )
	}
	
	// FIXME écrire un commentaire
	// FIXME respecter les conventions d'écriture (paramètres)
	// FIXME visibilité ?
	void bouger(Monsters M, Map T){
		
	}

	// FIXME redéfinir toString
}
