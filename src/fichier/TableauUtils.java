package fichier;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class TableauUtils {

//	lire le contenue du ficier csv avec le format demande

	public static Tableau read(String cheminFichier) {
//
		Tableau tableau = new Tableau();
//
		List<String> lines = null;

		try {
			

			File file = new File(cheminFichier);
			lines = FileUtils.readLines(file, "UTF-8");

			lines.remove(0);

			for (String line : lines) {

				ParserVille.addLine(tableau, line);
			}
			return tableau;

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());

			return null;

		}

	}
}
