package fr.iutvalence.java.projets.iutdefender;

/**
 * La classe partie dans laquelle vont intervenir nos algorithme de déroulement du jeu.
 * 
 * @author lamif - chevalgu
 * 
 */
public class Partie
{

	/**
	 * La map sur laquelle sont placés les tours et les monstres
	 */
	private Map table;

	/**
	 * le joueur
	 */
	private Player p1;

	/**
	 * Le constructeur de partie.
	 * 
	 * @param table
	 *            La Map.
	 * @param p1
	 *            Le joueur.
	 */
	// FIXME compléter le commentaire
	public Partie(Map table, Player p1)
	{
		super();
		this.table = table;
		this.p1 = p1;
	}

	/**
	 * Place les monstres un à un sur la case départ de la map.
	 * 
	 * @param m
	 *            La Map.
	 */
	// FIXME (NOT FIXED)respecter les conventions d'écriture (paramètres)
	// FIXME pourquoi passer la map ? et quelles informations pour placer les monstres ?
	public void initMonstre(Map m)
	{
		// while ( chercherContenu!= )
	}

	/**
	 * 
	 */
	// FIXME écrire un commentaire
	public void demarrer()
	{
		// FIXME à compléter
	}

	
	/**
	 * Permet de poser une nouvelle tour sur la map
	 * @param x la coordonnée x de la tour à poser
	 * @param y la coordonnée y de la tour à poser
	 * @throws CoordInvalideException soulève l'exception quand les coordonnées entrés dépassent les limites de la map.
	 * @throws CaseNonModifiable soulève l'exception quand la case en question n'est pas modifiable
	 * @throws ArgentInsuffisant soulève l'exception quand le joueur n'a pas assez d'argent.
	 */
	public void creerTour (int x, int y) throws CoordInvalideException, CaseNonModifiable,  ArgentInsuffisant
	{
			this.table.modifierCase(x, y, ElementMap.TOUR);
			this.p1.payer(100);
	}
}
