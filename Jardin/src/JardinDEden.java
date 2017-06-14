import java.util.Scanner;

import Jardin.Jardin;

public class JardinDEden {

	public static void main(String[] args) {
		Jardin j = new Jardin(5,5);
		
		System.out.println("Voici le jardin:");
		j.toString(5,5);
		
		
		
		while(true){	
			
			System.out.println("Le panier contient : ");
			j.ajouterPanier("Tomate",j.qT);
			j.ajouterPanier("Carotte",j.qC);
			j.ajouterPanier("Betterave",j.qB);
			j.ajouterPanier("Ail",j.qA);
			
			j.menu();
			
			Scanner scanner = new Scanner(System.in);
			int scan = scanner.nextInt();
			
			if(scan == 1){
				j.semer();
			}
			else if(scan == 2){
				j.recolter(5, 5);
			}
			else if(scan == 3){
				j.saisonSuivante(5,5);
			}
			else if(scan == 4){
				j.close();
			}
			j.toString(5,5);
			
		}
	}

}
