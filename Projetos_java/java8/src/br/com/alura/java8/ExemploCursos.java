package br.com.alura.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

	@Override
	public String toString() {
		return this.nome;
	}
}

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		// ORDERNAÇÕES E FILTROS
		// cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		// cursos.sort(Comparator.comparing(Curso::getAlunos));
		// cursos.sort(Comparator.comparingInt(Curso::getAlunos));

		// EXIBIÇÃO DOS RESULTADOS
		// cursos.forEach(c -> System.out.println(c.getNome()));
		// cursos.forEach(System.out::println);

		// FILTROS
		// cursos.stream().filter(c -> c.getAlunos() >=
		// 100).forEach(System.out::println);
//		cursos.stream()
//		.filter(c -> c.getAlunos() >= 100)
//		.map(Curso::getAlunos)
//		.forEach(System.out::println);

//		OptionalDouble sum = cursos.stream().filter(c -> c.getAlunos() > 50).mapToInt(Curso::getAlunos).average();
//		System.out.println(sum);
//
//		Stream<String> nomes = cursos.stream().map(Curso::getNome);
//		System.out.println(nomes);

//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.findAny().ifPresent(c -> System.out.println(c.getNome()));
		
//		cursos = cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.collect(Collectors.toList());
		cursos.parallelStream()
				.filter(c -> c.getAlunos() >= 100)
				.collect(Collectors.toMap(
						c -> c.getNome(),
						c -> c.getAlunos()))
				.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		
	}
}