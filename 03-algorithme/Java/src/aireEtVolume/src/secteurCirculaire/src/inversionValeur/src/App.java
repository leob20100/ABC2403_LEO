import java.util.Scanner;

public class App {
 
	public static void main(String[] args) {
	
		int nombreA;
		
		int nombreB;
		
		int nombreC;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Veuillez afficher la valeur de A ");
		
		nombreA = sc.nextInt();
		
		System.out.println("Veuillez afficher la valeur de B ");
		
		nombreB = sc.nextInt();
		
		System.out.println("Le contenu de A est " + nombreA + " Le contenu de B est " + nombreB);
		nombreC = nombreA;
		
		nombreA = nombreB;
		
		nombreB = nombreC;
		
		System.out.println("Le contenu de A est " + nombreA + " Le contenu de B est " + nombreB);
		
		sc.close();
		
		
		
		
	}

}
