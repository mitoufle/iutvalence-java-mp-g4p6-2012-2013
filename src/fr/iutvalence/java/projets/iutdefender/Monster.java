package fr.iutvalence.java.projets.iutdefender;


/**
 * la classe monstre définie les caractéristiques du monstre.
 * 
 * @author lamif
 * 
 */
public class Monster
{

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
	private int antHP;

	/**
	 * L'argent que donne le monstre à sa mort.
	 */
	private int loot;

	// FIXME utiliser le type Coordonnee
	/**
	 * Coordonnée X du monstre sur la Map.
	 */
	private int x;

	/**
	 * Coordonnée Y du monstre sur la Map.
	 */
	private int y;

	// FIXME compléter le commentaire
	/**
	 * Constructeur de la classe Monstre.
	 * 
	 * @param hP
	 *            Les points de vie actuels du monstre.
	 * @param shield
	 *            l'armure du monstre qui permet d'annuler une partie des dégats des tours.
	 * @param moveSpd
	 *            La vitesse de déplacement du monstre.
	 * @param antHP
	 *            Les points de vie qu'il est prévu que le monstre perde.
	 * @param damage
	 *            L'argent que donne le monstre à sa mort.
	 * @param loot
	 *            L'argent que donne le monstre à sa mort.
	 * @param x
	 *            Coordonnée X du monstre sur la Map.
	 * @param y
	 *            Coordonnée Y du monstre sur la Map.
	 */
	public Monster(int hP, int shield, int moveSpd, int antHP, int damage, int loot, int x, int y)
	{
		super();
		this.hP = hP;
		this.shield = shield;
		this.moveSpeed = moveSpd;
		this.antHP = antHP;
		this.loot = loot;
		this.x = x;
		this.y = y;
	}

	/**
	 * Accesseur de l'attribut HP
	 * 
	 * @return Les points de vie actuels du monstre.
	 */
	public int getHP()
	{
		return hP;
	}

	/**
	 * Accesseur de l'attribut shield
	 * 
	 * @return l'armure du monstre qui permet d'annuler une partie des dégats des tours.
	 */
	public int getShield()
	{
		return shield;
	}

	/**
	 * Accesseur de l'attribut moveSpeed
	 * 
	 * @return La vitesse de déplacement du monstre.
	 */
	public int getMoveSpd()
	{
		return moveSpeed;
	}

	/**
	 * Accesseur de l'attribut antHP
	 * 
	 * @return Les points de vie qu'il est prévu que le monstre perde.
	 */
	public int getAntHP()
	{
		return antHP;
	}

	/**
	 * Accesseur de l'attribut loot
	 * 
	 * @return L'argent que donne le monstre à sa mort.
	 */
	public int getLoot()
	{
		return loot;
	}

	/**
	 * Accesseur de l'attribut x
	 * 
	 * @return Coordonnée X du monstre sur la Map.
	 */
	public int getX()
	{
		return x;
	}

	/**
	 * Accesseur de l'attribut y
	 * 
	 * @return Coordonnée Y du monstre sur la Map.
	 */
	public int getY()
	{
		return y;
	}

	/**
	 * Pour modifier les points de vie actuels du monstre
	 * 
	 * @param mHP
	 *            Les points de vie mis à jour du monstre.
	 */
	public void setHP(int mHP)
	{
		hP = mHP;
	}

	/**
	 * Pour modifier l'armure d'un monstre
	 * 
	 * @param mShield
	 *            L'armure mise à jour du monstre
	 */
	// FIXME (FIXED)écrire un commentaire
	// FIXME (FIXED)respecter les conventions d'écriture
	public void setshield(int mShield)
	{
		shield = mShield;
	}

	/**
	 * Pour modifier la vitesse de déplacement du monstre
	 * 
	 * @param mMoveSpd
	 *            La vitesse de déplacement mise à jour du monstre
	 */
	// FIXME (FIXED)écrire un commentaire
	// FIXME (FIXED)respecter les conventions d'écriture
	public void setmovespd(int mMoveSpd)
	{
		moveSpeed = mMoveSpd;
	}

	/**
	 * Pour modifier les points de vie anticipés du monstre.
	 * 
	 * @param mAntHP
	 *            Les points de vie anticipés mis à jour du monstre.
	 */
	// FIXME (NOT FIXED) respecter les conventions d'écriture
	public void setAntHP(int mAntHP)
	{
		antHP = mAntHP;
	}

	/**
	 * Pour modifier l'argent que donne le monstre à sa mort
	 * 
	 * @param mLoot
	 *            l'argent que donne le monstre à sa mort mis a jour
	 */
	public void setLoot(int mLoot)
	{
		loot = mLoot;
	}

	/**
	 * Pour modifier la coordonée x du monstre.
	 * 
	 * @param x
	 *            la coordonée x du monstre mise à jour.
	 */
	public void setX(int x)
	{
		this.x = x;
	}

	/**
	 * Pour modifier la coordonée y du monstre.
	 * 
	 * @param y
	 *            la coordonée y du monstre mise à jour.
	 */
	public void setY(int y)
	{
		this.y = x;
	}

	/**
	 * Permet de déplacer le monstre sur une Map.
	 * 
	 * @param m
	 *            la Map.
	 */
	// FIXME (FIXED)respecter les conventions d'écriture (paramètres)
	public void bouger(Map m)
	{

	}

	// FIXME redéfinir toString
}
