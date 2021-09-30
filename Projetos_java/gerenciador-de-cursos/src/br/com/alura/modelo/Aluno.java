package br.com.alura.modelo;

public class Aluno implements Comparable<Aluno>{

	private String nome;
	private int matricula;

	public Aluno(String nome, int matricula) {
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.nome = nome;
		this.matricula = matricula;		
	}

	public String getNome() {
		return this.nome;
	}

	public int getMatricula() {
		return this.matricula;
	}

	@Override
	public String toString() {	
		return String.format("[%s|N. Matricula: %s]", this.nome, this.matricula);
	}
	
	// Se dois objetos são equals eles presicam ter o mesmo hashcode
	// por isso sempre é necessario criar o médoto hashcode apos o equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public int compareTo(Aluno aluno) {		
		return this.nome.compareTo(aluno.nome);
	}
}
