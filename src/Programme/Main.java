package Programme;

import java.applet.Applet;
import java.util.Scanner;

import Jardin.Jardin;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int choix;
		int positionX;
		int positionY;
		String legume;
		
		Jardin monJardin = new Jardin(12, 12);
		monJardin.AjouterPanier("Ail", 12);
		monJardin.AjouterPanier("Carotte", 12);
		monJardin.AjouterPanier("Tomate", 12);
		monJardin.AjouterPanier("Betterave", 12);
		
		Scanner sc = new Scanner(System.in);
		
		
		do
		{
			try
			{
				monJardin.ToString();
				
				System.out.println("Que voulez vous faire?");
				System.out.println("1.Semer une graine?");
				System.out.println("2.Récolter toutes les platntes qui sont matures?");
				System.out.println("3.Passer à la saison suivante?");
				System.out.println("4.Quitter l'application");

				choix = sc.nextInt();
				switch(choix)
				{
				case 1:
					System.out.println("Ou souhaitez vous planter la graine?");
					System.out.println("Ligne n°?");
					positionY = sc.nextInt();
					System.out.println("Colonne n°?");
					positionX = sc.nextInt();
					System.out.println("Quel légume? Ail / Betterave / Carotte / Tomate");
					legume = sc.next();
					System.out.println(monJardin.Semer(positionX, positionY, legume));

					break;

				case 2:
					monJardin.Recolter();
					break;
				case 3:
					monJardin.PasserSaison();
					
					break;
				case 4:
					sc.close();
					
					break;

				default:

				}
			}
			catch(Exception e)
			{
				choix =0;
				System.out.println(e);
			}
			
		}while(choix !=4);
	}
}
