package com.danilo.estruturadados.vetor.teste;

import com.danilo.estruturadados.vetor.Vetor;

public class Aula008 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(4);
		vetor.adicionaFinal("Engenharia");
		vetor.adicionaFinal("Sistemas");
		vetor.adicionaFinal("Estrutura");
		vetor.adicionaFinal("IHC");
		vetor.adicionaFinal("Inglês");
		
		System.out.println(vetor);

	}

}
