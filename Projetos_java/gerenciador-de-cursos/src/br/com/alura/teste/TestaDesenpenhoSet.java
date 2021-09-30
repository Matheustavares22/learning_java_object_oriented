package br.com.alura.teste;

import java.util.ArrayList;
import java.util.Collection;

public class TestaDesenpenhoSet {

    public static void main(String[] args) {

        Collection<Integer> numeros = new ArrayList<Integer>();
        // apenas mudar HashSet para ArrayList ou LinkedList
        // para notar a velocidade da HashSet perto dessas outras
        
        long tempoAdicaoElementosIni = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            numeros.add(i);
        }
        long tempoAdicaoElementosFim = System.currentTimeMillis();
        long tempoDeExecucao1 = tempoAdicaoElementosFim - tempoAdicaoElementosIni;

        System.out.println("Tempo gasto adição: " + tempoDeExecucao1);
        
        
        long tempoBuscaElementosIni = System.currentTimeMillis();
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }
        long tempoBuscaElementosFim = System.currentTimeMillis();
        long tempoDeExecucao2 = tempoBuscaElementosFim - tempoBuscaElementosIni;

        System.out.println("Tempo gasto busca: " + tempoDeExecucao2);


    }

}