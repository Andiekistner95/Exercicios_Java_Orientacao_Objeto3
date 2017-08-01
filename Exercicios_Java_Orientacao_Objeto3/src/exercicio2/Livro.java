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
