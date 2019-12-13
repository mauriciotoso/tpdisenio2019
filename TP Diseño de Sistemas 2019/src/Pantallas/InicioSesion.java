package Pantallas;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import App.Sesion;
import App.Usuario;
import BDD.FachadaBDD;
import Logica.FachadaSesion;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;

public class InicioSesion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private MaskFormatter maskUsuario;
	private MaskFormatter maskContrasenia;

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
		
		this.setTitle("El Asegurado");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InicioSesion.class.getResource("/Pantallas/protection.png")));
		
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
				
		JFormattedTextField tfNombreUsuario = new JFormattedTextField();
		tfNombreUsuario.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					
				}
			}
		});
		tfNombreUsuario.setColumns(10);
		tfNombreUsuario.setBounds(170, 53, 160, 20);
		recuadroSesion.add(tfNombreUsuario);
		try {
			maskUsuario = new MaskFormatter("AAAAAAAAAAAAAAAAAAAA");
		} catch (java.text.ParseException e1) {
			e1.printStackTrace();
		}
		maskUsuario.install(tfNombreUsuario);
		
		JFormattedTextField tfContrasenia = new JFormattedTextField();
		tfContrasenia.setBounds(170, 83, 160, 20);
		recuadroSesion.add(tfContrasenia);
		try {
			maskContrasenia = new MaskFormatter("******************************");
			maskContrasenia.setInvalidCharacters("'/ |`~^<>*;:()[]{}");
		} catch (java.text.ParseException e1) {
			e1.printStackTrace();
		}
		maskContrasenia.install(tfContrasenia);
				
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAceptar.setBackground(Color.WHITE);
		btnAceptar.setBounds(300, 114, 90, 25);
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String user = tfNombreUsuario.getText();
				String pw = tfContrasenia.getText();
				
				String userCorregido="";
				String pwCorregido="";
				
				for (int x=0; x < user.length(); x++) {
					  if (user.charAt(x) != ' ')
					    userCorregido += user.charAt(x);
					}
				for (int x=0; x < pw.length(); x++) {
					  if (pw.charAt(x) != ' ')
					    pwCorregido += pw.charAt(x);
					}
				
				
				if (!user.isEmpty() && !pw.isEmpty()) {
						Usuario usuario = FachadaSesion.getInstance().verifUserPw(userCorregido,pwCorregido);
						Sesion.getInstance().setUsuarioConectado(usuario);
						System.out.println(usuario);
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
						} else {
							JOptionPane.showMessageDialog(null, "Usuario y/o contrasenia incorrectos.", "Error", JOptionPane.ERROR_MESSAGE);
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblNewLabel.setIcon(new ImageIcon(InicioSesion.class.getResource("/Pantallas/logoAseguradora.jpg")));
		lblNewLabel.setDisabledIcon(null);
		lblNewLabel.setBounds(47, 149, 240, 350);
		panelDerIS.add(lblNewLabel);
		
		/*PanelImagen panel = new PanelImagen();
		panel.setBackground(Color.WHITE);
		panel.setBounds(10, 165, 313, 265);
		panelDerIS.add(panel);*/
		splitInicioSesion.setDividerLocation(450);	
		
		
	}
}
