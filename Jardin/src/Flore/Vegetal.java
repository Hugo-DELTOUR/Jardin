package Flore;

public abstract class Vegetal {
	
	public Etat etat;
	public char dessin[] = new char[6];
	
	public Vegetal(){
		
		dessin[0] = '_';
		dessin[1] = '.';
		dessin[2] = 'i';
		dessin[5] = '#';
		this.etat = Etat.GRAINE;
	}
	
	public void grandir(){
		
	}
	
}
