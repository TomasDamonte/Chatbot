import java.util.HashMap;

public class mapaRespuestas {
	
	private HashMap<Integer, String> mapaRespuestas = new HashMap<Integer, String>();
	
	public mapaRespuestas() {
		this.getMapaRespuestas();
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
	
}
