package builder;

import java.util.List;

public class PizzaBuilder implements PizzaBuilderIn{
	private Pizza pizza = new Pizza();
	@Override
	public void buildIngredient(List<String> ingredientes) {
		for(String ingrediente: ingredientes) {
			pizza.add(ingrediente);
		}
	};
	
	@Override
	public void buildNome(String nome) {
		pizza.setNome(nome);
	}
	
	@Override
	public void buildId(int id) {
		pizza.setId(id);
	}
	
	@Override 
	public void buildBorda(String borda) {
		pizza.setBorda(borda);
	}
	
	@Override
	public void buildPreco(double preco) {
		pizza.setPreco(preco);
	}
	
	@Override
	public Pizza getResult() {
		return pizza;
	};
}
