import java.util.Scanner;
public class App {
	final static double piece1 = 0.10;
	final static double piece2 = 0.20;
	final static double piece3 = 0.50;
	final static double piece4 = 1.00;
	final static double piece5 = 2.00;
	public static void main(String[] args) {
		double montant;
		double sommeDue;
		double montantVersé;
		double reste;
		int billet5Euros;
		double pieces;
		Scanner sc = new Scanner(System.in);
		montant = 1;
		sommeDue = 0;
		
		while(montant < 0 || montant > 0) {
			System.out.println("Saisissez le montant : ");
			montant = sc.nextDouble();
			sommeDue = sommeDue + montant;
		}
		System.out.println("Vous devez : " + sommeDue + " euros. ");
		System.out.println("Montant versé : ");
		montantVersé = sc.nextDouble();
		reste = montantVersé - sommeDue;
		System.out.println("Rendu monnaie : " + reste + " euros. ");
		
		
		

	}

}
