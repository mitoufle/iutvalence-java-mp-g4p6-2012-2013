package fr.iutvalence.java.projets.iutdefender.tests;

import fr.iutvalence.java.projets.iutdefender.DirectionMap;
import fr.iutvalence.java.projets.iutdefender.Map;
import fr.iutvalence.java.projets.iutdefender.ElementMap;
import fr.iutvalence.java.projets.iutdefender.Monster;
import fr.iutvalence.java.projets.iutdefender.Coordonnee;

/**
 * Classe qui permet d'afficher la map en ascii art.
 * @author lamif
 *
 */
public class TestMap {
	/**
	 * Programme de test.
	 * @param args l'argument
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

		DirectionMap[][] terrain2 = {	{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE}};

				
				
				
		Coordonnee coord = new Coordonnee(12,30);
		Map map = new Map(terrain, terrain2);
		Monster monster = new Monster(70, 5, 10, 1, 30, coord);
		System.out.println(map.toString());
		System.out.println(monster.toString());
	}

}
