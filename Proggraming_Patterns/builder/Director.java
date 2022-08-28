package builder;

import java.util.ArrayList;
import java.util.List;

public class Director {
	public void buildFrangoComCatupiry(PizzaBuilderIn builder) {
		List<String> ingredientes = new ArrayList<String>();
		builder.buildNome("Frango com Catupiry");
		builder.buildId(1);
		ingredientes.add("Frango");
		ingredientes.add("Catupiry");
		builder.buildIngredient(ingredientes);
		builder.buildPreco(34.00);
		builder.buildBorda("Sem borda");
	}
	
	public void buildPortuguesa(PizzaBuilderIn builder) {
		List<String> ingredientes = new ArrayList<String>();
		builder.buildNome("Portuguesa");
		builder.buildId(2);
		ingredientes.add("Presunto");ingredientes.add("Cebola");
		ingredientes.add("Ovos");ingredientes.add("Mussarela");
		ingredientes.add("Cebola");
		builder.buildIngredient(ingredientes);
		builder.buildPreco(32.00);
		builder.buildBorda("Catupiry");
	}

	public void buildMussarela(PizzaBuilderIn builder) {
		List<String> ingredientes = new ArrayList<String>();
		builder.buildNome("Mussarela");
		builder.buildId(3);
		ingredientes.add("Mussarela");
		ingredientes.add("Oregano");
		builder.buildIngredient(ingredientes);
		builder.buildPreco(24.90);
		builder.buildBorda("Sem borda");
	}
}
