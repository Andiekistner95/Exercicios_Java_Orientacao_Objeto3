package exercicio2;

import java.util.Vector;

public interface IComparable {

	/**
	 * M�todo criado para realizar a pesquisa de produtos pelo nome.
	 * 
	 * Foi utilizado como static porque a classe loja n�o � uma classe de
	 * objeto, portanto ela n�o pode ser instanciada.
	 * 
	 * Ao definir um m�todo como static, o m�todo passa a existir sem ter a
	 * necessidade de instanciar um objeto da classe. Esta � a �nica maneira de
	 * acessar um m�todo de uma classe que n�o pode ser instanciada
	 * 
	 * 
	 * @param vetorProdutos
	 *            � a lista de produtos (ArrayList)
	 * @param produtoPesquisa
	 *            � o termo (item, nome, etc...) pesquisado (String)
	 * 
	 *            O m�todo buscaProduto, realizar� buscas na lista (ArrayList)
	 *            de produtos, retornando as informa��es do produto se
	 *            encontrado.
	 * 
	 *            A pesquisa � feita atrav�s do m�todo equals() onde o termo
	 *            pesquisado s� retornar� os dados nos casos em que o nome seja
	 *            EXATAMENTE igual ao termo da pesquisa.
	 */

	public abstract void buscaProdutoNomeCodBarras(Vector<Produto> vetorProduto, String produtoPesquisado);

}
