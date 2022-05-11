import java.util.Scanner;
public class Ex_02 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		
		int a,b,c,d;
		
		System.out.print("Entre com o 1º número: ");
		a = input.nextInt();
		System.out.print("Entre com o 2º número: ");
		b = input.nextInt();
		System.out.print("Entre com o 3º número: ");	
		c = input.nextInt();
		
		d = a*b*c;
		
		System.out.println(a+" * "+b+" * "+c+" = "+d);
		
		
	}
}
