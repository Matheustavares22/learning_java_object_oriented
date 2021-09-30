
public class SistemaInterno {
	
	private int senha = 222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.auntentica(this.senha);
		if(autenticou) {
			System.out.println("Autenticou");
		} else {
			System.out.println("Não autenticou");
		}
	}
}
