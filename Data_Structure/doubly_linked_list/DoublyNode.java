package doubly_linked_list;

public class DoublyNode<T> {
	private T content;
	private DoublyNode<T> nextNo;
	private DoublyNode<T> backNo;
	
	public DoublyNode(T content) {
		this.content = content;
	}

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

	public DoublyNode<T> getNextNo() {
		return nextNo;
	}

	public void setNextNo(DoublyNode<T> nextNo) {
		this.nextNo = nextNo;
	}

	public DoublyNode<T> getBackNo() {
		return backNo;
	}

	public void setBackNo(DoublyNode<T> backNo) {
		this.backNo = backNo;
	}

	@Override
	public String toString() {
		return "DoublyNode [content=" + content + "]";
	}
	
	
}
