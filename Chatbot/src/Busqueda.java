import java.util.List;

public class Busqueda {

	private String busqueda;
	
	public Busqueda() {
		this.setBusqueda("");
	}

	public Busqueda(String busqueda) {
		this.setBusqueda(busqueda);
	}

	public String getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}

	public static Integer validarBusqueda(String busqueda) {
		switch(busqueda) {
		case "libro": return 1;
		case "autor" : return 2;
		default: return 0;
		}
	}

	public void busquedaBinariaPrimerMitad(List<String> consulta) {
		for(int i=0;i< (int) Math.ceil(consulta.size()/2);i++) {
			validarBusqueda(consulta.get(i));
		}
	}
	
	public void busquedaBinariaSegundaMitad(List<String> consulta) {
		for(int i= (int) Math.ceil(consulta.size()/2);i<consulta.size();i++) {
			validarBusqueda(consulta.get(i));
		}
	}
	
	public void getTitulo(List<String> titulo) {
		
	}
	
	public void getAutor(List<String> autor) {

		
	}
}
