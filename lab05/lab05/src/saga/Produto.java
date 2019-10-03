package saga;

/**
 * Classe respons�vel por representar um objeto do tipo Produto
 * @author Raiff F. Mota Maia
 *
 */

public class Produto {


	private Double preco;
	private String nome;
	private String descricao;
	
	
	/**
	 * Construtor responsável por criar um obejeto do tipo Produto
	 * @param nome nome do produto
	 * @param preco preco do produto
	 * @param descricao descricao do produto
	 */
	public Produto(String nome, Double preco, String descricao) {
		this.preco = preco;
		this.nome = nome;
		this.descricao = descricao;
	}

	/**
	 * Método que acessa o preco de um produto
	 * @return String com preco
	 */
	public Double getPreco() {
		return preco;
	}

	/**
	 * Método que permite editar o preo de um produto
	 * @param preco preco do produto
	 */
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	/**
	 * Método que acessa nome de um produto
	 * @return String com nome
	 */

	public String getNome() {
		return nome;
	}

	/**
	 * Método responsável por editar o nome de um produto
	 * @param nome nome do produto
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Método responsável por acessar a descrição de um produto
	 * @return String com a descrição
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * Método que retorna uma String com informações de um produto
	 */
	@Override
	public String toString() {
		return this.nome + " - " + this.descricao + " - " + "R$" + preco;
	}
	

}
