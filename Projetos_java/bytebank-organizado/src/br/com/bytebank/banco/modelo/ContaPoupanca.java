package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia,int numero, Cliente titular) {
		super(agencia,numero,titular);
	}
	
	@Override
	public boolean deposita(double valor) {
		super.saldo =+ valor;
		return true;
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException{
		double valorASacar = valor + 0.1;
		super.saca(valorASacar);
	}
	
	@Override
	public String toString() {
		return "Conta Poupan�a " + super.toString();
	} 

}
