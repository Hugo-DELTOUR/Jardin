import java.util.Scanner;

import Jardin.Jardin;

public class JardinDEden {

	public static void main(String[] args) {
		Jardin j = new Jardin(5,5);
		
		System.out.println("Voici le jardin:");
		j.toString(5,5);
		
		System.out.println("Le panier contient : ");
		j.ajouterPanier("Tomate",5);
		j.ajouterPanier("Carotte",5);
		j.ajouterPanier("Betterave",5);
		j.ajouterPanier("Ail",5);
		
		while(true){	
			
			
			j.menu();
			
			Scanner scanner = new Scanner(System.in);
			int scan = scanner.nextInt();
			
			switch(scan){
				case 1 : j.semer();
			}
				
		}
	}

}
