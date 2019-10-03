package saga;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Classe que representa o objeto Fornecedor
 * 
 * @author Raiff F. Mota Maia
 */

public class Fornecedor {
	private String nome;
	private String email;
	private String telefone;
	private Map<String, Produto> produtos;

	/**
	 * Construtor respons�vel por criar um novo objeto do tipo fonecedor
	 * 
	 * @param nome     nome do fornecedor
	 * @param email    email do fornecedor
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
	 * M�todo que retorna uma Stringo com as informa��os do fornecedor
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return nome + "-" + email + "-" + telefone;
	}

	/**
	 * M�todo que acessa o nome de um Fornecedor
	 * 
	 * @return String com o nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo que permite alterar o nome de um Fornecedor
	 * 
	 * @param nome nome do fornecedor
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * M�todo que acessa o email de um Fornecedor
	 * 
	 * @return String com o email
	 */

	public String getEmail() {
		return email;
	}

	/**
	 * M�todo que permite alterar o email de um Fornecedor
	 * 
	 * @param nome nome do email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * M�todo que acessa o telefone de um Fornecedor
	 * 
	 * @return String com o telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * M�todo que permite alterar o telefone de um Fornecedor
	 * 
	 * @param telefone telefone do fornecedor
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	// --------------------------------------------

	/**
	 * M�todo respons�vel por cadastrar um produto em um fornecedor
	 * 
	 * @param fornecedor nome do fonecedor
	 * @param nome       nome do produto
	 * @param preco      preco do produto
	 * @param descricao  descricao do produto
	 */
	public void cadastraProduto(String nome, Double preco, String descricao) {
		Produto produto = new Produto(nome, preco, descricao);
		if (this.produtos.containsKey(nome))
			throw new Error("Erro no cadastro de produto: produto ja existe.");
		this.produtos.put(produto.getNome(), produto);

	}
	
	/**
	 * Método responsável por retornar um produto
	 * @param nome do produto
	 * @return retorna uma String com informções do produto
	 */
	public String retornaProduto(String nome) {
		return this.produtos.get(nome).toString();
	}

	
	/**
	 * Método responsável por retornar todos os produtos
	 * @return String contendo todos os produtos de todos os fornecedores
	 */
	public String retornaTodos() {
		Set<String> chaves = this.produtos.keySet();
		String lista = "";
		int i = 0;
		for(String chave: chaves) {
			if (chave != null && i == 0) {
				lista += this.nome + " - "+ produtos.get(chave).toString();
			}
			else if (chave != null && i > 0){
				lista += this.nome + " - "+ produtos.get(chave).toString() + " | ";
			}
			i++;
		
		}
		
		return lista;
	}
	
	/**
	 * Método responsável por remover um produto
	 * @param nome nome do produto
	 */
	public void removeProduto(String nome) {
		this.produtos.remove(nome);
	}

	/**
	 * Método responsável por editar um produto
	 * @param nome nome do produto
	 * @param novoValor novo valor a ser atualizado
	 */
	public void editaProduto(String nome, Double novoValor) {
		this.produtos.get(nome).setPreco(novoValor);
		
	}


}
