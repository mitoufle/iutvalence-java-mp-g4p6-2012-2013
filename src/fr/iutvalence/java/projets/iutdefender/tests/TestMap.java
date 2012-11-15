package fr.iutvalence.java.projets.iutdefender.tests;

import fr.iutvalence.java.projets.iutdefender.Map;
import fr.iutvalence.java.projets.iutdefender.ElementMap;

/**
 * Classe qui permet d'afficher la map en ascii art.
 * @author lamif
 *
 */
public class TestMap {
	/**
	 * Programme de test.
	 * @param args
	 * 
	 */
	public static void main(String[] args)
	{

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
