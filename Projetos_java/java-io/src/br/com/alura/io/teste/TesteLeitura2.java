package br.com.alura.io.teste;

import java.io.File;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {
		
		Charset utf8 = StandardCharsets.UTF_8;
		Scanner scanner = new Scanner(new File("contas.csv"), utf8);
		
		scanner.hasNextLine();
		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();			
//			System.out.println(linha);
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");
			
			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numeroConta = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
			System.out.format(new Locale("pt","BR"), "%s - %04d-%08d, %13s | R$%8.2f%n", 
					tipoConta, agencia, numeroConta, titular, saldo);
            
			
			linhaScanner.close(); 
//			String[] valores = linha.split(",");
//			System.out.println(valores[3]);
		}
				
		scanner.close();
	}
}
