package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;

import DTO.PolizaDTO;
import Entidades.Poliza;
import Logica.FachadaPoliza;

import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosPoliza extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosPoliza frame = new DatosPoliza();
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
	public DatosPoliza(PolizaDTO polDTO) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("Numero de cliente:");
		label.setBounds(10, 11, 100, 20);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Nombre:");
		label_1.setBounds(10, 42, 48, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Numero de poliza:");
		label_2.setBounds(354, 14, 100, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Apellido:");
		label_3.setBounds(354, 42, 48, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Tipo de documento:");
		label_4.setBounds(10, 73, 100, 20);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Numero de documento:");
		label_5.setBounds(354, 73, 120, 20);
		contentPane.add(label_5);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 120, 700, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_6 = new JLabel("Ultimo pago");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_6.setBounds(10, 11, 100, 20);
		panel.add(label_6);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 42, 40, 20);
		panel.add(lblFecha);
		
		JLabel label_7 = new JLabel("Monto:");
		label_7.setBounds(346, 42, 40, 20);
		panel.add(label_7);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(52, 42, 150, 20);
		panel.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(390, 42, 150, 20);
		panel.add(textField_7);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(110, 11, 150, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(60, 42, 150, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(115, 73, 150, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(450, 14, 150, 20);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(403, 42, 150, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(475, 73, 150, 20);
		contentPane.add(textField_5);
		
		JButton button = new JButton("Atras");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(Color.WHITE);
		button.setBounds(10, 525, 90, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Aceptar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(684, 527, 90, 25);
		contentPane.add(button_1);
		
		
		/*textField.setText(pol.getNroCliente().getNroCliente());
		textField_1.setText(pol.getNroCliente().getNombre());
		textField_2.setText(pol.getNroCliente().getTipoDocumento().toString());
		textField_3.setText(pol.getNroPoliza());
		textField_4.setText(pol.getNroCliente().getApellido());
		textField_5.setText(pol.getNroCliente().getNroDocumento());
		String fecha = new String();
		if(pol.getTipoPoliza().compareTo("SEMESTRAL")==0)
			fecha=pol.getCuotas().get(0).getUltimoDiaPago().toString();
		else 
			fecha=pol.getCuotas().get(5).getUltimoDiaPago().toString();
		textField_6.setText(fecha);
		textField_7.setText(Float.toString(pol.getMontoTotal()));*/
	}

}
