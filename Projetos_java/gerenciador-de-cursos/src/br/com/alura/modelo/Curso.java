package br.com.alura.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;


public class Curso {
	
	private Set<Aluno> alunos = new HashSet<>();
	private List<Aula> aulas = new ArrayList<>();
	private String intrutor;
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	private String nome;			
	private int tempoTotal = 0;		
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
		this.tempoTotal += aula.getTempo();
	}	
	
	public Curso(String nome, String intrutor) {
		super();
		this.nome = nome;
		this.intrutor = intrutor;
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}	
		
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(this.aulas);
	}	

	public String getIntrutor() {
		return this.intrutor;
	}

	public String getNome() {
		return this.nome;
	}
	
	public int getTempoTotal() {		 
		return this.tempoTotal;
	}

	public void matricular(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}	
	
	@Override
	public String toString() {	
		return String.format("[Curso: %s|Tempo: %d min]%n%s", this.nome, this.tempoTotal, this.aulas);
	}

	public Aluno buscaMatricula(int matricula) {
		if(!matriculaParaAluno.containsKey(matricula)) {
			 throw new NoSuchElementException("Aluno não encontrado, matricula: " + matricula);
		}
		return matriculaParaAluno.get(matricula);
	}

}
