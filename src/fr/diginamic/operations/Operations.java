package fr.diginamic.operations;

public class Operations {

	// cette classe a une méthode de classe calcul qui prend en paramètre 2 double a
	// et b et un opérateur qui est de type char.

	public static double Calcul(double a, double b, char operateur) {

		double calcul=0;

		switch (operateur) {
		case '+':
			calcul = a + b;
			break;

		case '-':
			calcul = a - b;
			break;
		case '*':
			calcul = a * b;
			break;
		case '/':
			calcul = a / b;
			break;
			
			

		}
		
		return calcul;
	}

}
