package fichier;

public class ParserVille {
	
//	Parser permet de constituer un tableau a partir des lignes du fichier

	public static void addLine (Tableau tableau, String line ) {
		
	
	
		String[] parts = line.split(";");
		String codeDep = parts[2];
		String nomVille = parts[6];
		String population = parts[8];
		int populationTotal = Integer.parseInt(population.replace(" ", "").trim());
		
		NomVille nomville = new NomVille(nomVille, codeDep, populationTotal );
		
		tableau.getVilles().add(nomville);
		
	}	
		
	
	
}
