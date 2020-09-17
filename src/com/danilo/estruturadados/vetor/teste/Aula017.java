package com.danilo.estruturadados.vetor.teste;

import com.danilo.estruturadados.pilha.Pilha;

public class Aula017 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia());
		
		pilha.empilha(7);
		pilha.empilha(8);
		pilha.empilha(9);
		
		System.out.println(pilha);
		
		System.out.println("Desembilhar pilha, retorna elemento: " + pilha.desempilha());
		
		System.out.println(pilha);
		
	}

}
