import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		long nombre;
		long produit = 1;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entrez un nombre entier positif : ");
		nombre = sc.nextLong();

		if (nombre == 0) {
			produit = 0;

		} else {

			for (long i = 1; i <= nombre; i++) {

				produit *= i;

			}

		}


		System.out.println("La factorielle " +nombre+ " est : " + produit + " . ");
	
		sc.close();
	}

}
