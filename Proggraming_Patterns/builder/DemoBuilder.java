package builder;

public class DemoBuilder {
	public static void main (String args[]) {
		Director director = new Director();
        PizzaBuilderIn b1 = new PizzaBuilder();
        PizzaBuilderIn b2 = new PizzaBuilder();
        PizzaBuilderIn b3 = new PizzaBuilder();
        
        //Pizza p1 = ("Frango com Catupiry",1,["Frango","Catupiry"],34.00,"Sem borda");
        
        director.buildFrangoComCatupiry(b1);
        Pizza p1 = b1.getResult();
        director.buildMussarela(b3);
        Pizza p3 = b3.getResult();
        director.buildPortuguesa(b2);
        Pizza p2 = b2.getResult();
        
        p1.show();
        System.out.println("\n");
        p2.show();
        System.out.println("\n");
        p3.show();
       

	}
}
