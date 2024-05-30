package insertionDansUnTableauOrdonné;
import java.util.*;
public class App {
	
	public static int [] ajoutX(int [] tableau1, int x) {
		
		int i;
		int newArray[] = new int[tableau1.length +1];
		
		for (i = 0; i < tableau1.length; i++) {
			newArray[i] = tableau1[i];
			newArray[tableau1.length] = x;
		}
		
		return newArray;
	}
	
	public static void main(String[] args) {
		int nombre;
		
		int [] tableau = {1, 4, 5, 10, 20, 22, 25, 30, 32};;
		
		
		
		System.out.println("Le tableau initial :" + Arrays.toString(tableau));
		
		int x = 7;
		
		tableau = App.ajoutX(tableau, x);
		
		System.out.println("Le nouveau tableau avec " + x + " ajouté : " + Arrays.toString(tableau));
		
		}
	
	

}
