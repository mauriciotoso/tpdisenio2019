package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BDD.GestorBDD;
import DTO.ClienteDTO;

public class BuscarCliente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarCliente frame = new BuscarCliente();
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
	public BuscarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(0, 0, 784, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnBuscarCliente = new JButton("Buscar cliente");
		btnBuscarCliente.setBackground(Color.WHITE);
		btnBuscarCliente.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnBuscarCliente.setBounds(292, 250, 200, 50);
		btnBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClienteDTO clienteDTO = GestorBDD.getInstance().getCliente();
				
				PolizaGenerar polizaGenerar = new PolizaGenerar(clienteDTO);
				polizaGenerar.setVisible(true);
				dispose();
			}
		});
		panel.add(btnBuscarCliente);
		
		JButton btnCancelarBC = new JButton("Cancelar");
		btnCancelarBC.setBackground(Color.WHITE);
		btnCancelarBC.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnCancelarBC.setBounds(654, 500, 120, 50);
		btnCancelarBC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Desea cancelar la transacción?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					MenuProductorSeguro menuProductorSeguro = new MenuProductorSeguro();
					menuProductorSeguro.setVisible(true);
					dispose();
				}
			}
		});
		panel.add(btnCancelarBC);
	}

}
