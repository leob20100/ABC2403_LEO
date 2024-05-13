package catégorieFootball;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	int age;
	String categorie = null;	
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Saissisez votre âge ");
	
	age = sc.nextInt();
	
	if (age < 5) {
		categorie = "Trop jeune";
	} else if (age < 7) {
		categorie = "Débutant";
	} else if (age < 9) {
		categorie = "Poussin";
	} else if (age < 11) {
		categorie = "Benjamin";
	} else if (age < 13) {
		categorie = "Pupille";
	} else if (age < 15) {
		categorie = "Minime";
	} else if (age < 17) {
		categorie = "Cadet";
	} else if (age < 19) {
		categorie = "Junior";
	} else if (age < 35) {
		categorie = "Sénior";
	} else {
		categorie = "Vétéran";
	}
	System.out.println("Votre catégorie d'age est " + categorie);
	
	sc.close(); }

}
