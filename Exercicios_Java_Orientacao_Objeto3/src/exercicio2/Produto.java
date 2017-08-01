package exercicio2;

import java.text.DecimalFormat;

/**
 * Declaração da classe "public abstract class Produto implements Comparable<Produto>".
 * A implementação da interface Comparable, passando Produto como Parâmetro é utilizada
 * para comparar objetos. A implementação desta interface foi necessária para que fosse
 * possível utilizar o método Collections.sort(lista), onde o método necessita de um parâmetro 
 * para efetuar a comparação. Ao implementar a interface Comparable, foram definidos um método para
 * cada classe que extende ao produto. 
 * 
 * @author Andiara
 *
 */

public abstract class Produto implements Comparable<Produto>{

	DecimalFormat df = new DecimalFormat("#0.00");

	private String nome;
	private double preco;
	private String codBarras;
	private final String tipoProduto;

	public Produto(String nome, double preco, String codBarras, String tipoProduto) {
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
		this.tipoProduto = tipoProduto;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		String dados;
		dados = "\nNome: " + getNome();
		dados += "\nPreço: R$" + df.format(getPreco());
		dados += "\nTipo: " + getTipoProduto();
		dados += "\nCódigo: "+ getCodBarras();
		dados += "\n------------------------------";
		return dados;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	/**
	 * Object obj é a representação genérica de um objeto. Para acessar a
	 * variável obj como um objeto do tipo produto, foi necessário realizar o
	 * CAST informando o tipo do objeto conforme exemplo:
	 * 
	 * Produto outro = (Produto) obj;
	 * 
	 * O CAST é feito ao declarar entre parênteses o tipo do objeto/variável
	 * antes da variável selecionada.
	 * 
	 * Neste caso, o objeto "obj" foi convertido para um do tipo "Produto".
	 */

	@Override
	public boolean equals(Object obj) {
		Produto outro = (Produto) obj;
		return this.codBarras.equals(outro.getCodBarras());
	}

}
