package atributionreference;

public class Main {
	public static void main(String[] args) {
		int a = 1;
		int b = a;
		
		Obj A = new Obj(1);
		Obj B = A;
		
		System.out.println("A"+a+"B"+b);
		a++;
		System.out.println("A"+a+"B"+b);
		
		System.out.println("A"+A+"B"+B);
		A.setNum(30);
//Object A and B have the same memory endress, in consequence the same value
		System.out.println("A"+A+"B"+B);

	}

}
