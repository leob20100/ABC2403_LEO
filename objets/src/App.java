import java.util.*;
import java.text.*;
public class App {

	public static void afficherJourEtHeure() {
		
		SimpleDateFormat s = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	    Date date = new Date();
	    System.out.println(s.format(date));
	    
	
	

	}
	public static double additioner(double valeur1, double valeur2) {
		double somme;
		somme = valeur1 + valeur2;
		return somme;
	}
	
	public static String concatenerPrenomNom(String prenom, String nom) {
		String retour;
		retour = prenom + "." + nom;
		return retour;
	}
	
	public static void main(String[] args) {
		App.afficherJourEtHeure();
		System.out.println();
		
		
		String nomComplet;
		nomComplet = App.concatenerPrenomNom("Léo", "Besson");
		System.out.println(nomComplet);
		
		
		double deuxValeurs;
		deuxValeurs = App.additioner(2, 3);
		System.out.println(deuxValeurs);
		
		
		
		}
}
