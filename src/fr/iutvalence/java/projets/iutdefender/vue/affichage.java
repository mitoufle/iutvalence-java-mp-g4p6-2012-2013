package fr.iutvalence.java.projets.iutdefender.vue;
import fr.iutvalence.java.projets.iutdefender.Map;
import fr.iutvalence.java.projets.iutdefender.Monster;
import fr.iutvalence.java.projets.iutdefender.Tower;
import java.util.ArrayList;

/**
 * @author lamif
 *
 */
public interface affichage
{
	/**
	 * 
	 * @param aLTower
	 * @param aLMonster
	 * @param pMap
	 */
	public void afficher(ArrayList<Tower> aLTower, ArrayList<Monster> aLMonster, Map pMap);
	
}
