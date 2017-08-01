package exercicio2;

public class DVD extends Produto {

	private int duracao;

	public DVD(String nome, double preco, int duracao, String codBarras) {
		super(nome, preco, codBarras, "DVD");
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

	 /**
	* Método utilizado para servir de parâmetro para a Interface Comparable.
	* A interface Comparable utilizará o retorno deste método para faze a comparação entre 
	* os objetos durante uma ordenação.
	* 
	*/
	
	@Override
	public int compareTo(Produto o) {
		return this.getNome().compareTo(o.getNome());
	}

}
