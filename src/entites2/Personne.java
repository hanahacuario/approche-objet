package entites2;

import entites.AdressePostale;

public class Personne {
	public String nom;
	public String prenom;
	public AdressePostale adresse;

	// Ajoutez un second constructeur à la classe Personne avec les 3 paramètres
	// permettant de valoriser les attributs nom, prenom et adresse.

	public Personne(String nom, String prenom, AdressePostale adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;

	}
	// public Personne(String string, String string2, int i, String string3, int j,
	// String string4) {
	// TODO Auto-generated constructor stub

	// Ajoutez un constructeur à la classe Personne avec les paramètres permettant
	// de valoriser nom et prénom.

	public void afficherIdentite() {
		System.out.println("Je m'appelle " + prenom + " " + nom);

	}

	// ajoutez une méthode qui permet d’afficher le nom et le prénom avec le nom de
	// famille en majuscules.
	public String toString() {
		return this.nom.toUpperCase() + " " + this.prenom.toLowerCase();
	}

	// ajoutez une méthode qui prend un argument en paramètre et permet de modifier
	// la variable d’instance nom de Personne.
	// public
	public void SetNom(String nom) {
		this.nom = nom;

	}

	// ajoutez une méthode similaire pour modifier le prénom.
	public void SetPrenom(String prenom) {
		this.prenom = prenom;

	}

	// ajoutez une méthode similaire pour modifier l’adresse.
	public void SetAdresse(AdressePostale nvadresse) {
		this.adresse = nvadresse;

	}

	public void SetAdresse(int numeroRue, String libelleRue, int codePostal, String ville) {
		this.adresse = new AdressePostale(numeroRue, libelleRue, codePostal, ville);

	}

	// ajoutez une méthode qui retourne le nom.
	public String GetNom() {
		return nom;

	}
	//ajoutez une méthode qui retourne le prénom.
	public String GetPrenom() {
		return prenom;
		
	}
	// ajoutez une méthode qui retourne l’adresse.
	public AdressePostale GetAdresse() {
		return adresse;
		
	}
}
