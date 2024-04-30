package positifOunégatif2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nombreEntier1;
		
		int nombreEntier2;
		
		System.out.println("Saisissez votre premier nombre");
		
		nombreEntier1 = sc.nextInt();
		
		System.out.println("Saisissez votre second nombre");
		
		nombreEntier2 = sc.nextInt();
		
		if (nombreEntier1 * nombreEntier2 >= 0) { 
			
			System.out.println("Ce nombre est positif ");
		}
		else {
			
			System.out.println("Ce nombre est négatif ");
		}
	
		if (nombreEntier2 * nombreEntier1 >=0) {
			
			System.out.println("Ce nombre est positif ");
		}
		else {
			
			System.out.println("Ce nombre est négatif ");
		}
		sc.close();
}
	
}
