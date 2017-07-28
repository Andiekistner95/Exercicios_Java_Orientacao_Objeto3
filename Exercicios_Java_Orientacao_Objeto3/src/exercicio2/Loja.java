package exercicio2;

import java.util.Vector;

public class Loja {
	public static void main(String[] args) {

		Vector<Produto> produtos = new Vector<Produto>();

		// Pode ser feito de duas maneiras:
		// CD cd1 = new CD("Metal milf", 55.99, 7);

		produtos.add(new CD("Metal milf", 55.99, 7,"5454545"));
		produtos.add(new CD("Meteora", 69.99, 12,"7878787"));

		produtos.add(new DVD("Frozen", 35.99, 120,"12121212"));
		produtos.add(new DVD("Enrolados", 38.99, 125,"65656565"));

		produtos.add(new Livro("A seleção", 39.99, "Kiera Cass","9898898"));
		produtos.add(new Livro("The kiss of deception", 69.99, "Mary E Pearson","66969966"));
		produtos.add(new Livro("Instrumentos mortais", 49.99, "Cassandra Clare","47474747"));
		produtos.add(new Livro("A rainha vermelha", 49.99, "Victoria Aveyard","2525252255"));

		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}
	}
}
