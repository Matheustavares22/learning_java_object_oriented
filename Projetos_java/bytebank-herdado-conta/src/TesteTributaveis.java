
public class TesteTributaveis {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto cdi = new CalculadorDeImposto();
		cdi.registra(cc);
		cdi.registra(sv);
		
		System.out.println(cc.getValorImposto());
		System.out.println(sv.getValorImposto());
	}
}
