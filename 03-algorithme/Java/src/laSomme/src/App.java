import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int nombre;
		int i;
		int somme;
		somme = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Saisissez votre nombre : ");
		nombre = sc.nextInt();
		
		
		for(i = 1 ; i <= nombre ; i++) {
			somme+=nombre;
			System.out.println("La somme des nombres jusque " + nombre + " est : " + somme );
		}
		
		
		sc.close();
	}

}
