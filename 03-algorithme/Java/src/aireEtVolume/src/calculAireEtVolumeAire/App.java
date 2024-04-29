package calculAireEtVolumeAire;

import java.util.Scanner;
import java.lang.Math;

public class App {

	public static void main(String[] args) {
	
		double rayon;
		double aireRayon;
		double volumeRayon;
		Scanner sc;
		
		sc = new Scanner(System.in);
		
		System.out.println("Veuillez saisir le rayon d'une sphère : ");
		
		rayon = sc.nextDouble();
		
		aireRayon = 4.0 * Math.PI * Math.pow(rayon, 2);
		
		volumeRayon = (4.0 * Math.PI * Math.pow(rayon, 3)) / 3;
		
		System.out.println("L'aire d'une spère est de " + aireRayon + " et le volume d'une spère est de " + volumeRayon);
				
				
		sc.close();
	}

}
