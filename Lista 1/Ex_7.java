import java.util.Scanner;
public class Ex_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int r;
		double c,a,v;
		

		
		System.out.print("Entre com o valor do raio: ");
		r = input.nextInt();
		
		c = 2 * Math.PI * r;
		a = Math.PI * Math.pow(r,2);
		v = (4 * Math.PI * Math.pow(r,3))/3;
		
		System.out.println("Esfera:");
		System.out.println("O comprimento: "+c);
		System.out.println("A área: "+a);
		System.out.println("O volume: "+v);

	}

}
