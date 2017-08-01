package exercicio3;

public class Retangulos extends Formas {
	
	private double altura;
	private double base;

	public double getAltura() {
		return altura;
	}
	
	public Retangulos(double altura, double base) {
		this.altura = altura;
		this.base = base;
		calculaArea();
		calculaPerimetro();
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

}
