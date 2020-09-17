package com.danilo.estruturadados.vetor.teste;

import com.danilo.estruturadados.pilha.Pilha;

public class Aula016 {

	public static void main(String[] args) {
		
		Pilha<Integer> pilha = new Pilha<Integer>();
		
		System.out.println(pilha.topo());
		
		System.out.println(pilha);
		
		pilha.empilha(76);
		pilha.empilha(876);
		pilha.empilha(722);
		
		System.out.println(pilha.topo());
		System.out.println(pilha);
		
		

	}

}
