package br.com.alura.teste;

import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do java", "Matheus Tavares");

		javaColecoes.adiciona(new Aula("Trabalhando com Array list", 45));
		javaColecoes.adiciona(new Aula("Java IO", 25));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

		Aluno a1 = new Aluno("Matheus", 021);
		Aluno a2 = new Aluno("Kamila", 022);
		Aluno a3 = new Aluno("Hayasaka", 023);
		Aluno a4 = new Aluno("Margarida", 025);

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);

		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));

		System.out.println(a4 + " esta matriculado?: " + javaColecoes.estaMatriculado(a3));
		
		Aluno a5 = new Aluno("Hayasaka", 023);
		System.out.println("O a3 é equals ao a5?");
		System.out.println(a3.equals(a5));
		System.out.println(a3.hashCode());
		System.out.println(a5.hashCode());
		System.out.println();
		System.out.println();
		System.out.println("-----------");
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		
		while(iterador.hasNext()) {	
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
	}
}

// EXTRAS
// um emptySet pode ser destinado a algo que foi cancelado, assim não podera
// mais ser alterado
// Set<String> nomes = Collections.emptySet();
// nomes.add("Paulo"); //o que acontece aqui?
// java.lang.UnsupportedOperationException

// Sincronizar um SET A ao SET B 
//Set<Aluno> alunosSincronizados = Collections.synchronizedSet(javaColecoes.getAlunos());
//System.out.println(alunosSincronizados);
//javaColecoes.matricular(a4);
//System.out.println(alunosSincronizados);
