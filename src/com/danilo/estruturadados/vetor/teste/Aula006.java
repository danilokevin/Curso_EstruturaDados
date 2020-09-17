package com.danilo.estruturadados.vetor.teste;

import com.danilo.estruturadados.vetor.Vetor;

public class Aula006 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(3);
		vetor.adicionaFinal("Engenharia");
		vetor.adicionaFinal("Sistemas");
		vetor.adicionaFinal("Estrutura");
		
		System.out.println(vetor.buscaElemento("estrutura"));

	}

}
