package fr.iutvalence.java.projets.iutdefender.tests;

import fr.iutvalence.java.projets.iutdefender.Map;

// FIXME écrire un commentaire
public class TestMap {

	// FIXME compléter le commentaire
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// FIXME remplacer les valeurs par des constantes
		int[][] terrain = {{0,3,0},{0,1,0},{4,1,4},{0,1,0},{0,1,0},{0,1,0},{0,1,0},{0,1,0},{0,1,0},{0,2,0}};
		Map map = new Map(terrain);
		System.out.println(map.toString());
	}

}
