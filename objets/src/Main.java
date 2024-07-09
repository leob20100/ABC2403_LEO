
public class Main {

	public static void main(String[] args) {
		String[] bandeAPicsou = new String[] {" riri ", " fifi "," loulou "," et "," picsou "};
		String resultat = concatCanard(bandeAPicsou);
		System.out.println(resultat);

	}
	
	public static String concatCanard(String[] tab) {
		
		String retour = "";
		
		for(int i = 0; i<tab.length; i++) {
			
			retour = retour + tab[i];
		}
		
		return retour;
	}

}
