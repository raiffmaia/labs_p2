package lab5;

public class Pesquisa {
	private String descricao;
	private String campoInteresse;
	private boolean status;
	
	
	public Pesquisa(String campo, String descricao) {
		this.campoInteresse = campo;
		this.descricao = descricao;
		this.status = true;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean getStatus(){
		return this.status;
	}


	public String getCampoInteresse() {
		return campoInteresse;
	}


	public void setCampoInteresse(String campoInteresse) {
		this.campoInteresse = campoInteresse;
	}

}
