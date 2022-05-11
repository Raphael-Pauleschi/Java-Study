import java.util.Scanner;
public class Ex_05 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int pro,pre;
		
		System.out.print("Entre com o preço do produto: ");
		pro = input.nextInt();
		
		pre = pro-pro*10/100;
		
		System.out.print("O preço com 10% de desconto: "+pre);
		
		

	}

}
