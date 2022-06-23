package maps;

public class NomVille {

//	creation de ville
//	1. je declare le code du departement

	private int codeDepartement;

//	2. je declare le nom de la ville

	private String nomVille;

//	3. je declare la population total

	private int populationTotal;

//Constructor:
	public NomVille(String nomVille,int codeDepartement,  int populationTotal) {
		super();
		this.codeDepartement = codeDepartement;
		this.nomVille = nomVille;
		this.populationTotal = populationTotal;

	}
// equals
	@Override
	public boolean equals(Object obj) {
		// etape 1 : est-ce que obj es une ville
		
		if (!(obj instanceof NomVille)) {
			return false;
		}
		// etape 2 : nom obj est bien une ville => cast pour transformer obj en ville
		
		NomVille autre = (NomVille) obj;
		
		// etape 3: generer l'expression logique pour tester l'egqlite de deux villes
		
		return nomVille.equals(autre.getNomVille()) && codeDepartement==autre.getCodeDepartement() && populationTotal==autre.getPopulationTotal();
		
	}
	
	@Override
	public String toString() {
		return "Code de departement : " + codeDepartement + " - Ville : " + nomVille + " - population total : ="
				+ populationTotal;
	}	
	
//Getters and Setters
	
	public int getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(int codeDepartement) {
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
