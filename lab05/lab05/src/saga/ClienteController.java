package saga;

import java.util.HashMap;

import java.util.Map;

/**
 * Classe responsável por controlar ao métodos relacionados a um Cliente
 * @author cilada
 *
 */


public class ClienteController {
	private Map<String, Cliente> clientes;

	public ClienteController() {
		this.clientes = new HashMap<>();
	}

	/**
	 * Método responsável por cadastrar um cliente
	 * @param nome nome do cliente
	 * @param cpf cpf do cliente
	 * @param email email do cliente
	 * @param loc localização do cliente
	 * @return retorna o cpf do cliente
	 */
	public String cadastraCliente(String nome, String cpf, String email, String loc) {
		Cliente cliente = new Cliente(nome, cpf, email, loc);
		this.clientes.put(cpf, cliente);
		return cpf;
		
	}
	
	/**
	 * M�todo respons�vel por retornar um cliente
	 * @param nome nome do cliente
	 * @return String contendo informacoes de um cliente
	 */
	public String retornaCliente(String cpf) {
		if(!this.clientes.containsKey(cpf)) {
			throw new Error("Erro na exibicao do cliente: cliente nao existe.");
			
		}
		return this.clientes.get(cpf).toString();
		}

	/**
	 * Método responsável por retornar todos os clientes
	 * @return String contendo os clientes
	 */
	public String retornaClientes() {
	    for (Cliente cliente : this.clientes.values()) {
	        return cliente.toString();
	    }
	    	return "";
}
	
	/**
	 * Método responsável por editar um cliente
	 * @param cpf cpf do cliente
	 * @param dado dado do cliente
	 * @param dadoAtualizado novo dado do cliente
	 */
	public void editaCliente(String cpf, String dado, String dadoAtualizado) {
		if(!this.clientes.containsKey(cpf)) {
			throw new Error("Erro na edicao do cliente: CPF n�o existe.");
			}
		else if(dado.equals("email")) {
			this.clientes.get(cpf).setEmail(dadoAtualizado);
			}
		else if(dado.equals("nome")) {
			this.clientes.get(cpf).setNome(dadoAtualizado);
			}
		else if(dado.equals("localizacao")) {
			this.clientes.get(cpf).setLoc(dadoAtualizado);
			}
}
	/**
	 * Cliente responsavel por remover um cliente
	 * @param cpf cpf do cliente
	 */
	public void removeCliente(String cpf) {
		 this.clientes.remove(cpf);

	}
}