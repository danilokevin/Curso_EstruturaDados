package com.danilo.estruturadados.pilha;

import com.danilo.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {
	
	public Pilha(){
		super();
	}
	
	public Pilha(int capacidade){
		super(capacidade);
	}
	
	public void empilha(T elemento){
//		this.aumentaCapacidade();
//		
//		this.elementos[this.tamanho] = elemento;
//		this.tamanho++;
		
		super.adiciona(elemento);
		
	}
	
	public T topo(){
		if (this.estaVazia()){
			return null;
		}
		
		return this.elementos[this.tamanho-1];
	}
	
	public T desempilha(){
		if (this.estaVazia()){
			System.out.println("Pilha vazia");
		}
		
		T retorno = this.elementos[this.tamanho - 1];
		
		this.tamanho--;
		
		return retorno;
		
		//Exemplo:
		//4
		//3
		//2
		//1

		//remover elemento, sempre o último a ser inserido (que está no topo)
		//topo = tamanho - 1 = posição 3 = elemento 4
		
		//elemento removido = 4
		
		//pilha atualizada
		//3
		//2
		//1

		
	}

}
