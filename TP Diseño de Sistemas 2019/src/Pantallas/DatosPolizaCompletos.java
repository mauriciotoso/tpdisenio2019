package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import BDD.GestorBDD;
import DTO.PolizaDTO;

import javax.swing.JScrollPane;
import javax.swing.JButton;

public class DatosPolizaCompletos extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private static PolizaDTO polDTO;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatosPolizaCompletos frame = new DatosPolizaCompletos();
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
	public DatosPolizaCompletos(/*PolizaDTO polDTO*/) {
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
		label_1.setBounds(10, 42, 50, 20);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Apellido:");
		label_2.setBounds(288, 45, 50, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Numero de poliza:");
		label_3.setBounds(10, 73, 90, 20);
		contentPane.add(label_3);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(107, 11, 150, 20);
		contentPane.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(60, 42, 150, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(335, 45, 150, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(107, 73, 150, 20);
		contentPane.add(textField_3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(20, 104, 700, 80);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel label_4 = new JLabel("Marca:");
		label_4.setBounds(10, 29, 39, 20);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("Patente del veh\u00EDculo:");
		label_5.setBounds(10, 49, 120, 20);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Modelo:");
		label_6.setBounds(272, 29, 50, 20);
		panel.add(label_6);
		
		JLabel label_7 = new JLabel("Datos autom\u00F3vil");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_7.setBounds(10, 11, 130, 20);
		panel.add(label_7);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(20, 197, 700, 80);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label_8 = new JLabel("Fecha de vigencia");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_8.setBounds(10, 11, 130, 20);
		panel_1.add(label_8);
		
		JLabel label_9 = new JLabel("Inicio:");
		label_9.setBounds(10, 32, 40, 20);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel("Fin:");
		label_10.setBounds(286, 35, 40, 20);
		panel_1.add(label_10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(20, 288, 700, 100);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel label_11 = new JLabel("Cuotas atrasadas");
		label_11.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_11.setBounds(10, 11, 120, 20);
		panel_2.add(label_11);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 37, 680, 52);
		panel_2.add(scrollPane);
		
		//Object[][] datosCuotasAtrasadas = polDTO.getDatosCuotasA(3);
		
		
		
		Object[][] datosCuotasAtrasadas = new Object[3][3];
		for(int i=0; i<3;i++) {
			datosCuotasAtrasadas[i][0]= Integer.toString(i);
			datosCuotasAtrasadas[i][1]= Float.toString(345);
			datosCuotasAtrasadas[i][2]= Float.toString(400);
		}
		
		
		
		
		String[] columnas = {"Nro Cuota","Valor original","Valor actualizado"};
		
		table = new JTable(datosCuotasAtrasadas, columnas);
		scrollPane.setViewportView(table);
		table.setAutoCreateRowSorter(true);
		table.editingCanceled(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(20, 400, 700, 100);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel label_14 = new JLabel("Cuotas futuras");
		label_14.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_14.setBounds(10, 11, 110, 20);
		panel_3.add(label_14);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 29, 680, 60);
		panel_3.add(scrollPane_1);
		
		//Object[][] datosCuotasFuturas = polDTO.getDatosCuotasF();
		
		
		
				Object[][] datosCuotasFuturas = new Object[3][3];
				for(int i=0; i<3;i++) {
					datosCuotasFuturas[i][0]= Integer.toString(i);
					datosCuotasFuturas[i][1]= Float.toString(345);
					datosCuotasFuturas[i][2]= Float.toString(300);
				}
				
				
		
		table_1 = new JTable(datosCuotasFuturas,columnas);
		scrollPane_1.setViewportView(table_1);
		table_1.setAutoCreateRowSorter(true);
		table_1.editingCanceled(null);
		
		JButton button = new JButton("Atras");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(Color.WHITE);
		button.setBounds(10, 525, 90, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Aceptar");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(684, 527, 90, 25);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Elegir otra p\u00F3liza");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(534, 527, 140, 25);
		contentPane.add(button_2);
		
		
	}
}
