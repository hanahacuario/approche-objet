package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// Instanciez 2 cercles différents et affichez les résultats des méthodes de
		// calcul de périmètre et de calcul de surface

		Cercle cercle1 = new Cercle(18);
		Cercle cercle2 = new Cercle(55);
		// dans la classe TestCercle, faites appel à la méthode static de CercleFactory
				// pour créer vos cercles.

		Cercle cercle3 = CercleFactory.CreerCercle(60.3);
		Cercle cercle4 = CercleFactory.CreerCercle(49.5);

		System.out.println("le perimetre du premier cercle est: " + cercle1.perimetre()
				+ " et la surface du premier cercle est: " + cercle1.surface());
		System.out.println("le perimetre du deuxieme cercle est: " + cercle2.perimetre()
				+ " et la surface du premier cercle est: " + cercle2.surface());
		System.out.println("le perimetre du troisieme cercle est: " + cercle3.perimetre()
		+ " et la surface du premier cercle est: " + cercle3.surface());
		System.out.println("le perimetre du quatrieme cercle est: " + cercle4.perimetre()
		+ " et la surface du premier cercle est: " + cercle4.surface());

		
		
	
	}

}
