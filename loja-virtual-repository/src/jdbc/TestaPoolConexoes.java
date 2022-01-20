package jdbc;
import java.sql.SQLException;
import java.util.Iterator;

public class TestaPoolConexoes {
	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		
		//la�o para executar 20 vezes a conex�o 
		for (int i = 0; i < 20; i++) {
			connectionFactory.recuperarConexao();
			System.out.println("Conex�o de n�mero: " + i);
		}
		
	}
}
