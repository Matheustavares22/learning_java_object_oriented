
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente matheus = new Cliente();
		matheus.nome = "Matheus";
		matheus.cpf = "46509312900";
		matheus.profissao = "Desenvolvedor";
		
		Conta cMatheus = new Conta();
		cMatheus.deposita(100);
		cMatheus.titular = matheus;
		System.out.println(cMatheus.titular.nome);
		
		Conta cKamila = new Conta();
		cKamila.titular = new Cliente();
		cKamila.titular.nome = "Kamila";
		System.out.println(cKamila.titular.nome);
		
		System.out.println(cMatheus.deposita(-23));
		System.out.println(cMatheus.getSaldo());
		System.out.println(cMatheus.transfere(100, cKamila));
		System.out.println(cMatheus.getSaldo());		
	}
}
