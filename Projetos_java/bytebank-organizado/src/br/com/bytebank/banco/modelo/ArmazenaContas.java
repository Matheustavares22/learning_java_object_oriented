package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class ArmazenaContas	implements Serializable{
		
	private static final long serialVersionUID = 1L;
		
	private Conta[] referencias;
	private int posicaoLivre;
	
	public ArmazenaContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) {		
		this.referencias[posicaoLivre] = ref;
		posicaoLivre++;		
	}
	
	public int numeroDeElementos() {	
		return this.posicaoLivre;
	}

	public Conta getConta(int posicao) {
		return this.referencias[posicao];
	}
}
