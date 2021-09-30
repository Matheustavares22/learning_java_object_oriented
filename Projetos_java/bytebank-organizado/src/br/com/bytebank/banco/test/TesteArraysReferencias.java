package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

/**
 * Classe para testar Arrays com referencias
 * @author Matheus Tavares
 *
 */
public class TesteArraysReferencias {
	
	//Arrays []
	public static void main(String[] args)  {
		try {
			Cliente[] clientes = new Cliente[5];
			clientes[0] = new Cliente("Matheus Tavares");
			clientes[1] = new Cliente("Kamila Tavares");
			
			Conta[] contas = new Conta[5];			
			contas[0] = new ContaCorrente(333,333, clientes[0]);
			contas[1] = new ContaPoupanca(123,321, clientes[1]);

			
			/**
			 * Imprime as contas lançadas
			 */
			for(int c = 0; c < contas.length; c++) {				
				System.out.println(contas[c]);
			}		
			
		} catch (ArrayIndexOutOfBoundsException e) {			
			System.out.println("Ocorreu uma exceção " + e);
			
		}
		
	}
}
