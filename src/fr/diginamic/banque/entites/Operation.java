package fr.diginamic.banque.entites;

public abstract class Operation {
	// Elle doit être abstraite
	// Elle a 2 attributs

//	i. la date de l’opération (au format String pour l’instant)
	String date;
//	ii. le montant de l’opération.	
	int montant;

	// Elle a un constructeur avec 2 arguments : date et montant
	public Operation(String date, int montant) {

		this.date = date;
		this.montant = montant;
	}

	public String toString() {
		return "date d'operation" + " " + this.date + " montant d'operation " + this.montant;

	}

	// Dans la classe Operation, ajoutez la méthode abstraite suivante : String
	// getType()
	
	public String getType() {
		return "";
		
	}
	public int getMontant() {
		return this.montant;
	}
	
}
