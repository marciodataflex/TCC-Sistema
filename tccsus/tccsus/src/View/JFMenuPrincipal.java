package View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JFMenuPrincipal extends JFrame {

	private JPanel contentPane;
	private final JDesktopPane JDPPrincipal = new JDesktopPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFMenuPrincipal frame = new JFMenuPrincipal();
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
	public JFMenuPrincipal() {
		setFont(new Font("Dialog", Font.PLAIN, 16));
		setTitle("Sistema de Acompanhamento SUS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1382, 744);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//setExtendedState(MAXIMIZED_BOTH);
		setIcon();
		JDPPrincipal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		JDPPrincipal.setBackground(Color.LIGHT_GRAY);
		JDPPrincipal.setBounds(7, 21, 1355, 681);
		contentPane.add(JDPPrincipal);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(JFMenuPrincipal.class.getResource("/View/prefeitura1.png")));
		label.setBounds(534, 164, 307, 269);
		JDPPrincipal.add(label);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1362, 21);
		contentPane.add(menuBar);
		
		JMenu mnCadastros = new JMenu("Cadastros");
		mnCadastros.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnCadastros);
		
		JMenuItem mntmCadastroDePacientes = new JMenuItem("Cadastro de Pacientes");
		mntmCadastroDePacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JIFCadPaciente objcadpac1 = new JIFCadPaciente ();
				JDPPrincipal.add(objcadpac1);
				objcadpac1.setVisible(true);
				
			}
		});
		mnCadastros.add(mntmCadastroDePacientes);
		
		JMenuItem mntmCadastroDeMunicpios = new JMenuItem("Cadastro de Munic\u00EDpios");
		mntmCadastroDeMunicpios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JIFCadMunicipios objcadmun1 = new JIFCadMunicipios ();
				JDPPrincipal.add(objcadmun1);
				objcadmun1.setVisible(true);
			}
		});
		mnCadastros.add(mntmCadastroDeMunicpios);
		
		JMenuItem mntmCadastroUnidatendimento = new JMenuItem("Cadastro Unid.Atendimento");
		mntmCadastroUnidatendimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JIFUndAtend objundatend1 = new JIFUndAtend ();
				JDPPrincipal.add(objundatend1);
				objundatend1.setVisible(true);
			}
		});
		mnCadastros.add(mntmCadastroUnidatendimento);
		
		JMenuItem mntmCadastroDeEspecialidade = new JMenuItem("Cadastro de Especialidade");
		mntmCadastroDeEspecialidade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JIFCadEspec objcadespec1= new JIFCadEspec ();
				JDPPrincipal.add(objcadespec1);
				objcadespec1.setVisible(true);
			}
		});
		mnCadastros.add(mntmCadastroDeEspecialidade);
		
		JMenuItem mntmCadastroDeProfissional = new JMenuItem("Cadastro de Profissional");
		mntmCadastroDeProfissional.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JIFCadProfissional objcadprofissional1= new JIFCadProfissional ();
				JDPPrincipal.add(objcadprofissional1);
				objcadprofissional1.setVisible(true);
			}
		});
		mnCadastros.add(mntmCadastroDeProfissional);
		
		JMenuItem mntmCadastroDeProcedimento = new JMenuItem("Cadastro de Procedimento");
		mntmCadastroDeProcedimento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JIFCadProcedimento objcadprocedimento1= new JIFCadProcedimento ();
				JDPPrincipal.add(objcadprocedimento1);
				objcadprocedimento1.setVisible(true);
			}
		});
		mnCadastros.add(mntmCadastroDeProcedimento);
		
		JMenuItem mntmCadastroDeDoenas = new JMenuItem("Cadastro de Doen\u00E7as - CID");
		mntmCadastroDeDoenas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JIFCadDoenças objcaddoenças1= new JIFCadDoenças ();
				JDPPrincipal.add(objcaddoenças1);
				objcaddoenças1.setVisible(true);
			}
		});
		mnCadastros.add(mntmCadastroDeDoenas);
		
		JMenu mnAgendamentos = new JMenu("Agendamentos");
		mnAgendamentos.setFont(new Font("Segoe UI", Font.BOLD, 13));
		menuBar.add(mnAgendamentos);
		
		JMenuItem mntmCriarAgendamento = new JMenuItem("Criar Agendamento");
		mnAgendamentos.add(mntmCriarAgendamento);
		
		JMenuItem mntmConsultaFilaDe = new JMenuItem("Consulta Fila de Agendamentos");
		mnAgendamentos.add(mntmConsultaFilaDe);
		
		JMenuItem mntmCancelaAgendamento = new JMenuItem("Cancela Agendamento");
		mnAgendamentos.add(mntmCancelaAgendamento);
		
		
	}

	private void setIcon() {
		// TODO Auto-generated method stub
		setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("prefeiturasp2.png")));
		
	}
}
