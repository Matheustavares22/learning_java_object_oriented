public class Conta {	
	private double saldo;
	int agencia;
	int numero;
	Cliente titular;
	
	//public void deposita(double valor) {		
	public boolean deposita(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			return false;
		}
	}
	
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
	
}

//Classe é como o blueprint de uma casa
// As contas feitas a partir da classe sim são objetos ou instâncias