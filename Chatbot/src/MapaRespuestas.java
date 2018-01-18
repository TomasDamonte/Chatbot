import java.util.Collection;
import java.util.HashMap;

public class MapaRespuestas implements Iterator {
	
	private HashMap<Integer, String> mapaRespuestas = new HashMap<Integer, String>();
	private Collection c;
	private java.util.Iterator itr;
	
	public MapaRespuestas(HashMap<Integer, String> mapaRespuestas) {
		this.setMapaRespuestas(mapaRespuestas);
		this.c = this.getMapaRespuestas().keySet();
		this.itr = this.c.iterator();
	}

	private HashMap<Integer, String> getMapaRespuestas() {
		return mapaRespuestas;
	}

	@SuppressWarnings("unused")
	private void setMapaRespuestas(HashMap<Integer, String> mapaRespuestas) {
		this.mapaRespuestas = mapaRespuestas;
	}
	
	@SuppressWarnings("unused")
	private String getRespuesta(Integer key) {
		if (this.getMapaRespuestas().containsKey(key)) {
			return this.getMapaRespuestas().get(key);
		}
		return null;
	}
	
	@SuppressWarnings("unused")
	private void addRespuesta(String respuesta) {
		Integer key = this.getMapaRespuestas().size() + 1;
		this.getMapaRespuestas().put(key, respuesta);
	}

	@Override
	public Boolean hasNext() {
		return itr.hasNext();
	}

	@Override
	public Object next() {
		if(this.hasNext()) return itr.next();
		return null;
	}
	
}
