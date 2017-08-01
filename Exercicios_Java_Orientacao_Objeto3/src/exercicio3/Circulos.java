package exercicio3;

public class Circulos extends Formas {

	private double raio;
	
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

}
