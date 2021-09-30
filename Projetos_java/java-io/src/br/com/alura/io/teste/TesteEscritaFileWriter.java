package br.com.alura.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		// Padrão Decorator
		// Fluxo de leitura de arquivo		
		long ini = System.currentTimeMillis();
        BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
        
        bw.write("One Piece");
        bw.newLine();
        bw.newLine();
        bw.write("Jimetsu no jaiba");

        bw.close();
        
        long fim = System.currentTimeMillis();
        System.out.println("Passaram " + (fim - ini) + " milissegundos");

	}

}
