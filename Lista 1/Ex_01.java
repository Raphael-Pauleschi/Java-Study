import java.util.Scanner;
public class Ex_01 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		
		int a,b,c;
		
		System.out.print("Entre com o 1º número: ");
		a = input.nextInt();
		System.out.print("Entre com o 2º número: ");
		b = input.nextInt();
		
		c = a-b;
		
		System.out.println(a+" - "+b+" = "+c);
		
		
		
		
	}

}
