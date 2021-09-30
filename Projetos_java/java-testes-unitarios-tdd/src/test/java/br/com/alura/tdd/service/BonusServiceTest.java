 package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	private BonusService service;
	private BigDecimal bonus;

	@Test
	void bunosDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		service = new BonusService();
		assertThrows(IllegalArgumentException.class,
				() -> service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal(25000))));
//		try {
//			service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal(25000)));
//			fail("Não deu a excption que deveria ter acontecido neste caso");
//		} catch (IllegalArgumentException ex) {		
//			assertEquals("Funcionario com salario maior do que R$10000 não pode receber bonus", ex.getMessage());
//		}
	}
	
	@Test
	void bunosDeveriaSerDezPorcentoDoSalario() {
		service = new BonusService();
		bonus = service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal(2500)));
		
		assertEquals(new BigDecimal("250.00"), bonus);
	}
	
	@Test
	void bunosDeveriaSerDezPorcentoParaFuncionarioComSalarioIgualAMil() {
		service = new BonusService();
		bonus = service.calcularBonus(new Funcionario("Matheus", LocalDate.now(), new BigDecimal(10000)));
		
		assertEquals(new BigDecimal("1000.00"), bonus);
	}
}
