package saga;

/**
 * Classe responsável por representar um objeto do tipo Produto
 * @author Raiff F. Mota Maia
 *
 */

public class Produto {
	private Double preco;
	private String nome;
	private String descricao;
	
	
	public Produto(String nome, Double preco, String descricao) {
		this.preco = preco;
		this.nome = nome;
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
