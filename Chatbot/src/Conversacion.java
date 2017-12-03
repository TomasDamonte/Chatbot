import java.util.ArrayList;

public class Conversacion {
	
	public Conversacion() {
		
	}
	
	public void mensajeInicial() {
		System.out.println("Buenos dias. Mi nombre es Amy. Soy un asistente automatizado y "
				+ "quiero ser de utilidad para usted. Por favor, digame que esta buscando,"
				+ " y vere si podemos localizarlo en nuestra biblioteca");
	}
	
	public void mensajeFinal() {
		System.out.println("Me alegra poder haber sido de utilidad. Vuelva pronto!");
	}
	
	public void preguntaLibroEncontrado() {
		System.out.println("Es esto lo que estaba buscando? ");
	}
	
	public void preguntaNuevaConsulta() {
		System.out.println("Lo puedo ayudar en algo mas?");
	}
	
	public void libroEncontrado(Libro libro) {
		System.out.println("Tenemos en nuestra biblioteca el siguiente libro: " + libro.toString());
	}
	
	public void libroNoEncontrado() {
		System.out.println("Lamentablemente nuestra biblioteca no cuenta con el libro que esta buscando."
				+ " Sepa disculpar las molestias ocasionadas.");
	}
	
	public void recomendacion(ArrayList<Libro> lista_libros, Busqueda busqueda) {
		System.out.println("Le puedo recomendar estos libros que estan fuertemente relacionados con "
				+ "el " + busqueda.getBusqueda() + " que esta buscando: ");
		for (Libro libro : lista_libros) {
			System.out.println(libro.toString());
		}
	}
	
}
