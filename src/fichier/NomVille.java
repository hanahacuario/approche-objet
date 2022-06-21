package fichier;

public class NomVille {

//	creation de ville
//	1. je declare le code du departement

	private String codeDepartement;

//	2. je declare le nom de la ville

	private String nomVille;

//	3. je declare la population total

	private int populationTotal;

//Constructor:
	public NomVille(String nomVille,String codeDepartement,  int populationTotal) {
		super();
		this.codeDepartement = codeDepartement;
		this.nomVille = nomVille;
		this.populationTotal = populationTotal;

	}
	
	@Override
	public String toString() {
		return "Code de departement : " + codeDepartement + " - Ville : " + nomVille + " - population total : ="
				+ populationTotal;
	}	
	
//Getters and Setters
	
	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public int getPopulationTotal() {
		return populationTotal;
	}

	public void setPopulationTotal(int populationTotal) {
		this.populationTotal = populationTotal;
	}



	
}
