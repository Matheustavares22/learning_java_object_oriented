package br.com.bytebank.banco.modelo;

import java.io.Serializable;

public class SeguroDeVida implements Tributavel, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public double getValorImposto() {
		return 42;
	}
	
}
