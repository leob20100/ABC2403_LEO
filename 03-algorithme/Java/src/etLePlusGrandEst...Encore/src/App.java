import java.util.Scanner;
public class App {

	public static void main(String[] args) {
	int nombre = 1;
	int i = 0;
	int pg = 0;
	int ipg = i ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Entrez un nombre : ");
	nombre = sc.nextInt();
while(nombre <=  20 || nombre > 0) {
	
	i = i + 1;
	i++;
	if (i == 1 || nombre > pg) {
		pg = nombre;
		ipg = i;
	}
	System.out.println("Le nombre le plus grand était : " + pg);
	System.out.println("Il a été saisi en position numéro : " + ipg);
	
	sc.close();
}
	}

}
