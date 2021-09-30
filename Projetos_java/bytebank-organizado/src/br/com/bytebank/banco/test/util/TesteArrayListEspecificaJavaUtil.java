package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEspecificaJavaUtil {

	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		Cliente c1 = new Cliente("Matheus");
		Cliente c2 = new Cliente("Kamila");
		Conta cc1 = new ContaCorrente(23, 32, c1);
		Conta cc2 = new ContaCorrente(233, 332, c2);

		lista.add(c1);
		lista.add(c2);
		lista.add(cc1);
		lista.add(cc2);
		lista.remove(cc2);
//		for(int i = 0; i < lista.size(); i++) {
//			System.out.println(lista.get(i) + "\n");	
//		}
		//for mais simples
		for(Object o : lista){
			System.out.println(o);
		}
		
	}

}
