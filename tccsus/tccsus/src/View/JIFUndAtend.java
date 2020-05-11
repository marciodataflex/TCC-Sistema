package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class JIFUndAtend extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFUndAtend frame = new JIFUndAtend();
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
	public JIFUndAtend() {
		setTitle("Cadastro de Unidades de Atendimento");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(300, 100, 726, 414);
		getContentPane().setLayout(null);
		
		JLabel lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(21, 28, 46, 14);
		getContentPane().add(lblCdigo);
		
		JLabel lblDescrioDaUnidade = new JLabel("Descri\u00E7\u00E3o da Unidade de Atendimento");
		lblDescrioDaUnidade.setBounds(120, 28, 412, 14);
		getContentPane().add(lblDescrioDaUnidade);
		
		textField = new JTextField();
		textField.setBounds(21, 43, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(120, 43, 568, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(21, 93, 387, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(418, 93, 86, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(514, 93, 174, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(21, 74, 387, 14);
		getContentPane().add(lblEndereo);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(418, 74, 86, 14);
		getContentPane().add(lblNmero);
		
		JLabel lblCep = new JLabel("Complemento");
		lblCep.setBounds(514, 74, 96, 14);
		getContentPane().add(lblCep);
		
		textField_5 = new JTextField();
		textField_5.setBounds(21, 146, 86, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblCep_1 = new JLabel("CEP");
		lblCep_1.setBounds(21, 131, 86, 14);
		getContentPane().add(lblCep_1);
		
		textField_6 = new JTextField();
		textField_6.setBounds(120, 146, 86, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDdd = new JLabel("DDD");
		lblDdd.setBounds(120, 131, 86, 14);
		getContentPane().add(lblDdd);
		
		textField_7 = new JTextField();
		textField_7.setBounds(216, 146, 134, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(216, 131, 134, 14);
		getContentPane().add(lblTelefone);
		
		textField_8 = new JTextField();
		textField_8.setBounds(360, 146, 66, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblCodmunicipio = new JLabel("Cod.Municipio");
		lblCodmunicipio.setBounds(360, 131, 86, 14);
		getContentPane().add(lblCodmunicipio);
		
		textField_9 = new JTextField();
		textField_9.setBounds(449, 146, 191, 20);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblMunicpo = new JLabel("Munic\u00EDpo");
		lblMunicpo.setBounds(449, 131, 191, 14);
		getContentPane().add(lblMunicpo);
		
		textField_10 = new JTextField();
		textField_10.setBounds(648, 146, 40, 20);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(648, 131, 46, 14);
		getContentPane().add(lblUf);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(551, 334, 89, 23);
		getContentPane().add(btnSalvar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(443, 334, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(337, 334, 89, 23);
		getContentPane().add(btnExcluir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(228, 334, 89, 23);
		getContentPane().add(btnPesquisar);

	}
}
