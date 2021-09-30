
public class TesteConexao {
    public static void main(String[] args) {

    	String a = "strawberries";
    	System.out.println(a.substring(2,5));
//    	// simplificando o exemplo de conexão
    	try (Conexao conexao = new  Conexao()) {
    		conexao.leDados();
    	} catch (IllegalStateException ex){
    		System.out.println("Deu erro na coneão");
    	}

    	//    	Conexao con = null;
//    	try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException e) {
//			System.out.println("Deu erro na coneão");
//		} finally {
//			if(con != null) { 
//				con.close();
//			}
//		}
    }
};