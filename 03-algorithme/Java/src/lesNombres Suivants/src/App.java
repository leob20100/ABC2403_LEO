import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int nombreDepart;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Saisissez votre nombre : ");
		nombreDepart = sc.nextInt();
		
	/*	while(i <= 10) {
			System.out.println(nombreDepart + i + ",");
			i++;
		} */

		for (i = 1 ; i<= 10 ; i++ ) {
			System.out.println(nombreDepart + i + ".");
}
		
sc.close();	

	}

}
