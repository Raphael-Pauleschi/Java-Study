package pilha;

public class Main {

	public static void main(String[] args) {
		pilha stack = new pilha();
		stack.push(new node(1));
		stack.push(new node(2));
		stack.push(new node(3));
		stack.push(new node(4));
		stack.push(new node(5));
		stack.push(new node(6));
		stack.push(new node(7));
		stack.push(new node(8));
		stack.pop();
		
		System.out.println(stack);
	}

}
