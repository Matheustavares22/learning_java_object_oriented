
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		double salario;
		salario = 18000.90;
		// n�o declarar assim
		System.out.println("Meu salario � R$" + salario);
		
		double idade = 21;
		System.out.println("Minha idade � " + idade);
		
		double divisao1 = 3.14 / 2;
		Float divisao2 = 3.14F / 2F;
		System.out.println("divis�o 1 � => " + divisao1);
		System.out.println("divis�o 2 � =>" + divisao2);
		
		int outraDivisao = 5 / 2;
		System.out.println("Outra divis�o porem em uma variavel int => 5 / 2 = " + outraDivisao);
		
		double novaTentativa = 5 / 2;
		System.out.println("nova tentativa porem em uma variavel double(mais tem algo errado) => 5 / 2 = " + novaTentativa);

		double maisUmaTentativa = 5.0 / 2;
		System.out.println("agora sim => 5 / 2 = " + maisUmaTentativa);
		
		
		
		
	}
}
