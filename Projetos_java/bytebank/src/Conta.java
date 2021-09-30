public class Conta {	
	double saldo;
	int agencia;
	int numero;
	String Titular;
	
	public void deposita(double valor) {
		this.saldo += valor;
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
}

//Classe é como o blueprint de uma casa
// As contas feitas a partir da classe sim são objetos ou instâncias