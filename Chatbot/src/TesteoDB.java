

public class TesteoDB {

	public static void main(String[] args) {		
		
		for(Libro libro : ConnectionManager.getLibros()) {
			System.out.println(libro.toString());
		}
		
	}

}
