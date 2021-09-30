package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ArmazenaReferencias implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Object referencias[];
	private int posicao;
	
	public ArmazenaReferencias() {
		this.referencias = new Object[100];
		this.posicao = 0;
	}
	
	public void adiciona(Object referencia) {		
		this.referencias[posicao] = referencia;
		posicao++;		
	}
	
	public int numeroDeElementos() {	
		return this.posicao;
	}

	public Object getReferencia(int posicao) {
		return this.referencias[posicao];
	}
	
}
