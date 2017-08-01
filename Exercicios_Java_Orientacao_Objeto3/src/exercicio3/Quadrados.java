package exercicio3;

public class Quadrados extends Formas {

	private double lado;

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

}
