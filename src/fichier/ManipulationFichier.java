package fichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ManipulationFichier {

	public static void main(String[] args) throws IOException {

		// Lire le contenu du fichier csv

		Path readFile = Paths.get(args[0]);
		List<String> lines = Files.readAllLines(readFile, StandardCharsets.UTF_8);

		// List<String> is a List of Strings (i.e. a List containing String elements).
		// List<String>[] is an array of Lists of Strings (i.e. an array whose elements
		// are List<String>.

		// la liste newLines va accueillir les villes de plus de 25000 habitants, avec
		// uniquement le code departement, nom de la ville et la population totale

		List<String> newLines = new ArrayList<>();

		// Add first line, intitule
		newLines.add("Code Departement; Nom de la Ville; Population totale");

		// On commence la lecture du fichier par la ligne une, pour ne pas prendre en
		// compte la premiere ligne

		for (int i = 1; i < lines.size(); i++) {

			String line = lines.get(i);

			// split the line using ";"
			String[] tokens = line.split(";");

			// On recupere le marceau #9 ou indice[9], ce marceau contient l'information de
			// population. Mais d'abbord il faut eliminer les espaces dans les chiffres de
			// la population.

			String strPopulation = tokens[9].trim().replace(" ", "");

			// convertir strPopulation en int

			int population = Integer.parseInt(strPopulation);

			int populationMin = 25000;

			// uniquement pour les villes > 25000 on va uniquement stocker les informations
			// code departement , nom de la ville, et population.

			if (population > populationMin) {
				String linesOut = tokens[2] + ";" + tokens[6] + ";" + population ;

				newLines.add(linesOut);

			}

		}
		
		Files.write(Paths.get("/Users/anah/Documents/cours_java/"+"populationMin"+".csv"),newLines);
		
	}
}