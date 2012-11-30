package fr.iutvalence.java.projets.iutdefender;

/** ElementMap: les cosntantes de la map sous forme énumérées*/ 
	public enum DirectionMap{
		
		/**
		 * la direction à prendre sur le chemin est en haut
		 */
		HAUT, 
		/**
		 * la direction à prendre sur le chemin est en bas.
		 */
		BAS,
		/**
		 * la direction à prendre sur le chemin est à gauche.
		 */
		GAUCHE,
		/**
		 * a direction à prendre sur le chemin est à droite.
		 */
		DROITE,		
		/**
		 * représente l'absence d'éléments dans la map.
		 */
		VIDE,
		/**
		 * a direction à prendre sur le chemin est en haut et à droite.
		 */
		DIAGHAUTGAUCHE,
		/**
		 * a direction à prendre sur le chemin est en haut et à gauche.
		 */
		DIAGHAUTDROITE,
		/**
		 * a direction à prendre sur le chemin est en bas et à gauche.
		 */
		DIAGBASGAUCHE,
		/**
		 * a direction à prendre sur le chemin est en bas et à droite.
		 */
		DIAGBASDROITE,
		
	}