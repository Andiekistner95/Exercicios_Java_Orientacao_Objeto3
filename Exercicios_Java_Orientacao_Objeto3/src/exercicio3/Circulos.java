package exercicio3;

import java.text.DecimalFormat;

public class Circulos extends Formas {
	
	DecimalFormat df = new DecimalFormat("#0.00");

	private double raio;
	
	public Circulos() {
		// TODO Auto-generated constructor stub
	}
	
	public Circulos(double raio) {
		this.raio = raio;
		calculaArea();
		calculaPerimetro();
	}
	

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public void calculaPerimetro() {
		setPerimetro((2 * 3.14) * raio);

	}

	@Override
	public void calculaArea() {
		setArea(3.14 * (raio * raio));

	}
	
	@Override
	public String toString() {
		String dados;
		dados = "\n-----------------------";
		dados += "\nCirculo";
		dados += "\nRaio: "+ df.format(this.getRaio())+"cm";
		dados += "\nArea: "+ df.format(this.getArea())+"cm";
		dados += "\nPerimetro: "+ df.format(this.getPerimetro())+"cm";
		return dados;
	}

}
