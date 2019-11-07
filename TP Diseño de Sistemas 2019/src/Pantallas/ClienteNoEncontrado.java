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
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class ClienteNoEncontrado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteNoEncontrado frame = new ClienteNoEncontrado();
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
	public ClienteNoEncontrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_Marco = new JPanel();
		panel_Marco.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_Marco.setBounds(150, 150, 484, 170);
		panel.add(panel_Marco);
		panel_Marco.setLayout(null);
		
		JButton btnAgregarClienteCNE = new JButton("Agregar cliente");
		btnAgregarClienteCNE.setBounds(264, 117, 170, 33);
		panel_Marco.add(btnAgregarClienteCNE);
		btnAgregarClienteCNE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JButton btnCancelarCNE = new JButton("Cancelar");
		btnCancelarCNE.setBounds(50, 117, 120, 33);
		panel_Marco.add(btnCancelarCNE);
		btnCancelarCNE.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JLabel lblDeseaAgregar = new JLabel("\u00BF Desea agregar un cliente ?");
		lblDeseaAgregar.setBounds(84, 25, 316, 31);
		panel_Marco.add(lblDeseaAgregar);
		lblDeseaAgregar.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnAgregarClienteCNE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
	}

}
