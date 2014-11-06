import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBCInsere {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		//conectando
		Connection con = new ConnectionFactory().getConnection();
		
		//cria um preparedStatement
		String sql = "insert into cliente" + 
				"(cod_cli, nome, cidade, uf, telefone,status,limite) " +
				" values (?,?,?,?,?,?,?)";
		PreparedStatement stmt = con.prepareStatement(sql);
		
		//preenche os valores
		stmt.setString(1, "20");
		stmt.setString(2, "Mayara");
		stmt.setString(3, "Porto Alegre");
		stmt.setString(4, "RS");
		stmt.setString(5, "91511376");
		stmt.setString(6, "m�dio");
		stmt.setString(7, "1000");
		
		
		stmt.execute();
		stmt.close();
		
		con.close();
		
	}

}
