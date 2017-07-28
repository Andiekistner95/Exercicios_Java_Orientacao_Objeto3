package exercicio2;

public class Livro extends Produto {

	private String autor;

	public Livro(String nome, double preco, String autor, String codBarras) {
		super(nome, preco, codBarras);
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

}
