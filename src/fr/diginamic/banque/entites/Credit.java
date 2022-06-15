package fr.diginamic.banque.entites;

public class Credit extends Operation { /// Elle hérite de Operation

	public Credit(String date, int montant) {
		super(date, montant);
		// TODO Auto-generated constructor stub
	}
	// Redéfinissez cette méthode dans la classe Debit pour qu’elle retourne « DEBIT
	// »

	public String getType() {
		return "CREDIT";
	}

}
