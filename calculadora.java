import java.util.Scanner;
public class Calculadora{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		float valor1, valor2;
		int conta, aux;
		
		boolean novoValor, execucao, contaMontada;
		novoValor = true; execucao = true; contaMontada = false
		
		do{
			do{
			if (novoValor == true){
			System.out.println("Entre com o valor:");
			valor1 = input.nextFloat();
			}
			System.out.println("Entre com o tipo de conta");
			System.out.println("\n1- soma 2-subtracao"+
							   "\n3- multiplicacao  4-divisao \n0- encerrar");
			conta = input.nextInt();
			System.out.println("Entre com outro valor");
			valor2 = input.nextFloat();
			switch(conta){
			 case 1:
				valor1 = valor1+valor2;
				contaMontada = true;
				break;
			case 2:
				valor1 = valor1-valor2;
				contaMontada = true;
				break;
			case 3:
				valor1 = valor1*valor2;
				contaMontada = true;
				break;
			case 4:
				valor1 = valor1/valor2;
				contaMontada = true;
				break;
			case 0:
				System.out.println("\nEncerrado");
				execucao = false;contaMontada = true;
				break;
			default:	
				System.out.println("\nValor inválido, entre com os valores novamente!");
				break;
			}}while(contaMontada == false);	
			
			
			if (execucao == true){
				System.out.println("\nResultado : "+valor1);
				System.out.println("\nZerar valor?");
				aux = input.nextInt();
				if (aux >0){novoValor = true;}
				else{novoValor=false;}
				contaMontada = false;
			}
			
			
			
		}while(execucao == true);	
}