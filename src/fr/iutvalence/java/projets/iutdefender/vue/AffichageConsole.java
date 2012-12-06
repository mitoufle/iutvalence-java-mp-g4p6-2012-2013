package fr.iutvalence.java.projets.iutdefender.vue;

import java.util.ArrayList;

import fr.iutvalence.java.projets.iutdefender.DirectionMap;
import fr.iutvalence.java.projets.iutdefender.ElementMap;
import fr.iutvalence.java.projets.iutdefender.Map;
import fr.iutvalence.java.projets.iutdefender.Monster;
import fr.iutvalence.java.projets.iutdefender.Tower;

/**
 * @author lamif
 *
 */
public class AffichageConsole implements affichage
{

	@Override
	public void afficher(ArrayList<Tower> aLTower, ArrayList<Monster> aLMonster, Map pMap)
	{
		String res = "";
		String cases = "|||||";

		for (int i = 0; i < this.table.getTable().length; i++)
		{

			res = res + "\n";
			for (int j = 0; j < this.table.getTable()[0].length; j++) // lignes
			{
				int monstresc = monstreSurCase(j, i);

				if (this.table.getTable()[i][j] == ElementMap.CHEMIN && monstresc != -1)
				{


					if (this.aLMonster.get(monstresc).getHP() < VIESTANDARD/3)
					{
						res = res + "|n  |";
					}
					else if (this.aLMonster.get(monstresc).getHP() > VIESTANDARD/3 && this.aLMonster.get(monstresc).getHP() < 2*VIESTANDARD/3)
					{
						res = res + "|nn |";
					}
					else
					{
						res = res + "|nnn|";
					}


				}
				else if (this.table.getTable()[i][j] == ElementMap.CHEMIN && monstresc == -1)
				{ 
					if (this.table.getTable2()[i][j] == DirectionMap.HAUT) res = res + "  ^  ";
					else if (this.table.getTable2()[i][j] == DirectionMap.BAS) res = res + "  !  ";
					else if (this.table.getTable2()[i][j] == DirectionMap.GAUCHE) res = res + "  <  ";
					else res = res + "  >  ";
				}

				else if (this.table.getTable()[i][j] == ElementMap.DEPART)
				{

					res = res + "|^^^|";
				}
				else if (this.table.getTable()[i][j] == ElementMap.ARRIVE)
				{
					res = res + "|~~~|";
				}
				else if (this.table.getTable()[i][j] == ElementMap.CONSTRUCTIBLE)
				{
					res = res + cases;
				}
				else if (this.table.getTable()[i][j] == ElementMap.TOUR)
				{
					res = res + "| T |";
				}
			}
		}


		return res+"\n";

	}

}
