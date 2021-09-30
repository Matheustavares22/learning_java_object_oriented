package br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe representa a moldura de uma conta.
 * 
 * @author Matheus Tavares
 * @version 0.1
 */
public abstract class Conta implements Comparable<Conta>, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	protected double saldo;
	private int agencia;
	private int numero;
	// private Cliente titular;
	// no caso de usar transient o cliente não tera seu titular salvo junto com ele no arquivo binario 
	private transient Cliente titular;
	private static int totalContas;
	/**
	 * Contrutor para inicializar o objeto Conta a partir da agencia e numero.
	 * @param agencia
	 * @param numero
	 */
	public Conta(int agencia, int numero,Cliente titular) {
		Conta.totalContas++;
		setAgencia(agencia);
		setNumero(numero);
		setTitular(titular);
	}
	
	public abstract boolean deposita(double valor);

	/**
	 * Valor precisa ser maior do que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException{
		
		if (this.saldo < valor){
			//problema 
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + " Valor:" + valor);
		} 
		this.saldo -= valor;
	}
	
	public void transfere(double valor, Conta destinatario) throws SaldoInsuficienteException{
		this.saca(valor);
		destinatario.deposita(valor);
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	private void setNumero(int numero){
		if (numero <= 0) {
			System.out.println("Não pode ser menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	private void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode ser um numero menor ou igual a 0!");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotalContas() {
		return Conta.totalContas;
	}	
	
	@Override
	public boolean equals(Object referencia) {
		Conta conta = (Conta) referencia;
		if(this.getAgencia() != conta.getAgencia()) { 		
			return false;
		}		
		if(this.getNumero() != conta.getNumero()) {		
			return false;
		} 		
		if(this.getTitular() != conta.getTitular()) {
			return false;
		}
		return true;
	}
	
	
	/**
	 * Apresentação da classe
	 * 
	 */
	@Override
	public String toString() {
		return String.format("%nTitular %s%n ag.%s-n.%s%nSaldo R$%f", this.titular.getNome(), this.agencia, this.numero , this.saldo);
	}
	
	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}
}

//Classe é como o blueprint de uma casa
// As contas feitas a partir da classe sim são objetos ou instâncias