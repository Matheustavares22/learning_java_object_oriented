package br.com.bytebank.banco.test.util;
/**
 * Classe para testar Arrays list e Equals
 * @author Matheus
 */
import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListJavaUtil {

	public static void main(String[] args) {
		
		// Generics <>
		ArrayList<Conta> listaConta = new ArrayList<>();
		Cliente c1 = new Cliente("Matheus");
		Cliente c2 = new Cliente("Kamila");
		Conta cc1 = new ContaCorrente(23, 32, c1);
		Conta cc2 = new ContaCorrente(233, 332, c2);
		Conta cc3 = new ContaCorrente(233, 332, c2);
		
		listaConta.add(cc1);
		listaConta.add(cc2);
		
		
		for(Object o : listaConta){
			System.out.println(o);
		}
		
		boolean existe = listaConta.contains(cc2);
		System.out.println("conta cc2 existe? " + existe);
		
		System.out.println("conta cc3 existe? " + listaConta.contains(cc3));
		
		for(Conta conta : listaConta) {
			if(conta.equals(cc3)) {
				System.out.println("Já tem sim");
			}
		}
		
		System.out.println(listaConta.contains(cc3));
		
	}

}
