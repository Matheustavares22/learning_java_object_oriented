package br.com.alura.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OrdenaStrings {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("ol?");
		palavras.add("mundo");
		palavras.add("arigatou");

		// Collections.sort(palavras);
		// Collections.sort(palavras, comparador);
//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length()) {
//				return -1;
//			}
//			if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});
		// palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		//palavras.sort(Comparator.comparing(s -> s.length()));
		//palavras.sort(Comparator.comparing(String::length));
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		//palavras.forEach(palavra -> System.out.println(palavras));
		palavras.forEach(System.out::println);

		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		
	}

}
