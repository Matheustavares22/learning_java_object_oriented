
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta cMatheus = new Conta();
		Conta cKamila = new Conta();
		cMatheus.deposita(100);
		cMatheus.transfere(20, cKamila);
		System.out.println(cKamila.saldo);
		System.out.println(cMatheus.saldo);
	}
}
