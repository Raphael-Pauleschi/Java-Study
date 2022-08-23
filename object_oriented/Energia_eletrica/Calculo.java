package energia_eletrica;
import javax.swing.JOptionPane;

public class Calculo {
	float consumo;
	float fornecimento;
	
	Calculo(float consumo){
		this.consumo = consumo;
		fornecimento = Fornecimento();
	}
	
	public float Fornecimento() {
		return consumo * 0.28172f;
	}
	
	public float ICMS() {
		if (consumo <= 200) {
			return fornecimento * 0.136363f;
		}
		else {
			return fornecimento * 0.333333f;
		}
	}
	
	public float COFINS() {
		if (consumo <= 200) {
			return fornecimento * 0.0614722f;
		}
		else {
			return fornecimento * 0.0730751f;
		}
	}
	
	public float PIS_PASESP() {
		if (consumo <= 200) {
			return fornecimento * 0.013346f;
		}
		else {
			return fornecimento * 0.0158651f;
		}
	}
	
	public float ICMS_COFINS() {
		if (consumo <= 200) {
			return fornecimento * 0.136363f * 0.0614722f;
		}
		else {
			return fornecimento * 0.333333f * 0.0730751f;
		}
	}
	
	public float ICMS_PIS_PASESP() {
		if (consumo <= 200) {
			return fornecimento * 0.136363f * 0.013346f;
		}
		else {
			return fornecimento * 0.333333f * 0.0158651f;
		}
	}
	
	public float fatura() {
		return (fornecimento + ICMS() + COFINS() + PIS_PASESP() + ICMS_COFINS() + ICMS_PIS_PASESP());
	}
	public void mostraDados() {
		JOptionPane.showMessageDialog(null, "Os gastos do mês: \nFornecimento"+fornecimento+"\nICMS: "+ICMS()+"\nCOFINS: "+COFINS()+
				"\nPIS/PASESP: "+PIS_PASESP()+"\nICMS sobre COFINS: "+ICMS_COFINS()+"\nICMS sobre PIS/PASESP: "+ICMS_PIS_PASESP()+
				"\n\nFatura: "+fatura());
	}
	
	
	
	
	
	

}
