package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
	
	public static void main(String[] args) {
		
		Integer idadeRef = new Integer(21); // autoboxing 
		System.out.println(idadeRef.intValue());// unboxing
		
		Double dRef = Double.valueOf(3.2);// autoboxing
		System.out.println(dRef.doubleValue());// unboxing		
		
		Boolean bRef = Boolean.TRUE;
		// Constantes sempre em letra MAIUSCULA
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Float.valueOf(29.99F);
		List<Number> lista = new ArrayList<>();
		lista.add(10);
		lista.add(10.1);
		lista.add(123.10F);
		
		
		
	}
}
