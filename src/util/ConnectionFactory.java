package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() 
	{ 
		try {
			return DriverManager.getConnection(
					//drivermanager � a classe (letra maiuscula)
					//getconnection (metodo de conex�o da classe drivermanager)
					"jdbc:sqlserver://localhost:1433;" +
					//jdb � o conector, no caso sqlserver
					//localhost � que o servidor est� na m�quina
					//1433 porta
					"databaseName=negocio;" +
					//nome do banco
					"user=usuario; password=123456;");				
					//usuario e senha
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		
	}
	
		

}
