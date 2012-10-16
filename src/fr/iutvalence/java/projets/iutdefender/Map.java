package fr.iutvalence.java.projets.iutdefender;

/**
 * La classe Map représente une carte sur laquelle les tours seront construites
 * et les monstres se déplaceront.
 * @author lamif
 *  
 */
public class Map {
	
	// FIXME quelles valeurs peuvent prendre les cases de la map ? -> constantes (FIXED)
	private final static int CONSTRUCTIBLE = 0;
	private final static int CHEMIN = 1;
	private final static int DEPART = 2;
	private final static int ARRIVE = 3;
	private final static int TOUR = 4;
	

	/**
	 * tableau bidimensionel représentant la carte.
	 */
	// FIXME indiquer ou est le 0,0 (FIXED)
	// le 0,0 est en table[0][0]
	
	private int[][] table;

	public Map(int[][] table) {
		super();
		this.table = table;
	}
	
	// FIXME méthodes ?
	
	
	// FIXME redéfinir toString pour obtenir une représentation en Ascii-art de la map (FIXED)
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
	
	
}
