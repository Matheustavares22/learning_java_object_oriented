
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		
		// if com condição apenas para true
		if (idade >= 18) System.out.println("você tem mais de 18 anos");
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade pode entrar");		
		} else {
			if (quantidadePessoas > 1) {
				System.out.println("Você ainda é menor de idade, mas pode entrar pois esta acompanhado");
			} else { 
				System.out.println("Infelizmente você não pode entrar");
			}
		}
	}
}
