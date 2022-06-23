package maps;

public class TestEquals {

	public static void main(String[] args) {
		
		//Vérifiez que la méthode equals retourne true pour 2 instances de villes qui ont les mêmes attributs.
		
		NomVille ville1 = new NomVille("Nice", 06, 343000);
		NomVille ville2 = new NomVille("Nice", 06, 343000);
		
		System.out.println("Equals retourne true pour les deux isntances de villes qui ont les mêmes attributs: ");
		System.out.println(ville1.equals(ville2));
		
//		Vérifiez maintenant que la méthode retourne false si vous changez un des attributs.
		
		NomVille ville3 = new NomVille("Nice", 07, 343000);
		NomVille ville4 = new NomVille("Nice", 06, 343000);
		
		System.out.println("Equals retourne false si on change un des attributs: ");
		System.out.println(ville3.equals(ville4));


	}

}
