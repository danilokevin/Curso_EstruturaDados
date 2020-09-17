package com.danilo.estruturadados.vetor.teste;

import com.danilo.estruturadados.fila.Fila;

public class Aula022 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileirar(1);
		fila.enfileirar(2);
		fila.enfileirar(3);
		fila.enfileirar(4);
		System.out.println(fila.tamanho());
		System.out.println(fila);
		
		System.out.println("Removido: " + fila.desenfileirar());
		
		System.out.println(fila);
		System.out.println("Removido: " + fila.desenfileirar());
		
		System.out.println(fila);
		
		

	}

}
