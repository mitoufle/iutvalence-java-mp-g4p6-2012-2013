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
//		ElementMap[][] terrain =  {	{ElementMap.CONSTRUCTIBLE,ElementMap.ARRIVE,ElementMap.CONSTRUCTIBLE},
//									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
//									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
//									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
//									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
//									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
//									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
//									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
//									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
//									{ElementMap.CONSTRUCTIBLE,ElementMap.DEPART,ElementMap.CONSTRUCTIBLE}};
//		
		
		ElementMap[][] terrain = {	{ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE},
									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CHEMIN,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CHEMIN,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CHEMIN,ElementMap.CHEMIN,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CHEMIN,ElementMap.CHEMIN,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE},
									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE},
									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE},
									{ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CHEMIN,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE},
									{ElementMap.CONSTRUCTIBLE,ElementMap.DEPART,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.ARRIVE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE,ElementMap.CONSTRUCTIBLE}};
		

		
//		DirectionMap[][] terrain2 = {	{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
//										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
//										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
//										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
//										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
//										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
//										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
//										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
//										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE},
//										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE}};
//		
		DirectionMap[][] terrain2 =	{	{DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.DROITE,DirectionMap.DROITE,DirectionMap.BAS,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.DROITE,DirectionMap.DROITE,DirectionMap.BAS,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE,DirectionMap.BAS,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE,DirectionMap.BAS,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE,DirectionMap.DROITE,DirectionMap.DROITE,DirectionMap.DROITE,DirectionMap.HAUT,DirectionMap.VIDE,DirectionMap.BAS,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.BAS,DirectionMap.GAUCHE,DirectionMap.GAUCHE,DirectionMap.GAUCHE,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.BAS,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.BAS,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.BAS,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE},
										{DirectionMap.VIDE,DirectionMap.HAUT,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.BAS,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE,DirectionMap.VIDE}};
						


ArrayList<Monster> aLM = new ArrayList<Monster>();
ArrayList<Tower> aLT = new ArrayList<Tower>();	 
Coordonnee ct1 = new Coordonnee(2,2);
Tower t1 = new Tower(2, 1, 5, ct1);
terrain[ct1.getX()][ct1.getY()]=ElementMap.TOUR;
Coordonnee ct2 = new Coordonnee(2,7);
Tower t2 = new Tower(2, 1, 5, ct2);
terrain[ct2.getX()][ct2.getY()]=ElementMap.TOUR;
Coordonnee ct3 = new Coordonnee(2,5);
Tower t3 = new Tower(2, 1, 5, ct3);
terrain[ct3.getX()][ct3.getY()]=ElementMap.TOUR;

aLT.add(t1);
aLT.add(t2);
aLT.add(t3);

Map map = new Map(terrain, terrain2);
Partie p = new Partie(map, lamif, aLM, aLT);
p.demarrer();
	}

}
