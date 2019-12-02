package Pantallas;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import App.Usuario;
import BDD.FachadaBDD;
import Logica.FachadaSesion;

public class InicioSesion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
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
	public InicioSesion() {
		
		FachadaBDD.getInstance();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel inicioSesion = new JPanel();
		inicioSesion.setBounds(0, 0, 784, 561);
		inicioSesion.setLayout(null);
		contentPane.add(inicioSesion);
				
		JSplitPane splitInicioSesion = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, (Component) null, (Component) null);
		splitInicioSesion.setDividerSize(0);
		splitInicioSesion.setBounds(0, 0, 784, 561);
		inicioSesion.add(splitInicioSesion);
				
		JPanel panelIzqIS = new JPanel();
		panelIzqIS.setLayout(null);
		panelIzqIS.setBackground(Color.GRAY);
		splitInicioSesion.setLeftComponent(panelIzqIS);
				
		JPanel recuadroSesion = new JPanel();
		recuadroSesion.setLayout(null);
		recuadroSesion.setBorder(null);
		recuadroSesion.setBounds(25, 200, 400, 150);
		panelIzqIS.add(recuadroSesion);
		
		JLabel lblInicioSesion = new JLabel("Inicio de Sesi\u00F3n");
		lblInicioSesion.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblInicioSesion.setBounds(110, 10, 180, 20);
		recuadroSesion.add(lblInicioSesion);
				
		JLabel lblNombreUsuario = new JLabel("Nombre de usuario:");
		lblNombreUsuario.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNombreUsuario.setBounds(30, 55, 130, 14);
				recuadroSesion.add(lblNombreUsuario);
				
		JLabel lblContrasenia = new JLabel("Contrase\u00F1a:");
		lblContrasenia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContrasenia.setBounds(81, 84, 80, 14);
		recuadroSesion.add(lblContrasenia);
				
		JTextField tfNombreUsuario = new JTextField();
		tfNombreUsuario.setColumns(10);
		tfNombreUsuario.setBounds(170, 53, 160, 20);
		recuadroSesion.add(tfNombreUsuario);
				
		JTextField tfContrasenia = new JPasswordField();
		tfContrasenia.setBounds(170, 83, 160, 20);
		recuadroSesion.add(tfContrasenia);
				
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAceptar.setBackground(Color.WHITE);
		btnAceptar.setBounds(300, 114, 90, 25);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = tfNombreUsuario.getText();
				String pw = tfContrasenia.getText();
				boolean correctoUser=false; 
				boolean correctoPw=false;
				int contNum=0,contCaract=0,contMayus=0,contMin=0;
				int i=0;
				if (!user.isEmpty() && !pw.isEmpty()) {
					if (user.length()>=8 && user.length()<=30) {
						correctoUser=true;
						while(correctoUser && i<user.length()) {
							if (user.charAt(i)==' ')//>='32' && userA[i]<='47') && (userA[i]>='58' && userA[i]<='64') && (userA[i]>='91' && userA[i]<='96'))
								correctoUser=false;
							i++;
						}
					} 
					if (pw.length()>=8 && pw.length()<=15) {						
						correctoPw=true;
						/*while(correctoUser && i<user.length()) {
						if (user.charAt(i)!=' ') {
								if (user.charAt(i)>='65' && user.charAt(i)<='90')
									contMayus++;
								else if (user.charAt(i)>='97' && user.charAt(i)<='122')
									contMin++;
								else if (user.charAt(i)>='48' && user.charAt(i)<='57')
									contNum++;
								else if ((user.charAt(i)>='32' && user.charAt(i)<='47') || (user.charAt(i)>='58' && user.charAt(i)<='64') || (user.charAt(i)>=91 && user.charAt(i)<='96'))
									contCaract++;
								//>='32' && userA[i]<='47') && (userA[i]>='58' && userA[i]<='64') && (userA[i]>='91' && userA[i]<='96'))
							} else 
								correctoUser=false;	
							i++;
						}*/
						if (contMayus>0 && contMin>0 && contNum>0 && contCaract>0)
							correctoUser=true;
					}
					if (correctoUser && correctoPw) {
						Usuario usuario = FachadaSesion.getInstance().verifUserPw(user,pw);
						if (usuario!=null) {
							if (usuario.getTipo().compareTo("Productor de Seguro")==0) {
								MenuProductorSeguro productorSeguroMenu = new MenuProductorSeguro();
								productorSeguroMenu.setVisible(true);
								dispose();
							} else if (usuario.getTipo().compareTo("Cobrador")==0) {
								MenuCobrador menuCobrador = new MenuCobrador();
								menuCobrador.setVisible(true);
								dispose();
							} else if (usuario.getTipo().compareTo("Gerente")==0) {
								MenuGerente menuGerente = new MenuGerente();
								menuGerente.setVisible(true);
								dispose();
							} else 
								JOptionPane.showMessageDialog(null, "Error lectura de derechos.", "Error", JOptionPane.ERROR_MESSAGE);
						}
					} else {
						tfNombreUsuario.setText(null);
						tfContrasenia.setText(null);
						JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos, vuelva a intentarlo.", "Error", JOptionPane.ERROR_MESSAGE);
					}
				} else 
					JOptionPane.showMessageDialog(null, "Por favor, complete los campos.", "Error", JOptionPane.ERROR_MESSAGE);
			}
		});
		recuadroSesion.add(btnAceptar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setBounds(10, 526, 90, 25);
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int input = JOptionPane.showConfirmDialog(null, "Desea abandonar la aplicación?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0)
					System.exit(0);
			}
					
		});
		panelIzqIS.add(btnSalir);
				
		JPanel panelDerIS = new JPanel();
		panelDerIS.setLayout(null);
		panelDerIS.setBackground(Color.DARK_GRAY);
		splitInicioSesion.setRightComponent(panelDerIS);
				
		JLabel lblAsegurado = new JLabel("El Asegurado");
		lblAsegurado.setForeground(Color.WHITE);
		lblAsegurado.setFont(new Font("Tahoma", Font.PLAIN, 50));
		lblAsegurado.setBackground(Color.WHITE);
		lblAsegurado.setBounds(21, 67, 290, 60);
		panelDerIS.add(lblAsegurado);
				
		JLabel lblLogo = new JLabel("New label");
		lblLogo.setIcon(null);
		lblLogo.setBounds(21, 124, 307, 370);
		panelDerIS.add(lblLogo);
		splitInicioSesion.setDividerLocation(450);	
	}

}
