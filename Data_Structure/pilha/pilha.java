package pilha;

public class pilha {
	
	private node refNoEntrada;

	public pilha() {
		this.refNoEntrada = null;
	}
	
	public void push(node newNode) {
		node auxiliarNode = refNoEntrada;
		refNoEntrada = newNode;
		refNoEntrada.setReNo(auxiliarNode);
		/*Putting a new node in the top, now it swaps places with the old one
		 * which points to it*/
	}
	
	public node pop() {
		if(!isEmpty()) {
			node noPop = refNoEntrada;
			refNoEntrada = refNoEntrada.getReNo();
			return noPop;
		}
		return null;
	}
	
	public node top() {
		return refNoEntrada;
		//It points to the top of stack
	}
	
	
	public boolean isEmpty(){
		return refNoEntrada == null? true:false; 
	}
	
	@Override
	public String toString() {
		String stringReturn = "-----------\n";
		stringReturn += "    Pilha\n";
		stringReturn += "-----------\n";
		
		node aux = refNoEntrada;
		while (true) {
			if(aux != null) {
				stringReturn +="[Node{Data = "+aux.getDat()+"}]\n";
				aux = aux.getReNo();			
				}else{break;}
		}
		stringReturn += "-----------\n";
		return stringReturn;
	}
	

}
