
public class TestaGerente {

	public static void main(String[] args) {
	
		//Autenticavel referencia = new Gerente();
		
		Gerente g1 = new Gerente();
		g1.setNome("Matheus");
		g1.setCpf("213.123.123-09");
		g1.setSalario(1234.30);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		g1.setSenha(2222);
		boolean auntenticou = g1.auntentica(2222);
		System.out.println(auntenticou);
		System.out.println(g1.getBonificacao());
	}	

}
