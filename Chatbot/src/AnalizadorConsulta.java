import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalizadorConsulta {
	private List<String> consulta = new ArrayList<String>();
	
	public AnalizadorConsulta(String consulta) {
		String[] arrConsulta = consulta.split(" ");
		//Convierto el String[] en un objeto List que fue inicializado como ArrayList<String>
		this.setConsulta(Arrays.asList(arrConsulta));
	}

	public List<String> getConsulta() {
		return consulta;
	}

	public void setConsulta(List<String> consulta) {
		this.consulta = consulta;
	}
}
