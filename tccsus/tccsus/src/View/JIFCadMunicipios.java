package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JIFCadMunicipios extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFCadMunicipios frame = new JIFCadMunicipios();
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
	public JIFCadMunicipios() {
		setIconifiable(true);
		setMaximizable(true);
		setClosable(true);
		setTitle("Cadastro do Munic\u00EDpio");
		setBounds(450, 100, 489, 300);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(26, 35, 59, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 35, 309, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(411, 35, 46, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBounds(26, 21, 86, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Descri\u00E7\u00E3o Munic\u00EDpio");
		lblNewLabel_1.setBounds(95, 21, 149, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("UF");
		lblNewLabel_2.setBounds(413, 16, 46, 14);
		getContentPane().add(lblNewLabel_2);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(368, 221, 89, 23);
		getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(269, 221, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(170, 221, 89, 23);
		getContentPane().add(btnExcluir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(71, 221, 89, 23);
		getContentPane().add(btnPesquisar);
		
		textField_3 = new JTextField();
		textField_3.setBounds(26, 81, 59, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDdd = new JLabel("DDD");
		lblDdd.setBounds(26, 66, 46, 14);
		getContentPane().add(lblDdd);
		
		textField_4 = new JTextField();
		textField_4.setBounds(95, 81, 116, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCdigoIbge = new JLabel("C\u00F3digo IBGE");
		lblCdigoIbge.setBounds(95, 66, 116, 14);
		getContentPane().add(lblCdigoIbge);

	}
}
