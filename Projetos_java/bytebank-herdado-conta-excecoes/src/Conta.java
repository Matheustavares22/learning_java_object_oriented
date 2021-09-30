
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
}

//Classe é como o blueprint de uma casa
// As contas feitas a partir da classe sim são objetos ou instâncias