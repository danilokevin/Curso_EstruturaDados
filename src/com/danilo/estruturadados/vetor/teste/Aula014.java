package com.danilo.estruturadados.vetor.teste;

import com.danilo.estruturadados.pilha.Pilha;

public class Aula014 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		for (int i = 1; i <= 12; i++){
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
		
		
	
		

	}

}
