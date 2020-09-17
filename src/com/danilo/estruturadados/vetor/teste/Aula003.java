package com.danilo.estruturadados.vetor.teste;

import com.danilo.estruturadados.vetor.Vetor;

public class Aula003 
{
	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);
		
		
		
		vetor.adicionaInicio("Fura Fila");
		vetor.adicionaInicio("Outro Fura Fila");
		vetor.adicionaInicio("Outro Fura Fila");
		vetor.adicionaFinal("teste");
		System.out.println(vetor);
		
		//boolean vazia = vetor.verificaListaVazia();
		//System.out.println(vazia);
		
		//boolean disponibilidade = vetor.verificaLista();
		//System.out.println(disponibilidade);





	}

}
