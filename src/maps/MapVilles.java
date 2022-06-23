package maps;

import java.util.HashMap;
import java.util.Map;

public class MapVilles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		• Dans ce TP nous allons retravailler avec la classe Ville et les informations des TPs
//		précédent.
//		• Dans cette classe, créez une map permettant de stocker les instances de villes (valeur)
//		en fonction de leur nom (clé).

		Map<String, NomVille> mapVilles = new HashMap<>();
		mapVilles.put("Nice", new NomVille("Nice", 06, 343000));
		mapVilles.put("Carcassone", new NomVille("Carcassone", 11, 47800));
		mapVilles.put("Narbonne", new NomVille("Narbonne", 11, 53400));
		mapVilles.put("Lyon", new NomVille("Lyon", 60, 48400));
		mapVilles.put("Foix", new NomVille("Foix", 19, 9700));
		mapVilles.put("Pau", new NomVille("Pau", 64, 9700));
		mapVilles.put("Marseille", new NomVille("Marseille", 13, 9700));
		mapVilles.put("Tarbes", new NomVille("Tarbes", 65, 9700));

	}

}
