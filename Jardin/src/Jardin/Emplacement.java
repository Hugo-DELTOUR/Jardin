package Jardin;

import Flore.Vegetal;

public class Emplacement {
	
	private Vegetal vegetal;
	
	public Emplacement(Vegetal vegetal){
		this.vegetal = vegetal;
	}
	
	public Vegetal getVegetal() {
		return vegetal;
	}
	
	public String toString(){
		System.out.println(this.vegetal);
		return null;
	}
}
