

public class TesteoDB {

	public static void main(String[] args) {		
		
		for(Libro libro : ConnectionManager.getLibrosMateria("ramac")) {
			System.out.println(libro.toString());
		}
		
	}

}
