package facade.subsistema;

public class CrmService {
	private CrmService() {
		super();
	}
	public static void gravarCliente(String nome, String cep, String cidade, String estado) {
		System.out.println("Cliente salvo no sistema de crm");
		System.out.println("\n"+nome 
				+ "\n"+cep+"\n"
				+cidade+"\n"
				+estado);
	}
}
