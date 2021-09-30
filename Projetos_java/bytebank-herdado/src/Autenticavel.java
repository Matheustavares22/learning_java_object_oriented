// todos os métodos de uma interface devem ser abastratos

//contrato Autenticavel
	//quem assina esse contrato, precisa implementar o	
		//SETSENHA
	 	//metodo AUTENTICA

public abstract interface Autenticavel {

	public abstract void setSenha(int senha); 	
	
	public abstract boolean auntentica(int senha);
}
