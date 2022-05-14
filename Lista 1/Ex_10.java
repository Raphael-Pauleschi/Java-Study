import java.util.Scanner;
public class Ex_10 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a,c;
		double s,r;
		
		System.out.print("Entre com a distância da escada da parede: ");
		c = input.nextInt();
		System.out.print("Entre com a ângulo da escada na parede: ");
		a = input.nextInt();
		
		s = Math.sin(a);
		
		r = s*c;
		
		System.out.println("A medida da escada: "+r);
		
		
		

	}

}
