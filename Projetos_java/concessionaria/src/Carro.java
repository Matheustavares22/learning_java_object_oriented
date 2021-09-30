
public class Carro {

	private int ano;
	private String modelo;
	private double preco;
	
	public Carro (int ano, String modelo, double preco){
		if (ano >= 1891) {
			this.ano = ano;
		} else {
            System.out.println("O ano informado está inválido. Por isso usaremos 2017!");
            this.ano = 2017;
		}
		if (modelo == null) {
            System.out.println("O modelo não foi informado. Por isso usaremos Gol!");
            this.modelo = "Gol";
		} else {
			this.modelo = modelo;
		}
		if (preco > 0) {
			this.preco = preco;
		} else {
			System.out.println("Preço invalido, por isso sera 20 mil");
			this.preco = 20000;
		}
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
