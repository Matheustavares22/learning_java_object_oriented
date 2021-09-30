
public class TestaContaComMinhaException {

		public static void main(String[] args) {
				
			Conta c = new Conta();
			try {
				c.deposita();
			} catch (MinhaException2 ex) {
				System.out.println("Tratamento");
			}
		}
}
