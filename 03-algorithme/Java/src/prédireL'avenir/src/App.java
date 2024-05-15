
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		int heure;
		int minutes;
		Scanner sc;
		
		sc = new Scanner (System.in);
		
		System.out.println("Saisissez les heures et les minutes ");
		
		heure  = sc.nextInt();
		minutes = sc.nextInt();
		
		minutes = minutes + 3;
		heure = heure + 1;
		
		if (minutes > 59) {
			minutes = 0;
			
		}
		if (heure <= 24) {
			
			heure = 0;
		}
		System.out.println(" Dans trois minutes il sera " + heure + " H et " + minutes + " . ");
	}

}
