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
	 * Le nombre de monstre présents 
	 */
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
	 * Le nombre de points de vie retiré au joueur.
	 */
	private int damage;
	/**
	 * La vitesse de déplacement du monstre.
	 */
	private int moveSpeed;
	/**
	 * L'argent que donne le monstre à sa mort.
	 */
	private final int loot;

	
	/**
	 * les coordonnées du monstre.
	 */
	private Coordonnee c;


	// FIXME (FIXED)compléter le commentaire (dire à quoi ressemble l'objet créé)
	/**
	 * Constructeur de la classe Monstre. Un monstre est un objet mobile dont l'objectif 
	 * sera d'atteindre une certaine case de la map (ARRIVE) pour infliger des dégats 
	 * au joueur.
	 * 
	 * @param hP
	 *            Les points de vie actuels du monstre.
	 * @param shield
	 *            l'armure du monstre qui permet d'annuler une partie des dégats des tours.
	 * @param moveSpd
	 *            La vitesse de déplacement du monstre.
	 * @param damage
	 * 			  les degats d'un monstre
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
		this.damage = damage;
		this.c = c;
		Monster.nbM = Monster.nbM + 1;
	}

	/**
	 * crée un monstre et le place sur la case départ. 
	 * @param dep les coordonnées de depart de la Map de partie.
	 */
	public Monster(Coordonnee dep){
		this.hP = 50;
		this.shield = 2;
		this.moveSpeed = 1;
		this.loot = 30;
		this.damage = 1;
		this.c = dep;
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

	/**		Bullet a = new Bullet(10, 5 ,this.choisirCible());
	 * l'accesseur de l'attribut damage.
	 * @return les dégats occasionnés par le monstre.
	 */
	public int getDamage()
	{
		return this.damage;
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
	 * Accesseur de l'attribut loot		Bullet a = new Bullet(10, 5 ,this.choisirCible());
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
	 * Pour retirer des points de vie au monstre
	 * 
	 * @param HP
	 *            Les points de vie que va perdre.
	 */
	public void perdreHP(int HP)
	{
		this.hP -= HP;
	}

	/**
	 * Pour modifier l'armure d'un monstre
	 * 
	 * @param mShield
	 *            L'armure mise à jour du monstre
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	public void setShield(int mShield)
	{
		this.shield = mShield;
	}

	/**
	 * Pour modifier la vitesse de déplacement du monstre
	 * 
	 * @param mMoveSpd
	 *            La vitesse de déplacement mise à jour du monstre
	 */
	// FIXME (FIXED)respecter les conventions d'écriture
	public void setMoveSpd(int mMoveSpd)
	{
		this.moveSpeed = mMoveSpd;
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
	 * modifi les coordonnées d'un monstre de sorte qu'il tourne en haut
	 */
	public void tourneHaut()
	{
		int x = this.c.getX();
		int y = this.c.getY();
		Coordonnee c = new Coordonnee(x,y + 1);
		this.setC(c);
	}
	
	/**
	 * modifi les coordonnées d'un monstre de sorte qu'il tourne en bas
	 */
	public void tourneBas()
	{
		int x = this.c.getX();
		int y = this.c.getY();
		Coordonnee c = new Coordonnee(x,y - 1);
		this.setC(c);
	}
	
	/**
	 * modifi les coordonnées d'un monstre de sorte qu'il tourne à gauche
	 */
	public void tourneGauche()
	{
		int x = this.c.getX();
		int y = this.c.getY();
		Coordonnee c = new Coordonnee(x - 1,y);
		this.setC(c);
	}
	
	/**
	 * modifi les coordonnées d'un monstre de sorte qu'il tourne à droite
	 */
	public void tourneDroite()
	{
		int x = this.c.getX();
		int y = this.c.getY();
		Coordonnee c = new Coordonnee(x + 1,y);
		this.setC(c);
	}
	// FIXME (FIXED)redéfinir toString
	
	public String toString()
	
	{
		String res = "  [--- ] hp:"+this.hP+"\n    o    armor:"+ this.shield+"\n   /|\\   move speed:"
						+this.moveSpeed+"\n   / \\   loot:"+this.loot+"\n coordonnées: ("
						+this.c.getX()+";"+this.c.getY()+")\n dégats:"+this.damage;

		return res +"\n";
	}

}
