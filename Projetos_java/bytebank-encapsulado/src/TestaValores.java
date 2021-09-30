
public class TestaValores {
	
	public static void main(String[] args) {
		Conta conta1 = new Conta(1337,25);
		Conta conta2 = new Conta(1338,28);
		System.out.println(conta1.getAgencia());
		Conta conta3 = new Conta(1338,28);
		System.out.println(Conta.getTotalContas());
	} 	
}
