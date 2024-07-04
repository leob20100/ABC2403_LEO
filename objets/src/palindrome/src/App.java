
public class App {
	
	public static void main(String[] args) {
		
		boolean resultat = estUnPalindrome("LAVAL");
		
		boolean resultat2 = estUnPalindrome("COUCOU");

	}



	public static boolean estUnPalindrome(String mot) {
		
		int i = 0;
		int j = mot.length()-1-i;
		boolean ok = true;
		
		while(i < mot.length() / 2 && ok == true) {
			
			if(mot.charAt(i) != mot.charAt(j)) {
				ok = false;
			}
			
			i++;
			
			j = mot.length()-1-i;
		}
		return ok;
	}

}