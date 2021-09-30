package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		// Padrão Decorator
		// Fluxo de leitura de arquivo		
		OutputStream fos = new FileOutputStream("lorem.txt");
		Writer osw = new OutputStreamWriter(fos);
		BufferedWriter br = new BufferedWriter(osw);
		
		br.write("ola tudo bem com vc");
		br.newLine();
		br.newLine();
		br.write("oi dnv rs");
		br.close();

	}

}
