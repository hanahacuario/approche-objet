package fr.diginamic.essais;

import java.util.Formatter;

import fr.diginamic.entites.Facture;

public class TestFacture {

	public static void main(String[] args) {
		Facture fact = new Facture(50);
		
		
		
		System.out.println(fact.addKwh(30));
		System.out.println(fact.calculTTC());
		System.out.println(fact.calculHT());
		
		
		System.out.println(fact.toString());
		
		
		
	}

}
