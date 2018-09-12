package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import control.ConfiguracaoControl;

public class Home extends JFrame {

	public  String usuario = "";
	private JPanel contentPane;
	public JTextField txtBruto;
	private JTextField txtLiquido;
	private JTextField txtAposentadoria;
	private JTextField txtReserva;
	private JTextField txtBrutoTotal;
	private JTextField txtLiquidoTotal;
	private JTextField txtAposentadoriaTotal;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Home frame = new Home();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Home() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 515);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTelaInicial = new JLabel("Detalhes");
		lblTelaInicial.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 22));
		lblTelaInicial.setBounds(311, 11, 97, 38);
		contentPane.add(lblTelaInicial);
		
		JLabel lblSaldoBruto = new JLabel("Saldo bruto");
		lblSaldoBruto.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblSaldoBruto.setBounds(44, 86, 114, 38);
		contentPane.add(lblSaldoBruto);
		
		txtBruto = new JTextField();
		txtBruto.setEnabled(false);
		txtBruto.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtBruto.setColumns(10);
		txtBruto.setBounds(26, 121, 145, 30);
		txtBruto.setText("R$ 100,00");
		contentPane.add(txtBruto);
		
		txtLiquido = new JTextField();
		txtLiquido.setEnabled(false);
		txtLiquido.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtLiquido.setColumns(10);
		txtLiquido.setBounds(195, 121, 145, 30);
		contentPane.add(txtLiquido);
		
		JLabel lblSaldoLiquido = new JLabel("Saldo liquido");
		lblSaldoLiquido.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblSaldoLiquido.setBounds(206, 86, 127, 38);
		contentPane.add(lblSaldoLiquido);
		
		txtAposentadoria = new JTextField();
		txtAposentadoria.setEnabled(false);
		txtAposentadoria.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtAposentadoria.setColumns(10);
		txtAposentadoria.setBounds(360, 121, 145, 30);
		contentPane.add(txtAposentadoria);
		
		JLabel lblAposentadoria = new JLabel("Aposentadoria");
		lblAposentadoria.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblAposentadoria.setBounds(360, 86, 145, 38);
		contentPane.add(lblAposentadoria);
		
		txtReserva = new JTextField();
		txtReserva.setEnabled(false);
		txtReserva.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtReserva.setColumns(10);
		txtReserva.setBounds(529, 121, 145, 30);
		contentPane.add(txtReserva);
		
		JLabel lblReserva = new JLabel("Reserva");
		lblReserva.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		lblReserva.setBounds(552, 86, 82, 38);
		contentPane.add(lblReserva);
		
		JButton btnMais = new JButton("Mais");
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mais mais = new Mais();
				new ConfiguracaoControl().padrao(usuario, mais);
				dispose();
			}
		});
		btnMais.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 20));
		btnMais.setBounds(543, 19, 145, 30);
		contentPane.add(btnMais);
		
		txtBrutoTotal = new JTextField();
		txtBrutoTotal.setText("R$ 100,00");
		txtBrutoTotal.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtBrutoTotal.setEnabled(false);
		txtBrutoTotal.setColumns(10);
		txtBrutoTotal.setBounds(26, 163, 145, 30);
		contentPane.add(txtBrutoTotal);
		
		txtLiquidoTotal = new JTextField();
		txtLiquidoTotal.setText("R$ 100,00");
		txtLiquidoTotal.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtLiquidoTotal.setEnabled(false);
		txtLiquidoTotal.setColumns(10);
		txtLiquidoTotal.setBounds(195, 162, 145, 30);
		contentPane.add(txtLiquidoTotal);
		
		txtAposentadoriaTotal = new JTextField();
		txtAposentadoriaTotal.setText("R$ 100,00");
		txtAposentadoriaTotal.setFont(new Font("Microsoft Tai Le", Font.PLAIN, 18));
		txtAposentadoriaTotal.setEnabled(false);
		txtAposentadoriaTotal.setColumns(10);
		txtAposentadoriaTotal.setBounds(360, 162, 145, 30);
		contentPane.add(txtAposentadoriaTotal);
	}

}
