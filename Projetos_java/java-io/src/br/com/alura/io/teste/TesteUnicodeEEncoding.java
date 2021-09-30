package br.com.alura.io.teste;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) throws IOException {

		String s = "ç";
		System.out.println(s.codePointAt(0));//Unicode
		
		System.out.println();
		
		Charset charset = Charset.defaultCharset();
		System.out.println(charset);
		
		byte[] bytes = s.getBytes("windows-1252");
		System.out.print(bytes.length + ", windows-1252, ");
		String sNovo = new String(bytes, "windows-1252");
		System.out.println(sNovo);
						
		bytes = s.getBytes("UTF-8");		
		System.out.print(bytes.length + ", UTF-8, ");
		sNovo = new String(bytes, "UTF-8");
		System.out.println(sNovo);		
		
		bytes = s.getBytes("UTF-16");					
		System.out.print(bytes.length + ", UTF-16, ");
		sNovo = new String(bytes, "UTF-16");
		System.out.println(sNovo);	
		
		bytes = s.getBytes(StandardCharsets.US_ASCII.name());		
		System.out.print(bytes.length + ", US_ASCII, ");
		sNovo = new String(bytes, "ASCII");
		System.out.println(sNovo);		
		

	}

}
