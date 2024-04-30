package helloYou;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	String prenom; // Déclaration d'une variable "prenom" de type "chaine de cractère"
	
	Scanner sc; // Déclaration d'une variable de type Scanner
	
	sc = new Scanner(System.in); // initialisation d'un nouveau scanner
	
	System.out.println("Bonjour, veuillez saisir votre prénom :"); // Affichage
	
	prenom = sc.nextLine(); // Demande à l'utilistauer une saisie.
	// Lorsque l'utilisateur validera sur la touche Entrée, la saisie est récupérée dans la variable à gauche du signe.
	
	System.out.println("Bonjour " + prenom); // Affichage 
	
	sc.close(); // fermeture du scanner (OBLIGATOIRE)
	
	
	}

}
