import java.util.LinkedList;

public class MainParaTestear {

	public static void main(String[] args) throws Exception {

		Boolean nuevaConsulta;
		InputProvider inputProvider = new InputProvider();
		Conversacion.mensajeInicial();
		Conversacion.preguntaNombrePersona();
		Persona persona = new Persona(inputProvider.getStringInput());
		do {
			System.out.println(persona.getNombre());
			Conversacion.preguntaTipoConsulta();
			AnalizadorConsulta analizadorConsulta = new AnalizadorConsulta(inputProvider.getStringInput());
			while(!analizadorConsulta.analizarConsulta()) {
				Conversacion.preguntaTipoConsulta();
				analizadorConsulta = new AnalizadorConsulta(inputProvider.getStringInput());
			}
			if(analizadorConsulta.getBusqueda().equals("titulo")) {
				LinkedList<Libro> libros = ConnectionManager.getLibrosTitulo(inputProvider.getStringInput());
				if(!libros.isEmpty()) {				
					for(Libro libro : libros) 
						Conversacion.libroEncontrado(libro);				
				}
				else Conversacion.libroNoEncontrado();
			}
			else {
				LinkedList<Libro> libros = ConnectionManager.getLibrosAutor(inputProvider.getStringInput());
				if(!libros.isEmpty()) {				
					for(Libro libro : libros) 
						Conversacion.libroEncontrado(libro);				
				}
				else Conversacion.consultaNoEncontrada();
			}
			Conversacion.preguntaNuevaConsulta();
			if(inputProvider.getStringInput().equalsIgnoreCase("si")) nuevaConsulta = true;
			else nuevaConsulta = false;
		}while(nuevaConsulta);
		Conversacion.mensajeFinal();
	}
}