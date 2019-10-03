package saga;

import java.util.HashMap;
import java.util.Map;


public class ClienteController {
	private Map<String, Cliente> clientes;

	public ClienteController() {
		this.clientes = new HashMap<>();
	}

	public String cadastraCliente(String nome, String cpf, String email, String loc) {
		Cliente cliente = new Cliente(nome, cpf, email, loc);
		this.clientes.put(cpf, cliente);
		return cpf;
		
	}
	
	public String retornaCliente(String cpf) {
		if(!this.clientes.containsKey(cpf)) {
			throw new Error("Erro na exibicao do cliente: cliente nao existe.");
			
		}
		return this.clientes.get(cpf).toString();
		}

	public String retornaClientes() {
		String lista = "";
	    for (Cliente cliente : this.clientes.values()) {
	        lista += cliente.toString() + " | ";
	    }
	    	return lista;
}
	
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
	public void removeCliente(String cpf) {
		 this.clientes.remove(cpf);

	}
}