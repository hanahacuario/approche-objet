package fr.diginamic.essais;

import fr.diginamic.entites.Ampoule;

public class TestAmpoule {

	public static void main(String[] args) {
		
//Instanciez une Ampoule
	Ampoule amp = new Ampoule();
	
	
	System.out.println("l'etat de l'ampoule est:" + amp);
	
	amp.clic();
	
	System.out.println("l'etat de l'ampoule apres le clic est: " + amp);
	
	}

}
