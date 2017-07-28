package exercicio2;

public class DVD extends Produto {

	private int duracao;

	public DVD(String nome, double preco, int duracao, String codBarras) {
		super(nome, preco, codBarras);
		this.duracao = duracao;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	@Override
	public String toString() {
		String dados = super.toString();
		dados += "\nDuração em minutos: " + getDuracao();
		return dados;
	}

}
