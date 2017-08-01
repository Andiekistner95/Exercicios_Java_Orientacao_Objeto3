package exercicio2;

import java.text.DecimalFormat;

/**
 * Declara��o da classe "public abstract class Produto implements Comparable<Produto>".
 * A implementa��o da interface Comparable, passando Produto como Par�metro � utilizada
 * para comparar objetos. A implementa��o desta interface foi necess�ria para que fosse
 * poss�vel utilizar o m�todo Collections.sort(lista), onde o m�todo necessita de um par�metro 
 * para efetuar a compara��o. Ao implementar a interface Comparable, foram definidos um m�todo para
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
		dados += "\nPre�o: R$" + df.format(getPreco());
		dados += "\nTipo: " + getTipoProduto();
		dados += "\nC�digo: "+ getCodBarras();
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
	 * Object obj � a representa��o gen�rica de um objeto. Para acessar a
	 * vari�vel obj como um objeto do tipo produto, foi necess�rio realizar o
	 * CAST informando o tipo do objeto conforme exemplo:
	 * 
	 * Produto outro = (Produto) obj;
	 * 
	 * O CAST � feito ao declarar entre par�nteses o tipo do objeto/vari�vel
	 * antes da vari�vel selecionada.
	 * 
	 * Neste caso, o objeto "obj" foi convertido para um do tipo "Produto".
	 */

	@Override
	public boolean equals(Object obj) {
		Produto outro = (Produto) obj;
		return this.codBarras.equals(outro.getCodBarras());
	}

}
