package secteurCirculaire;

import java.util.Scanner;
import java.lang.Math;

public class App {

	public static void main(String[] args) {

		double rayon;
		double angle;
		double aireSecteur;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le rayon du cercle : ");
		
		System.out.println("Veuillez saisir l'angle du cercle : ");
		
		rayon = sc.nextDouble();
		
		angle = sc.nextDouble();
		
		aireSecteur = (Math.PI * Math.pow(rayon, 2) * angle) / 360;
		
		System.out.println ("L'aire du secteur circulaire est de " + aireSecteur);
		
	}

}
