package fr.diginamic.entites;

public class Facture {
//	cette classe a 3 attributs d’instance :
//	▪ nbKwh : qui représente le nombre de kwh d’électricité consommé
//	▪ montantTTC : qui représente le prix TTC de la facture (=nbKwh *0.15) ▪ montantHT : qui représente le prix HT de la facture (=80% du prix TTC)
	
	int nbKwh;
	double montantTTC;
	double montantHT;

//	Créez un constructeur avec uniquement le nombre de kwh consommé initial et calcule les montants TTC et HT initiaux.	

	public Facture(int nbInitial) {
		this.nbKwh= nbInitial;
		this.montantTTC = nbInitial * 0.15;
		this.montantHT = montantHT * .80;
	}
// Créez une méthode addKwh(int nb) qui permet d’ajouter un nombre de kwh consommé à la facture et qui recalcule les montants HT et TTC.

	public int addKwh(int nb) {
		return this.nbKwh = this.nbKwh + nb;

	}

	public double calculTTC() {
		return (this.montantTTC = this.nbKwh * .15);

	}

	public double calculHT() {
		return (this.montantHT = this.montantTTC * .80);

	}

	@Override
	public String toString() {
		return "La consommation en nbKwh est: "+ this.nbKwh+  ",le montant HT est:" + String.format("%.2f", montantHT) + ", le montant de la facture TTC est: " + String.format("%.2f", montantTTC);
	}

}
