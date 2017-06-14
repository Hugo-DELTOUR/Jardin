package Flore;

import java.util.HashMap;

public class Ail extends Vegetal implements IRacePure{
	
	public Ail(){
		dessin[3] = 'a';
		dessin[4] = 'A';
	}

	@Override
	public void seReproduire(HashMap<String, Integer> panier, String vegetal) {
		panier.put(vegetal, panier.get(vegetal) + 1);		
	}
}
