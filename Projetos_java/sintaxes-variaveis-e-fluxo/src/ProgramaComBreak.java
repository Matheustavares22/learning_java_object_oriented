
public class ProgramaComBreak {
    public static void main(String args[]) {
       /* for(int linha = 0; linha < 5; linha++) {
            for (int coluna = 0; coluna < 5; coluna++) {
                if (coluna > linha) {
                    break;
                }
                System.out.print(coluna+1);
            }
            System.out.println();
        }
        */
    	//multiplos 
    	for(int numero = 0; numero <= 100; numero++) {
    		if(numero % 2 == 0) {
    			System.out.println(numero);
    		}
    	}
    }
}