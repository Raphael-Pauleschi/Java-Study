package builder;

import java.util.List;

public interface PizzaBuilderIn {
	public abstract void buildNome(String nome);
	public abstract void buildId(int id);
	public abstract void buildIngredient(List<String> ingredientes);
	public abstract void buildPreco(double preco);
	public abstract void buildBorda(String borda);
	public abstract Pizza getResult();

}
