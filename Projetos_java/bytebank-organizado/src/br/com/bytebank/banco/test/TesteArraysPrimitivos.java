package br.com.bytebank.banco.test;

/**
 * Classe para testar Arrays de tipos promitivos
 * @author Matheus Tavares
 *
 */
public class TesteArraysPrimitivos {
	
	//Arrays []
	public static void main(String[] args)  {
		try {
			double[] idades = new double [5];
			idades[0] = 29;
			idades[1] = 27;
			idades[2] = 17;
			idades[3] = 20;
			idades[4] = 19;
			
			for(int c = 0; c < idades.length; c++) {				
				System.out.println(idades[c]);
			}		
			System.out.println();
			
			System.out.println(idades.length);
			System.out.println(idades);
	
		} catch (ArrayIndexOutOfBoundsException e) {			
			System.out.println("Ocorreu uma exceção " + e);
			
		}
		
	}
}
