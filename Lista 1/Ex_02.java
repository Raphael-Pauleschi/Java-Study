import java.util.Scanner;
public class Ex_02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		
		int a,b,c,d;
		
		System.out.print("Entre com o 1� n�mero: ");
		a = input.nextInt();
		System.out.print("Entre com o 2� n�mero: ");
		b = input.nextInt();
		System.out.print("Entre com o 3� n�mero: ");	
		c = input.nextInt();
		
		d = a*b*c;
		
		System.out.println(a+" * "+b+" * "+c+" = "+d);
		
		
	}
}
