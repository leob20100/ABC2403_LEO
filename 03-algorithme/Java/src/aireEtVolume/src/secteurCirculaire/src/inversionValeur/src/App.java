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
		
		nombreC = nombreA;
		
		nombreA = nombreB;
		
		nombreB = nombreC;
		
		System.out.println("Le contenu A est " + nombreB + " ." +  " Le contenu A est transmis dans le contenu C qui est de " + nombreC + " et le contenu B qui est de " + nombreA + " est transmis dans le contenu A qui est maintenat de " + nombreA + " . " +  " La valeur du contenu A est maintenant  de " + nombreA + " et la valeur du contenu B est maintenant de " + nombreB);
		
		
		
		
		
		
		
	}

}
