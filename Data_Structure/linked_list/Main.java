package linked_list;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("generic");
		list.add(360);
		list.add(true);
		
		System.out.println(list.size());
		System.out.println("\n"+list.toString());
		System.out.println("\n"+list.get(3));
		System.out.println(list.remove(1));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		

	}

}
