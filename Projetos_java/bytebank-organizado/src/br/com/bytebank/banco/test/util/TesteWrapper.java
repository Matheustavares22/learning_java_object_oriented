package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapper {
	
	public static void main(String[] args) {

		int idade = 21;		
		Integer idadeRef = new Integer(21); // autoboxing 
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue();// untoboxing
		//String s = args[0];//"10"
		//Integer numero = Integer.valueOf(s);
		//int numero = Integer.parseInt(s);
		//System.out.println(numero);//Autoboxing
		
		List<Integer> numeros = new ArrayList<>();
		numeros.add(21);//AutoBoxing
		// Graças a isso é possivel indicar um tipo primitivo para uma lista
		// que em tese só poderia receber referencias
		// recebe um tipo primitivo que é convertido para alguma referencia
		// no caso de receber um int é transformado em um integer
		// PARA CADA TIPO PRIMITIVO NO JAVA
		// EXISTE UM CLASSE PARA TRANSFORMALA EM OBJETO
		// WRAPPER(Integer, Double, Float...)
		//System.out.println(numeros.get(0));
		Integer ref = Integer.valueOf("3");
        ref++;
        System.out.println(ref);
	}
}
