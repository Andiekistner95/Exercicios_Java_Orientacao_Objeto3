package exercicio3;

import java.text.DecimalFormat;

public class Retangulos extends Formas {
	
	DecimalFormat df = new DecimalFormat("#0.00");
	
	private double altura;
	private double base;
	
	public Retangulos() {
		// TODO Auto-generated constructor stub
	}

	public Retangulos(double altura, double base) {
		this.altura = altura;
		this.base = base;
		calculaArea();
		calculaPerimetro();
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public void calculaPerimetro() {
		setPerimetro((altura * 2) + (base * 2));
	}

	@Override
	public void calculaArea() {
		setArea(altura * base);

	}
	
	@Override
	public String toString() {
		String dados;
		dados = "\n-----------------------";
		dados += "\nRetangulo";
		dados += "\nRaio: "+ df.format(this.getAltura())+"cm";
		dados += "\nRaio: "+ df.format(this.getBase())+"cm";
		dados += "\nArea: "+ df.format(this.getArea())+"cm";
		dados += "\nPerimetro: "+ df.format(this.getPerimetro())+"cm";
		return dados;
	}

}
