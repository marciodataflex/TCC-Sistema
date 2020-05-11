package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JIFCadProfissional extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFCadProfissional frame = new JIFCadProfissional();
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
	public JIFCadProfissional() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(400, 100, 617, 300);
		getContentPane().setLayout(null);
		int lDesk = getWidth();
		int aDesk = getHeight();
		int lIFrame = getWidth();
		int aIFrame = getHeight();

		//setLocation( lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2 );
		
		
		textField = new JTextField();
		textField.setBounds(25, 51, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(127, 51, 279, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(420, 51, 160, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(25, 114, 278, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(26, 34, 46, 14);
		getContentPane().add(lblCdigo);
		
		JLabel lblNomeDoProfiossinal = new JLabel("Nome do Profiossinal");
		lblNomeDoProfiossinal.setBounds(127, 34, 279, 14);
		getContentPane().add(lblNomeDoProfiossinal);
		
		JLabel lblCpf = new JLabel("C.P.F.");
		lblCpf.setBounds(420, 34, 46, 14);
		getContentPane().add(lblCpf);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(26, 94, 277, 14);
		getContentPane().add(lblEndereo);
		
		textField_4 = new JTextField();
		textField_4.setBounds(313, 114, 86, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(313, 94, 86, 14);
		getContentPane().add(lblNmero);
		
		textField_5 = new JTextField();
		textField_5.setBounds(409, 114, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(409, 94, 77, 14);
		getContentPane().add(lblBairro);
		
		textField_6 = new JTextField();
		textField_6.setBounds(505, 114, 77, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(506, 94, 46, 14);
		getContentPane().add(lblCep);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(491, 236, 89, 23);
		getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(386, 236, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(282, 236, 89, 23);
		getContentPane().add(btnExcluir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(181, 236, 89, 23);
		getContentPane().add(btnPesquisar);

	}
}
