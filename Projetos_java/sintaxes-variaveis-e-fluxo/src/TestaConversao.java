
public class TestaConversao {
	
	public static void main(String[] args) {
		
		//double valor = 3; (Promoção do valor int para double não é 
		//possivel fazer o inverso de forma tão simples é necessaria uma conversão)
		
		double salario = 1270.50;
		int valor = (int) salario;		
		System.out.println(valor);
		
		long numeroGrande = 8235789053478909l;
		System.out.println(numeroGrande);
		
		short valorPequeno = 2323;
		System.out.println(valorPequeno);
		
		byte valorPequenino = 127;
		System.out.println(valorPequenino);
		
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2;
		
		System.out.println("\n" + total);
		
		float pontoFlutuante = 3.14f;
		System.out.println(pontoFlutuante);
		
	}
}
