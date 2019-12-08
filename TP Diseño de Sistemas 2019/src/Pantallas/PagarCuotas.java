package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import DTO.CuotaDTO;
import DTO.PolizaDTO;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PagarCuotas extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private float importeTotal;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PagarCuotas frame = new PagarCuotas();
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
	public PagarCuotas(PolizaDTO polDTO, ArrayList<CuotaDTO> cuotasPagar) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(40, 21, 700, 220);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 37, 680, 52);
		panel_1.add(scrollPane);
		
		Object[][] datosCuotasPagar = new Object[cuotasPagar.size()][2];
		for(int i=0; i<=cuotasPagar.size()-1;i++) {
			CuotaDTO c = cuotasPagar.get(i);
			datosCuotasPagar[i][0]= c.getNroCuota();
			datosCuotasPagar[i][1]= c.getImporteCuota();
		}
		
		String[] columnas = {"Nro Cuota","Importe"};
		
		table = new JTable(datosCuotasPagar, columnas);
		scrollPane.setViewportView(table);
		table.setAutoCreateRowSorter(true);
		table.editingCanceled(null);
		
		JLabel label = new JLabel("Cuotas seleccionadas");
		label.setBounds(10, 1, 172, 25);
		panel_1.add(label);
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel label_1 = new JLabel("Importe total:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_1.setBounds(40, 252, 110, 25);
		contentPane.add(label_1);
		
		JButton button = new JButton("Cancelar");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(Color.WHITE);
		button.setBounds(10, 525, 90, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Pagar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ImporteIngresado importeIngresado = new ImporteIngresado(polDTO,cuotasPagar,importeTotal);
				importeIngresado.setVisible(true);
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(684, 525, 90, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Cambiar cuotas");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(547, 525, 127, 25);
		contentPane.add(button_2);
		
		textField = new JTextField();
		textField.setBounds(150, 252, 90, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		for(CuotaDTO c: cuotasPagar) 
			importeTotal+=c.getImporteCuota();
		
		textField.setText(Float.toString(importeTotal));
	}
}
