package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteOrdenacao {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Ana");
		Cliente cliente2 = new Cliente("Clara");
		Cliente cliente3 = new Cliente("Luffy");
		Cliente cliente4 = new Cliente("Zoro");
		
        Conta cc1 = new ContaCorrente(22, 33, cliente4);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44, cliente2);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11, cliente3);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22, cliente1);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        System.out.println("----");
        //lista.sort(new NumeroContaComparator());  
//        Collections.sort(lista, new NumeroContaComparator());// Ordena��o legado
//        Collections.reverse(lista);// Ordena��o legado
        Collections.sort(lista);//usa a ordem narutal, esta se baseia no m�todo compare dentro da classe m�e, no caso CONTA        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        System.out.println("");      
        
// --------------------------------------------------------------------------------------------------

        System.out.println("----");             
        //lista.sort(new TitularContaComparator());
        //Collections.sort(lista, new TitularContaComparator());// Ordena��o legado
        //Collections.reverse(lista);// Ordena��o legado
        
        for (Conta conta : lista) {
			System.out.println(conta);
		}
        
        System.out.println("");
        
        
        int[] numeros = new int[]{43, 15, 64, 22, 89};

        Arrays.sort(numeros); //m�todo utilit�rio sort

        System.out.println(Arrays.toString(numeros)); //m�todo utilit�rio toString

        //Saida : [15, 22, 43, 64, 89]
	}

}
class TitularContaComparator implements Comparator<Conta> {
	
	@Override
	public int compare(Conta c1, Conta c2) {
		return c1.getTitular().getNome().compareTo(c2.getTitular().getNome());
	}
}

class NumeroContaComparator implements Comparator<Conta> {
	
	@Override
	public int compare(Conta c1, Conta c2) {
		return Integer.compare(c1.getNumero(), c2.getNumero());
	}	
}