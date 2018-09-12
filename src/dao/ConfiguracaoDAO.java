package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Configuracao;
import util.ConnectionFactory;

public class ConfiguracaoDAO {

	PreparedStatement ps;
	ResultSet rs;
	Connection con;
	Configuracao conf;

	public ConfiguracaoDAO() {
		conf = new Configuracao();
		con = new ConnectionFactory().getConnection();
	}

	public boolean inserirBruto(Configuracao conf) {

		try {
			ps = con.prepareStatement("UPDATE configuracao SET bruto = ? where usuario = ?");
			ps.setDouble(1, conf.getBruto());
			ps.setString(2, conf.getUsuario());
			ps.executeUpdate();
			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public double consultarBruto(String usuario) {
		try {
			ps = con.prepareStatement("SELECT * FROM CONFIGURACAO where usuario = ?");
			ps.setString(1, usuario);
			rs = ps.executeQuery();

			if (rs.next()) {
				return rs.getDouble("bruto");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

}
