package psquiza;

import easyaccept.EasyAccept;

public class Facade {
    private ControllerPesquisa cp;

    public static void main(String[] args) {
        args = new String[] {"Testadno.Facade", "TestesAceitacao/use_case_1.txt"};
        EasyAccept.main(args);
    }

    public Facade() {
        this.cp = new ControllerPesquisa();
    }
    public String cadastraPesquisa(String descricao, String campoDeInteresse) {
        return cp.cadastraPesquisa(descricao, campoDeInteresse);
    }
    public void encerraPesquisa(String codigo, String motivo) {
        cp.encerraPesquisa(codigo, motivo);
    }

    public void ativaPesquisa(String codigo) {
        cp.ativaPesquisa(codigo);
    }

    public void alteraPesquisa(String codigo, String conteudoASerAlterado, String novoConteudo) {
        cp.alteraPesquisa(codigo, conteudoASerAlterado, novoConteudo);
    }

    public String exibePesquisa(String codigo) {
        return cp.exibePesquisa(codigo);
    }

    public boolean pesquisaEhAtiva(String codigo) {
        return cp.verificaSeAtiva(codigo);
    }



}
