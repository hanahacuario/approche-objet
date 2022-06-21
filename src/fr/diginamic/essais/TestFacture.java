package fr.diginamic.essais;

import fr.diginamic.entites.Facture;

public class TestFacture {

	public static void main(String[] args) {
		Facture fact = new Facture(50);
		
		System.out.println(fact.addKwh(30));
		System.out.println(fact.calculTTC());
		System.out.println(fact.calculTTC());
		
		
	}

}
