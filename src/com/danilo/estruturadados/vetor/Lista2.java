package com.danilo.estruturadados.vetor;

import com.danilo.estruturadados.base.EstruturaEstatica;

public class Lista2 <T> extends EstruturaEstatica<T> {
	
	public Lista2(){
		super();
	}
	
	public Lista2(int capacidade){
		super(capacidade);
	}
	
	public boolean adiciona(T elemento) {
		return super.adiciona(elemento);
		
	}
	
	public boolean adicionaQualquer(T novo, int pos){
		return super.adicionaQualquer(novo, pos);
	}

}
