package catégorieFootball;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
	int age;
	String catégorie = null;	
		
	Scanner sc = new Scanner(System.in);
		
	System.out.println("Saissisez votre âge ");
	
	age = sc.nextInt();
	
	if (age < 5) {
		catégorie = "Trop jeune";
	} else if (age < 7) {
		catégorie = "Débutant";
	} else if (age < 9) {
		catégorie = "Poussin";
	} else if (age < 11) {
		catégorie = "Benjamin";
	} else if (age < 13) {
		catégorie = "Pupille";
	} else if (age < 15) {
		catégorie = "Minime";
	} else if (age < 17) {
		catégorie = "Cadet";
	} else if (age < 19) {
		catégorie = "Junior";
	} else if (age < 35) {
		catégorie = "Sénior";
	} else if (age > 35) {
		catégorie = "Vétéran";
	}
	System.out.println("Votre catégorie d'age est " + catégorie);
	
	sc.close(); }

}
