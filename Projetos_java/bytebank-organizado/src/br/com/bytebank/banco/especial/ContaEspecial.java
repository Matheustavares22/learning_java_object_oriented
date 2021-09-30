package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero, Cliente titular) {
		super(agencia, numero, titular);
	}

	@Override
	public boolean deposita(double valor) {
		super.saldo += valor;
		return false;
	}

}
