
public class MainParaTestear {

	public static void main(String[] args) {
		
		for(Libro libro : ConnectionManager.getLibrosCategoria("ama")) {
			System.out.println(libro.toString());
		}
		
		System.out.println(ConnectionManager.getRespuesta("2"));

	}

}
