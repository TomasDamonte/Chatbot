import java.util.ArrayList;

public final class Conversacion {
	
	public static void mensajeInicial() {
		System.out.println("Buenos dias. Mi nombre es Amy. Soy un asistente automatizado y "
				+ "quiero ser de utilidad para usted. Por favor, digame que esta buscando,"
				+ " y vere si podemos localizarlo en nuestra biblioteca.");
	}
	
	public static void preguntaNombrePersona() {
		System.out.println("¿Para conocerlo mejor, me podria decir su nombre?");
	}
	
	public static void preguntaTipoConsulta() {
		System.out.println("¿Esta buscando un libro en especifico o un autor?");
	}
	
	public static void preguntaEspecificarConsulta(String consulta) {
		System.out.println("¿cual es el nombre del " + consulta + " que esta buscando?");
	}
	
	public static void mensajeFinal() {
		System.out.println("¡Me alegra poder haber sido de utilidad. Vuelva pronto!");
	}
	
	public static void preguntaLibroEncontrado() {
		System.out.println("¿Es esto lo que estaba buscando? ");
	}
	
	public static void preguntaNuevaConsulta() {
		System.out.println("¿Lo puedo ayudar en algo mas?");
	}
	
	public static void libroEncontrado(Libro libro) {
		System.out.println("Tenemos en nuestra biblioteca el siguiente libro: " + libro.toString());
	}
	
	public static void libroNoEncontrado() {
		System.out.println("Lamentablemente nuestra biblioteca no cuenta con el libro que esta buscando."
				+ " Sepa disculpar las molestias ocasionadas.");
	}
	
	public static void recomendacion(ArrayList<Libro> lista_libros, Busqueda busqueda) {
		System.out.println("Le puedo recomendar estos libros que estan fuertemente relacionados con "
				+ "el " + busqueda.getBusqueda() + " que esta buscando: ");
		for (Libro libro : lista_libros) {
			System.out.println(libro.toString());
		}
	}
	
}
