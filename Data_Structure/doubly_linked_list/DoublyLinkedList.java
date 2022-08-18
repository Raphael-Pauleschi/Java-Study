package doubly_linked_list;

public class DoublyLinkedList<T> {

	private DoublyNode<T> firstNo;
	private DoublyNode<T> lastNo;
	private int listSize;
	
	public DoublyLinkedList() {
		this.firstNo = null;
		this.lastNo = null;
		this.listSize = 0;
		
	}
	
	public void add(T element) {
		DoublyNode<T> newNo = new DoublyNode<T>(element);
		newNo.setNextNo(null);
		newNo.setBackNo(lastNo);
		if(firstNo == null) firstNo = newNo;
		if(lastNo != null) lastNo.setNextNo(newNo);
		
		lastNo = newNo;
		listSize++;	
	}
	
	public void remove(int index) {
		if(index == 0) {
			firstNo = firstNo.getNextNo();
			if(firstNo != null) {
				firstNo.setBackNo(null);
			}
		}else {
			DoublyNode<T> auxNo = getNo(index);
			auxNo.getBackNo().setNextNo(auxNo.getNextNo());
			if(auxNo != lastNo) {
				auxNo.getNextNo().setBackNo(auxNo.getBackNo());
			}else {
				lastNo = auxNo;
			}
		}
		this.listSize--;
	}
	
	public void add(int index, T element) {
		DoublyNode<T> auxNo = getNo(index);
		DoublyNode<T> newNo = new DoublyNode<T>(element);
		newNo.setNextNo(auxNo);
		if(newNo.getNextNo()!=null) {
			newNo.setBackNo(auxNo.getBackNo());
			newNo.getNextNo().setBackNo(newNo);
		}else {
			newNo.setBackNo(lastNo);
			lastNo = newNo;
		}
		
		if(index == 0) {
			firstNo = newNo;
		}else {
			newNo.getBackNo().setNextNo(newNo);;
		}
	
	}
	
	public T get(int index) {
		return this.getNo(index).getContent();
	}
	
	private DoublyNode<T> getNo(int index){
		DoublyNode<T> auxNo = firstNo;
		
		for (int i =0; (i < index) && (auxNo != null);i++) {
			auxNo = auxNo.getNextNo();
		}
		return auxNo;
	}
	
	public int size() {
		return listSize;
	}

	
	@Override
	public String toString() {
		String strReturn = "";
		
		DoublyNode<T> auxNo = firstNo;
		for(int i = 0; i < listSize; i++) {
			strReturn += "[Node{content = "+auxNo.getContent()+"}] -->";
			auxNo = auxNo.getNextNo();
		}
		
		strReturn += "null";
		return strReturn;
	}
	
	
	
}
