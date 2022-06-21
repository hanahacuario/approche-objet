package fichier;

public class File {
	
	public static void main(String[] args) {
		
		String filePath = ClassLoader.getSystemClassLoader().getResource("recensement.csv").getFile();	
		
		Tableau tableau = TableauUtils.read(filePath);
		
			System.out.println(tableau);
		
				}

}
