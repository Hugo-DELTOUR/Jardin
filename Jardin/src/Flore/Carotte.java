package Flore;

import java.util.HashMap;

public class Carotte extends Vegetal implements IRacePure{
	
	public Carotte(){
		dessin[3] = 'c';
		dessin[4] = 'C';
	}

	@Override
	public void seReproduire(HashMap<String, Integer> panier, String vegetal) {
		panier.put(vegetal, panier.get(vegetal) + 1);		
	}
}
