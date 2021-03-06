package psquiza;

/**
 * Classe responsável por por manipular e fazer as operações sobre o objeto Pesquisa
 */

import java.util.HashMap;

public class ControllerPesquisa {
    private HashMap<String, Pesquisa> pesquisas;
    /**
     * @param pesquisas Mapa responsável por associar um objeto pesquisa ao seu código gerado
     */

    public ControllerPesquisa() {
        this.pesquisas = new HashMap<>();
    }

    /**
     * Método responsável por cadastrar uma nova pesquisa e gerar seu código de identificação
     * @param descricao descricao de uma pesquisa
     * @param campoDeInteresse campo de interesse de uma pesquisa
     * @return codigo de identificacao de uma pesquisa
     */

    public String cadastraPesquisa(String descricao, String campoDeInteresse) {
        if(descricao == null || descricao.equals("")) {
            throw new IllegalArgumentException( "Descricao nao pode ser nula ou vazia.");
        }
        else if(campoDeInteresse == null || campoDeInteresse.trim().equals("")) {
            throw new NullPointerException("Formato do campo de interesse invalido.");
        }else if(campoDeInteresse.length() > 255){
            throw new IllegalArgumentException("Formato do campo de interesse invalido.");
        }else if (verificaTopico(campoDeInteresse)){
            throw new IllegalArgumentException("Formato do campo de interesse invalido.");
        }
        Pesquisa pesquisa = new Pesquisa(descricao, campoDeInteresse);
        String codigo = geraCodigo(campoDeInteresse.substring(0, 3), 1);
        this.pesquisas.put(codigo, pesquisa);


        return codigo;

    }

    /**
     * Método responsável por alterar o status de uma pesquisa
     * @param codigo codigo identificador da pesquisa
     * @param motivo motivo de encerramento de uma pesquisa
     */
    public void encerraPesquisa(String codigo, String motivo) {
        if (this.pesquisas.containsKey(codigo)) {
            if(motivo == null || motivo.trim().equals("")){
                throw new NullPointerException("Motivo nao pode ser nulo ou vazio.");
            } else if (pesquisas.get(codigo).getStatus() == true) {
                pesquisas.get(codigo).setStatus();
            } else {
                throw new IllegalArgumentException("Pesquisa desativada.");
            }
        }else {
            throw new IllegalArgumentException("Pesquisa nao encontrada.");
        }
    }

    /**
     * Método responsável por alterar o status de uma pesquisa
     * @param codigo codigo identificador de uma pesquisa
     */
    public void ativaPesquisa(String codigo) {
        if (this.pesquisas.containsKey(codigo)) {
            if (pesquisas.get(codigo).getStatus() == false) {
                pesquisas.get(codigo).setStatus();
            } else {
                throw new IllegalArgumentException("Pesquisa ja ativada.");
            }
        } else {
            throw new IllegalArgumentException("Pesquisa nao encontrada.");
        }

    }

    /**
     * Método responsável por editar as informações de uma pesquisa
     * @param codigo codigo identificador de uma pesquisa
     * @param conteudoASerAlterado qual a opcao a ser alterada na pesquisa
     * @param novoConteudo novo conteudo a ser inseirdo na pesquisa
     */
    public void alteraPesquisa(String codigo, String conteudoASerAlterado, String novoConteudo) {
        if (this.pesquisas.containsKey(codigo)) {
            if (conteudoASerAlterado.equals("DESCRICAO")) {
                if(novoConteudo == null || novoConteudo.equals("")) {
                    throw new IllegalArgumentException( "Descricao nao pode ser nula ou vazia.");
                }else{
                    if(verificaSeAtiva(codigo)){
                        pesquisas.get(codigo).setDescricao(novoConteudo);
                    } else{
                        throw new IllegalArgumentException("Pesquisa desativada.");
                    }
                }
            }
            else if (conteudoASerAlterado.equals("CAMPO")) {
                    if(novoConteudo == null || novoConteudo.trim().equals("")) {
                        throw new NullPointerException("Formato do campo de interesse invalido.");
                    }else{
                        if(verificaSeAtiva(codigo)){
                            pesquisas.get(codigo).setCampoInteresse(novoConteudo);
                        }else {
                            throw new IllegalArgumentException("Pesquisa desativada.");
                        }
                    }
            }else {
                throw new IllegalArgumentException("Nao e possivel alterar esse valor de pesquisa.");
            }

        } else {
            throw new IllegalArgumentException("Pesquisa nao encontrada.");
        }
    }

    /**
     * Método responsável por retornar a representação textual de uma pesquisa
     * @param codigo codigo identificador de uma pesquisa
     * @return toString de uma pesquisa
     */
    public String exibePesquisa(String codigo) {
        if (this.pesquisas.containsKey(codigo)) {
            return codigo + pesquisas.get(codigo).toString();
        }
        else {
            throw new IllegalArgumentException("Pesquisa nao encontrada.");
        }
    }

    /**
     * Método responsável por vefirificar se o status de uma pesquisa está "Ativa"
     * @param codigo codigo identificador de uma pesquisa
     * @return retorna um boolean true ou false
     */
    public boolean verificaSeAtiva(String codigo) {
        if (codigo == null || codigo.trim().equals("")){
            throw new NullPointerException("Codigo nao pode ser nulo ou vazio.");
        } else if (!this.pesquisas.containsKey(codigo)){
            throw new IllegalArgumentException("Pesquisa nao encontrada.");
        } else {
            if(pesquisas.get(codigo).getStatus()) {
                return true;

            } else {
                return false;
            }
        }
    }

    /**
     * Método auxiliar da classe CadastraPesquisa() para gerar o codigo identificador da pesquisa
     * @param codigo as trés letras iniciais do campo de interesse
     * @param i inteiro auxiliar do codigo
     * @return retorna codigo identificador da pesquisa
     */
    private String geraCodigo(String codigo, Integer i) {
        String codigoFinal = codigo.toUpperCase() + i;
        if (pesquisas.containsKey(codigoFinal)) {
            i++;
            return geraCodigo(codigo, i);
        }
        return codigoFinal;
    }

    /**
     * Método auxiliar para verificar as excecões de uma topico de uma pesquisa
     * @param camposDeInteresse campo de interesse de uma pesquisa
     * @return um boolean true ou false
     */
    private boolean verificaTopico(String camposDeInteresse){
        String [] topicos =  camposDeInteresse.split(",");
        boolean retorno = false;
        int contador = 0;
        for (String e: topicos){
            if(e.length() < 3){
                retorno = true;
                break;
            } else{
                contador += 1;
                if (contador > 4){
                    retorno = true;
                }
            }
        }

        return retorno;
    }

}
