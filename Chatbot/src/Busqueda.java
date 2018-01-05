
public class Busqueda {
	
	private String busqueda;

	public Busqueda(String busqueda) {
		this.setBusqueda(busqueda);
	}
	
	public String getBusqueda() {
		return busqueda;
	}

	public void setBusqueda(String busqueda) {
		this.busqueda = busqueda;
	}
	
	public Boolean validarBusqueda(String busqueda) {
		switch(busqueda) {
			case "libro": return true;
			case "autor" : return true;
			default: return false;
		}
	}
}
