package View;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.BevelBorder;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class JIFCadPaciente extends JInternalFrame {
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
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JIFCadPaciente frame = new JIFCadPaciente();
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
	public JIFCadPaciente() {
		setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		setIconifiable(true);
		getContentPane().setBackground(SystemColor.menu);
		setForeground(Color.LIGHT_GRAY);
		setClosable(true);
		setResizable(true);
		setMaximizable(true);
		setTitle("Cadastro de Pacientes");
		setBounds(350, 100, 868, 500);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 46, 144, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero Cart\u00E3o SUS");
		lblNewLabel.setBounds(20, 31, 144, 14);
		getContentPane().add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 93, 157, 21);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(20, 93, 144, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblCpf = new JLabel("C.P.F.");
		lblCpf.setBounds(174, 74, 46, 20);
		getContentPane().add(lblCpf);
		
		JLabel lblRg = new JLabel("R.G.");
		lblRg.setBounds(20, 77, 46, 14);
		getContentPane().add(lblRg);
		
		textField_3 = new JTextField();
		textField_3.setBounds(174, 46, 383, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(174, 31, 46, 14);
		getContentPane().add(lblNome);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Masculino", "Feminino"}));
		comboBox.setBounds(567, 46, 94, 20);
		getContentPane().add(comboBox);
		
		JLabel lblSexro = new JLabel("Sexo");
		lblSexro.setBounds(567, 31, 46, 14);
		getContentPane().add(lblSexro);
		
		textField_4 = new JTextField();
		textField_4.setBounds(341, 93, 103, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data Nascimento");
		lblDataNascimento.setBounds(341, 77, 103, 14);
		getContentPane().add(lblDataNascimento);
		
		textField_5 = new JTextField();
		textField_5.setBounds(454, 93, 207, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNacionalidade = new JLabel("Nacionalidade");
		lblNacionalidade.setBounds(454, 77, 210, 14);
		getContentPane().add(lblNacionalidade);
		
		textField_6 = new JTextField();
		textField_6.setBounds(301, 185, 183, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Munic\u00EDpio");
		lblNewLabel_1.setBounds(301, 171, 97, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField_7 = new JTextField();
		textField_7.setBounds(494, 185, 38, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(496, 171, 46, 14);
		getContentPane().add(lblUf);
		
		textField_8 = new JTextField();
		textField_8.setBounds(21, 140, 377, 20);
		getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblEmdereo = new JLabel("Emdere\u00E7o");
		lblEmdereo.setBounds(20, 124, 58, 14);
		getContentPane().add(lblEmdereo);
		
		textField_9 = new JTextField();
		textField_9.setBounds(408, 140, 86, 20);
		getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNmero = new JLabel("N\u00FAmero");
		lblNmero.setBounds(411, 124, 46, 14);
		getContentPane().add(lblNmero);
		
		textField_10 = new JTextField();
		textField_10.setBounds(504, 140, 157, 20);
		getContentPane().add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(504, 124, 157, 14);
		getContentPane().add(lblComplemento);
		
		textField_11 = new JTextField();
		textField_11.setBounds(20, 185, 271, 20);
		getContentPane().add(textField_11);
		textField_11.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(20, 171, 46, 14);
		getContentPane().add(lblBairro);
		
		textField_12 = new JTextField();
		textField_12.setBounds(542, 185, 119, 20);
		getContentPane().add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(542, 171, 46, 14);
		getContentPane().add(lblCep);
		
		textField_13 = new JTextField();
		textField_13.setBounds(79, 228, 141, 20);
		getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(79, 213, 144, 14);
		getContentPane().add(lblTelefone);
		
		textField_14 = new JTextField();
		textField_14.setBounds(20, 228, 46, 20);
		getContentPane().add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblDdd = new JLabel("DDD");
		lblDdd.setBounds(22, 214, 46, 14);
		getContentPane().add(lblDdd);
		
		textField_15 = new JTextField();
		textField_15.setBounds(230, 228, 101, 20);
		getContentPane().add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblCdunvnculo = new JLabel("C\u00F3d.Un.V\u00EDnculo");
		lblCdunvnculo.setBounds(235, 215, 96, 14);
		getContentPane().add(lblCdunvnculo);
		
		textField_16 = new JTextField();
		textField_16.setBounds(344, 228, 317, 20);
		getContentPane().add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNomeUndvnculo = new JLabel("Nome Und.V\u00EDnculo");
		lblNomeUndvnculo.setBounds(344, 213, 317, 14);
		getContentPane().add(lblNomeUndvnculo);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(570, 304, 89, 23);
		getContentPane().add(btnNewButton);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(470, 303, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setBounds(368, 304, 89, 23);
		getContentPane().add(btnExcluir);
		
		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.setBounds(264, 304, 89, 23);
		getContentPane().add(btnPesquisar);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(681, 15, 145, 196);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(6, 16, 133, 174);
		panel.add(label);
		label.setLabelFor(this);

	}
}
