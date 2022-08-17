package row;

public class Row<T> {
	private Node<T> refEnter;
	
	public Row() {
		this.refEnter = null;
	}
	
	
	public void enqueue(T obj) {
		Node newNo = new Node(obj);
		newNo.setRefNode(refEnter);
		refEnter = newNo;
		//The last node is now the penultimate node
	}
	public T dequeue() {
		if(!isEmpty()) {
			Node firstNo = refEnter;
			Node auxNo = refEnter;
			while(true) {
				if(firstNo.getRefNode() != null) {//isn't the first
					auxNo = firstNo;
					firstNo = firstNo.getRefNode();
					}else {
						auxNo.setRefNode(null);
						break;
					}
			}
			return (T)firstNo.getObject();
		}
		return null;
	}
	
	
	public T first() {
		if(!isEmpty()) {
			Node firstNo = refEnter;
			while(true) {
				if(firstNo.getRefNode() != null) {//isn't the first
					firstNo = firstNo.getRefNode();
					}else {break;}
			}
			return (T)firstNo.getObject();
		}
		return null;
	}
	
	
	public boolean isEmpty() {
		return refEnter == null? true:false;
	}


	@Override
	public String toString() {
		String stringReturn = "";
		Node auxNo = refEnter;
		
		if(refEnter!=null) {
			while(true) {
				stringReturn += "[No{object"+auxNo.getObject()+"}] ----->";
				if(auxNo.getRefNode() != null) {
					auxNo = auxNo.getRefNode();
				}else {
					stringReturn += "null";
					break;}
			}
		}
		else {stringReturn += "null";}
		
		
		return stringReturn;
	}
	
	
	
}
