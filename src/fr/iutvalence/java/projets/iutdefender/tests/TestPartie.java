package fr.iutvalence.java.projets.iutdefender.tests;

import fr.iutvalence.java.projets.iutdefender.Player;
import fr.iutvalence.java.projets.iutdefender.Map;
// FIXME (FIXED)écrire un commentaire
/**
 * La classe permettant de faire des test sur une Partie.
 * @author lamif - chevalgu
 *
 */
public class TestPartie {

	// FIXME compléter le commentaire
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Player lamif = new Player(20,200);
		// FIXME remplacer les valeurs par des constantes
		int[][] terrain =  {{Map.CONSTRUCTIBLE,2,Map.CONSTRUCTIBLE},
							{Map.CONSTRUCTIBLE,Map.CHEMIN,Map.CONSTRUCTIBLE},
							{Map.CONSTRUCTIBLE,1,Map.CONSTRUCTIBLE},
							{Map.CONSTRUCTIBLE,1,Map.CONSTRUCTIBLE},
							{Map.CONSTRUCTIBLE,1,Map.CONSTRUCTIBLE},
							{Map.CONSTRUCTIBLE,1,Map.CONSTRUCTIBLE},
							{Map.CONSTRUCTIBLE,1,Map.CONSTRUCTIBLE},
							{Map.CONSTRUCTIBLE,1,Map.CONSTRUCTIBLE},
							{Map.CONSTRUCTIBLE,1,Map.CONSTRUCTIBLE},
							{Map.CONSTRUCTIBLE,3,Map.CONSTRUCTIBLE};

		// TODO Auto-generated method stub

	}

}
