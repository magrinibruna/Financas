package control;

import dao.ConfiguracaoDAO;
import model.Configuracao;
import view.Home;
import view.Mais;

public class ConfiguracaoControl {

	ConfiguracaoDAO dao = new ConfiguracaoDAO();
	Configuracao conf = new Configuracao();
	String usuario;
	ConfiguracaoDAO cdao = new ConfiguracaoDAO();

	public void padrao(String usuario, Home home) {
		home.usuario = usuario;
		home.txtBruto.setText(String.valueOf(cdao.consultarBruto(usuario)));
		home.setVisible(true);
	}
	
	public void padrao(String usuario, Mais mais) {
		mais.usuario = usuario;
		mais.txtBrutoAtual.setText(String.valueOf(cdao.consultarBruto(usuario)));
		mais.setVisible(true);
	}

	public boolean inserirBruto(Configuracao conf) {
		if (dao.inserirBruto(conf)) {
			return true;
		}

		return false;
	}

	public double consultarBruto(String usuario) {
		return dao.consultarBruto(usuario);
	}

}
