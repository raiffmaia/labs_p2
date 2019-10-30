package lab5;

import java.util.HashMap;

public class ControllerPesquisa {
	private HashMap<String, Pesquisa> pesquisas;

	public ControllerPesquisa(){
		this.pesquisas = new HashMap<>();
	}

	public void cadastraPesquisa(String descricao, String campoDeInteresse) {
		Pesquisa pesquisa = new Pesquisa(descricao, campoDeInteresse);
		String codigo = geraCodigo(campoDeInteresse.substring(0, 3), 1);
		this.pesquisas.put(codigo, pesquisa);
	}
	
	public void alteraPesquisa(String codigo, String conteudoASerAlterado, String novoConteudo) {
		if(pesquisas.)
		if (codigoEhValido(codigo)) {
			if (conteudoASerAlterado.equals("descricao")) {
				pesquisas.get(codigo).setDescricao(novoConteudo);
			}
			if(conteudoASerAlterado.equals("campo")){
				pesquisas.get(codigo).setCampoInteresse(novoConteudo);
			}

		}


	}
	
	public void encerraPesquisa(String codigo, String motivo) {
		pesquisas.get(codigo)
		
	}
	
	public void ativaPesquisa(String codigo) {
		
	}
	public String exibePesquisa(String codigo) {
		return this.pesquisas.get(codigo).getCampoInteresse();
	}

	private boolean codigoEhValido(String codigo) {
		if (this.pesquisas.containsKey(codigo))
			return true;
		else
			throw new Error("Codigo nao cadastrado");
	}

	private String geraCodigo(String codigo, Integer i){
		String codigoFinal = codigo + i;
		if(pesquisas.containsKey(codigoFinal)){
			i++;
			return geraCodigo(codigo, i);
		}
		return codigoFinal;
	}

}
