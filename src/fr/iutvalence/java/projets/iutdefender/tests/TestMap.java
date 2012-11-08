package fr.iutvalence.java.projets.iutdefender.tests;

import fr.iutvalence.java.projets.iutdefender.Map;
import fr.iutvalence.java.projets.iutdefender.ElementMap;

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
	 * 
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		// FIXME (FIXED)remplacer les valeurs par des constantes
		ElementMap[][] terrain =  {	{ElementMap.CONSTRUCTIBLE,ElementMap.ARRIVE,ElementMap.CONSTRUCTIBLE},
								{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
								{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
								{ElementMap.TOUR,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
								{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
								{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.TOUR},
								{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
								{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
								{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
								{ElementMap.CONSTRUCTIBLE,ElementMap.DEPART,ElementMap.CONSTRUCTIBLE}};

		Map map = new Map(terrain);
		System.out.println(map.toString());
	}

}
