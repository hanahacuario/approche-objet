package listes;

import java.util.ArrayList;

public class CreationListe {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int[] nombre = new int[100];

		for (int i = 0; i < nombre.length; i++) {
			nombre[i] = i + 1;
			numbers.add(i);
		}
		System.out.println("La taille de la liste est: " + numbers.size());

	}
}
