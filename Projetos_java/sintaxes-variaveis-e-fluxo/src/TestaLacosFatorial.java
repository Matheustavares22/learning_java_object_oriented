
public class TestaLacosFatorial {
	
	public static void main(String[] args) {
		///5x4 = 20 x 3 = 60 x 2 = 120 x 1 = 120
		int numero = 6;
		long resultado = 1;
		for(int n = 1; n <= numero; n++) {
			resultado += (resultado * (numero - n));		
			System.out.println(resultado);
		}
		System.out.println(resultado);
        int fatorial = 1;
        for (int i = 1; i < 11; i++) {
            fatorial *= i;
            System.out.println("Fatorial de " + i + " = " +fatorial);
        }
	} 
}
