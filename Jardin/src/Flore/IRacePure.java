package Flore;

import java.util.HashMap;

public interface IRacePure {
	
	public static void seReproduire(HashMap<String, Integer> panier, String vegetal){
		
		panier.put(vegetal, panier.get(vegetal) + 1);
		
	}
		
}
