package control;

import dao.ConfiguracaoDAO;
import dao.LoginDAO;
import model.Login;
import view.Home;
import view.Mais;

public class LoginControl {

	LoginDAO dao = new LoginDAO();
	Login login;

	public boolean Logar(String usuario, String senha) {
		
		login = dao.Logar(usuario);
		if (login.getSenha().equals(senha)) {
			new ConfiguracaoControl().padrao(usuario, new Home());
			return true;
		}
		return false;
	}

}
