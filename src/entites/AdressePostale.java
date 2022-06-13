package entites;
//Variables d'instance

// elle doit avoir les 4 attributs suivants : numéro de rue, libellé de la rue, code postal et ville.
public class AdressePostale {
	int numeroRue;
	String libelleRue;
	int codePostal;
	String Ville;
	
	/** Constructeur avec 4 parametres
	 
	 */
	public AdressePostale (int nvNumeroRue, String nvLibelleRue, int nvCodePostal, String nvVille ) {
		numeroRue = nvNumeroRue;
		libelleRue = nvLibelleRue;
		codePostal = nvCodePostal;
		Ville = nvVille;
			
		}

}


