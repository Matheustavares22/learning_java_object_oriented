package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.CalculadorDeImposto;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(222, 333, null);
		cc.deposita(100.0);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto cdi = new CalculadorDeImposto();
		cdi.registra(cc);
		cdi.registra(sv);
		
		System.out.println(cc.getValorImposto());
		System.out.println(sv.getValorImposto());
	}
}
