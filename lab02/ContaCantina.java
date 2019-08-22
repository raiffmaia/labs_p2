package lab02;
/** 
 * Classe responsável 
 * 
 * @author raifffmm
 *
 */

public class ContaCantina {
	private String nomeCantina;
	private int debito;
	private int quantidade;
	private int totalConsumido;
	
	public ContaCantina(String nome) {
		this.nomeCantina = nome;
	}
	
	public void cadastraLanche(int qtdItens, int valor) {
		this.totalConsumido += valor;
		this.debito += valor;
		this.quantidade += qtdItens;
		
	}
	
	public void pagaConta(int valor) {
		this.debito -= valor;
	}
	
	public int getFaltaPagar() {
		return debito;
		}

	@Override
	public String toString() {
		return  nomeCantina + " " + quantidade + " " + totalConsumido;
	}

}
