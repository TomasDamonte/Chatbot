import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalizadorConsulta implements Iterator {
	private List<String> consulta = new ArrayList<String>();
	
	public AnalizadorConsulta(String consulta) {
		//Convierto el String[] en un objeto List que fue inicializado como ArrayList<String>
		this.setConsulta(consulta);
	}

	public List<String> getConsulta() {
		return consulta;
	}

	public void setConsulta(String consulta) {
		String[] arrConsulta = consulta.split(" ");
		this.consulta = Arrays.asList(arrConsulta);
	}
	
	public void analizarConsulta () throws ChatBotExceptions {
		List<String> arrConsulta = this.getConsulta();
		for (String consulta : arrConsulta) {
			Decision.buscarConsulta(consulta);
		}
	}

	@Override
	public Boolean hasNext() {
		List<String> consulta = this.getConsulta();
		
		return Boolean.FALSE;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}
}
