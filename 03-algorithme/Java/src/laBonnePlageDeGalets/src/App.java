import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		int nombre2;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Entrez un nombre entre 10 et 20 : ");
			nombre2 = sc.nextInt();
			if(nombre2 < 10) {
				System.out.println("Plus grand ! ");
			}
			else if (nombre2 > 20) {
				System.out.println("Plus petit ! ");
			}
		}
		while (nombre2 < 10 || nombre2 > 20 );
		System.out.println(nombre2 + " Yes, you did it ! ");
		
		sc.close();
	}

}
