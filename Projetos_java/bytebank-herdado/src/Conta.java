public abstract class Conta {	
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas;
	
	public Conta(int agencia, int numero) {
		Conta.totalContas++;
		setAgencia(agencia);
		setNumero(numero);
	}
	
	public abstract boolean deposita(double valor);
//	public boolean deposita(double valor) {
//		if (valor > 0) {
//			this.saldo += valor;
//			return true;
//		} else {
//			return false;
//		}
//	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destinatario){
		if (saca(valor)) {
			destinatario.deposita(valor);
			return true;
		} 
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	private void setNumero(int numero){
		if (numero <= 0) {
			System.out.println("N�o pode ser menor ou igual a 0!");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	private void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("N�o pode ser um numero menor ou igual a 0!");
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
}

//Classe � como o blueprint de uma casa
// As contas feitas a partir da classe sim s�o objetos ou inst�ncias