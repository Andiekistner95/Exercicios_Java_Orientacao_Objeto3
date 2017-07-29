package exercicio2;

public class CD extends Produto {

	private int numeroFaixas;

	public int getNumeroFaixas() {
		return numeroFaixas;
	}

	public void setNumeroFaixas(int numeroFaixas) {
		this.numeroFaixas = numeroFaixas;
	}

	public CD(String nome, double preco, int numeroFaixas, String codBarras) {
		super(nome, preco, codBarras,"CD");
		this.numeroFaixas = numeroFaixas;
	}

	@Override
	public String toString() {
		String dados = super.toString();
		dados += "\nNúmero  de faixas: " + getNumeroFaixas();
		return dados;
	}
}
