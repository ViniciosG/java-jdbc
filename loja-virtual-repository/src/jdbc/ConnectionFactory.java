package jdbc;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("admin123456");
		//limita o numero de conex�es a 15
		comboPooledDataSource.setMaxPoolSize(15);
		
		//faz com que o pooled funcione 
		this.dataSource = comboPooledDataSource;
	}
	
	public Connection recuperarConexao() throws SQLException { 
		//n�o precisa abrir toda vez uma conex�o com BD
		return this.dataSource.getConnection();
	}
}
