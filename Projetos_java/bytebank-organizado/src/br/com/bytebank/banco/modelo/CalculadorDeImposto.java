package br.com.bytebank.banco.modelo;

import java.io.Serializable;

//br.com.bytebank.banco.modelo.CalculadorDeImposto => FQN
public class CalculadorDeImposto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private double totalImposto;
	
	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
	
}
