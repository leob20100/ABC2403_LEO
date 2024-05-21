import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		int nombre;
		
		int max = 0;
		int imax = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez le nombre numero 1 : ");
		max = sc.nextInt();
		boolean changement = false;
		for (int i = 1; i < 20; i++) {
			System.out.println("Entrez le nombre numero : "+ (i+1));
			nombre = sc.nextInt();

			if (nombre > max) {
				max = nombre;
				imax = i+1;
				changement = true;
			}
		} if (changement == true) {
			System.out.println("Le plus grand des nombres saisis est : " + max + " . ");
			System.out.println(max + " était le nombre numéro " + imax + " . ");
		}
		else {
			System.out.println("Le plus grand des nombres saisis est : " + max + " . ");
			System.out.println(max + " était le nombre numéro 1. ");
		}
		

	sc.close();
		
	}

}
