package nodes;

public class Node<T> {
	
	public T content;
	public Node<T> next;
	
	public Node(T content) {
		this.content = content;
		this.next = null;
	}
	
	public T getContent() {
		return content;
	}
	
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node{"+
				"content-"+content+
				"}";
	}
	
}
