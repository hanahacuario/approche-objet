package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
	
		System.out.println("Calcul de + : " + Operations.Calcul(29.3, 79, '+'));
		System.out.println("Calcul de - : " + Operations.Calcul(5, 2, '-'));
		System.out.println("Calcul de * : " + Operations.Calcul(38.2, 7, '*'));
		System.out.println("Calcul de / : " + Operations.Calcul(45, 3, '/'));
		
	}

}
