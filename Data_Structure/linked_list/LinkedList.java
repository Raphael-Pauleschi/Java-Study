package linked_list;

public class LinkedList<T> {
	Node<T> refEnter;
	
	public LinkedList() {
		this.refEnter = null;
	}
	
	public int size(){
		int sizeList = 0;
		Node<T> refAux = refEnter;
		while(true) {
			if(refAux != null) {
				sizeList++;
				if(refAux.getNextNo() !=null) {
					refAux = refAux.getNextNo();
				}
				else {
					break;
				}
			}else {
				break;
			}
			
		}
		return sizeList;
	}
	
	public void add(T content) {
		Node<T> newNo = new Node(content);
		if(this.isEmpty()) {
			refEnter = newNo;
			return;
		}
		
		Node <T> auxNo = refEnter;
		for(int i = 0; i <this.size()-1;i++) {
			auxNo = auxNo.getNextNo();
		}
		auxNo.setNextNo(newNo);
	}
	
	private Node<T> getNode(int index){
		indexValidator(index);
		
		Node<T> auxNo = refEnter;
		Node<T> returNo = null;
		
		for(int i = 1; i <=index;i++) {
			returNo = auxNo;
			auxNo = auxNo.getNextNo();
		}
		return returNo;
		
	}
	
	public T remove(int index) {
		Node pivotNo = this.getNode(index);
		if(index == 1) {
			refEnter = pivotNo.getNextNo();
			return (T) pivotNo.getContent();
			//Change the entrance reference to the next in memory
		}
		
		Node<T> backNo = getNode(index - 1);
		//For the node before this, it will change it's next pointer for the next pointer of it's next pointer
		//Is removing it's reference and putting  the next in memory
		backNo.setNextNo(pivotNo.getNextNo());
		return (T) pivotNo.getContent();
	}
	
	public T get(int index) {
		return getNode(index).getContent();
	}
	
	private void indexValidator(int index) {
		if(index > size()) {
			throw new IndexOutOfBoundsException("There's no content in the index "+index+" on this list. \nThis list can only support till index "+this.size());
		}
	}
	
	public boolean isEmpty() {
		return refEnter == null ? true:false;
	}

	@Override
	public String toString() {
		String strReturn = "";
		Node<T> auxNo = refEnter;
		for(int i =1; i <=this.size();i++) {
			strReturn += "No{content: "+auxNo.getContent()+"} -->\n";
			auxNo = auxNo.getNextNo();
		}
		strReturn += "null";
		return strReturn;
	}
	
	
	
}
