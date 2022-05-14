import java.util.Scanner;
public class Ex_9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l1,l2,a,p;
		
		System.out.print("Entre com o comprimento do lado 1: ");
		l1 = input.nextInt();
		System.out.print("Entre com o comprimento do lado 2: ");
		l2 = input.nextInt();
		
		a = l1*l2;
		p = a*18;
		
		System.out.println("A aréa desse comodo: "+a+"m²");
		System.out.println("A potencia necessaria: "+p+"W");
		
		

	}

}
