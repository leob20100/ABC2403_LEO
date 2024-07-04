
 public class Bouteille {
	// attributes
	private float contenanceEnL;
	private float contenuEnL;
	private boolean ouvert;
	private String typeDeContenu;
	//access / modifier
	
	// constructor par défaut
	public Bouteille() {
		
		contenanceEnL = 1;
		 contenuEnL = 1;
		 ouvert = false;
		 typeDeContenu = "H2O";
	}
	
	// constructeur classique
	
	public Bouteille(float _contenanceEnL, float _contenuEnL, boolean _ouvert, String _typeDeContenu) {
		this.contenanceEnL = _contenanceEnL;
		this.contenuEnL = _contenuEnL;
		this.ouvert = _ouvert;
		this.typeDeContenu = _typeDeContenu;
	}
	
	// constructeur par recopie ou de clonage
	
	public Bouteille(Bouteille _bouteilleARecopier) {
		this.contenanceEnL = _bouteilleARecopier.contenanceEnL;
		this.contenuEnL = _bouteilleARecopier.contenuEnL;
		this.ouvert = _bouteilleARecopier.ouvert;
		this.typeDeContenu = _bouteilleARecopier.typeDeContenu;
		
		//_bouteilleARecopier.typeDeContenu = "Champagne";
	}

	
	// methods

	public float donneContenanceEnCl() {
		float result;
		result = this.contenanceEnL*100;
		return result;
	}
	
	public float donneContenuEnCl() {
		float resultat2;
		resultat2 = this.contenuEnL*100;
		return resultat2;
	}
	
	public boolean estPleine() {
		boolean bouteilleEstPleine = false;
		if (contenuEnL == contenanceEnL) {
			bouteilleEstPleine = true;
		}
		return bouteilleEstPleine;
		
	}
	
	public boolean remplir(float quantite) {
		boolean retour = false;
		
		if (this.ouvert 
				&& quantite<=(this.contenanceEnL - this.contenuEnL)) {
			retour = true;
			contenuEnL +=  quantite;
		}
	
		
		return retour;
		
		
	}
	
	public boolean ouvrir() {
		
		boolean bouteilleAReussisAOuvrir = false;
		if (ouvert == true) {
			bouteilleAReussisAOuvrir = false;
		}
		else {
			ouvert = true;
			
		}
		return bouteilleAReussisAOuvrir;
	}
	
	public boolean fermer() {
		
		boolean bouteilleAReussisAFermee = false;
		
		if(ouvert == false) {
			bouteilleAReussisAFermee = true;
		}
		else {
			ouvert = true;
		}
		return bouteilleAReussisAFermee;
	}
	
	public boolean vider (float quantite) {
		
		boolean retour;
		
		if (this.ouvert
				&& quantite>=(this.contenanceEnL - this.contenuEnL)) {
			retour = true;
			contenuEnL -= quantite;
		}
		else {
			retour = false;
		}
		return retour;
		
	}
	
	}

