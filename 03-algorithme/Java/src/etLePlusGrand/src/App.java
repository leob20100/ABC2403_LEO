import java.util.Scanner;

public class App {

	public static void main(String[] args) {
int nombre;
int i = 1;
int pg = 0;
int ipg = i;
Scanner sc = new Scanner(System.in);

for (i = 1; i<20; i++) {
	System.out.println("Entrez un nombre : ");
	nombre = sc.nextInt();
	
	if(i == 1 || nombre > pg) {
		pg = nombre;
		ipg = i;
	}
	System.out.println("Le plus grand des nombres saisis est : " + pg + " . ");
	System.out.println(pg + " était le nombre numéro " + ipg + " . ");
	
	sc.close();
}
}
	

}
