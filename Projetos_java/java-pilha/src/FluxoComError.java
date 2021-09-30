public class FluxoComError {

    public static void main(String[] args) {
        System.out.println("Início do main");
    	try {
    		metodo1();
    	} catch(Exception ex) {
    		System.out.println("Exception " + ex.getMessage());
    		ex.printStackTrace();   		
    	}
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaException2 {
        System.out.println("Início do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaException2 {
    	System.out.println("ini metodo2");
    	//double val = 1/0; 
    	throw new MinhaException2("exeção checkada");
    	
    }
}