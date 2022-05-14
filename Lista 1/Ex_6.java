import java.util.Scanner;
public class Ex_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int b,c;
		double a;
		
		System.out.print("Entre com o 1º cateto: ");
		b = input.nextInt();
		System.out.print("Entre com o 2° cateto: ");
		c = input.nextInt();
		
		a = b*b + c*c;
		a = Math.sqrt(a);
		
		System.out.println("O valor da hipotenusa: "+a);
		


	}

}
