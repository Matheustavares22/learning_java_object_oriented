
public class TesteReferencia {

		public static void main(String[] args) {
			Conta primeiraConta = new Conta();
			primeiraConta.saldo = 200;
			
			System.out.println("Saldo da primeira: " + primeiraConta.saldo);
			
			//referencia			
			Conta segundaConta = primeiraConta;
			System.out.println("Saldo da segunda: " + segundaConta.saldo);
			
			segundaConta.saldo += 100;
			System.out.println("Saldo da segunda: " + segundaConta.saldo);			
			System.out.println("Saldo da primeira: " + segundaConta.saldo);
			
			if (primeiraConta == segundaConta) {
				System.out.println("São a mesma conta");
			}
			System.out.println(primeiraConta);
			System.out.println(segundaConta);
		}
}
