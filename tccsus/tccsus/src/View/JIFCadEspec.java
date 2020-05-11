package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class JIFCadEspec extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFCadEspec frame = new JIFCadEspec();
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
	public JIFCadEspec() {
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setTitle("Cadastro de Especialidade");
		setBounds(450, 100, 450, 300);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(23, 42, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(119, 42, 290, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("C\u00F3digo");
		lblNewLabel.setBounds(23, 24, 46, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblDescrioDaEspecialidade = new JLabel("Descri\u00E7\u00E3o da Especialidade");
		lblDescrioDaEspecialidade.setBounds(123, 24, 286, 14);
		getContentPane().add(lblDescrioDaEspecialidade);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(335, 220, 89, 23);
		getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(236, 220, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(137, 220, 89, 23);
		getContentPane().add(btnPesquisar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(38, 220, 89, 23);
		getContentPane().add(btnExcluir);

	}
}
