package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando classe aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);
		//aulas.remove(0);
		System.out.println(aulas);
		System.out.println();

		System.out.println("---- foreach padrão");
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		System.out.println();

		System.out.println("---- AL.get(Index)");
		String primeiraAula = aulas.get(0);
		System.out.println("A primeira aula é " + primeiraAula);

		System.out.println();

		System.out.println("---- for padrão");
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: " + aulas.get(i));
		}

		System.out.println();
		System.out.println(aulas.size());

		System.out.println();
		System.out.println("---- for each método Iterable");
		aulas.forEach(aula -> System.out.println("Aula: " + aula));
		
		System.out.println();
		System.out.println("---- Ordenando com Collections");
		aulas.add("Aumentando nosso conhecimento");
		Collections.sort(aulas);		
		aulas.forEach(aula -> System.out.println(aula));


	}

}
