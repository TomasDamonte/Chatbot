import java.util.LinkedList;

public class MainParaTestear {

	public static void main(String[] args) throws Exception {
		Conversacion conversacion = new Conversacion();
		InputProvider inputProvider = new InputProvider();
		conversacion.mensajeInicial();
		String input = inputProvider.getStringInput();
		AnalizadorConsulta analizadorConsulta = new AnalizadorConsulta(input);
		analizadorConsulta.analizarConsulta();
		String libro = input.split("libro")[1].trim();
		if(ConnectionManager.getLibrosTitulo(libro).size() == 0)
			conversacion.libroNoEncontrado();
		else {
			LinkedList<Libro> libros = ConnectionManager.getLibrosTitulo(libro);
			for(Libro item : libros)
				conversacion.libroEncontrado(item);
		}		
		
	}
}