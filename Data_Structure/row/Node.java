package row;

public class Node<T> {
	private Object object;
	private Node<T> refNode;
	
	public Node() {}
	public Node(T object) {
		//Node content
		this.object = object;
		this.refNode = null;
	}
	public Object getObject() {
		return object;
	}
	public void setObject(T object) {
		this.object = object;
	}
	public Node getRefNode() {
		return refNode;
	}
	public void setRefNode(Node refNode) {
		this.refNode = refNode;
	}
	
	@Override
	public String toString() {
		return "Node [object=" + object + "]";
	}
	
	
	
}

