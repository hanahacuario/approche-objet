package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String date, int montant) { // Elle hérite de Operation
		super(date, montant);
//		// TODO Auto-generated constructor stub
	}
	//  a. Redéfinissez cette méthode dans la classe Credit pour qu’elle retourne « CREDIT »
	
	public String getType() {
		return "DEBIT";
		
	}

}
