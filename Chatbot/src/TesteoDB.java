

public class TesteoDB {

	public static void main(String[] args) {		
		
		for(Libro libro : ConnectionManager.getLibrosTitulo("pist")) {
			System.out.println(libro.toString());
		}
		
	}

}
