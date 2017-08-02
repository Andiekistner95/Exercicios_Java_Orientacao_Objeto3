package exercicio3;

import java.text.DecimalFormat;

public class Quadrados extends Formas {
	
	DecimalFormat df = new DecimalFormat("#0.00");

	private double lado;
	
	public Quadrados() {
		// TODO Auto-generated constructor stub
	}

	public Quadrados(double lado) {
		this.lado = lado;
		calculaArea();
		calculaPerimetro();
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public void calculaPerimetro() {
		setPerimetro(lado * 4);

	}

	@Override
	public void calculaArea() {
		setArea(lado * lado);

	}
	@Override
	public String toString() {
		String dados;
		dados = "\n-----------------------";
		dados += "\nQuadrado";
		dados += "\nRaio: "+ df.format(this.getLado())+"cm";
		dados += "\nArea: "+ df.format(this.getArea())+"cm";
		dados += "\nPerimetro: "+ df.format(this.getPerimetro())+"cm";
		return dados;
	}

}
