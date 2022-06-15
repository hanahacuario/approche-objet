package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;
	
	//Ajoutez un second constructeur à la classe Personne avec les 3 paramètres permettant de valoriser les attributs nom, prenom et adresse.
	
	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;

	}
	//public Personne(String string, String string2, int i, String string3, int j, String string4) {
		// TODO Auto-generated constructor stub
	
	// Ajoutez un constructeur à la classe Personne avec les paramètres permettant de valoriser nom et prénom.
	public void afficherIdentite() {
		System.out.println("Je m'appelle " + prenom + " " + nom.toUpperCase()+ " "+ adresse );
	}

  }
