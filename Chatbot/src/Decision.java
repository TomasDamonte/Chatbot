import java.util.Collection;
import java.util.TreeMap;

public class Decision implements Aprendizaje, Iterator{
	
	public TreeMap decision;
	private static Node root;
	private Collection c;
	private java.util.Iterator itr;
	
	public Decision(String decision) {
		this.c = this.getDecision().values();
		this.itr = this.c.iterator();
		root = new Node(decision);	
	}
	
	public Decision() {
		root = new Node("decision");
		root.setRight(new Node("titulo"));
		root.setLeft(new Node("autor"));
		this.agregarDecision(root.getRight(), new Node("Existencia"), "right");
		this.agregarDecision(root.getRight(), new Node("Inexistencia"), "left");
		this.agregarDecision(root.getRight().getLeft(), new Node("recomendacion"), "right");
		this.agregarDecision(root.getRight().getLeft(), new Node("no recomendacion"), "left");
		this.agregarDecision(root.getLeft(), new Node("Existencia"), "right");
		this.agregarDecision(root.getLeft(), new Node("Inexistencia"), "left");
		this.agregarDecision(root.getLeft().getLeft(), new Node("recomendacion"), "right");
		this.agregarDecision(root.getLeft().getLeft(), new Node("no recomendacion"), "left");
	
	}
	
	public TreeMap getDecision() {
		return decision;
	}

	public void setDecision(TreeMap decision) {
		this.decision = decision;
	}
	
	public void agregarDecision(Node parent, Node child, String orientation)
    {
        if (orientation.equals("left"))
        {
           parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }

	@Override
	public void aprender() {
		// TODO Auto-generated method stub
		
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
