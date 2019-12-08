package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DTO.PolizaDTO;
import Entidades.Recibo;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class DetallePago extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetallePago frame = new DetallePago();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	*/

	/**
	 * Create the frame.
	 */
	public DetallePago(PolizaDTO polDTO, Recibo recibo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DetalleRecibo detalleRecibo = new DetalleRecibo(polDTO,recibo);
				detalleRecibo.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(Color.WHITE);
		button.setBounds(140, 117, 90, 25);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(40, 11, 300, 95);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblImporte = new JLabel("Importe:");
		lblImporte.setBounds(10, 11, 55, 15);
		panel.add(lblImporte);
		lblImporte.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblImporteAbonado = new JLabel("Importe abonado:");
		lblImporteAbonado.setBounds(10, 34, 110, 15);
		panel.add(lblImporteAbonado);
		lblImporteAbonado.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		JLabel lblVuelto = new JLabel("Vuelto:");
		lblVuelto.setBounds(10, 59, 45, 15);
		panel.add(lblVuelto);
		lblVuelto.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		textField = new JTextField();
		textField.setBounds(67, 10, 86, 15);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(118, 31, 86, 15);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(55, 56, 86, 15);
		panel.add(textField_2);
		
		textField.setText(Float.toString(recibo.getImporte()));
		textField_1.setText(Float.toString(recibo.getImportePagado()));
		textField_2.setText(Float.toString(recibo.getVuelto()));
	}
}
