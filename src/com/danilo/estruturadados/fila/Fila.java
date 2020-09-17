package com.danilo.estruturadados.fila;

import com.danilo.estruturadados.base.EstruturaEstatica;

public class Fila <T> extends EstruturaEstatica<T> {
	
	public Fila(int capacidade){
		super(capacidade);
	}
	
	public Fila(){
		this(10);
	}
	
	public void enfileirar(T valor){
		this.adiciona(valor);
	}
	
	public T espiar(){
		if (this.estaVazia()){
			return null;
		}
		
		return this.elementos[0];
	}
	
	public T desenfileirar(){
		if (this.estaVazia()){
			System.out.println("Fila vazia");;
		}
		
		T removido = this.elementos[0];  //removemos sempre o primeiro elemento
											//da fila
		this.tamanho--;
		
		for (int i = 0; i < this.tamanho; i++){
			this.elementos[i] = this.elementos[i+1]; //em seguida puxamos todos os elementos
		}
		
		//Exemplo: dados ==> | 1  |  2  |   3 | 4   |
		//tamanho-- = de 4 para 3;
		//elemento removido = dados[0] = 1
		//i=0
		//dados[i = 0] = dados[i+1 = 1]
		//| 2  |  2  |   3 | 4   |
		//i++
		//dados[i = 1] = dados[i+1 = 2]
		//| 2  |  3  |   3 | 4   |
		//i++
		//dados[i = 2] = dados[i+1 = 3]
		//| 2  |  3  |   4 | 4   |
		//i++ = 3 (sai da condição do for, pois i = tamannho = 3
		return removido;
	}
	
	

}
