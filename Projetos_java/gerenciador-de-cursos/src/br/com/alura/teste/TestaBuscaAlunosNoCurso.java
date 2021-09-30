package br.com.alura.teste;

import br.com.alura.modelo.Aluno;
import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaBuscaAlunosNoCurso {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do java", "Matheus Tavares");

		javaColecoes.adiciona(new Aula("Trabalhando com Array list", 45));
		javaColecoes.adiciona(new Aula("Java IO", 25));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

		Aluno a1 = new Aluno("Matheus", 021);
		Aluno a2 = new Aluno("Kamila", 023);
		Aluno a3 = new Aluno("Hayasaka", 023);		

		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		
		
		System.out.println(a3);
		System.out.println("Quem é o aluno com matricula 023?");
		Aluno a4 = javaColecoes.buscaMatricula(023);
		System.out.println(a4);
	}

}
