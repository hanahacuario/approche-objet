package listes;

import java.util.ArrayList;
import java.util.List;

public class Fusionliste {

	public static void main(String[] args) {

		List<String> liste1 = new ArrayList<String>();
		liste1.add("Rouge");
		liste1.add("Vert");
		liste1.add("Orange");

		List<String> liste2 = new ArrayList<String>();
		liste2.add("Blanc");
		liste2.add("Bleu");
		liste2.add("Orange");
		
		// Create a new list3 that will be the fusion of list1 and list2
		
		List<String> liste3 = new ArrayList<String>();
		
		// print the 2 lists
		
		System.out.println("Liste1 : " + liste1 + " Liste2 : " + liste2);
		
		// join the 2 lists
		liste3.addAll(liste1);
		liste3.addAll(liste2);
		
		System.out.println("Les deux listes fusionees cree la liste3 :" + liste3);
		
	}

}
