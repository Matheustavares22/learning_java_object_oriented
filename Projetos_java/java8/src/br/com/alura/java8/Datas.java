package br.com.alura.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {

		LocalDate dt1 = LocalDate.now();
		LocalDate dt2 = LocalDate.of(2021, Month.JUNE, 15);
		dt2 = dt2.plusDays(10);

		Period periodo = Period.between(dt1, dt2);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("hh:mm:ss");
		DateTimeFormatter formatadorDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		String dtbr1 = dt1.format(formatador);
		String dtbr2 = dt2.format(formatador);
		System.out.println(dtbr1);
		System.out.println(dtbr2);
		String msg = String.format("Numero de dias entre %s e %s é de ", dtbr1, dtbr2);
		System.out.println(msg + periodo.getDays() + " dias");

		System.out.println("---------------------------------------------------------");
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora.format(formatadorDataHora));
		LocalDate dt3 = agora.toLocalDate();
		
		
	}

}
