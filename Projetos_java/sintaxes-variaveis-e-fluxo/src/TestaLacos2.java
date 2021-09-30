
public class TestaLacos2 {

	public static void main(String[] args) {
		
		for(int linha = 0; linha < 10; linha++) {
			
			for(int coluna = 0; coluna <= linha; coluna++) {
				System.out.print("M");
			}
			System.out.println("  ");
		}
		for(int linha = 0; linha < 10; linha++) {
			
			for(int coluna = 10; linha <= coluna && linha != coluna; coluna--) {
				System.out.print("+");
			}
			System.out.println("  ");
		}
	}
}
