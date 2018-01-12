import java.util.Collection;
import java.util.TreeMap;

public class Decision implements Aprendizaje, Iterator{
	
	public TreeMap decision;
	private Collection c;
	private java.util.Iterator itr;
	
	public Decision(TreeMap decision) {
		this.setDecision(decision);
		this.c = this.getDecision().values();
		this.itr = this.c.iterator();
	}
	
	public TreeMap getDecision() {
		return decision;
	}

	public void setDecision(TreeMap decision) {
		this.decision = decision;
	}

	@Override
	public void aprender() {
		// TODO Auto-generated method stub
		
	}
	
	public Boolean buscarConsulta(String busqueda) {
		return null;
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
