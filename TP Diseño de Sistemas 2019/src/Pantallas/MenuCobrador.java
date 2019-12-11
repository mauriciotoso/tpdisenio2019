package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
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
		gestionPoliza.setBounds(286, 50, 211, 410);
		productorSeguro.add(gestionPoliza);
		
		JLabel lblGestion2 = new JLabel("Gesti\u00F3n de");
		lblGestion2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGestion2.setBounds(35, 11, 141, 60);
		gestionPoliza.add(lblGestion2);
		
		JLabel lblPoliza = new JLabel("pago");
		lblPoliza.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPoliza.setBounds(67, 57, 76, 46);
		gestionPoliza.add(lblPoliza);
		
		JButton btnConsultar2 = new JButton("Registrar Pago");
		btnConsultar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscarPoliza buscarPoliza = new BuscarPoliza();
				buscarPoliza.setVisible(true);
				dispose();
			}
		});
		btnConsultar2.setBackground(Color.WHITE);
		btnConsultar2.setBounds(25, 190, 160, 60);
		gestionPoliza.add(btnConsultar2);
		
		JButton btnCerrarPS = new JButton("Cerrar Sesion");
		btnCerrarPS.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCerrarPS.setBackground(Color.WHITE);
		btnCerrarPS.setBounds(22, 526, 106, 23);
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
