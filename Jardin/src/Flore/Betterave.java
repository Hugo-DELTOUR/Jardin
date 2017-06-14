package Flore;

import java.util.AbstractMap.SimpleEntry;
import java.util.Random;

public class Betterave extends Vegetal implements IOgm{
	
	public Betterave(){
		dessin[3] = 'b';
		dessin[4] = 'B';
	}

	@Override
	public SimpleEntry<Integer, Integer> seDupliquer(int longueur, int largeur) {
		Random rand = new Random();
		int r = rand.nextInt(longueur);
		int r2 = rand.nextInt(largeur);
		return new SimpleEntry<Integer, Integer>( r, r2);
	}
	
}
