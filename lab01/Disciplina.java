package lab02;

import java.util.Arrays;

public class Disciplina {
	private String nomeDisciplina;
	private int horasEstudo;
	private double[] notas = new double[4];
	
	public Disciplina(String nome) {
		this.nomeDisciplina = nome;
	}
	
	public void cadastraHoras(int horas) {
		this.horasEstudo += horas;
	}
	
	public void cadastraNota(int posicao, Double nota) {
		this.notas[posicao + 1] = nota;
		
	}
	
	private double calculaMedia() {
		double somador = 0;
		for(double i : this.notas) {
			somador += i; 
		}
		return somador / 4 ;
	}
	
	public boolean aprovado() {
		double media = calculaMedia();
		if (media >= 7) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Disciplina [nomeDisciplina=" + nomeDisciplina + ", horasEstudo=" + horasEstudo + ", notas="
				+ Arrays.toString(notas) + "]";
	}
	

}
