package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> listeInt = new ArrayList<>();

		// Dans cette classe instanciez une ArrayList d’entiers et placez y les éléments
		// suivants :
		// -1, 5, 7, 3, -2, 4, 8, 5
		int[] first = { -1, 5, 7, 3, -2, 4, 8, 5 };

		for (int i : first) {
			listeInt.add(i);
		}

		// Affichez tous les éléments de la liste
		System.out.println("ListeInt : " + listeInt);

		// Affichez la taille de la liste
		System.out.println("La taille de la liste est: " + listeInt.size());

		// Recherchez et affichez le plus grand élément de la liste
		System.out.println("le plus grand élément de la liste = " + Collections.max(listeInt));

		// Recherchez et affichez le plus petit élément de la liste
		System.out.println("le plus petit élément de la liste = " + Collections.min(listeInt));

		// Supprimez le plus petit élément de la liste et affichez le résultat

		// definir une variable type int pour stocker le plus petit elelement de la
		// liste
		int min = Collections.min(listeInt);
		// create an iterator object
		Iterator<Integer> iter = listeInt.iterator();
		// Holds true till there is single element
		// remaining in the object
		while (iter.hasNext()) {
			// Remove the smaller element using
			// Iterator.remove()
			int x = (Integer) iter.next();
			if (x == min)
				iter.remove();
		}
		// print the new result
		System.out.println("Les valeurs de ListeInt apres avoir suprimer le plus ptetit element sont: " + listeInt);

		// Recherchez tous les éléments négatifs et modifiez les de manière à ce qu’ils
		// deviennent positifs.
		/*
		 * 
		 */
			
		}

	}


