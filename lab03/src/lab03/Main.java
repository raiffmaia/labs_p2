package lab03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Agenda agenda = new Agenda();
		Scanner sc = new Scanner(System.in);

		String opcao = "";

		while (!opcao.equals("S")) {
			System.out.print("\n" + "(C)adastrar Contato\n" + "(L)istar Contatos\n" + "(E)xibir Contato\n" + "(S)air\n"
					+ "\n" + "Opção> ");
			opcao = sc.nextLine();
			if (opcao.equals("C")) {
				System.out.println("Posição: ");
				int posicao = sc.nextInt();
				sc.nextLine();
				System.out.println("Nome: ");
				String nome = sc.nextLine();
				System.out.println("Sobrenome: ");
				String sobrenome = sc.nextLine();
				System.out.println("Telefone: ");
				String numero = sc.nextLine();
				if ((0 < posicao) && (posicao <= 100)) {
					agenda.cadastraContato(posicao, nome, sobrenome, numero);
					System.out.println("\n" + "CADASTRO REALIZADO!");
				} else {
					System.out.println("\n" + "POSIÇÃO INVÁLIDA!");

				}
			}
			if (opcao.equals("E")) {
				System.out.print("contato> ");
				int posicaoContato = sc.nextInt();
				sc.nextLine();
				agenda.posicaoContato(posicaoContato);
			}
			if (opcao.equals("L")) {
				agenda.listaContatos();
			}

		}

	}

}
