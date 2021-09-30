
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente matheus = new Gerente();
		matheus.setNome("Matheus");
		matheus.setCpf("123.123.123-12");
		matheus.setSalario(3900.00);
		System.out.println(matheus.getNome());
		System.out.println(matheus.getCpf());
		System.out.println(matheus.getSalario());
		System.out.println(matheus.getBonificacao());
	}
}
