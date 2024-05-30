package alimenterUnTableau;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int tailleTableau;
		int [] tableau;
		int i;
		int positif;
		int negatif;
		
		positif = 0;
		negatif = 0;
		
		System.out.println("Entrez le nombre de valeurs que vous souhaitez saisir: ");
		
		tailleTableau = sc.nextInt();
		tableau = new int[tailleTableau];
		for(i = 0; i < tailleTableau ; i++) {
			
			System.out.println("Saisissez la valeur N° " + (i+1) + " / " + tailleTableau);
			tableau[i] = sc.nextInt();
			
			if(tableau[i] >= 0) {
				positif++;
			
			}
			else {
				negatif++;
			}
		}
		System.out.println("Vous avez saisi : " + positif + " nombres positifs");
		System.out.println("Vous avez saisi : " + negatif + " nombres negatifs");
			
		
	}

}
