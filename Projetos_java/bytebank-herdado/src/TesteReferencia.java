
public class TesteReferencia {
	public static void main(String[] args) {
		Funcionario f1 = new Gerente();
		f1.setSalario(2000);
	    
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		
		Gerente g1 = new Gerente();			
		g1.setSalario(5000.00);
			
		
		Funcionario d1 = new Designer();
		d1.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(f1);
		controle.registra(ev);
		controle.registra(d1);
		
	}
}
