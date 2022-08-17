package linked_list;

public class Node<T> {
	
	private T content;
	private Node nextNo;
	
	public Node() {
		this.nextNo = null;
	}
	
	public Node(T content) {
		this.content = content;
		this.nextNo = null;
	}

	public Node(T content, Node nextNo) {
		this.content = content;
		this.nextNo = nextNo;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public Node getNextNo() {
		return nextNo;
	}

	public void setNextNo(Node nextNo) {
		this.nextNo = nextNo;
	}

	@Override
	public String toString() {
		return "Node [content=" + content + ", nextNo=" + nextNo + "]";
	}
	
	public String toLinkedString() {
		String str = "Node{ content ="+content+"}";
		if(nextNo != null) {
			str += "->"+nextNo.toString();
		}else {
			str +="->null";
		}
		
		return str;
	}
	
	
}
