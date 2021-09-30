
public class TesteSistema {
	
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(222);
		
		Administrador a = new Administrador();
		a.setSenha(2222);
		
		//Designer d = new Designer();
		//d.setSenha(222);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
		si.autentica(a);
		//si.autentica(d);
	} 	
}
