import java.util.Scanner;
public class App {

	public static void main(String[] args) {
	int nombre = 1;
	int i = 0;
	int max = 0;
	int imax;
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrez un nombre : ");
	
	nombre = sc.nextInt();
	do {
		i = i + 1;
		i++;
		if (nombre > max) {
			max = nombre;
			imax = i;	
		}
	} while (nombre != 0);
	
	System.out.println("Le nombre le plus grand était : " + max);
	System.out.println(max + " était le nombre numéro 1. ");

	
	


	
	
	sc.close();
}
	

}
