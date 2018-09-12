package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import control.ConfiguracaoControl;
import dao.ConfiguracaoDAO;
import model.Configuracao;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Mais extends JFrame {

	public String usuario = "";
	Configuracao conf = new Configuracao();
	ConfiguracaoControl control = new ConfiguracaoControl();
	private JPanel contentPane;
	private JTextField txtBrutoNovo;
	private JTextField txtLiquidoNovo;
	private JTextField txtLiquidoAtual;
	private JTextField txtAposentadoriaNovo;
	private JTextField txtAposentadoriaAtual;
	private JTextField txtReservaNovo;
	private JTextField txtReservaAtual;
	public JTextField txtBrutoAtual;

	/**
	 * Launch the application.
	 */
	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// Mais frame = new Mais();
	// frame.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	// });
	// }

	/**
	 * Create the frame.
	 */
	public Mais() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Home home = new Home();
				new ConfiguracaoControl().padrao(usuario, home);
				dispose();
			}
		});
		btnVoltar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		btnVoltar.setBounds(20, 11, 145, 30);
		contentPane.add(btnVoltar);

		JLabel lblAlterarSaldoBruto = new JLabel("Saldo bruto");
		lblAlterarSaldoBruto.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblAlterarSaldoBruto.setBounds(89, 91, 123, 38);
		contentPane.add(lblAlterarSaldoBruto);

		txtBrutoAtual = new JTextField();
		txtBrutoAtual.setText("R$ 100,00");
		txtBrutoAtual.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtBrutoAtual.setEnabled(false);
		txtBrutoAtual.setColumns(10);
		txtBrutoAtual.setBounds(73, 130, 145, 30);
		contentPane.add(txtBrutoAtual);

		JLabel lblAtual = new JLabel("Atual");
		lblAtual.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		lblAtual.setBounds(20, 126, 59, 38);
		contentPane.add(lblAtual);

		txtBrutoNovo = new JTextField();
		txtBrutoNovo.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtBrutoNovo.setColumns(10);
		txtBrutoNovo.setBounds(73, 175, 145, 30);
		contentPane.add(txtBrutoNovo);

		JLabel lblNovo = new JLabel("Novo");
		lblNovo.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		lblNovo.setBounds(20, 171, 59, 38);
		contentPane.add(lblNovo);

		JButton btnBruto = new JButton("Ok");
		btnBruto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					
					conf.setUsuario(usuario);
					conf.setBruto(Double.parseDouble(txtBrutoNovo.getText()));

					if (control.inserirBruto(conf)) {
						JOptionPane.showMessageDialog(null, "Bruto alterado com sucesso");
					} else {
						JOptionPane.showMessageDialog(null, "Erro ao alterar o bruto");
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Erro");
					e.printStackTrace();
				}

			}
		});
		btnBruto.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		btnBruto.setBounds(238, 175, 59, 30);
		contentPane.add(btnBruto);

		JButton btnLiquido = new JButton("Ok");
		btnLiquido.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		btnLiquido.setBounds(540, 179, 59, 30);
		contentPane.add(btnLiquido);

		txtLiquidoNovo = new JTextField();
		txtLiquidoNovo.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtLiquidoNovo.setColumns(10);
		txtLiquidoNovo.setBounds(375, 179, 145, 30);
		contentPane.add(txtLiquidoNovo);

		JLabel label = new JLabel("Novo");
		label.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		label.setBounds(322, 175, 59, 38);
		contentPane.add(label);

		JLabel label_1 = new JLabel("Atual");
		label_1.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		label_1.setBounds(322, 130, 59, 38);
		contentPane.add(label_1);

		txtLiquidoAtual = new JTextField();
		txtLiquidoAtual.setText("R$ 100,00");
		txtLiquidoAtual.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtLiquidoAtual.setEnabled(false);
		txtLiquidoAtual.setColumns(10);
		txtLiquidoAtual.setBounds(375, 134, 145, 30);
		contentPane.add(txtLiquidoAtual);

		JLabel lblSaldoLiquido = new JLabel("Saldo liquido");
		lblSaldoLiquido.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblSaldoLiquido.setBounds(391, 95, 123, 38);
		contentPane.add(lblSaldoLiquido);

		JButton btnAposentadoria = new JButton("Ok");
		btnAposentadoria.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		btnAposentadoria.setBounds(238, 345, 59, 30);
		contentPane.add(btnAposentadoria);

		txtAposentadoriaNovo = new JTextField();
		txtAposentadoriaNovo.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtAposentadoriaNovo.setColumns(10);
		txtAposentadoriaNovo.setBounds(73, 345, 145, 30);
		contentPane.add(txtAposentadoriaNovo);

		JLabel label_3 = new JLabel("Novo");
		label_3.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		label_3.setBounds(20, 341, 59, 38);
		contentPane.add(label_3);

		JLabel label_4 = new JLabel("Atual");
		label_4.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		label_4.setBounds(20, 296, 59, 38);
		contentPane.add(label_4);

		txtAposentadoriaAtual = new JTextField();
		txtAposentadoriaAtual.setText("R$ 100,00");
		txtAposentadoriaAtual.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtAposentadoriaAtual.setEnabled(false);
		txtAposentadoriaAtual.setColumns(10);
		txtAposentadoriaAtual.setBounds(73, 300, 145, 30);
		contentPane.add(txtAposentadoriaAtual);

		JLabel lblAposentadoria = new JLabel("Aposentadoria");
		lblAposentadoria.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblAposentadoria.setBounds(73, 261, 139, 38);
		contentPane.add(lblAposentadoria);

		JButton btnReserva = new JButton("Ok");
		btnReserva.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		btnReserva.setBounds(540, 341, 59, 30);
		contentPane.add(btnReserva);

		txtReservaNovo = new JTextField();
		txtReservaNovo.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtReservaNovo.setColumns(10);
		txtReservaNovo.setBounds(375, 341, 145, 30);
		contentPane.add(txtReservaNovo);

		JLabel label_6 = new JLabel("Novo");
		label_6.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		label_6.setBounds(322, 337, 59, 38);
		contentPane.add(label_6);

		JLabel label_7 = new JLabel("Atual");
		label_7.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		label_7.setBounds(322, 292, 59, 38);
		contentPane.add(label_7);

		txtReservaAtual = new JTextField();
		txtReservaAtual.setText("R$ 100,00");
		txtReservaAtual.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtReservaAtual.setEnabled(false);
		txtReservaAtual.setColumns(10);
		txtReservaAtual.setBounds(375, 296, 145, 30);
		contentPane.add(txtReservaAtual);

		JLabel lblReserva = new JLabel("Reserva");
		lblReserva.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblReserva.setBounds(403, 257, 87, 38);
		contentPane.add(lblReserva);

		JLabel lblConfiguraesBsicas = new JLabel("Configura\u00E7\u00F5es b\u00E1sicas");
		lblConfiguraesBsicas.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblConfiguraesBsicas.setBounds(201, 11, 217, 38);
		contentPane.add(lblConfiguraesBsicas);

		JButton button_3 = new JButton("Ok");
		button_3.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		button_3.setBounds(454, 50, 145, 30);
		contentPane.add(button_3);

		JLabel label_2 = new JLabel("Pagamento");
		label_2.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		label_2.setBounds(476, 11, 123, 38);
		contentPane.add(label_2);
	}

}
