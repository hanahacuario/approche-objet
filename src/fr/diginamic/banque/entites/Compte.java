package fr.diginamic.banque.entites;

public class Compte {
	//private int numero, solde;
	private String numero;
	private double solde;
	
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
