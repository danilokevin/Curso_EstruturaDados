package com.danilo.estruturadados.vetor.teste;

import java.util.ArrayList;

public class Aula012 {

	public static void main(String[] args) {
		
		ArrayList<String> vetor = new ArrayList<String>();
		
		vetor.add("elemento A");
		vetor.add("elemento C");
		
		System.out.println(vetor);
		
		vetor.add(1, "Elemento B");
		
		System.out.println(vetor);
		
		boolean existe = vetor.contains("elemento a");
		if(existe){
			System.out.println("elemento existe no array");
		} else {
			System.out.println("elemento não existe no array");
		}
		
		int pos = vetor.indexOf("elemento D");
		System.out.println(pos);
		
		vetor.remove(1);
		System.out.println(vetor);
		
		vetor.remove("elemento C");
		System.out.println(vetor);
		
		
		

		
		
		
		

	}

}
