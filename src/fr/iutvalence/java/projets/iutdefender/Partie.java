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
	 * le tableau contenant tous les monstres présents (vivants).
	 */
	public Monster tab[];
	
	/**
	 * La map sur laquelle sont placés les tours et les monstres
	 */
	public Map table;

	/**
	 * le joueur
	 */
	private Player p1;

	// FIXME (FIXED)compléter le commentaire (dire à quoi ressemble l'objet créé)
	/**
	 * 
	 * Le constructeur de partie. Une partie est une succession de vagues de monstres
	 * sur une map.
	 * 
	 * @param table
	 *            La Map.
	 * @param p1
	 *            Le joueur.
	 */
	public Partie(Map table, Player p1)
	{
		super();
		this.table = table;
		this.p1 = p1;
	}

	// FIXME (FIXED)pourquoi passer la map ? et quelles informations pour placer les monstres ?
	//Fonction retirée
	
	
	
	
	
	/**
	 * démarre une partie d'IUT defender.
	 */
	// FIXME (FIXED)écrire un commentaire
	public void demarrer()
	{
		// FIXME à compléter
	}

	public void avancer(){
		
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
