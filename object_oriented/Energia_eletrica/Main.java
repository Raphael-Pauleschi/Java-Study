package energia_eletrica;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		float consumo;
		
		consumo = Float.parseFloat(JOptionPane.showInputDialog("Entre com o consumo em KWh:"));
		
		Calculo c = new Calculo(consumo);
		c.mostraDados();
		
	}

}
