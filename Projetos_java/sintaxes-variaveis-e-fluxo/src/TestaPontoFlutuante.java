
public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		double salario;
		salario = 18000.90;
		// não declarar assim
		System.out.println("Meu salario é R$" + salario);
		
		double idade = 21;
		System.out.println("Minha idade é " + idade);
		
		double divisao1 = 3.14 / 2;
		Float divisao2 = 3.14F / 2F;
		System.out.println("divisão 1 é => " + divisao1);
		System.out.println("divisão 2 é =>" + divisao2);
		
		int outraDivisao = 5 / 2;
		System.out.println("Outra divisão porem em uma variavel int => 5 / 2 = " + outraDivisao);
		
		double novaTentativa = 5 / 2;
		System.out.println("nova tentativa porem em uma variavel double(mais tem algo errado) => 5 / 2 = " + novaTentativa);

		double maisUmaTentativa = 5.0 / 2;
		System.out.println("agora sim => 5 / 2 = " + maisUmaTentativa);
		
		
		
		
	}
}
