//	private - apenas visível dentro da classe
//	protected - visível dentro da classe e também para as filhas
//	public - visível em todo lugar


//  Funcionario é abstrato pelo seguinte, pense, em uma empresa a pessoa que esta trabalhando não é apenas um funcionario, ele tem uma função!
//  Logo funcionario se torna um conceito, algo ABSTRATO, por conta disso usamos a key word "... abstract ..." para definar a classe como 
//  Abstrata 


public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
		
	//método sem corpo, sem implementação aqui
	//As classes filhas desta serão obrigadas a implementar este método 
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
