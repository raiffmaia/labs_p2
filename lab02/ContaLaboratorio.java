package lab02;

public class ContaLaboratorio {
	/** 
	 * nome: atributo que guarda o nome da conta. 
	 * */
	private String nome;
	/** 
	 * espaco: atributo que guarda os dados de espaco oculpado/liberado da conta 
	 * */
	private int espaco;
	/**
	 * cota: atributo que guarda a o valor(limite) fixo da uma cota
	 */
	private int cota = 2000;
	
	
	/**
	 * contaLaboratorio Construtor responsável por cadastrar um novo laboratório
	 * @param nome: variavel que recebe o nome de referencia do laboratorio
	 */
	public ContaLaboratorio(String nome) {
		this.nome = nome;
	}
	
	/**
	 * contaLaboratorio: Construtor responsável por cadastrar um laboratorio e definir um novo valor pra cota
	 * @param nome: variavel que recebe o nome de referencia do laboratorio
	 * @param cota: variavel que recebe nova cota escolhida pelo o usuário para a conta
	 */
	public ContaLaboratorio(String nome, int cota) {
		 this.nome = nome;
		 this.cota = cota;
		}
	
	/**
	 * consomeEspaco: método responsável por adicionar somar o "espaco" consumido no atributo espaço
	 * @param mbytes: variavel que recebe o valor consumido
	 */
	public void consomeEspaco(int mbytes) {
		this.espaco += mbytes;
		
	}
	
	/**
	 * liberaEspaco: método responsável por subtrair espaco consumido no atributo espaço
	 * @param mbytes: variavel que recebe o valor a ser liberado
	 */
	public void liberaEspaco(int mbytes) {
		this.espaco -= mbytes;
	}
	
	/**
	 * atingiuCota: método responsável por verificar como está o espaço em relação a cota 
	 * @return: retorna um booleano indicando se o espaço ultrapassou ou não a cota
	 */
	public boolean atingiuCota() {
		return this.espaco >= cota;
	}

	/**
	 * toString: retorna o estado atual dos atributos (nome, espaco, cota)
	 */
	@Override
	public String toString() {
		return  nome + " " + espaco + "/"+ cota;
	}
	
	
	
}
