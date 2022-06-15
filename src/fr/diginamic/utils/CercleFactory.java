package fr.diginamic.utils;

import fr.diginamic.entites.Cercle;

public class CercleFactory {
	// Dans ce package créez une classe CercleFactory 
	// cette classe a une méthode de classe (static) qui prend en paramètre un double et retourne un Cercle
	
	public static Cercle CreerCercle (double rayon) {
		return new Cercle(rayon);
	}

}