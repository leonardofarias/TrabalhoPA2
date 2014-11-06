import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCExemplo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conexao = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/Databases");
		System.out.println("Conectado");
		conexao.close();

	}

}
