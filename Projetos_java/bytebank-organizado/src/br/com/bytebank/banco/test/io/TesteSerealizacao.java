package br.com.bytebank.banco.test.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerealizacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cliente cliente = new Cliente("Matheus");
		cliente.setCpf("46509312311");
		cliente.setProfissao("Programador");
		
		Conta cc1 = new ContaCorrente(123, 321, cliente);
		cc1.deposita(100);
		System.out.println(cc1); 
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc1);
		oos.close();
		System.out.println();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		Conta cc1v2 = (Conta) ois.readObject();
		System.out.println(cc1v2);
		ois.close();
	}

}
