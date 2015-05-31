package Jardin;

import java.util.HashMap;
import java.util.Random;

import Flore.Ail;
import Flore.Betterave;
import Flore.Carotte;
import Flore.IOgm;
import Flore.IracePure;
import Flore.Tomate;

public class Jardin {
	private int longueur;
	private int largeur;
	private Emplacement[][] emplacement;
	private HashMap<String, Integer> panier;
	
	public Jardin(int longueur, int largeur)
	{
		this.longueur = longueur;
		this.largeur = largeur;
		this.panier = new HashMap<String, Integer>();
		this.emplacement = new Emplacement[longueur][largeur];
		
	}
	
	public void AjouterPanier(String nomVegetal, int quantite)
	{
		this.panier.put(nomVegetal, quantite);
		
	}
	
	public void ToString()
	{
		
		System.out.println("Voici notre Jardin :");
		for(int i=0; i<this.largeur ; i++)
		{
			for(int j = 0; j<this.longueur; j++)
			{
				if(this.emplacement[i][j] != null)
						{
							System.out.print(this.emplacement[i][j].getVegetal().GetVegatableImage());
						}
				else
				{
					System.out.print("0");
				}
				
			}
			System.out.print("\n");
		}
		System.out.print("Et notre panier contient :");
		
		
	}

	public String Semer(int positionX, int positionY, String legume) {
		
		if(legume.equalsIgnoreCase("ail"))
		{
			this.emplacement[positionX][positionY] = new Emplacement(new Ail());
			return "Ail Planté";
		}
		else if(legume.equalsIgnoreCase("tomate"))
		{
			this.emplacement[positionX][positionY] = new Emplacement(new Tomate());
			return "Ail Planté";
		}
		else if(legume.equalsIgnoreCase("betterave"))
		{
			this.emplacement[positionX][positionY] = new Emplacement(new Betterave());
			return "Ail Planté";
		}
		else if(legume.equalsIgnoreCase("carotte"))
		{
			this.emplacement[positionX][positionY] = new Emplacement(new Carotte());
			return "Ail Planté";
		}
		else
		{
			return "Legume non disponible";
		}
	}

	public void PasserSaison() {
		for(int i=0; i<this.largeur ; i++)
		{
			for(int j = 0; j<this.longueur; j++)
			{
				if(this.emplacement[i][j] != null)
						{
							this.emplacement[i][j].getVegetal().Grandir();
						}
								
			}
			
		}
		
	}

	public void Recolter() {
		
		for(int i=0; i<this.largeur ; i++)
		{
			for(int j = 0; j<this.longueur; j++)
			{
				try
				{
					if(this.emplacement[i][j].getVegetal().getEtat().ordinal()>4 )
					{
						if(this.emplacement[i][j].getVegetal() instanceof IracePure)
						{
							IracePure v = (IracePure)this.emplacement[i][j].getVegetal();
							v.SeReproduire(this.panier);
						}
						else if(this.emplacement[i][j].getVegetal() instanceof IOgm)
						{
							IOgm v = (IOgm)this.emplacement[i][j].getVegetal();
							v.SeDupliquer(12,12);
						}
						this.emplacement[i][j] = null;
						
					}
				}
				catch(Exception e)
				{
					
				}
									
			}
			
		}
		
		
	}
	
}
