package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		System.out.println("artjemis");
		System.out.println(123);
		System.out.println(true);
		
		ContaCorrente cc = new ContaCorrente(123, 312, null);
		ContaPoupanca cp = new ContaPoupanca(213, 414, null);
		Cliente c1 = new Cliente("Matheus");
		
		System.out.println(cc);
		System.out.println(cp);
		System.out.println(c1);
		
		println(cc);
		println(cp);
		println(c1);
		
	}
	static void println() {}	
	static void println(int x) {}	
	static void println(boolean x) {}	
	static void println(String x) {}	
	static void println(Object x) {}
}
