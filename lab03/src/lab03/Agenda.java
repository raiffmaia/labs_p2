package lab03;

public class Agenda {
	private Contato[] listaContatos;

	public Agenda() {
		this.listaContatos = new Contato[100];
	}

	public void cadastraContato(int posicao, String nome, String sobrenome, String telefone) {
		Contato contato = new Contato(nome, sobrenome, telefone);
		listaContatos[posicao - 1] = contato;
	}

	public void listaContatos() {
		for(int i = 0; i < this.listaContatos.length; i++) {
			System.out.println((i + 1) + " " + "-" + " " + listaContatos[i].getnome());	
		}
	}

	public String posicaoContato(int posicao) {
		if (!(listaContatos[posicao - 1] == null)) {
			return listaContatos[posicao - 1].toString();
		} else {
			return "POSIÇÃO INVÁLIDA!";
		}
	}

}
