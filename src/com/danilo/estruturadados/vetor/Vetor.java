package com.danilo.estruturadados.vetor;

//4) Implemente  uma  Lista  de  Strings  em  aloca��o  est�tica  com  todas  as  opera��es indicadas a seguir: 
public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidades) {
		this.elementos = new String[capacidades];
		this.tamanho = 0;
	}
	
	//adicionar  uma  String  no  final  da  lista,  caso  a  opera��o  n�o  possa  ser  realizada,  mostre mensagem avisando;
	
	public void adicionaFinal(String elemento) {
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){ //considerando que tamanho real do vetor n�o � maior 
													//do que sua capacidade
			this.elementos[this.tamanho] = elemento; // Vetor de 4 posi��es, cont�m 3 n�meros ==> | 1  | 2  | 3  |   |
			this.tamanho++; //novo elemento vai ocupar posi��o 3 do vetor (que corresponde ao tamanho real, 
								//n�mero de elementos nele contido
													//| 1  | 2  | 3  | *4*  |
		} else {
			System.out.println("Vetor cheio. N�o � poss�vel adicionar um " + (this.tamanho + 1) + "� elemento");
			//Se vetor estivesse cheio, ou seja, tamanho >= capacidade, a inclus�o n�o seria poss�vel
		}
		
	}
	
	//adicionar uma String no inicio da lista, caso  a  opera��o  n�o  possa  ser  realizada,  mostre mensagem avisando;
	
	public void adicionaInicio(String elemento){
		this.aumentaCapacidade();
		if (this.tamanho < this.elementos.length){ //verificar se a capacidade do vetor j� n�o foi alcan�ada
			for(int i=this.tamanho;i>0;i--){
				this.elementos[i] = this.elementos[i-1];
			}
			this.elementos[0] = elemento;
			this.tamanho++;
			//Como ocorre a troca de posi��es e inclus�o de novo elemento no inicio do vetor?
			//Exemplo de vetor ==> |  1 | 2  | 3  |  |
			//Novo elemento a ser incluso no inicio = 4;
			// i = 3 (tamanho)
			//vetor[3(i)] = vetor[2(i-1)] |  1 | 2  | 3  | 3 |
			//i-- (decrementar valor de i. i = 2)
			// i = 2
			//vetor[2(i)] = vetor[1(i-1)] |  1 | 2  | 2  | 3 |
			//i--
			//i = 1
			//vetor[1(i)] = vetor[0(i-1)] |  1 | 1  | 2  | 3 |
			//i-- = 0
			//ao chegar na posi��o 0 (zero), podemos adicionar o novo elemento.
			//vetor[0] = 4
			//|  0 | 1  | 2  | 3 |
			
			
		} else {
			System.out.println("Vetor cheio. N�o � poss�vel adicionar um novo elemento");
			//Se vetor estivesse cheio, ou seja, tamanho >= capacidade, a inclus�o n�o seria poss�vel
		}
	}
	
	//-verificar se a lista est� vazia, retornando true se estiver vazia e false se n�o estiver;
	
	public boolean verificaListaVazia(){
		//tamanho corresponde ao n�mero de elementos contidos no vetor
		//se tamanho for = 0 (zero), siginifica que o vetor est� v�zio, sem nenhum elemento
		if (this.tamanho == 0){
			return true;
		} else {
			return false;
		}
	}
	
	//-verificar se a lista est� cheia, retornando true se estiver cheia e false se n�o estiver;
	
	public boolean verificaListaCheia(){
		if (this.tamanho == this.elementos.length){
			//se tamanho, que corresponde ao n�mero de elementos contidos no vetor, for igual a 
			//capacidade do mesmo
			//significa que ele est� vazio
			//tamanho e capacidade = 4 |  0 | 1  | 2  | 3 |
			return true;
		} else {
			return false;
		}
	}
	
	public int retornaTamanho(){
		return this.tamanho;
	}

	//percorrer a lista concatenando os elementos em uma String que ser� devolvida no final 
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		for (int i=0; i<this.tamanho-1;i++){
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		s.append("]");
		return s.toString();
		
		//  dados = |  1 | 2  | 3  |
		//i = 0; tamanho = 3;
		//String += dados[i] = "[1, 
		//i++ = i = 1
		//String += dados[i] = "[1, 2 
		//i++ = i = 2
		//String += dados[i] = "[1, 2, 3
		//i++ = i = 3 (maior que tamanho - 1 = 2)
		//String += ] = [1, 2, 3] = sa�da
	
		
//		if (this.tamanho > 0){
//			s.append(this.elementos[this.tamanho-1]);
//		}
		
		
	}
	
	//retornar elemento de determinada posi��o v�lida do vetor
	public String buscaElemento(int posicao){
		if (!(posicao >= 0 && posicao < this.tamanho)){ //verificar se posi��o passada n�o � menor que 0 (zero) ou 
														//maior/igual ao tamanho real do vetor
														// |  1 | 2  | 3  | = tamanho = 3
														// a busca est� limitada na posi��o entre 0 e 2
			
														//se posi��o igual a 1 = retornar� 2
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}
		return this.elementos[posicao];
	}
	
	//verificar se determinado elemento existe no vetor
	public boolean buscaElemento(String elemento){
		for (int i=0;i<this.tamanho;i++){
			if (this.elementos[i].equals(elemento)){//existe o m�todo equalIgnoreCase que n�o leva em considera��o mai�scula e min�scula ao comparar Strings
				return true; //tamb�m poderia retornar um inteiro com o n�mero da posi��o onde o elemento se encontra
			}
		}
		return false; //usaria o -1 como false, se estivesse retornando inteiro (posi��o)
	}
	
	//adicionar uma String em determinada posi��o da lista, caso a opera��o n�o possa ser realizada, mostre mensagem avisando o motivo
	
	
	public void adicionaQualquer(String novo, int pos){
		this.aumentaCapacidade();
		
		if (!(pos >= 0 && pos < this.tamanho)){
			throw new IllegalArgumentException("Posi��o Inv�lida");
		}
		
		for (int i=this.tamanho-1;i>= pos; i--){
			this.elementos[i+1] = this.elementos[i];
		}
		
		this.elementos[pos] = novo;
		this.tamanho++;
		//Exemplo: dados = |  1 | 2  | 3  |  4 |   |
		//se deseja-se adicionar um novo elemento (5) na posi��o 1 (onde atualmente est� o n�mero 2):
		//� necess�rio "empurar" todos os elementos a partir desta posi��o para 1 casa a frente
		//i = tamanho - 1 = 3
		//dados[i+1=4] = dados[i=3] = |  1 | 2  | 3  |  4 | 4  |
		//i-- = 2
		//dados[i+1=3] = dados[i=2] = |  1 | 2  | 3  |  3 | 4  |
		//i-- = 1
		//dados[i+1=2] = dados[i=1] = |  1 | 2  | 2  |  3 | 4  |
		//i-- = 0
		//como i alcan�a a condi�ao do for, ou seja, menor que a posi��o desejada
		//podemos adicionar o novo elemento
		//dados[posi��o desejada = 1] = novo elemento
		//|  1 | 5  | 2  |  3 | 4  |
	}
	
	private void aumentaCapacidade(){
		if (this.tamanho == this.elementos.length){
			String[] elementosNovos = new String[this.elementos.length * 2];
			for(int i=0;i<this.tamanho;i++){
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	//remover a String de determinada posi��o da lista, retornando o elemento que foi removido, 
				//caso a opera��o n�o possa ser realizada, mostre mensagem avisando; 
	public String removeQualquer(int pos){
		if (!(pos >= 0 && pos < this.tamanho)){
			throw new IllegalArgumentException("Posi��o Inexistente");
		}
		String retorno = this.elementos[pos];
		
		for (int i=pos; i<this.tamanho-1;i++){
			this.elementos[i] = this.elementos[i+1];
		}
		
		this.tamanho--;
		
		//dados = |  1 | 5  | 2  |  3 | 4  |
		//Exemplo: remover elemento da posi��o 2 do vetor (n�mero 2)
		//vamos puxar os elementos a partir desta posi��o para tr�s
		//i = pos = 2
		//dados[2] = dados[3] ==> |  1 | 5  | 3  |  3 | 4  |
		//i++ = 3
		//dados[3] = dados[4] ==> |  1 | 5  | 3  |  4 | 4  |
		
		//como decrementamos o tamanho (de 5 para 4), o �ltimo elemento n�o ser� exibido 
		//ou considerado
		
		return retorno;
	}
}
