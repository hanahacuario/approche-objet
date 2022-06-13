package entites2;

import entites.AdressePostale;

public class PersonneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Modifiez la classe TestPersonne afin d’utiliser le nouveau constructeur de la
		// classe Personne.

		AdressePostale adr1 = new AdressePostale(6, "mathurin regnier", 75015, "Paris");
		AdressePostale adr2 = new AdressePostale(8, "fontaine au roi", 75011, "Paris");

		Personne pers1 = new Personne("HERNANDEZ", "Ana", adr1);
		pers1.afficherIdentite();

		Personne pers2 = new Personne("CHAPARRO", "Angelica", adr2);
		pers2.afficherIdentite();

	}

}
