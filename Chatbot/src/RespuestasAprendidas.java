import java.util.ArrayList;

public class RespuestasAprendidas implements Iterator {
	
	public ArrayList<String> nuevasRespuestas = new ArrayList<String>();
	private java.util.Iterator itr;

	public ArrayList<String> getNuevasRespuestas() {
		return nuevasRespuestas;
	}

	public void setNuevasRespuestas(ArrayList<String> nuevasRespuestas) {
		this.nuevasRespuestas = nuevasRespuestas;
		itr = (java.util.Iterator) nuevasRespuestas.iterator();
	} 
	
	private void agregarNuevaRespuesta(String respuesta) {
		this.getNuevasRespuestas().add(respuesta);
		itr = (java.util.Iterator) this.nuevasRespuestas.iterator();
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
