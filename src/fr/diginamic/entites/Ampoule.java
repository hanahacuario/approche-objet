package fr.diginamic.entites;

public class Ampoule {
	// cette classe a un seul attribut d’instance : son etat de type booléen.
	// ▪ Si etat=false alors l’ampoule est éteinte
	// ▪ Si etat=true alors l’ampoule est allumée

	private boolean etat;

	// creer un constructor sans parametre

	public Ampoule() {

		
		// Par défaut ce constructeur positionne l’etat de l’ampoule à false (éteint)
		this.etat = false;

	}

	// Créez une méthode clic() qui change l’état de l’ampoule.

	public void clic() {
		if (etat == false) {
			etat = true;

		} 
		else {
			etat = false;
		}
		
	}
//Redéfinissez la méthode toString() de manière à ce que cette dernière retourne l’état de l’ampoule sous la forme d’une chaine de caractères
	//▪ Si etat=false alors la méthode retourne « Eteinte »
	//▪ Si etat=true alors la méthode retourne « Allumée »
	@Override
	public String toString() {
		if (etat == false) {
			return "l'ampoule est etainte";
		
	}
		else {
			
		
			return "l'ampoule est allumee";
		}
	}
		
}


