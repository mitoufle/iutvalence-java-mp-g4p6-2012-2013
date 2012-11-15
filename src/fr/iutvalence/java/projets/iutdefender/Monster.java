package fr.iutvalence.java.projets.iutdefender;


/**
 * la classe monstre définie les caractéristiques du monstre.
 * 
 * @author lamif
 * 
 */
public class Monster
{

	private static int nbM;
	
	/**
	 * Les points de vie actuels du monstre.
	 */
	private int hP;

	/**
	 * l'armure du monstre qui permet d'annuler une partie des dégats des tours.
	 */
	private int shield;

	/**
	 * La vitesse de déplacement du monstre.
	 */
	private int moveSpeed;

	/**
	 * Les points de vie qu'il est prévu que le monstre perde.
	 */
	//private int antHP;

	/**
	 * L'argent que donne le monstre à sa mort.
	 */
	private int loot;

	
	/**
	 * les coordonnées du monstre.
	 */
	private Coordonnee c;


	// FIXME compléter le commentaire (dire à quoi ressemble l'objet créé)
	/**
	 * Constructeur de la classe Monstre.
	 * 
	 * @param hP
	 *            Les points de vie actuels du monstre.
	 * @param shield
	 *            l'armure du monstre qui permet d'annuler une partie des dégats des tours.
	 * @param moveSpd
	 *            La vitesse de déplacement du monstre.
	 * @param damage
	 *            L'argent que donne le monstre à sa mort.
	 * @param loot
	 *            L'argent que donne le monstre à sa mort.
	 * @param c 
	 * 			  Les coordonnées du monstre.
	 */
	public Monster(int hP, int shield, int moveSpd, int damage, int loot, Coordonnee c)
	{
		super();
		this.hP = hP;
		this.shield = shield;
		this.moveSpeed = moveSpd;
		this.loot = loot;
		this.c = c;
		Monster.nbM = Monster.nbM + 1;
	}

	/**
	 * Accesseur de l'attribut HP
	 * 
	 * @return Les points de vie actuels du monstre.
	 */
	public int getHP()
	{
		return this.hP;
	}

	/**
	 * Accesseur de l'attribut shield
	 * 
	 * @return l'armure du monstre qui permet d'annuler une partie des dégats des tours.
	 */
	public int getShield()
	{
		return this.shield;
	}

	/**
	 * Accesseur de l'attribut moveSpeed
	 * 
	 * @return La vitesse de déplacement du monstre.
	 */
	public int getMoveSpd()
	{
		return this.moveSpeed;
	}

	/**
	 * Accesseur de l'attribut antHP
	 * 
	 * @return Les points de vie qu'il est prévu que le monstre perde.
	 */
//	public int getAntHP()
//	{
//		return this.antHP;
//	}

	/**
	 * Accesseur de l'attribut loot
	 * 
	 * @return L'argent que donne le monstre à sa mort.
	 */
	public int getLoot()
	{
		return this.loot;
	}

	/**
	 * Accesseur de l'attribut c
	 * 
	 * @return Coordonnées du monstre sur la Map.
	 */
	public Coordonnee getC()
	{
		return this.c;
	}
	/**
	 * Pour modifier les points de vie actuels du monstre
	 * 
	 * @param mHP
	 *            Les points de vie mis à jour du monstre.
	 */
	public void setHP(int mHP)
	{
		this.hP = mHP;
	}

	/**
	 * Pour modifier l'armure d'un monstre
	 * 
	 * @param mShield
	 *            L'armure mise à jour du monstre
	 */
	// FIXME respecter les conventions d'écriture
	public void setshield(int mShield)
	{
		this.shield = mShield;
	}

	/**
	 * Pour modifier la vitesse de déplacement du monstre
	 * 
	 * @param mMoveSpd
	 *            La vitesse de déplacement mise à jour du monstre
	 */
	// FIXME respecter les conventions d'écriture
	public void setmovespd(int mMoveSpd)
	{
		this.moveSpeed = mMoveSpd;
	}

	/**
	 * Pour modifier les points de vie anticipés du monstre.
	 * 
	 * @param mAntHP
	 *            Les points de vie anticipés mis à jour du monstre.
	 */
//	public void setAntHp(int mAntHP)
//	{
//		this.antHP = mAntHP;
//	}

	/**
	 * Pour modifier l'argent que donne le monstre à sa mort
	 * 
	 * @param mLoot
	 *            l'argent que donne le monstre à sa mort mis a jour
	 */
	public void setLoot(int mLoot)
	{
		this.loot = mLoot;
	}

	/**
	 * Pour modifier les coordonnées du monstre.
	 * 
	 * @param c
	 *            les coordonnées x du monstre mise à jour.
	 */
	public void setC(Coordonnee c)
	{
		this.c = c;
	}
	

	/**
	 * Permet de déplacer le monstre sur une Map.
	 * 
	 * @param m
	 *            la Map.
	 */
	public void bouger(Map m)
	{

	}

	// FIXME redéfinir toString
}
