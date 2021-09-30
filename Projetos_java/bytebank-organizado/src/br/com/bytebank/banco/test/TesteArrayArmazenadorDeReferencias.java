package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ArmazenaReferencias;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ArmazenaContas;

public class TesteArrayArmazenadorDeReferencias {
	
	public static void main(String[] args) {
		Cliente c1 = new Cliente("Matheus");
		Cliente c2 = new Cliente("Kamila");
		//GuardadorDeContas guardador = new GuardadorDeContas();
		Conta cc = new ContaCorrente(23, 32, c1);
		Conta cc2 = new ContaCorrente(233, 332, c2);
//		guardador.adiciona(cc);
//		guardador.adiciona(cc2);
//		System.out.println(guardador.numeroDeElementos());
//		System.out.println(guardador.getConta(1));
		
		ArmazenaReferencias ar = new ArmazenaReferencias();
		ar.adiciona(c1);
		ar.adiciona(c2);
		ar.adiciona(cc);
		ar.adiciona(cc2);
		Conta ref = (Conta) ar.getReferencia(3);//precisa de cast 
		System.out.println(ar.getReferencia(0));
		System.out.println(ar.getReferencia(1));
		System.out.println(ar.getReferencia(2));
		System.out.println(ar.getReferencia(3));
		System.out.println(ref);
	}
}
