
public class Administrador extends Funcionario implements Autenticavel{
	
private AutenticacaoUtil autenticadorl;
	
	public Administrador() {
		this.autenticadorl = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticadorl.setSenha(senha);
	}
	
	@Override
	public boolean auntentica(int senha) {
		return this.autenticadorl.auntentica(senha);
		
	}
	
	@Override	
	public double getBonificacao() {
		return 50;
	}
}
