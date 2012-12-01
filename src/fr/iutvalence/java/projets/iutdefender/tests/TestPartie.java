package fr.iutvalence.java.projets.iutdefender.tests;

import java.util.ArrayList;

import fr.iutvalence.java.projets.iutdefender.Coordonnee;
import fr.iutvalence.java.projets.iutdefender.DirectionMap;
import fr.iutvalence.java.projets.iutdefender.ElementMap;
import fr.iutvalence.java.projets.iutdefender.Map;
import fr.iutvalence.java.projets.iutdefender.Monster;
import fr.iutvalence.java.projets.iutdefender.Partie;
import fr.iutvalence.java.projets.iutdefender.Player;
import fr.iutvalence.java.projets.iutdefender.Tower;
/**
 * La classe permettant de faire des test sur une Partie.
 * @author lamif - chevalgu
 *
 */
public class TestPartie {

	/**
	 * programme de test d'une partie. il comprends un joueur et une map.
	 * @param args arguments
	 */
	public static void main(String[] args) {
		Player lamif = new Player(200,20);
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
						



ArrayList<Monster> aLM = new ArrayList<Monster>();
ArrayList<Tower> aLT = new ArrayList<Tower>();	 
Coordonnee ct1 = new Coordonnee(3,0);
Tower t1 = new Tower(2, 1, 100, ct1);
aLT.add(t1);
Map map = new Map(terrain, terrain2);
Partie p = new Partie(map, lamif, aLM, aLT);
p.demarrer();
	}

}
