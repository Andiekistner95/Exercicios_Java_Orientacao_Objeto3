package exercicio2;

import java.util.Vector;

public interface IComparable {

	/**
	 * Método criado para realizar a pesquisa de produtos pelo nome.
	 * 
	 * Foi utilizado como static porque a classe loja não é uma classe de
	 * objeto, portanto ela não pode ser instanciada.
	 * 
	 * Ao definir um método como static, o método passa a existir sem ter a
	 * necessidade de instanciar um objeto da classe. Esta é a única maneira de
	 * acessar um método de uma classe que não pode ser instanciada
	 * 
	 * 
	 * @param vetorProdutos
	 *            É a lista de produtos (ArrayList)
	 * @param produtoPesquisa
	 *            É o termo (item, nome, etc...) pesquisado (String)
	 * 
	 *            O método buscaProduto, realizará buscas na lista (ArrayList)
	 *            de produtos, retornando as informações do produto se
	 *            encontrado.
	 * 
	 *            A pesquisa é feita através do método equals() onde o termo
	 *            pesquisado só retornará os dados nos casos em que o nome seja
	 *            EXATAMENTE igual ao termo da pesquisa.
	 */

	public abstract void buscaProdutoNomeCodBarras(Vector<Produto> vetorProduto, String produtoPesquisado);

}
