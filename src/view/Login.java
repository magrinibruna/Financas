package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.LoginControl;
import dao.LoginDAO;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private LoginControl control = new LoginControl();
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 292, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtUsuario.setBounds(62, 83, 145, 30);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);

		txtSenha = new JPasswordField();
		txtSenha.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtSenha.setBounds(62, 156, 145, 30);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (control.Logar(txtUsuario.getText(), String.valueOf(txtSenha.getPassword()))) {
					
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Usuario ou senha incorretos");
				}
			}
		});
		btnEntrar.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		btnEntrar.setBounds(62, 197, 145, 30);
		contentPane.add(btnEntrar);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblUsuario.setBounds(62, 48, 78, 38);
		contentPane.add(lblUsuario);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblSenha.setBounds(62, 127, 86, 28);
		contentPane.add(lblSenha);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 22));
		lblLogin.setBounds(111, 11, 60, 38);
		contentPane.add(lblLogin);
	}
}
