package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.modelo.Aula;
import br.com.alura.modelo.Curso;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do java","Matheus Tavares");
		
		javaColecoes.adiciona(new Aula("Trabalhando com Array list",45));
		javaColecoes.adiciona(new Aula("Java IO",25));
		javaColecoes.adiciona(new Aula("Modelando com coleções",21));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(javaColecoes.getAulas());
		
		List<Aula> aulasMutaveis = new ArrayList<Aula>(aulasImutaveis);
		Collections.sort(aulasMutaveis);
		aulasMutaveis.forEach(aula -> System.out.println(aula));		

		 
		
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
	}	
}
