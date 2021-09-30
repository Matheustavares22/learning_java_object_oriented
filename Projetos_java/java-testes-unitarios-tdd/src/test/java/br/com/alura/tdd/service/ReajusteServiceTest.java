package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTest {

	private RajusteService service;
	private Funcionario funcionario;

	@BeforeEach
	public void inicializar() {
		System.out.println("iniciando teste");
		service = new RajusteService();
		funcionario = new Funcionario("Matheus", LocalDate.now(), new BigDecimal("1000"));
	}

	@AfterEach
	public void finalizar() {
		System.out.println("Fim do teste");
	}
	
	@BeforeAll
	public static void antesDeTodos() {
		System.out.println("inicio geral");
	}
	
	@AfterAll
	public static void DepoisDeTodos() {
		System.out.println("Fim real");
	}
	
	@Test
	public void reajusteDeveriaSerDe1PorcentoQuandoDesempenhoForAMediano() {		
		service.concederReajuste(funcionario, Desempenho.MEDIANO);
		assertEquals(new BigDecimal(1010).setScale(2), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDe3PorcentoQuandoDesempenhoForADesejar() {
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal(1030).setScale(2), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDe15PorcentoQuandoDesempenhoForBom() {
		service.concederReajuste(funcionario, Desempenho.BOM);
		assertEquals(new BigDecimal(1150).setScale(2), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDe20PorcentoQuandoDesempenhoForOtimo() {
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		assertEquals(new BigDecimal(1200).setScale(2), funcionario.getSalario());
	}

	@Test
	public void reajusteDeveriaSerDe40PorcentoQuandoDesempenhoForEspetacular() {
		service.concederReajuste(funcionario, Desempenho.ESPETACULAR);
		assertEquals(new BigDecimal(1400).setScale(2), funcionario.getSalario());
	}
}
