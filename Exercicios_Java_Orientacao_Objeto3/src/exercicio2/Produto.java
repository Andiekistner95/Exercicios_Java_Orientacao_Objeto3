package exercicio2;

import java.text.DecimalFormat;

public abstract class Produto {

	DecimalFormat df = new DecimalFormat("#0.00");
	
	private String nome;
	private double preco;
	private String codBarras;

	public Produto(String nome, double preco, String codBarras){
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
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
		return dados;
	}
}
