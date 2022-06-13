package utils;

public class TestMethodeStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dans la méthode main, déclarez une variable de type chaine de caractères qui contient un nombre entier.
		String chaine = "1984";
		
		// Utilisez une méthode de la classe java.lang.Integer qui permet de convertir une chaîne de caractères en entier.
			// Déclarez une variable de type int pour récupérer le résultat de cette méthode.
		int i = Integer.parseInt(chaine);
		System.out.println(i);
		
		// Déclarez maintenant 2 variables de type int a et b
		int a = 18;
		int b = 45;
		
		//Utilisez une méthode de la classe Integer qui calcule le nombre maximum entre a et b.
		
		//Math.max(a, b);
		int max = Integer.max(a, b);
		
		// affichez le résultat de l’appel de cette méthode
		System.out.println("le nombre maximum entre a et b est: " + max);
		
		//System.out.println("le nombre maximum entre a et b est: " + Math.max(a, b));
		
		//System.out.println("Math.min(" + a + "," + b + ")=" + Math.min(a, b));
	}

}
