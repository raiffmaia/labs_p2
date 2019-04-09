package lab03;

/** Classe que representa o objeto contato */
public class Contato {
	/**
	 * String nome nome do contato
	 */
	private String nome;
	/**
	 * String sobrenome sobrenome do contato
	 */
	private String sobrenome;
	/**
	 * String numero numero do contato
	 */
	private String numero;

	/**
	 * Construtor do objeto contato
	 * 
	 * @param String nome nome do contato
	 * @param String sobrenome sobrenome do contato
	 * @param String telefone telefone do contato
	 */
	public Contato(String nome, String sobrenome, String numero) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.numero = numero;
	}

	public String getnome() {
		return this.nome;

	}

	public String getsobrenome() {
		return this.sobrenome;
	}

	public String getnumero() {
		return this.numero;
	}

	public String toString() {
		return nome + " " + sobrenome + " " + "-" + " " + numero;
	}

}
