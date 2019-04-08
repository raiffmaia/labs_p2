package lab03;

public class Contato {
	private String nome;
    private String sobrenome;
    private String numero;
    private int posicao;
   
    public Contato(String nome, String sobrenome, String numero) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numero = numero;
    }

    public String getnome() {
        return this.nome;
       
    }
     public String getsobrenome() {
         return this.sobrenome;
     }
   
    public String getnumero() {
        return this.numero;
    }
   
    public int getposicao() {
        return this.posicao;
    }
    
    public String toString() {
        return nome + " " + sobrenome + " " + "-" + " " + numero;
    }
   
}


