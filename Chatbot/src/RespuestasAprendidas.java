import java.util.ArrayList;

public class RespuestasAprendidas {
	
	public ArrayList<String> nuevasRespuestas = new ArrayList<String>();

	public ArrayList<String> getNuevasRespuestas() {
		return nuevasRespuestas;
	}

	public void setNuevasRespuestas(ArrayList<String> nuevasRespuestas) {
		this.nuevasRespuestas = nuevasRespuestas;
	} 
	
	private void agregarNuevaRespuesta(String respuesta) {
		this.getNuevasRespuestas().add(respuesta);
	}
	
	
}
