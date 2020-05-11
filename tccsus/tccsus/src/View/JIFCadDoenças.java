package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JIFCadDoenças extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFCadDoenças frame = new JIFCadDoenças();
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
	public JIFCadDoenças() {
		setTitle("Cadastro de Doen\u00E7as - CID");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(500, 100, 450, 300);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(27, 49, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(123, 49, 288, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(28, 32, 85, 14);
		getContentPane().add(lblCdigo);
		
		JLabel lblDescrioDaDoena = new JLabel("Descri\u00E7\u00E3o da Doen\u00E7a");
		lblDescrioDaDoena.setBounds(121, 32, 290, 14);
		getContentPane().add(lblDescrioDaDoena);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(335, 225, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.setBounds(236, 225, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setBounds(132, 225, 89, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pesquisar");
		btnNewButton_3.setBounds(27, 225, 89, 23);
		getContentPane().add(btnNewButton_3);

	}

}
