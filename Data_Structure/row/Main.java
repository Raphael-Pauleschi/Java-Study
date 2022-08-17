package row;

import pilha.node;
import pilha.pilha;

public class Main {

	public static void main(String[] args) {
		Row<String> row = new Row();
		row.enqueue("1");
		row.enqueue("2");
		row.enqueue("3");
		row.enqueue("4");
		row.enqueue("5");
		row.enqueue("6");
		row.enqueue("7");
		row.enqueue("8");
		
		System.out.println("\nEmpty? "+row.isEmpty());
		System.out.println("Calling: "+row.dequeue());
		row.enqueue("9");
		//row.enqueue(9); due to generics it ONLY accepts String, this line will cause a error
		System.out.println("\nFirst element: "+row.first());
		System.out.println("\nAll nodes: \n"+row.toString());

	}

}
