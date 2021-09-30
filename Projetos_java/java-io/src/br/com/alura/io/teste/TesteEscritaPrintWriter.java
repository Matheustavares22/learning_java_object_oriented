package br.com.alura.io.teste;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintWriter {

	public static void main(String[] args) throws IOException {
		// Padr�o Decorator
		// Fluxo de leitura de arquivo		
		//PrintStream ps = new PrintStream(new File("lorem.txt"));
		PrintWriter pw = new PrintWriter(new File("lorem.txt"), "UTF-8");
		pw.print("the midnight");
		pw.println();
		pw.print("ué viu, óia só, não");
		pw.println();
		pw.flush();
        pw.close();
	}

}
