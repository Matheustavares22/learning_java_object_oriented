
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando condicionais");
		int idade = 16;
		int quantidadePessoas = 1;
		
		// if com condi��o apenas para true
		if (idade >= 18) System.out.println("voc� tem mais de 18 anos");
		
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade pode entrar");		
		} else {
			if (quantidadePessoas > 1) {
				System.out.println("Voc� ainda � menor de idade, mas pode entrar pois esta acompanhado");
			} else { 
				System.out.println("Infelizmente voc� n�o pode entrar");
			}
		}
	}
}
