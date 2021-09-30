package br.com.alura.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteCopiaCriaArquivo {

	public static void main(String[] args) throws IOException {
		// Padr�o Decorator
		// Fluxo de leitura de arquivo
		//Socket s = new Socket();
		
		InputStream fis = new FileInputStream("lorem.txt"); // s.getInputStream(); //System.in; 
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        
        OutputStream fos = new FileOutputStream("lorem2.txt"); // s.getOutputStream(); //System.out;
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

		
		String linha = br.readLine();
		while(linha != null && !linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush();
			linha = br.readLine();
		}
		
		bw.close();
		br.close();

	}

}
