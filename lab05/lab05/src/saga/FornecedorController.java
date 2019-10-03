package saga;

/**
 * M�todo que cont�m as funcionalidades relacionadas do Fornecedor
 */

import java.util.HashMap;
import java.util.Map;

public class FornecedorController {
	private Map<String, Fornecedor> fornecedores;
	
	/**
	 * Contrutor respons�vel por inicializar um mapa de fornecedores
	 */
	public FornecedorController() {
		this.fornecedores = new HashMap<>();
	}
	
	/**
	 * M�todo respons�vel por cadastrar um fornecedor
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
	 * M�todo respons�vel por retornar um fornecedor
	 * @param nome nome do fornecedor
	 * @return Strindo contendo informa��es de um fornecedor
	 */
	public String retornaFornecedor(String nome) {
		if(!this.fornecedores.containsKey(nome)) {
			throw new Error("Erro na exibicao do cliente: cliente nao existe.");
			
		}
		return this.fornecedores.get(nome).toString();
		}
	
	
	/**
	 * M�todo respons�vel por alterar os dados de um fornecedor
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
	 * Classe respons�vel por remover determinado fornecedor
	 * @param nome nome do fornecedor
	 */
	public void removeFornecedor(String nome) {
	    	this.fornecedores.remove(nome);
	}
	
	/**
	 * Método responsável por cadastrar um produto
	 * @param fornecedor fornecedor a ser cadastrado
	 * @param nome nome do produto
	 * @param preco preco do produto
	 * @param descricao descricao do produto
	 */
	public void cadastraProduto(String fornecedor, String nome, Double preco, String descricao) {
		this.fornecedores.get(fornecedor).cadastraProduto(nome,preco,descricao);
	}
	
	/**
	 * Método responsável por retornar as informações de um produto
	 * @param fornecedor fornecedor do produto
	 * @param nomeProduto nome do produto
	 * @return String com as informações do produto
	 */
	public String consultaProduto(String fornecedor, String nomeProduto) {
		return this.fornecedores.get(fornecedor).retornaProduto(nomeProduto);
	}
	
	/**
	 * Método responsável por retornar todos os produtos de um fornecedor
	 * @param fornecedor
	 * @return Stringo com todos os profutos de um fornecedor
	 */
	public String consultaProdutos(String fornecedor) {
		return this.fornecedores.get(fornecedor).retornaTodos();
	}
	
	/**
	 * Método responsável por retornar os produtos de todos os fornecedores
	 * @return String com os produtos
	 */
	public String retornaTodosExistentes() {
		String lista = " ";
		for(Fornecedor fornecedor : fornecedores.values()) {
			lista += fornecedor.retornaTodos();
		}
			return lista;
		}
	
	/**
	 * Método responsável por remover um produto
	 * @param fornecedor fornecedor do produto
	 * @param produto nome do produto
	 */
	public void removeProduto(String fornecedor, String produto) {
		this.fornecedores.get(fornecedor).removeProduto(produto);
		
	}
	
	
	/**
	 * Método responsável por editar as informações de um produto
	 * @param fornecedor fornecedor do produto
	 * @param produto nome do produto
	 * @param dado dado a ser alterado do produto
	 * @param novoValor novo valor 
	 */
	public void editaProduto(String fornecedor, String produto, String dado, String novoValor) {

		if(dado.equals("preço")) {
			Double novoPreco = Double.parseDouble(novoValor);
			this.fornecedores.get(fornecedor).editaProduto(dado, novoPreco);
		}
		else {
			throw new Error("Comando inválido: exclua o produto e insira-o posteriormente!");
		}
	}
	
	
	
}