
public class TestaCarro {
	
	public static void main(String[] args) {
		Carro carro = new Carro(2015, "Onix", 25000.0);
		System.out.println(carro.getModelo());
		Carro carro2 = new Carro(1756, "Fusca", 25000.0);
		Carro carro3 = new Carro(1956, null, 25000.0);
		Carro carro4 = new Carro(1956, "onix", -123);
	}
}
