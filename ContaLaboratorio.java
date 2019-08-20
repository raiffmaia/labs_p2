package lab02;

public class ContaLaboratorio {
	private String nome;
	private int espaco;
	private int cota = 2000;
	
	public ContaLaboratorio(String nome) {
		this.nome = nome;
	}
	public ContaLaboratorio(String nome, int cota) {
		 this.nome = nome;
		 this.cota = cota;
		}

	public void consomeEspaco(int mbytes) {
		this.espaco += mbytes;
		
	}
	
	public void liberaEspaco(int mbytes) {
		this.espaco -= mbytes;
	}
	
	public boolean atingiuCota() {
		return this.espaco <= cota;
	}

	@Override
	public String toString() {
		return "ContaLaboratorio [nome=" + nome + ", espaco=" + espaco + ", cota=" + cota + "]";
	}
	
	
	
}
