import java.util.ArrayList;
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
			LinkedList<Libro> libros = new LinkedList<Libro>();
			if(analizadorConsulta.getBusqueda().equals("titulo")) {
				Conversacion.preguntaEspecificarConsulta("libro");
				libros = ConnectionManager.getLibrosTitulo(inputProvider.getStringInput());
			}
			else if(analizadorConsulta.getBusqueda().equals("autor")){
				Conversacion.preguntaEspecificarConsulta("autor");
				libros = ConnectionManager.getLibrosAutor(inputProvider.getStringInput());
			}
			else {
				ArrayList<String> categorias = ConnectionManager.getCategorias();
				Conversacion.categoriasDisponibles();		
				for(String categoria : categorias) 
					System.out.println(categoria);
				Conversacion.preguntaCategoria();
				libros = ConnectionManager.getLibrosCategoria(inputProvider.getStringInput());
			}
			if(!libros.isEmpty()) {				
				for(Libro libro : libros) 
					Conversacion.libroEncontrado(libro);				
			}
			else Conversacion.consultaNoEncontrada();
			Conversacion.preguntaNuevaConsulta();
			if(inputProvider.getStringInput().equalsIgnoreCase("si")) nuevaConsulta = true;
			else nuevaConsulta = false;
		}while(nuevaConsulta);
		Conversacion.mensajeFinal();
	}
}