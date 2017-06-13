package Jardin;

import java.util.HashMap;
import java.util.Scanner;

import Flore.Ail;
import Flore.Betterave;
import Flore.Carotte;
import Flore.Etat;
import Flore.IOgm;
import Flore.IRacePure;
import Flore.Tomate;

public class Jardin {
	
	private HashMap<String, Integer> panier;
	public Emplacement[][] emplacement ;
	
	public int qA = 5;
	public int qB = 5;
	public int qC = 5;
	public int qT = 5;
	
	public Jardin(int longueur, int largeur){
		this.emplacement = new Emplacement[5][5];
		this.panier = new HashMap<String, Integer>();
	}
	
	public void ajouterPanier(String vegetal, int quantiteGraine){
		this.panier.put(vegetal, quantiteGraine);
		System.out.println(vegetal + " : " + quantiteGraine + " graine(s)");
	}
	
	public void semer(){
		
		System.out.println("Quelle graine?\n1->Ail\n2->Carotte\n3->Betterave\n4->Tomate\n");
		Scanner sc = new Scanner(System.in);
		int graine = sc.nextInt();
		
		System.out.println("Coordonnée x : ");
		int x = sc.nextInt();
		
		System.out.println("Coordonnée y :");
		int y = sc.nextInt();
		
		if(graine == 1){
			this.emplacement[x][y] = new Emplacement(new Ail());
			qA--;
		}
		else if(graine == 2){
			this.emplacement[x][y] = new Emplacement(new Carotte());
			qC--;
		}
		else if(graine == 3){
			this.emplacement[x][y] = new Emplacement(new Betterave());
			qB--;
		}
		else if(graine == 4){
			this.emplacement[x][y] = new Emplacement(new Tomate());
			qT--;
		}
	}
	
	public void saisonSuivante(int longueur, int largeur){
		for(int x = 0; x<longueur; x++){
			for(int y = 0; y <largeur; y++){
				if(emplacement[x][y] != null){
					this.emplacement[x][y].getVegetal().grandir();		
				}
			}
		}
	}
	
	public String toString(int longueur,int largeur){
		
		for(int i = 0; i<longueur; i++){
			for(int j = 0; j<largeur; j++){
				if(emplacement[i][j] != null){
					System.out.print("" + emplacement[i][j].getVegetal().dessin[emplacement[i][j].getVegetal().etat.ordinal()]);
				}
				else{
					System.out.print('o');
				}
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
	
	public void recolter(int longueur, int largeur){
		for(int x = 0; x<longueur; x++){
			for(int y = 0; y <largeur; y++){
				if(emplacement[x][y] != null){
					if(emplacement[x][y].getVegetal().etat == Etat.FLEUR){
						
						if(emplacement[x][y].getVegetal() instanceof IRacePure){
														
							IRacePure.seReproduire(this.panier,emplacement[x][y].getVegetal().toString());
							
						}
//						if(emplacement[x][y].getVegetal() instanceof IOgm){
//							IOgm.seDupliquer(5,5);
//						}
						
						this.emplacement[x][y] = null;
					}
				}
			}
		}
		
	}
	
}
