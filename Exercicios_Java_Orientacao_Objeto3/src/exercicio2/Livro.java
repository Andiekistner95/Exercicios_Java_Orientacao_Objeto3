package exercicio2;

public class Livro extends Produto {

	private String autor;

	public Livro(String nome, double preco, String autor, String codBarras) {
		super(nome, preco, codBarras, "Livro");
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		String dados = super.toString();
		dados += "\nAutor: " + getAutor();
		return dados;
	}
	
	 /**
	* M�todo utilizado para servir de par�metro para a Interface Comparable.
	* A interface Comparable utilizar� o retorno deste m�todo para faze a compara��o entre 
	* os objetos durante uma ordena��o.
	* 
	*/

	@Override
	public int compareTo(Produto o) {
		return this.getNome().compareTo(o.getNome());
	}
}
