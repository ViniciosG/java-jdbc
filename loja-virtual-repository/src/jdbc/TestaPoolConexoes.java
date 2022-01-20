package jdbc;
import java.sql.SQLException;
import java.util.Iterator;

public class TestaPoolConexoes {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		//laço para executar 20 vezes a conexão 
		for (int i = 0; i < 20; i++) {
			connectionFactory.recuperarConexao();
			System.out.println("Conexão de número: " + i);
		}
		
	}
}
