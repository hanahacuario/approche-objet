package fr.diginamic.banque.entites;

public class TestOperation {

	public static void main(String[] args) {
		// definir variable resultat
		int resultat = 0;
		// créez un tableau d’opérations avec au moins 4 opérations de crédits et de
		// débits dans le tableau.
		// creer les 4 instances
		Credit credit1 = new Credit("18/03/2020", 789);
		Credit credit2 = new Credit("20/07/1999", 5000);
		Debit debit1 = new Debit("04/11/2000", 478);
		Debit debit2 = new Debit("12/05/2010", 650);

		// creer le tableau operations
		Operation[] operations = new Operation[4];
		operations[0] = credit1;
		operations[1] = credit2;
		operations[2] = debit1;
		operations[3] = debit2;

		// Faites une boucle sur le tableau d’opérations pour afficher les informations
		// suivantes :
		// i. la date de l’opération
		// ii. le montant de l’opération

//		//for (int i =0; i< operations.length; i++) {
//			System.out.println(operations[i]);
//		}

		// Modifiez la boucle précédente et affichez également le type des opérations.
		for (int i = 0; i < operations.length; i++) {
			switch (operations[i].getType()) { // switch Use the switch statement to select one of many code blocks to
												// be executed.
			case "DEBIT":
				resultat -= operations[i].getMontant();
				break;

			case "CREDIT":
				resultat += operations[i].getMontant();
				break;

			}
			System.out.println(operations[i]+ " " + operations[i].getType());

		}
		// Calculez enfin le montant global de toutes les opérations :
		// a. si c’est une opération au débit utilisez l’opérateur « – » pour le calcul.
		// b. si c’est une opération au crédit, utilisez l’opérateur « + » pour le calcul.
		
		System.out.println("Montant global des operations: " + resultat);
	}

}
