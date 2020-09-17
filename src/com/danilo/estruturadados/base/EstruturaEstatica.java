package com.danilo.estruturadados.base;

public class EstruturaEstatica <T> {

	protected T[] elementos;
	protected int tamanho;

	public EstruturaEstatica(int capacidades) {
		this.elementos = (T[]) new Object[capacidades];
		this.tamanho = 0;
	}
	
	public EstruturaEstatica (){
		this(10);
	}

	protected boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento; //sempre vai adicionar na última posição disponível
										//corresponde ao valor do tamanho
					//Exemplo:
					// ___ (posição disponível para empilhar)
					//4
					//3
					//2
					//1
			
					//adicionar no topo o número 5.
					//pilha[tamanho = 4] = 5
					//5
					//4
					//3
					//2
					//1
			
			this.tamanho++;
			return true;
		}
		return false;
	}

	protected boolean adicionaQualquer(T novo, int pos){
		this.aumentaCapacidade();

		if (!(pos >= 0 && pos < this.tamanho)){
			throw new IllegalArgumentException("Posição Inválida");
		}

		for (int i=this.tamanho-1;i>= pos; i--){
			this.elementos[i+1] = this.elementos[i];
		}

		this.elementos[pos] = novo;
		this.tamanho++;
		
		return true;
	}

	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			T[] elementosNovos = (T[])new Object [this.elementos.length * 2];
			for(int i=0;i<this.tamanho;i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}

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

	public int tamanho(){
		return this.tamanho;
	}
	
	public boolean estaVazia(){
		//se tamanho, que corresponde ao número de elementos contidos na fila, for = zero
		//significa que está vazia, retorna true
		//caso contrário, se tiver pelo menos 1, retorna false
		return this.tamanho == 0;
	}

}
