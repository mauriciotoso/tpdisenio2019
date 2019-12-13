package Pantallas;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import Pantallas.CU12.BuscarPoliza;
public class MenuCobrador extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuCobrador frame = new MenuCobrador();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuCobrador() {
		this.setTitle("El Asegurado");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InicioSesion.class.getResource("/Pantallas/protection.png")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
			
		JPanel productorSeguro = new JPanel();
		productorSeguro.setBounds(0,0,784,561);
		contentPane.add(productorSeguro);
		productorSeguro.setLayout(null);
		
		JPanel gestionPoliza = new JPanel();
		gestionPoliza.setLayout(null);
		gestionPoliza.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		gestionPoliza.setBounds(244, 50, 304, 410);
		productorSeguro.add(gestionPoliza);
		
		JLabel lblGestion2 = new JLabel("Gesti\u00F3n de pago");
		lblGestion2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGestion2.setBounds(42, 11, 238, 92);
		gestionPoliza.add(lblGestion2);
		
		JButton btnConsultar2 = new JButton("Registrar Pago");
		btnConsultar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscarPoliza buscarPoliza = new BuscarPoliza();
				buscarPoliza.setVisible(true);
				dispose();
			}
		});
		btnConsultar2.setBackground(Color.WHITE);
		btnConsultar2.setBounds(82, 211, 160, 60);
		gestionPoliza.add(btnConsultar2);
		
		JButton btnCerrarPS = new JButton("Cerrar Sesion");
		btnCerrarPS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCerrarPS.setBackground(Color.WHITE);
		btnCerrarPS.setBounds(10, 527, 106, 23);
		btnCerrarPS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Desea abandonar la aplicación?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					InicioSesion inicioSesion = new InicioSesion();
					inicioSesion.setVisible(true);
					dispose();
				}
			}
		});
		productorSeguro.add(btnCerrarPS);
	}

}
