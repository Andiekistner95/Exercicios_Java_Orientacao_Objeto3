package exercicio2;

import java.util.Vector;

public class ComparableImpl implements IComparable{

	@Override
	public void buscaProdutoNomeCodBarras(Vector<Produto> vetorProdutos, String produtoPesquisado) {
		
			int tamanhoVetor = vetorProdutos.size();
			int posicao = 0;
			boolean encontrado = false;

			for (Produto produtos : vetorProdutos) {
				posicao++;
				if ((produtos.getNome().equals(produtoPesquisado)) || (produtos.getCodBarras().equals(produtoPesquisado))) {
					
					encontrado = true;
			
					System.out.println("\nProduto encontrado. Posição: " + (posicao-1));
					System.out.println(produtos.toString());
					
				} else if ((posicao == tamanhoVetor) && !encontrado) {
					System.out.println("\nProduto não encontrado.");

				}	
			}
		
	}
	

}
