package nodes;

public class Main {

	public static void main(String[] args) {
		Node<String> n1 = new Node<String>("This is a content");
		
		Node<String> n2 = new Node<String>("This another content");
		n1.setNext(n2);
		
		Node<String> n3 = new Node<String>("And the next content");
		n2.setNext(n3);
		
		Node<String> n4 = new Node<String>("There's nothing next");
		n3.setNext(n4);
		/*With the wildcards, there is already a String data chain, so
		 I can't put another data type*/
		
		//n1->n2->n3->n4->null
		
		//Using reference
		System.out.println(n1);
		System.out.println(n2);
		
		//Using data chain
		System.out.println(n1.getNext());
		System.out.println(n1.getNext().getNext());
		System.out.println(n1.getNext().getNext().getNext());
		System.out.println(n1.getNext().getNext().getNext().getNext());
		
	}

}
