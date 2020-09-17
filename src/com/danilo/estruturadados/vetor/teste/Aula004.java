package com.danilo.estruturadados.vetor.teste;
import com.danilo.estruturadados.vetor.Vetor;
public class Aula004 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		vetor.adicionaFinal("Engenharia");
		vetor.adicionaFinal("Sistemas");
		
		System.out.println(vetor.retornaTamanho());
		
		System.out.println(vetor);
		

	}

}
