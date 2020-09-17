package com.danilo.estruturadados.vetor.teste;

import java.util.Stack;

import com.danilo.estruturadados.pilha.Pilha;

public class Aula018 {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<Integer>();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		System.out.println(stack.isEmpty());
		
		stack.push(1);
		stack.push(6);
		stack.push(76); //empilha
		
		System.out.println(stack.isEmpty());//está vazio
		System.out.println(stack.size());//tamanho
		System.out.println(stack);
		
		System.out.println(stack.peek()); //ver o topo
		System.out.println(stack.pop()); //desempilha
		System.out.println(stack);
		
		
		
	}

}
