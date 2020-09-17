package com.danilo.estruturadados.vetor.teste;

import com.danilo.estruturadados.pilha.Pilha;

public class Aula015 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.estaVazia());
		
		pilha.empilha(6);
		
		System.out.println(pilha.estaVazia());

	}

}
