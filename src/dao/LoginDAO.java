package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.Login;
import util.ConnectionFactory;

public class LoginDAO {

	List<Login> list;
	Login login;
	PreparedStatement ps;
	ResultSet rs;
	Connection con;

	public LoginDAO() {
		login = new Login();
		con = new ConnectionFactory().getConnection();
	}

	public Login Logar(String usuario) {

		try {

			ps = con.prepareStatement("SELECT * FROM LOGIN where usuario = ?");
			ps.setString(1, usuario);
			rs = ps.executeQuery();
			
			if (rs.next()) {
				login.setUsuario(rs.getString(1));
				login.setSenha(rs.getString(2));
			} else {
				login.setSenha("");
				return login;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return login;

	}

}
