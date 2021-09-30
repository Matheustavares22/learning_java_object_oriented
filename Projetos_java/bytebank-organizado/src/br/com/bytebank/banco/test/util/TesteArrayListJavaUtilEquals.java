package br.com.bytebank.banco.test.util;
/**
 * Classe para testar Arrays list especificas do java.util
 * @author Matheus
 */
import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListJavaUtilEquals {

	public static void main(String[] args) {
		
		// Generics <>
		ArrayList<Conta> listaConta = new ArrayList<>();
		Cliente c1 = new Cliente("Matheus");
		Cliente c2 = new Cliente("Kamila");
		Conta cc1 = new ContaCorrente(23, 32, c1);
		Conta cc2 = new ContaCorrente(233, 332, c2);
		
		listaConta.add(cc1);
		listaConta.add(cc2);
		
		Object oRef = listaConta.get(0);
		Conta cRef = (Conta) oRef;
		//listaConta.add(c1); ilegal pois agora só é 
							//permitido adicionar Contas
		
		//for mais simples para arrays
		for(Object o : listaConta){
			System.out.println(o);
		}
		
	}

}
