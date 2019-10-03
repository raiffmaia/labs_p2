package saga;

/**
 * Método que contém as funcionalidades relacionadas do Fornecedor
 */

import java.util.HashMap;
import java.util.Map;

public class FornecedorController {
	private Map<String, Fornecedor> fornecedores;
	
	/**
	 * Contrutor responsável por inicializar um mapa de fornecedores
	 */
	public FornecedorController() {
		this.fornecedores = new HashMap<>();
	}
	
	/**
	 * Método responsável por cadastrar um fornecedor
	 * @param nome nome do fornecedor
	 * @param email email do fornecedor
	 * @param telefone telefone do fornecedor
	 * @return retorna o nome de um fornecdor ou mensagem de erro
	 */
	public String cadastraFornecedor(String nome, String email, String telefone) {
		if(!this.fornecedores.containsKey(nome)) {
			throw new Error("Erro na exibicao do cliente: cliente nao existe.");
	}
		else{
			Fornecedor fornecedor = new Fornecedor(nome, email,telefone);
			this.fornecedores.put(nome, fornecedor);
			return nome;
		}
	}
	
	/**
	 * Método responsável por retornar um fornecedor
	 * @param nome nome do fornecedor
	 * @return Strindo contendo informações de um fornecedor
	 */
	public String retornaFornecedor(String nome) {
		if(!this.fornecedores.containsKey(nome)) {
			throw new Error("Erro na exibicao do cliente: cliente nao existe.");
			
		}
		return this.fornecedores.get(nome).toString();
		}
	
	
	/**
	 * Método responsável por alterar os dados de um fornecedor
	 * @param nome nome do fornecedor
	 * @param dado qual o dado a ser substituido
	 * @param dadoAtualizado qual o novo dado a ser inserido
	 */
	public void editaFornecedor(String nome, String dado, String dadoAtualizado) {
			if(!this.fornecedores.containsKey(nome)) {
				throw new Error("Erro na edicao do fornecedor!");
				}
			else if(dado.equals("email")) {
				this.fornecedores.get(nome).setEmail(dadoAtualizado);
				}
			else if(dado.equals("telefone")) {
				this.fornecedores.get(nome).setTelefone(dadoAtualizado);
				}
	}
	
	/**
	 * Classe responsável por remover determinado fornecedor
	 * @param nome nome do fornecedor
	 */
	public void removeFornecedor(String nome) {
	    	this.fornecedores.remove(nome);
	}

	public void cadastraProduto(String fornecedor, String nome, Double preco, String descricao) {
		Produto produto = new Produto(nome, preco, descricao);
		fornecedor.cadastraProduto(fornecedor,nome,preco,descricao);
	}

}