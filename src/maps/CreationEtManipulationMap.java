package maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class CreationEtManipulationMap {

// Dans cette classe, la map nommée mapVilles contient les noms des préféctures
//	stockés par numéro de département.

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>(); // si je change HasMap par TreeMap cote gauche et cote droit. le resultat donne les cles triees.
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");

// Ajouter dans mapVilles les informations pour Lille, Lyon et Bordeaux

		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
// si je veux ecrasser une ligne, je mets la meme key avec un autre nom de ville. Ainsi
		
		mapVilles.put(59, "Tourcoing");

// Mettre en place une boucle pour afficher l'ensemble des clés contenues dans la map	

		Set<Integer> keys = mapVilles.keySet();
		
		System.out.println("l'ensemble de cles contenue dans la map sont: ");
		
		for (int key : keys) {
			System.out.println(key); // le resultat n'est pas trie car le set ne preserve pas l'odre d'insertion

		}
		System.out.println("-------------------------------");
		
// corrige
		
		System.out.println("corrige : l'ensemble de cles contenue dans la map sont: ");
		
		for(Integer key: mapVilles.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("-------------------------------");
		// Mettre en place une boucle pour afficher l'ensemble des valeurs contenues dans la map

		System.out.println("l'ensemble des valeurs contenues dans la map sont: ");
		for (String ville : mapVilles.values()) {
			System.out.println(ville);
		}
		
		System.out.println("-------------------------------");
		
		//Afficher la taille de la map
		
		System.out.println("la taille de la map est: ");
		
			System.out.println(mapVilles.size());
		}

	}


