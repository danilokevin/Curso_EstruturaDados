package com.danilo.estruturadados.vetor.teste;


import com.danilo.estruturadados.fila.Fila;

public class Aula019 {

	public static void main(String[] args) {
		
		Fila<Integer> fila = new Fila<>();
		
		fila.enfileirar(65);
		fila.enfileirar(5);
		fila.enfileirar(865);
		
		System.out.println(fila);
		System.out.println(fila.espiar());

	}

}
