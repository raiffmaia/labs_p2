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
		for (int i = 0; i < this.listaContatos.length; i++) {
			if (!(listaContatos[i] == null)) {
				System.out.println((i + 1) + " " + "-" + " " + listaContatos[i].getnome());
			}
		}
	}

	public void posicaoContato(int posicao) {
		if (!(listaContatos[posicao - 1] == null)) {
			System.out.println(listaContatos[posicao - 1].toString()); 
		} else {
			System.out.println( "POSIÇÃO INVÁLIDA!");
		}
	}

}
