
public class Consulta {
	
	private Node root;
	
	public Consulta() {
		root = new Node("consulta");
		/*root.setRight(new Node("titulo"));
		root.setLeft(new Node("autor"));
		this.agregarDecision(root.getRight(), new Node("Existencia"), "right");
		this.agregarDecision(root.getRight(), new Node("Inexistencia"), "left");
		this.agregarDecision(root.getRight().getLeft(), new Node("recomendacion"), "right");
		this.agregarDecision(root.getRight().getLeft(), new Node("no recomendacion"), "left");
		this.agregarDecision(root.getLeft(), new Node("Existencia"), "right");
		this.agregarDecision(root.getLeft(), new Node("Inexistencia"), "left");
		this.agregarDecision(root.getLeft().getLeft(), new Node("recomendacion"), "right");
		this.agregarDecision(root.getLeft().getLeft(), new Node("no recomendacion"), "left");
	*/
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
