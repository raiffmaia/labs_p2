package saga;

public class Facade {
	private ClienteController cc;
	private FornecedorController fc;
	
	
	public Facade() {
		this.cc = new ClienteController();
		this.fc = new FornecedorController();
	}
	
	public String adicionaCliente(String nome, String cpf, String email, String loc) {
		return this.cc.cadastraCliente(nome, cpf, email, loc);
		}

	public String acessaCliente(String cpf) {
		return this.cc.retornaCliente(cpf);
	}

	public String acessaClientes() {
		return this.cc.retornaClientes();
		
	}
	
	public void atualizaCliente(String cpf, String dado, String dadoAtualizado) {
		this.cc.editaCliente(cpf, dado, dadoAtualizado);
	}

	public void retiraCliente(String cpf) {
		 this.cc.removeCliente(cpf);

	}
	
	
	public String adicionaFonecedor(String nome, String email, String telefone) {
		return this.fc.cadastraFornecedor(nome, email, telefone);
	}

	public String acessaFornecedor(String nome) {
		return this.fc.retornaFornecedor(nome);
	}
	
	public void aualizaFornecedor(String nome, String dado, String dadoAtualizado) {
		this.fc.editaFornecedor(nome, dado, dadoAtualizado);
	}


	public Fornecedor retiraFornecedor(String nome) {
	    return this.fc.removeFornecedor(nome);
	}






}




