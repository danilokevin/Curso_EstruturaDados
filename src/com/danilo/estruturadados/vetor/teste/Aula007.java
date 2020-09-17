package com.danilo.estruturadados.vetor.teste;

import com.danilo.estruturadados.vetor.Vetor;

public class Aula007 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(4);
		vetor.adicionaFinal("Engenharia");
		vetor.adicionaFinal("Sistemas");
		vetor.adicionaFinal("Estrutura");
		
		System.out.println(vetor);
		
		vetor.adicionaQualquer("Inglês", 2);
		
		System.out.println(vetor);
		
		

	}

}
