package lesFruitsEtLegumes;
import java.util.*;
public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nomLegume;
		double prixLegume;
		
		while (true) {
			System.out.println("Saisissez le nom du légume : ");
			nomLegume = sc.nextLine();
			
			if(nomLegume.equalsIgnoreCase("go")) {
				break;
			}
		}
		
		String legumeLeMoinsCher = null;
		double prixLeMoinsCher;
		double prix;
		
		if(prix < prixLeMoinsCher) {
			
			prixLeMoinsCher = prix;
			legumeLeMoinsCher =;
		}

	}

}
