package Pantallas;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class PagarCuotaPendiente extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagarCuotaPendiente frame = new PagarCuotaPendiente();
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
	public PagarCuotaPendiente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Cancelar");
		button.setBounds(10, 525, 90, 25);
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(Color.WHITE);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Atras");
		button_1.setBounds(110, 527, 90, 25);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBackground(Color.WHITE);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Confirmar");
		button_2.setBounds(674, 527, 100, 25);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBackground(Color.WHITE);
		contentPane.add(button_2);
		
		
	}

}
