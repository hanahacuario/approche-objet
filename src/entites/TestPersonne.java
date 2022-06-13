package entites;

import entites2.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AdressePostale a = new AdressePostale();
		a.numeroRue = 6;
		a.libelleRue = "mathurin regnier";
		a.codePostal = 75015;
		a.Ville = "Paris";
		
		AdressePostale d = new AdressePostale();
		d.numeroRue = 8;
		d.libelleRue = "de la Rochefoucauld";
		d.Ville = "Paris";
		
		
		// premiere instance
				Personne cp = new Personne();
				cp.nom = "Ana";
				cp.prenom = "Hernandez";
				cp.adresse = a; 
				
				
				// deuxieme instance
				
				Personne dp = new Personne();
				dp.nom = "Angelica";
				dp.prenom = "Chaparro";
				dp.adresse =d;
				
				
				
				
				
				
				
	}

}
