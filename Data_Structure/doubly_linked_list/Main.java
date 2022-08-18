package doubly_linked_list;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList(); 
		
		list.add("Avocado");
		list.add("Pineapple");
		list.add("Grape");
		list.add("Lemon");
		list.add("Watermelon");
		list.add("Banana");
		
		System.out.println(list.size());
		list.remove(4);
		System.out.println(list.toString());
		list.add(1, "Kiwi");
		System.out.println(list.toString());
		System.out.println(list.get(3));
		
	}

}
