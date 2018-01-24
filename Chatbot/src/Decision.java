import java.util.TreeMap;

public class Decision {
	
	public TreeMap<Node,String> decision;
	private static Node root;
	
	public Decision(String decision) {
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
	
	public TreeMap<Node,String> getDecision() {
		return decision;
	}

	public void setDecision(TreeMap<Node,String> decision) {
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

}
