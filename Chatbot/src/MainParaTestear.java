
public class MainParaTestear {

	public static void main(String[] args) {
		
		for(Libro libro : ConnectionManager.getLibrosCatedra("ndol")) {
			System.out.println(libro.toString());
		}
		
		ConnectionManager.setRespuesta("chau");
	}

}
