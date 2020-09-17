package com.danilo.estruturadados.vetor.teste;

import com.danilo.estruturadados.vetor.Vetor;

public class Aula009 {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(4);
		vetor.adicionaFinal("Engenharia");
		vetor.adicionaFinal("Sistemas");
		vetor.adicionaFinal("Estrutura");
		vetor.adicionaFinal("IHC");
		
		System.out.println(vetor);
		
		System.out.println("Elemento removido: " + vetor.removeQualquer(2));
		
		System.out.println(vetor);

		

	}

}
