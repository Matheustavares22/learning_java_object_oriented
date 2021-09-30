package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		alunos.add("Matheus");
		alunos.add("Hayasaka");
		alunos.add("Chitoge");
		alunos.add("Kamila");
		alunos.add("Margarida");
		alunos.add("Bia");
		alunos.add("Giovana");
		System.out.println(alunos + "\n");
		// Nota-se que a ordem não é a mesma de adição
		
		System.out.println("Quantidade de alunos: " + alunos.size() + "\n");
		
//		for (String aluno : alunos) {
//			System.out.println(aluno);
//		}
		
		alunos.forEach(aluno -> System.out.println(aluno));
		
		boolean hayasakaEstaMatriculada = alunos.contains("Hayasaka");
		System.out.println(hayasakaEstaMatriculada);
		alunos.remove("Hayasaka");
		System.out.println(alunos.contains("Hayasaka"));
		
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		System.out.println(alunosEmLista);
		
		
	}

}
