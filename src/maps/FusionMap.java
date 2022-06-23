package maps;

import java.util.HashMap;

public class FusionMap {

	public static void main(String[] args) {
		// Création map1

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");
		map1.put(1, "Rouge");

		// Création map2

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

//		Créer une map appelée map3 et qui contient l’ensemble des données des 2 maps précédentes avec les mêmes clés et les mêmes valeurs

		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		map3.putAll(map1);
		map3.putAll(map2);

//		Aficher le contenue du map3

		System.out.println("l'ensemble des valeurs contenues dans la map3 sont: ");

		for (Integer key : map3.keySet()) {
			System.out.println(key + " - " + map3.get(key));
		}

//		une autre facon de faire
		HashMap<Integer, String> map4 = new HashMap<Integer, String>(map1);

		map4.putAll(map2);

//      Aficher le contenue du map3

		System.out.println("l'ensemble des valeurs contenues dans la map4 sont: ");

		for (Integer key : map4.keySet()) {
			System.out.println(key + " - " + map4.get(key));
		}

	}

}
