
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
				
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		
		System.out.println("Conta 1 Saldo: " + primeiraConta.saldo);
		System.out.println("Conta 2 Saldo: " + segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("true");
		} else {
			System.out.println("they are different!");
		}
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
