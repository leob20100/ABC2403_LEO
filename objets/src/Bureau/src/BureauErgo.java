import java.math.BigDecimal;

public class BureauErgo {

	private boolean branche;
	private BigDecimal hauteur1EnCm;
	private BigDecimal hauteur2EnCm;
	private BigDecimal hauteurEnCm;
	private final BigDecimal hauteurMaxEnCm;
	private final BigDecimal hauteurMinEnCm;
	private BigDecimal hauteur3EnCm;
	
	public BureauErgo() {
		branche = true;
		hauteur1EnCm = BigDecimal.valueOf(70);
		hauteur2EnCm = BigDecimal.valueOf(73);
		hauteurEnCm = BigDecimal.valueOf(80);
		hauteurMaxEnCm = BigDecimal.valueOf(120);
		hauteurMinEnCm = BigDecimal.valueOf(70);
		hauteur3EnCm = BigDecimal.valueOf(110);
	}
	
	public BureauErgo (boolean _branche, BigDecimal _hauteur1EnCm, BigDecimal _hauteur2EnCm, BigDecimal _hauteurEnCm, final BigDecimal _hauteurMaxEnCm, final BigDecimal _hauteurMinEnCm, BigDecimal _hauteur3EnCm) {
		
		this.branche = _branche;
		this.hauteur1EnCm = _hauteur1EnCm;
		this.hauteur2EnCm = _hauteur2EnCm;
		this.hauteurEnCm = _hauteurEnCm;
		this.hauteurMaxEnCm = _hauteurMaxEnCm;
		this.hauteurMinEnCm = _hauteurMinEnCm;
		this.hauteur3EnCm = _hauteur3EnCm; 
		
		
	}
	
	
	public boolean brancher () {
		
		boolean bureauReussisABranche = false;
		if (branche == true) {
			bureauReussisABranche = false;
		}
		else {
			branche = true;
			bureauReussisABranche = true;
		}
		
		return bureauReussisABranche;
		
	}
	
	public boolean positionnerALaHauteur( BigDecimal nouvelleHauteur) {
		
		boolean retour = false;
		if (this.branche
				&& nouvelleHauteur.compareTo(hauteurMaxEnCm)==-1
				&& nouvelleHauteur.compareTo(hauteurMinEnCm)==1) {
			retour = true;
			hauteurEnCm=nouvelleHauteur;
			
		}
		return retour;
		
	}
		
		
	
}


