public class Fluxo {

    public static void main(String[] args) {
        System.out.println("In�cio do main");
    	try {
    		metodo1();
    	} catch(ArithmeticException | NullPointerException | MinhaException ex) {
    		System.out.println("Exception " + ex.getMessage());
    		ex.printStackTrace();   		
    	}
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("In�cio do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("In�cio do metodo2");
        throw new MinhaException("deu bo aq");
    }
}