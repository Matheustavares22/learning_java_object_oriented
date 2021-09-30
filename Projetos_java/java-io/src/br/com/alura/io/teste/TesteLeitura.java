package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
/**
 * Classe dedicada a testar as funcionalidades do java.io
 * Padrão decorador 
 * Fluxo de entrada com arquivo
 * @author Matheus
 *
 */
public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		// Padrão Decorator
		// Fluxo de entrada com arquivo			
		InputStream fis = new FileInputStream("lorem.txt");
		
		//Charset utf8 = StandardCharsets.UTF_8;
		Reader isr = new InputStreamReader(fis, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		
		while(linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
	}

}