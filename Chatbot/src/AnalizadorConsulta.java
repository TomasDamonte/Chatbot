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
	
	public void analizarConsulta () throws ChatBotExceptions {
		index = 0;
		List<String> arrConsulta = this.getConsulta();
		for (String consulta : arrConsulta) {
			switch(consulta) {
				case "titulo" :
					List<String> titulo = arrConsulta.subList(index, arrConsulta.size());
					busqueda.getTitulo(titulo);
				case "autor" :
					List<String> autor = arrConsulta.subList(index, arrConsulta.size());
					busqueda.getAutor(autor);
				case "no" :
				case "si" :
				case "gracias" :
				default:
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
