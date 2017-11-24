

public class TesteoDB {

	public static void main(String[] args) {		
		
		for(Libro libro : ConnectionManager.getLibrosAutor("kin")) {
			System.out.println(libro.toString());
		}
		
	}

}
