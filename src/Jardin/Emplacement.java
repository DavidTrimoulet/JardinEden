package Jardin;

import Flore.Vegetal;

public class Emplacement {

	private Vegetal vegetal;
	
	public Vegetal getVegetal() {
		return vegetal;
	}

	public Emplacement(Vegetal vegetal)
	{
		this.vegetal = vegetal;
	}
	
	public String ToString()
	{
		return Character.toString(this.vegetal.GetVegatableImage());
	}
}
