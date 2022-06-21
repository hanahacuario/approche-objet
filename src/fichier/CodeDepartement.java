package fichier;

import java.util.ArrayList;
import java.util.List;

public class CodeDepartement {

//objets

	private String codeDepartement;

	private int populationTotal;

	private List<NomVille> villes = new ArrayList<>();

//Constructor

	public CodeDepartement(String codeDepartement) {
		super();
		this.setCodeDepartement(codeDepartement);
	}

//Ajouter villes

	public void addVille(NomVille ville) {
		villes.add(ville);
		this.populationTotal = this.populationTotal + ville.getPopulationTotal();

	}

//Getters and Setters

	public List<NomVille> getVilles() {
		return villes;
	}

	public void setVilles(List<NomVille> villes) {
		this.villes = villes;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public CodeDepartement(int populationTotal) {
		super();
		this.populationTotal = populationTotal;
	}

}
