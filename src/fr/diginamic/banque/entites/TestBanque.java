package fr.diginamic.banque.entites;


public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dans la méthode main, créez une instance de la classe Compte avec un numéro et un solde de votre choix.
		Compte cpt0 = new Compte ("JN234509",5678012);
		//Compte cpt2= new CompteTaux("6789087P", 678904444, 0.3);
		
		// affichez l’instance créée avec System.out.println(...)
		System.out.println(cpt0);
		CompteTaux cptTaux = new CompteTaux("2345678L", 4567908, 0.5);
		
		// Créez un tableau de comptes. Dans ce tableau, stockez 2 instances de comptes :
		Compte[] comptes = new Compte[2];
		comptes[0] = cpt0;
		comptes[1] = cptTaux;
		
		// Faites une boucle sur le tableau et affichez les informations des comptes avec un System.out.println.
		
		for (int i=0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
		}
		
	}
	
		
			
}