import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnalizadorConsulta implements Iterator {
	private List<String> consulta = new ArrayList<String>();
	private Integer index=0;
	
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
	
	public void analizarConsulta () {
		List<String> arrConsulta = this.getConsulta();
		for (String consulta : arrConsulta) {
			switch(consulta) {
			default: System.out.println(consulta);
			}
		}
	}

	@Override
	public Boolean hasNext() {
		return this.index < this.getConsulta().size();
	}

	@Override
	public Object next() {
		if(this.hasNext()) {
			this.index++;
			return this.getConsulta().get(this.index-1);
		}
		return null;
	}
}
