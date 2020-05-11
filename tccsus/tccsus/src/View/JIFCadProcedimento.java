package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JIFCadProcedimento extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFCadProcedimento frame = new JIFCadProcedimento();
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
	public JIFCadProcedimento() {
		setTitle("Cadastro de Procedimentos");
		setClosable(true);
		setMaximizable(true);
		setIconifiable(true);
		setBounds(400, 100, 450, 300);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(22, 48, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 48, 294, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(23, 27, 85, 14);
		getContentPane().add(lblCdigo);
		
		JLabel lblDescrioDoProcedimento = new JLabel("Descri\u00E7\u00E3o do Procedimento");
		lblDescrioDoProcedimento.setBounds(123, 27, 289, 14);
		getContentPane().add(lblDescrioDoProcedimento);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(323, 236, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar\r\n");
		btnNewButton_1.setBounds(224, 236, 89, 23);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Excluir");
		btnNewButton_2.setBounds(125, 236, 89, 23);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Pesquisar");
		btnNewButton_3.setBounds(26, 236, 89, 23);
		getContentPane().add(btnNewButton_3);

	}
}
