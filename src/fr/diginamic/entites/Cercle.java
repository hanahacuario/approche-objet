package fr.diginamic.entites;

public class Cercle {
	// cette classe a un seul attribut d’instance : son rayon de type double

	double rayon;

	// Créez un constructeur pour cette classe avec le rayon en paramètre.

	public Cercle(double rayon) {

		this.rayon = rayon;
	}
	// Créez une méthode qui retourne le périmètre du cercle
	// Périmètre du cercle = rayon x 2 x π

	public double perimetre() {
		return (this.rayon * 2 * Math.PI);

	}

	// Créez une méthode qui retourne la surface du cercle.
	// S cercle = π (Pi) x rayon² (rayon au carré)
	public double surface() {
		return (Math.PI * this.rayon * this.rayon);

	}

}
