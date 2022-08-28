package builder;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private List<String> ingredientes = new ArrayList<String>();
	private String nome;
	private int id;
	private String borda;
	private double preco;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBorda(String borda) {
		this.borda = borda;
	};
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void add(String ingrediente) {
		ingredientes.add(ingrediente);
	};
	
	public void show() {
		int aux = 0;
		String show = id+" - "+nome;
		show += ".... "+preco+"\n";
		for(String ingrediente : ingredientes) {
			show += ingrediente;
			aux++;
			if(ingredientes.size() != aux) {
				show +=", ";
			}
		}
		show += "\nBorda: "+borda;
		System.out.println(show);
	}
	

}
