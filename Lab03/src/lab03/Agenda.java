package lab03;

 /** Classe que representa a Agenda*/
public class Agenda {
	private Contato[] listaContatos;
	
	/* Método construtor do objeto Agenda */
	public Agenda() {
		this.listaContatos = new Contato[100];
	}
	
	/** Método responsável por cadastrar um contato na Agenda 
	 * @param int posicao posicão na qual o contato deve ser inserido na lista
	 * @param String nome nome do contato
	 * @param String sobrenome sobrenome do contato
	 * @param String telefone telefone do contato 
	 *
	 */
	public void cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		Contato contato = new Contato(nome, sobrenome, telefone);
		listaContatos[posicao - 1] = contato;
	}
	
	/** Método responsável por retornar a lista de contatos */
	public String listaContatos() {
		String lista = "";
		for (int i = 0; i < this.listaContatos.length; i++) {
			if (!(listaContatos[i] == null)) {
				lista += ((i + 1) + " " + "-" + " " + listaContatos[i].getnome()) + System.lineSeparator();
			}
		}
		return lista;
	}
	
	/** Método responsável por retornar o contato de uma determinada posição
	 * @param int posicao posicao do contato que deve ser retornado
	 *  */
	
	public String posicaoContato(int posicao) throws RuntimeException{
		if (!(listaContatos[posicao - 1] == null)) {
			return (listaContatos[posicao - 1].toString()); 
		} else {
			return ( "POSIÇÃO INVÁLIDA!");
		}
	}

}
