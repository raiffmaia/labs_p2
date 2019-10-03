package saga;

/**
 * Classe Cliente
 * @author Raiff F. Mota Maia
 *
 */
public class Cliente {
	private String cpf;
	private String nome;
	private String email;
	private String loc;
	
	/**
	 * M�todo que permite cria um novo objeto Cliente.
	 * @param nome nome do cliente
	 * @param cpf cpf do cliente
	 * @param email email do cliente
	 * @param loc localiza��o do cliente
	 */
	public Cliente(String nome, String cpf, String email, String loc) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.loc = loc;
	}

	/**
	 * M�todo que retorna informa��es de um cliente
	 */
	public String toString() {
		return this.nome+ "-" + this.loc + "-" + this.email;
	}
	
	/**
	 * M�todo que permite acessar um cpf de um cliente
	 * @return String com o cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * M�todo que permite alterar cpf de um cliente
	 * @param cpf cpf do cliente
	 */

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	/**
	 * M�todo que permite acessar nome de um cliente
	 * @return String como nome do cliente
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo que permite alterar nome de um cliente
	 * @param nome nome do cliente
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/** 
	 * M�todo que permite acessar o email de um cliente
	 * @return String com email
	 */

	public String getEmail() {
		return email;
	}

	/**
	 * M�todo que permite alterar email de um cliente
	 * @param email email do cliente
	 */

	public void setEmail(String email) {
		this.email = email;
	}

	/** 
	 * M�todo que permite acessar localizacao de um cliente
	 * @return String com a localiza��o
	 */
	public String getLoc() {
		return loc;
	}

	/**
	 * M�todo que permite alterar nome da localiza��o de um cliente
	 * @param loc localiza��o do cliente
	 */
	public void setLoc(String loc) {
		this.loc = loc;
	}

	

	
}
