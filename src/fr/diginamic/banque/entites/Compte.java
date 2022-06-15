package fr.diginamic.banque.entites;

public class Compte {
	//a. la classe Compte a 2 attributs d’instance :
	//i. le numéro de compte
	//ii. le solde du compte

	//private int numero, solde;
	private String numero;
	private double solde;
	// un constructeur avec le numéro de compte et le solde.
	public Compte(String numero, double solde) {
		super();
		this.numero = numero;
		this.solde = solde;
		
	}
	public String toString(){ return " le numero de compte est: " + numero + " " + " le solde du compte est: " + solde;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

}
