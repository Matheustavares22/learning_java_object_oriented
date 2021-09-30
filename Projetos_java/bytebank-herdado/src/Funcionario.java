//	private - apenas vis�vel dentro da classe
//	protected - vis�vel dentro da classe e tamb�m para as filhas
//	public - vis�vel em todo lugar


//  Funcionario � abstrato pelo seguinte, pense, em uma empresa a pessoa que esta trabalhando n�o � apenas um funcionario, ele tem uma fun��o!
//  Logo funcionario se torna um conceito, algo ABSTRATO, por conta disso usamos a key word "... abstract ..." para definar a classe como 
//  Abstrata 


public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
		
	//m�todo sem corpo, sem implementa��o aqui
	//As classes filhas desta ser�o obrigadas a implementar este m�todo 
	public abstract double getBonificacao(); 
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}	
}
