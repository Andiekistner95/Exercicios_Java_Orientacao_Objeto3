package exercicio2;

import java.util.Collections;
import java.util.Vector;

public class Loja {
	public static void main(String[] args) {

		Vector<Produto> produtos = new Vector<Produto>();

		// Pode ser feito de duas maneiras:
		// CD cd1 = new CD("Metal milf", 55.99, 7);

		produtos.add(new CD("Metal milf", 55.99, 7, "5454545"));
		produtos.add(new CD("Meteora", 69.99, 12, "7878787"));
		produtos.add(new CD("Meteora", 69.99, 12, "7878787"));
		produtos.add(new CD("Meteora", 69.99, 12, "78858585"));

		produtos.add(new DVD("Frozen", 35.99, 120, "12121212"));
		produtos.add(new DVD("Enrolados", 38.99, 125, "65656565"));

		produtos.add(new Livro("A seleção", 39.99, "Kiera Cass", "9898898"));
		produtos.add(new Livro("The kiss of deception", 69.99, "Mary E Pearson", "66969966"));
		produtos.add(new Livro("Instrumentos mortais", 49.99, "Cassandra Clare", "47474747"));
		produtos.add(new Livro("A rainha vermelha", 49.99, "Victoria Aveyard", "2525252255"));

		DVD voceQuerBrincarNaNeve = new DVD("Frozen", 35.99, 120, "12121212");

		for (Produto produto : produtos) {
			System.out.println(produto.toString());
		}

	
		Collections.sort(produtos);

		
		for (Produto produto : produtos) {
			System.err.println("******************************");
			System.err.println(produto.toString());
			System.err.println("******************************");
		}

		System.err.println(produtos.get(1).equals(produtos.get(2)));
		System.err.println(produtos.get(1).equals(produtos.get(3)));

		buscaProduto(produtos, voceQuerBrincarNaNeve);
		// buscaProduto(produtos, "Andie");

		ComparableImpl comparador = new ComparableImpl();
		System.out.println("-*****************-**************-");
		comparador.buscaProdutoNomeCodBarras(produtos, "A seleção");
		System.out.println("-*****************-**************-");

	}

	public static void buscaProduto(Vector<Produto> vetorProdutos, Produto produtoPesquisa) {
		int tamanhoVetor = vetorProdutos.size();
		int posicao = 0;
		boolean encontrado = false;

		for (Produto produtos : vetorProdutos) {
			posicao++;
			if ((produtos.equals(produtoPesquisa))) {

				encontrado = true;

				System.out.println("\nProduto encontrado. Posição: " + (posicao - 1));
				System.out.println(produtos.toString());

			} else if ((posicao == tamanhoVetor) && !encontrado) {
				System.out.println("\nProduto não encontrado.");

			}
		}
	}
}
