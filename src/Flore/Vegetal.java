package Flore;


public abstract class Vegetal {
	protected Etat etat;
	public Etat getEtat() {
		return etat;
	}

	protected char[] dessin ;
	
	public Vegetal()
	{
		this.etat = Etat.GRAINE;
		this.dessin  = new char[] {'-','.','i','0','0','#'};
		
	}
	
	public char GetVegatableImage()
	{
		return this.dessin[this.etat.ordinal()];
	}

	public void Grandir() {
		this.etat = Etat.values()[this.etat.ordinal() + 1];
	}
	
}
