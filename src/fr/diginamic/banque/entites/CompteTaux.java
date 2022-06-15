package fr.diginamic.banque.entites;
// La classe CompteTaux hérite de comptes et va représenter le concept de compte rémunéré genre compte épargne logement, etc.

public class CompteTaux extends Compte {
// Cette classe CompteTaux a un attribut spécifique :
	double tauxRemuneration;
// Créez un constructeur dans cette classe avec 3 attributs: numéro de compte, solde, taux de rémunération

	public CompteTaux(String numeroCompte, int solde, double tauxRemuneration) {
		super(numeroCompte, solde);
		this.tauxRemuneration = tauxRemuneration;
	
	}
// redéfinissez la méthode toString() afin que :
//	1. cette dernière retourne les mêmes informations que celles de la classe mère mais avec le taux de rémunération en plus.
//  2. Pensez à utiliser la clause super pour appeler la méthode toString() de la classe mère
	
	@Override
	public String toString() {
		return (super.toString() +" " + "le taux de remuneration est: " + tauxRemuneration );
	}


	
}
