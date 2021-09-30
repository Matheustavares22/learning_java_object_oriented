
public class TestaGetSet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(1337,12);
		//conta.numero = 1336;
		
		Cliente matheus = new Cliente();
		conta.setTitular(matheus);
		conta.getTitular().setNome("Matheus rei delas");
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		//entenda as referencias 
		System.out.println(titularDaConta);
		System.out.println(conta.getTitular());
		System.out.println(matheus);
	}
}
