public class Principal {

    public static void main(String[] args) {
        System.out.println("MAIN BEGIN");
        m1();
        System.out.println("MAIN END");
    }

    public static void m1() {
        System.out.println("B BEGIN");
        try {
        	m2();
    	} catch(ArithmeticException | NullPointerException ex) {
    		//String msg = ex.getMessage();    		
    		//System.out.println("ArithmeticException" + ex);
    		System.out.println("Exeption " + ex.getMessage());
    		ex.printStackTrace();
    	}
        System.out.println("B END");
    }

    public static void m2() {
   		System.out.println(1 / 0);
//		Conta c = null;
//		c.deposita();
        System.out.println("A BEGIN");
        System.out.println("A END");
    }
}