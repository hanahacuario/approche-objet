package maps;

import java.util.HashMap;

public class CreationMap {

// Créez une map nommée mapSalaires et qui permet de stocker les informations
// de salaire (valeur) en fonction du prénom de la personne (clé).	

	public static void main(String[] args) {
		HashMap<String, Integer> mapSalairesc = new HashMap<>();
		mapSalairesc.put("Paul", 1750);
		mapSalairesc.put("Hicham", 1825);
		mapSalairesc.put("Yu", 2250);
		mapSalairesc.put("Ingrid", 2015);
		mapSalairesc.put("Chantal", 2418);

// o Une fois la map créée, affichez sa taille	

		System.out.println("La taille du mapSalaires est: " + mapSalairesc.size());
	}

}
