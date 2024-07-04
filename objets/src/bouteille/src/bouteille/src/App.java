
public class App {
	public static void main(String[] args) {
		
		Bouteille bouteille1 = new Bouteille();
		
		Bouteille bouteille2 = new Bouteille(1.2f, 0.8f, true, "H2O" );
		
		Bouteille bouteille3 = new Bouteille(bouteille2);
		
		float contenanceEnClDeBouteille2 = bouteille2.donneContenanceEnCl();
		
		float contenuEnClDeBouteille1 = bouteille1.donneContenuEnCl();
		
		boolean estPleine = bouteille1.estPleine();
		
		boolean ouvrir = bouteille2.ouvrir();
		
		boolean fermer = bouteille3.fermer();
		
		//test remplir bouteille ferme
		Bouteille b1= new Bouteille(1,0.5f,false,"Ricard");
		boolean r1= b1.remplir(0.2f);
		
		Bouteille b2 = new Bouteille(1, 0.7f,true,"Champagne");
		boolean r2= b2.remplir(0.3f);
		
		Bouteille b3 = new Bouteille(1, 1.3f,true,"Bordeaux 1985");
		boolean r3= b3.remplir(0.5f);
		
		Bouteille b4 = new Bouteille(2,1.6f,true,"Pinot noir");
		boolean r4= b4.fermer();
		
		Bouteille b5 = new Bouteille(3,2.5f,true, "savagnin");
		boolean r5 = b5.vider(0.5f);
		
		boolean remplir = bouteille1.remplir(contenuEnClDeBouteille1);
		
		boolean vider = bouteille1.vider(contenuEnClDeBouteille1);
		
		
		
}
	
}
