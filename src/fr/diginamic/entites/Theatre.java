package fr.diginamic.entites;

public class Theatre {
	// ette classe a 4 attributs d’instance :
	// ▪ son nom
	// ▪ sa capacité max (en nb de personnes) ▪ le total de clients inscrits
	// ▪ la recette totale de l’établissement
	
	String nom; // nom du theatre
	int capaciteMax = 150; // capacite en nombre de personnes
	int totalInscrits; // total de personnes inscrits
	double RecetteTotal; // Recette total du theatre
	
	// Créez une méthode inscrire qui prend en paramètres : 
	// ▪ le nombre de clients
	// ▪ le prix de la place
	
	public void Inscrire(int nombreClients, double prixplace) {
		
	// Cette méthode effectue le traitement suivant :
	// 	▪Si la capacité max du théâtre n’est pas atteinte, elle met à jour le nombre total de clients inscrits ainsi que la recette totale de l’établissement
	//	▪ Si la capacité max est atteinte, elle affiche un message d’erreur.	
		if(this.totalInscrits < capaciteMax) {
			this.totalInscrits += nombreClients; //The addition assignment operator ( += ) adds the value of the right operand to a variable and assigns the result to the variable
			this.RecetteTotal +=prixplace;
		}
		else {
			System.out.println("la capacité max est atteinte");
		}
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapaciteMax() {
		return capaciteMax;
	}

	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	public int getTotalInscrits() {
		return totalInscrits;
	}

	public void setTotalInscrits(int totalInscrits) {
		this.totalInscrits = totalInscrits;
	}

	public double getRecetteTotal() {
		return RecetteTotal;
	}

	public void setRecetteTotal(double recetteTotal) {
		RecetteTotal = recetteTotal;
	}


}
