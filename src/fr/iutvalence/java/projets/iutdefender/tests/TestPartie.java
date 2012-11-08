package fr.iutvalence.java.projets.iutdefender.tests;

import fr.iutvalence.java.projets.iutdefender.ElementMap;
import fr.iutvalence.java.projets.iutdefender.Player;
import fr.iutvalence.java.projets.iutdefender.Map;
// FIXME (FIXED)écrire un commentaire
/**
 * La classe permettant de faire des test sur une Partie.
 * @author lamif - chevalgu
 *
 */
public class TestPartie {

	// FIXME (FIXED) compléter le commentaire
	/**
	 * programme de test d'une partie. il comprends un joueur et une map.
	 * @param args
	 */
	public static void main(String[] args) {
		Player lamif = new Player(20,200);
		// FIXME (FIXED) remplacer les valeurs par des constantes
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

		// TODO Auto-generated method stub

	}

}
