package Pantallas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import DTO.CuotaDTO;
import DTO.PolizaDTO;
import DTO.ReciboDTO;
import Logica.FachadaPoliza;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImporteIngresado extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	public ImporteIngresado(PolizaDTO polDTO, ArrayList<CuotaDTO> cuotasPagar, float importeTotal) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Importe abonado:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(55, 50, 140, 25);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(195, 50, 102, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReciboDTO reciboDTO = FachadaPoliza.getInstance().generarRecibo(Float.valueOf(textField.getText()), cuotasPagar, polDTO, importeTotal);
				
				DetallePago detallePago = new DetallePago(polDTO, reciboDTO);
				detallePago.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(Color.WHITE);
		button.setBounds(140, 86, 90, 25);
		contentPane.add(button);
		
	}
}