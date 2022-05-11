import java.util.Scanner;
public class Ex_04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1,n2;
		double m;
		
		System.out.print("Entre com a nota 1, de peso 2: ");
		n1 = input.nextInt();
		System.out.print("Entre com a nota 2, de peso 3: ");
		n2 = input.nextInt();
		
		m = (n1*2+n2*3)/(2+3);
		
		System.out.println("A média ponderada das notas: "+m);

	}

}
