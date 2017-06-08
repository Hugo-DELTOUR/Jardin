package Jardin;

import java.util.HashMap;
import java.util.Scanner;

import Flore.Ail;

public class Jardin {
	
	private Emplacement emplacements;
	private HashMap<String, Integer> panier;
	private Emplacement[][] emplacement = new Emplacement[5][5];
	
	public Jardin(int longueur, int largeur){
		this.emplacements = new Emplacement(null);
		this.panier = new HashMap<String, Integer>();		
	}
	
	public void ajouterPanier(String vegetal, int quantiteGraine){
		this.panier.put(vegetal, quantiteGraine);
		System.out.println(vegetal + " : " + quantiteGraine + " graine(s)");
	}
	
	public void semer(){
		System.out.println("Quelle graine?\n 1->Ail\n 2->Carotte\n3->Betterave\n4->Tomate\n");
		Scanner sc = new Scanner(System.in);
		int graine = sc.nextInt();
		System.out.println("Coordonnée x : ");
		int x = sc.nextInt();
		System.out.println("Coordonnée y :");
		int y = sc.nextInt();
		if(graine == 1){
			this.emplacement[x][y] = new Emplacement(new Ail());
			
		}
		
	}
	
	public void saisonSuivante(){
		
	}
	
	public String toString(int longueur,int largeur){
			
		for(int i = 0; i<longueur;i++){
			for(int j = 0; j<largeur; j++){
				System.out.print("o");
			}
			System.out.print("\n");
		}
		return null;
	}
	
	public void menu(){
		System.out.println("1. Semer une graine");
		System.out.println("2. Récolter toutes les plantes qui sont matures");
		System.out.println("3. Passer à la saison suivantes(toutes les plantes grandissent)");
		System.out.println("4. Quitter l'application");		
	}
}
