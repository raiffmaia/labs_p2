package saga;

import java.util.HashMap;
import java.util.Map;

/**
 * Classe que representa o objeto Fornecedor
 * @author Raiff F. Mota Maia
 */

public class Fornecedor {
	private String nome;
	private String email;
	private String telefone;
	private Map<String, Produto> produtos;
	
	/**
	 * Construtor respons�vel por criar um novo objeto do tipo fonecedor
	 * @param nome nome do fornecedor
	 * @param email email do fornecedor
	 * @param telefone telefone do fornecedor
	 */
	public Fornecedor(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.produtos = new HashMap<>();
	}
	
	/**
	 * M�todo respons�vel por cadastrar um produto em um fornecedor
	 * @param fornecedor nome do fonecedor
	 * @param nome nome do produto
	 * @param preco preco do produto
	 * @param descricao descricao do produto
	 */
	public void cadastraProduto(String fornecedor,String nome, Double preco, String descricao) {
		Produto produto = new Produto(nome, preco, descricao);
		if (this.produtos.containsKey(nome))
			throw new Error("Erro no cadastro de produto: produto ja existe.");
		this.produtos.put(produto.getNome(), produto);
		
	}

	public Map<String, Produto> getProdutos() {
		return produtos;
	}

	
	public void setProdutos(Map<String, Produto> produtos) {
		this.produtos = produtos;
	}

	/**
	 * M�todo que retorna uma Stringo com as informa��os do fornecedor
	 * @return String 
	 */
	@Override
	public String toString() {
		return nome + "-" + email + "-" + telefone ;
	}

	/**
	 * M�todo que acessa o nome de um Fornecedor
	 * @return String com o nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo que permite alterar o nome de um Fornecedor
	 * @param nome nome do fornecedor
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * M�todo que acessa o email de um Fornecedor
	 * @return String com o email
	 */

	public String getEmail() {
		return email;
	}

	/**
	 * M�todo que permite alterar o email de um Fornecedor
	 * @param nome nome do email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * M�todo que acessa o telefone de um Fornecedor
	 * @return String com o telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * M�todo que permite alterar o telefone de um Fornecedor
	 * @param telefone telefone do fornecedor
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
