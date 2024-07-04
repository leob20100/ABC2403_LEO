
public class App {

	public static void main(String[] args) {
		int [] tab;
		tab = new int [] {1,2,3,4}; 
		int chiffre = 3;
		
		boolean resultat = App.rechercheSiChiffreExiste(tab,chiffre);
		
		System.err.println(resultat);
	

	}
	
	
	public static boolean rechercheSiChiffreExiste(int[] tab, int chiffre) {
		boolean trouve = false;
		int i =0;
		while (i <= tab.length && !trouve) {
			if(tab[i] == chiffre) {
				trouve = true;
			}
			
			i++;
			
		}
		
		
		return trouve;
	}
}
