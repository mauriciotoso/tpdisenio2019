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

public class MenuProductorSeguro extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuProductorSeguro frame = new MenuProductorSeguro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuProductorSeguro() {
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
		
		JPanel gestionCliente = new JPanel();
		gestionCliente.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		gestionCliente.setBounds(50, 50, 211, 410);
		productorSeguro.add(gestionCliente);
		gestionCliente.setLayout(null);
		
		JLabel lblGestion1 = new JLabel("Gesti\u00F3n de");
		lblGestion1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGestion1.setBounds(35, 11, 141, 60);
		gestionCliente.add(lblGestion1);
		
		JLabel lblCliente = new JLabel("cliente");
		lblCliente.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCliente.setBounds(58, 57, 94, 46);
		gestionCliente.add(lblCliente);
		
		JButton btnAgregar1 = new JButton("Agregar");
		btnAgregar1.setBackground(Color.WHITE);
		btnAgregar1.setBounds(25, 150, 160, 60);
		gestionCliente.add(btnAgregar1);
		
		JButton btnConsultar1 = new JButton("Consultar");
		btnConsultar1.setBackground(Color.WHITE);
		btnConsultar1.setBounds(25, 220, 160, 60);
		gestionCliente.add(btnConsultar1);
		
		JPanel gestionPoliza = new JPanel();
		gestionPoliza.setLayout(null);
		gestionPoliza.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		gestionPoliza.setBounds(286, 50, 211, 410);
		productorSeguro.add(gestionPoliza);
		
		JLabel lblGestion2 = new JLabel("Gesti\u00F3n de");
		lblGestion2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGestion2.setBounds(35, 11, 141, 60);
		gestionPoliza.add(lblGestion2);
		
		JLabel lblPoliza = new JLabel("p\u00F3liza");
		lblPoliza.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPoliza.setBounds(67, 57, 76, 46);
		gestionPoliza.add(lblPoliza);
		
		JButton btnAgregar2 = new JButton("Agregar");
		btnAgregar2.setBackground(Color.WHITE);
		btnAgregar2.setBounds(25, 120, 160, 60);
		btnAgregar2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscarCliente buscarCliente = new BuscarCliente();
				buscarCliente.setVisible(true);
				dispose();
			}
					
		});
		gestionPoliza.add(btnAgregar2);
		
		JButton btnConsultar2 = new JButton("Consultar");
		btnConsultar2.setBackground(Color.WHITE);
		btnConsultar2.setBounds(25, 190, 160, 60);
		gestionPoliza.add(btnConsultar2);
		
		JButton btnGenerarProp = new JButton("Generar propuesta renovaci\u00F3n");
		btnGenerarProp.setBackground(Color.WHITE);
		btnGenerarProp.setBounds(25, 260, 160, 60);
		gestionPoliza.add(btnGenerarProp);
		
		JPanel gestionParametros = new JPanel();
		gestionParametros.setLayout(null);
		gestionParametros.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		gestionParametros.setBounds(522, 50, 211, 410);
		productorSeguro.add(gestionParametros);
		
		JLabel lblGestion3 = new JLabel("Gesti\u00F3n de");
		lblGestion3.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblGestion3.setBounds(30, 11, 156, 60);
		gestionParametros.add(lblGestion3);
		
		JLabel lblParametros = new JLabel("par\u00E1metros");
		lblParametros.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblParametros.setBounds(27, 57, 156, 46);
		gestionParametros.add(lblParametros);
		
		JButton btnActualizarPar = new JButton("Actualizar par\u00E1ametros");
		btnActualizarPar.setBackground(Color.WHITE);
		btnActualizarPar.setBounds(25, 190, 160, 60);
		gestionParametros.add(btnActualizarPar);
		
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
