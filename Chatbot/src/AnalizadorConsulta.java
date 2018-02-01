import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalizadorConsulta implements Iterator<Object> {
	private List<String> consulta = new ArrayList<String>();
	private Busqueda busqueda = new Busqueda();
	private static Integer index=0;
	
	public AnalizadorConsulta(String consulta) {
		//Convierto el String[] en un objeto List que fue inicializado como ArrayList<String>
		this.setConsulta(consulta);
	}

	public List<String> getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		consulta.replaceAll("[,.]", "");
		String[] arrConsulta = consulta.split(" ");
		this.consulta = Arrays.asList(arrConsulta);
	}
	
	public void analizarConsulta () {
		index = 0;
		List<String> arrConsulta = this.getConsulta();
		for (String consulta : arrConsulta) {
			switch(consulta) {
				case "titulo" :
					Conversacion.preguntaEspecificarConsulta("titulo");
					break;
				case "autor" :
					Conversacion.preguntaEspecificarConsulta("autor");
					break;
				default:
					break;
			}
			index++;
		}
	}

	@Override
	public Boolean hasNext() {
		return index < this.getConsulta().size();
	}

	@Override
	public Object next() {
		if(this.hasNext()) {
			index++;
			return this.getConsulta().get(index-1);
		}
		return null;
	}
}
