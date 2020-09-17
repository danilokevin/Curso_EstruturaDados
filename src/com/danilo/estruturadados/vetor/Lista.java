package com.danilo.estruturadados.vetor;

import java.lang.reflect.Array;

public class Lista <T>
{
	private T[] elementos;
	private int tamanho;
	
	public Lista(int capacidades) {
		this.elementos = (T[]) new Object[capacidades];
		this.tamanho = 0;
	}
	
//	public Lista(int capacidades, Class<T> tipoClasse) {
//		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidades);
//		this.tamanho = 0;
//	}
	
	//adicionar  uma  String  no  final  da  lista,  caso  a  operação  não  possa  ser  realizada,  mostre mensagem avisando;
	
	public void adicionaFinal(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		} else {
			System.out.println("Vetor cheio. Não é possível adicionar um " + (this.tamanho + 1) + "º elemento");
		}
		
	}
	
	//adicionar uma String no inicio da lista, caso  a  operação  não  possa  ser  realizada,  mostre mensagem avisando;
	
	public void adicionaInicio(T elemento){
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			for(int i=this.tamanho;i>0;i--){
				this.elementos[i] = this.elementos[i-1];
			}
			this.elementos[0] = elemento;
			this.tamanho++;
		} else {
			System.out.println("Vetor cheio. Não é possível adicionar um novo elemento");
		}
	}
	
	//-verificar se a lista está vazia, retornando true se estiver vazia e false se não estiver;
	
	public boolean verificaListaVazia(){
		if (this.tamanho == 0){
			return true;
		} else {
			return false;
		}
	}
	
	//-verificar se a lista está cheia, retornando true se estiver cheia e false se não estiver;
	
	public boolean verificaListaCheia(){
		if (this.tamanho == this.elementos.length){
			return true;
		} else {
			return false;
		}
	}
	
	public int retornaTamanho(){
		return this.tamanho;
	}

	//percorrer a lista concatenando os elementos em uma String que será devolvida no final 
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i=0; i<this.tamanho-1;i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if (this.tamanho > 0){
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		return s.toString();
	}
	
	//retornar elemento de determinada posição válida do vetor
	public T buscaElemento(int posicao){
		if (!(posicao >= 0 && posicao < this.tamanho)){
			throw new IllegalArgumentException("Posição Inválida");
		}
		return this.elementos[posicao];
	}
	
	//verificar se determinado elemento existe no vetor
	public boolean buscaElemento(T elemento){
		for (int i=0;i<this.tamanho;i++){
			if (this.elementos[i].equals(elemento)){//existe o método equalIgnoreCase que não leva em consideração maiúscula e minúscula ao comparar Strings
				return true; //também poderia retornar um inteiro com o número da posição onde o elemento se encontra
			}
		}
		return false; //usaria o -1 como false, se estivesse retornando inteiro (posição)
	}
	
	//adicionar uma String em determinada posição da lista, caso a operação não possa ser realizada, mostre mensagem avisando o motivo
	public void adicionaQualquer(T novo, int pos){
		this.aumentaCapacidade();
		
		if (!(pos >= 0 && pos < this.tamanho)){
			throw new IllegalArgumentException("Posição Inválida");
		}
		
		
		
		for (int i=this.tamanho-1;i>= pos; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[pos] = novo;
		this.tamanho++;
	}
	
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[]) new String[this.elementos.length * 2];
			for(int i=0;i<this.tamanho;i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//remover a String de determinada posição da lista, retornando o elemento que foi removido, caso a operação não possa ser realizada, mostre mensagem avisando; 
	public Object removeQualquer(int pos){
		if (!(pos >= 0 && pos < this.tamanho)){
			throw new IllegalArgumentException("Posição Inexistente");
		}
		Object retorno = this.elementos[pos];
		
		for (int i=pos; i<this.tamanho-1;i++){
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho--;
		
		return retorno;
	}

}
