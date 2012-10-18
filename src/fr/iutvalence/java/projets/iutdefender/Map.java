package fr.iutvalence.java.projets.iutdefender;

/**
 * La classe Map représente une carte sur laquelle les tours seront construites
 * et les monstres se déplaceront.
 * @author lamif
 *  
 */
public class Map {
	
	// FIXME écrire un commentaire
	private final static int CONSTRUCTIBLE = 0;

	// FIXME écrire un commentaire
	private final static int CHEMIN = 1;
	
	// FIXME écrire un commentaire
	private final static int DEPART = 2;
	
	// FIXME écrire un commentaire
	private final static int ARRIVE = 3;
	
	// FIXME écrire un commentaire
	private final static int TOUR = 4;
	
	// FIXME comment est gérée la taille de la map ?

	/**
	 * tableau bidimensionel représentant la carte.
	 */
	// FIXME indiquer DANS LE COMMENTAIRE où est le 0,0
	// le 0,0 est en table[0][0]
	private int[][] table;

	
	// FIXME écrire un commentaire
	public Map(int[][] table) {
		super();
		this.table = table;
	}
	
	
	// FIXME ajouter un constructeur sans paramètre créant une map vide 

	
	// FIXME écrire un commentaire
	public String toString(){

		String res = "";
		String cases = "|__|";
		
		for (int i=0;i<this.table.length;i++) 
		{
			res = res + "\n";
			for (int j=0; j<this.table[0].length;j++) // lignes
			{
				
				if (this.table[i][j] == CHEMIN){
					res = res + "| |";
				}
				else if (this.table[i][j] == DEPART){
					res = res + "^^^";
				}
				else if (this.table[i][j] == ARRIVE){
					res = res + "~~~";
				}
				else if (this.table[i][j] == CONSTRUCTIBLE){
					res = res + cases;
				}
				else if (this.table[i][j] == TOUR){
					res = res + " ŦŦ ";
				}
			}		
		}
		
		return res;	
	}
	
	// FIXME ajouter une méthode permettant d'obtenir le contenu d'une case de la grille
	
	// FIXME ajouter une méthode permettant de modifier le contenu d'une case de la grille
}
