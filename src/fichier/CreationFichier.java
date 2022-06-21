package fichier;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreationFichier {

	public static void main(String[] args) {
		// Générez un fichier cible :
		// au format CSV (séparateur ;
		// ne contenant que les villes de plus de 25000 habitants
		// avec seulement 3 informations : le nom de la ville, le code département et la
		// population totale.

		// j'utilise Stringbuilder pour creer la premier ligne du fichier avec les
		// intitules de colonnes

		StringBuilder sb = new StringBuilder();

		sb.append("Code département").append(",").append("Ville").append(",").append("Population total").append("\n");

		// j'utilise try avec un if pour creer le nouveau fichier avec la premiere
		// colonne
		// le if me permet de creer uniqueent le fichier s'il n'a pas ete cree au
		// paravant

		try (FileWriter fw = new FileWriter("/Users/anah/Documents/villes25000.csv")) {
			fw.write(sb.toString());

			File newFile = new File("villes25000.csv");
			if (newFile.createNewFile()) {

				System.out.println("File Created: " + newFile.getName());

			} else {
				System.out.println("file already exists");
			}

		} catch (IOException e) {
			System.out.println("Error");

			e.printStackTrace();
		}

		System.out.println("--------------------");

	}

}
