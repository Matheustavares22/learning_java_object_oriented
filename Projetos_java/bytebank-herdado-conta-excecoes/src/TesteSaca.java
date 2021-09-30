
public class TesteSaca {

	public static void main(String[] args) {
		
		Conta cc1 = new ContaCorrente(123, 321);
		cc1.deposita(100);
		try {
		cc1.saca(500);
		} catch (SaldoInsuficienteException e) {
			System.out.println("Ex: " + e.getMessage());
		}
		System.out.println(cc1.getSaldo());
	}
}
