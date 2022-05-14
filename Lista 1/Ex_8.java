import java.util.Scanner;
public class Ex_8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int c,f;
		
		System.out.print("Entre com a temperatura em Celsius: ");
		c = input.nextInt();
		
		f = 180*(c+32)/100;
		
		System.out.println("Em Fahrenheit: "+f);
		
		
		
		

	}

}
