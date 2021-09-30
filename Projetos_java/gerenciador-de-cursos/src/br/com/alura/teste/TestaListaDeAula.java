package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.modelo.Aula;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		
		Aula a1 = new Aula("Revisitando as ArraysList", 21);
		Aula a2 = new Aula("Lista de objetos", 15);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 14);
		Aula a4 = new Aula("Zabbix e seus conceitos", 32);		
		Aula a5 = new Aula("Atuando com codigo limpo", 10);
		
		ArrayList<Aula> aulas = new ArrayList<>();
		aulas.add(a1);
		aulas.add(a2);
		aulas.add(a3);
		aulas.add(a4);
		aulas.add(a5);
		
		//Collections.sort(aulas);
		Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
		aulas.forEach(aula -> System.out.println(aula));
		
	}
}
