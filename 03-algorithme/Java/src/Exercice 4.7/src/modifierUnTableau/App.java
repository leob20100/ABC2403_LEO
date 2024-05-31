package modifierUnTableau;
import java.util.*;
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valeurs;
		int[] tableau;
		int i;
		
		System.out.println("Saisissez votre valeur : ");
		valeurs = sc.nextInt();
		tableau = new int[valeurs];
		
		for(i = 0; i < tableau.length; i++) {
			System.out.println("Entrez le nombre n° " + i + 1);
			tableau[i] = sc.nextInt();
		}
		System.out.println("Le nouveau tableau est : ");
		
		for(i = 0; i < tableau.length; i++) {
			tableau[i] += tableau[i] + 1;
		System.out.println(tableau[i]);
		}
		
		

	}

}
