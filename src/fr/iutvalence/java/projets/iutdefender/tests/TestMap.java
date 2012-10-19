package fr.iutvalence.java.projets.iutdefender.tests;

import fr.iutvalence.java.projets.iutdefender.Map;

// FIXME (FIXED)écrire un commentaire
/**
 * Classe qui permet d'afficher la map en ascii art.
 * @author lamif
 *
 */
public class TestMap {

	// FIXME (FIXED)compléter le commentaire
	/**
	 * Programme de test.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FIXME (FIXED)remplacer les valeurs par des constantes
		int[][] terrain =  {	{Map.CONSTRUCTIBLE,Map.ARRIVE,Map.CONSTRUCTIBLE},
								{Map.CONSTRUCTIBLE,Map.CHEMIN,Map.CONSTRUCTIBLE},
								{Map.CONSTRUCTIBLE,Map.CHEMIN,Map.CONSTRUCTIBLE},
								{Map.TOUR,Map.CHEMIN,Map.CONSTRUCTIBLE},
								{Map.CONSTRUCTIBLE,Map.CHEMIN,Map.CONSTRUCTIBLE},
								{Map.CONSTRUCTIBLE,Map.CHEMIN,Map.TOUR},
								{Map.CONSTRUCTIBLE,Map.CHEMIN,Map.CONSTRUCTIBLE},
								{Map.CONSTRUCTIBLE,Map.CHEMIN,Map.CONSTRUCTIBLE},
								{Map.CONSTRUCTIBLE,Map.CHEMIN,Map.CONSTRUCTIBLE},
								{Map.CONSTRUCTIBLE,Map.DEPART,Map.CONSTRUCTIBLE}};
		Map map = new Map(terrain);
		System.out.println(map.toString());
	}

}
