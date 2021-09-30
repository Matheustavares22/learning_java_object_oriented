
public class ContaPoupanca extends Conta implements Tributavel {

	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getValorImposto(double valorImposto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deposita(double valor) {
		// TODO Auto-generated method stub
		return false;
	}

}
