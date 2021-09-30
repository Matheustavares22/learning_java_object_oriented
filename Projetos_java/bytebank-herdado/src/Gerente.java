// Gerente herda da classe funcionario, uma extensão dela
// alem de ser uma classe concreta
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();				
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public boolean auntentica(int senha) {
		return this.autenticador.auntentica(senha);		
	}
	
    //	mesma visibilidade, mesmo retorno, mesmo nome e os mesmos parâmetros.
	public double getBonificacao() {
		System.out.println("gerente");
		return super.getSalario();		
		//super é para indicar que esse atributo 
		//vem da classe superior
	}
	
}
