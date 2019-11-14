package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

import DTO.ClienteDTO;
import DTO.PolizaDTO;
import Logica.FachadaPoliza;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class AgregarHijos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgregarHijos frame = new AgregarHijos(4);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public AgregarHijos(PolizaDTO polDTO, ClienteDTO clienteDTO,int a) {
		
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
		MaskFormatter mask1=null;
		MaskFormatter mask2=null;
		MaskFormatter mask3=null;
		MaskFormatter mask4=null;
		MaskFormatter mask5=null;
		try {
			mask1 = new MaskFormatter("##/##/####");
			mask2 = new MaskFormatter("##/##/####");
			mask3 = new MaskFormatter("##/##/####");
			mask4 = new MaskFormatter("##/##/####");
			mask5 = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Hijo 1
		
		JPanel panelHijo1 = new JPanel();
		panelHijo1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelHijo1.setBounds(5, 44, 774, 90);
		panel.add(panelHijo1);
		panelHijo1.setLayout(null);
		
		JLabel lblHijo1 = new JLabel("Hijo");
		lblHijo1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijo1.setBounds(5, 5, 40, 18);
		panelHijo1.add(lblHijo1);
		
		JLabel lblFechaDeNacimiento1 = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento1.setBounds(5, 26, 120, 14);
		panelHijo1.add(lblFechaDeNacimiento1);
		
		JLabel lblSexo1 = new JLabel("Sexo:");
		lblSexo1.setBounds(5, 45, 49, 14);
		panelHijo1.add(lblSexo1);
		
		JLabel lblEstadoCivil1 = new JLabel("Estado civil:");
		lblEstadoCivil1.setBounds(5, 64, 81, 14);
		panelHijo1.add(lblEstadoCivil1);
		
		JRadioButton rdbtnFemenino1 = new JRadioButton("Femenino");
		rdbtnFemenino1.setBounds(130, 45, 95, 14);
		panelHijo1.add(rdbtnFemenino1);
		
		JRadioButton rdbtnMasculino1 = new JRadioButton("Masculino");
		rdbtnMasculino1.setBounds(230, 45, 95, 14);
		panelHijo1.add(rdbtnMasculino1);
		
		ButtonGroup Sexo1=new ButtonGroup();
		Sexo1.add(rdbtnMasculino1);
		Sexo1.add(rdbtnFemenino1);
		
		JComboBox comboBoxEstadoCivil1 = new JComboBox();
		comboBoxEstadoCivil1.setModel(new DefaultComboBoxModel(new String[] {"Seleccione estado civil", "Casado", "Soltero", "Viudo", "Divorciado"}));
		comboBoxEstadoCivil1.setBounds(130, 63, 100, 16);
		panelHijo1.add(comboBoxEstadoCivil1);
		
		JSpinner FechaNac1 = new JSpinner();
		FechaNac1.setModel(new SpinnerDateModel(new Date(-2208973392000L), new Date(-2209064400000L), null, Calendar.DAY_OF_YEAR));
		FechaNac1.setBounds(135, 23, 100, 20);
		panelHijo1.add(FechaNac1);
		
		//Hijo2
		
		JPanel panelHijo2 = new JPanel();
		panelHijo2.setLayout(null);
		panelHijo2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelHijo2.setBounds(5, 139, 774, 90);
		panel.add(panelHijo2);
		
		JLabel lblHijo2 = new JLabel("Hijo");
		lblHijo2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijo2.setBounds(5, 5, 40, 18);
		panelHijo2.add(lblHijo2);
		
		JLabel lblFechaDeNacimiento2 = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento2.setBounds(5, 26, 120, 14);
		panelHijo2.add(lblFechaDeNacimiento2);
		
		JLabel lblSexo2 = new JLabel("Sexo:");
		lblSexo2.setBounds(5, 45, 49, 14);
		panelHijo2.add(lblSexo2);
		
		JLabel lblEstadoCivil2 = new JLabel("Estado civil:");
		lblEstadoCivil2.setBounds(5, 64, 81, 14);
		panelHijo2.add(lblEstadoCivil2);
		
		JFormattedTextField FechaNac2 = new JFormattedTextField();
		FechaNac2.setBounds(130, 25, 100, 16);
		panelHijo2.add(FechaNac2);
		
		JRadioButton rdbtnFemenino2 = new JRadioButton("Femenino");
		rdbtnFemenino2.setBounds(130, 45, 95, 14);
		panelHijo2.add(rdbtnFemenino2);
		
		JRadioButton rdbtnMasculino2 = new JRadioButton("Masculino");
		rdbtnMasculino2.setBounds(230, 45, 95, 14);
		panelHijo2.add(rdbtnMasculino2);
		
		JComboBox comboBoxEstadoCivil2 = new JComboBox();
		comboBoxEstadoCivil2.setBounds(130, 63, 100, 16);
		panelHijo2.add(comboBoxEstadoCivil2);
		mask2.install(FechaNac2);
		
		//Hijo3
		
		JPanel panelHijo3 = new JPanel();
		panelHijo3.setLayout(null);
		panelHijo3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelHijo3.setBounds(5, 234, 774, 90);
		panel.add(panelHijo3);
		
		JLabel lblHijo3 = new JLabel("Hijo");
		lblHijo3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijo3.setBounds(5, 5, 40, 18);
		panelHijo3.add(lblHijo3);
		
		JLabel lblFechaDeNacimiento3 = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento3.setBounds(5, 26, 120, 14);
		panelHijo3.add(lblFechaDeNacimiento3);
		
		JLabel lblSexo3 = new JLabel("Sexo:");
		lblSexo3.setBounds(5, 45, 49, 14);
		panelHijo3.add(lblSexo3);
		
		JLabel lblEstadoCivil3 = new JLabel("Estado civil:");
		lblEstadoCivil3.setBounds(5, 64, 81, 14);
		panelHijo3.add(lblEstadoCivil3);
		
		JFormattedTextField FechaNac3 = new JFormattedTextField();
		FechaNac3.setBounds(130, 25, 100, 16);
		panelHijo3.add(FechaNac3);
		
		JRadioButton rdbtnFemenino3 = new JRadioButton("Femenino");
		rdbtnFemenino3.setBounds(130, 45, 95, 14);
		panelHijo3.add(rdbtnFemenino3);
		
		JRadioButton rdbtnMasculino3 = new JRadioButton("Masculino");
		rdbtnMasculino3.setBounds(230, 45, 95, 14);
		panelHijo3.add(rdbtnMasculino3);
		
		JComboBox comboBoxEstadoCivil3 = new JComboBox();
		comboBoxEstadoCivil3.setBounds(130, 63, 100, 16);
		panelHijo3.add(comboBoxEstadoCivil3);
		mask3.install(FechaNac3);
		
		//Hijo4
		
		JPanel panelHijo4 = new JPanel();
		panelHijo4.setLayout(null);
		panelHijo4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelHijo4.setBounds(5, 329, 774, 90);
		panel.add(panelHijo4);
		
		JLabel lblHijo4 = new JLabel("Hijo");
		lblHijo4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijo4.setBounds(5, 5, 40, 18);
		panelHijo4.add(lblHijo4);
		
		JLabel lblFechaDeNacimiento4 = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento4.setBounds(5, 26, 120, 14);
		panelHijo4.add(lblFechaDeNacimiento4);
		
		JLabel lblSexo4 = new JLabel("Sexo:");
		lblSexo4.setBounds(5, 45, 49, 14);
		panelHijo4.add(lblSexo4);
		
		JLabel lblEstadoCivil4 = new JLabel("Estado civil:");
		lblEstadoCivil4.setBounds(5, 64, 81, 14);
		panelHijo4.add(lblEstadoCivil4);
		
		JFormattedTextField FechaNac4 = new JFormattedTextField();
		FechaNac4.setBounds(130, 25, 100, 16);
		panelHijo4.add(FechaNac4);
		
		JRadioButton rdbtnFemenino4 = new JRadioButton("Femenino");
		rdbtnFemenino4.setBounds(130, 45, 95, 14);
		panelHijo4.add(rdbtnFemenino4);
		
		JRadioButton rdbtnMasculino4 = new JRadioButton("Masculino");
		rdbtnMasculino4.setBounds(230, 45, 95, 14);
		panelHijo4.add(rdbtnMasculino4);
		
		JComboBox comboBoxEstadoCivil4 = new JComboBox();
		comboBoxEstadoCivil4.setBounds(130, 63, 100, 16);
		panelHijo4.add(comboBoxEstadoCivil4);
		mask4.install(FechaNac4);
		
		//Hijo5
		
		JPanel panelHijo5 = new JPanel();
		panelHijo5.setLayout(null);
		panelHijo5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelHijo5.setBounds(5, 424, 774, 90);
		panel.add(panelHijo5);
		
		JLabel lblHijo5 = new JLabel("Hijo");
		lblHijo5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijo5.setBounds(5, 5, 40, 18);
		panelHijo5.add(lblHijo5);
		
		JLabel lblFechaDeNacimiento5 = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento5.setBounds(5, 26, 120, 14);
		panelHijo5.add(lblFechaDeNacimiento5);
		
		JLabel lblSexo5 = new JLabel("Sexo:");
		lblSexo5.setBounds(5, 45, 49, 14);
		panelHijo5.add(lblSexo5);
		
		JLabel lblEstadoCivil5 = new JLabel("Estado civil:");
		lblEstadoCivil5.setBounds(5, 64, 81, 14);
		panelHijo5.add(lblEstadoCivil5);
		
		JFormattedTextField FechaNac5 = new JFormattedTextField();
		FechaNac5.setBounds(130, 25, 100, 16);
		panelHijo5.add(FechaNac5);
		
		JRadioButton rdbtnFemenino5 = new JRadioButton("Femenino");
		rdbtnFemenino5.setBounds(130, 45, 95, 14);
		panelHijo5.add(rdbtnFemenino5);
		
		JRadioButton rdbtnMasculino5 = new JRadioButton("Masculino");
		rdbtnMasculino5.setBounds(230, 45, 95, 14);
		panelHijo5.add(rdbtnMasculino5);
		
		JComboBox comboBoxEstadoCivil5 = new JComboBox();
		comboBoxEstadoCivil5.setBounds(130, 63, 100, 16);
		panelHijo5.add(comboBoxEstadoCivil5);
		mask5.install(FechaNac5);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setBounds(5, 531, 90, 25);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PolizaGenerar polizaGenerar = new PolizaGenerar(clienteDTO);
				polizaGenerar.setVisible(true);
				dispose();
			}
		});
		panel.add(btnAtras);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Date hijo1FN, hijo2FN, hijo3FN, hijo4FN, hijo5FN;
				String hijo1EC, hijo2EC, hijo3EC, hijo4EC, hijo5EC;
				Boolean hijo1Fem, hijo2Fem, hijo3Fem, hijo4Fem, hijo5Fem;
				ArrayList<Date> fechasNac = new ArrayList<>();
				ArrayList<Boolean> sexo = new ArrayList<>(); //femenino true, masculino false
				ArrayList<String> estadoCivil = new ArrayList<>();
				switch (a) {
				case 5:
					hijo1FN = (Date) FechaNac1.getValue();
					hijo1Fem = rdbtnFemenino1.isSelected();
					hijo1EC = (String) comboBoxEstadoCivil1.getSelectedItem();
					fechasNac.add(hijo1FN);
					sexo.add(hijo1Fem);
					estadoCivil.add(hijo1EC);
					
					hijo2FN = (Date) FechaNac2.getValue();
					hijo2Fem = rdbtnFemenino2.isSelected();
					hijo2EC = (String) comboBoxEstadoCivil2.getSelectedItem();
					fechasNac.add(hijo2FN);
					sexo.add(hijo2Fem);
					estadoCivil.add(hijo2EC);
					
					hijo3FN = (Date) FechaNac3.getValue();
					hijo3Fem = rdbtnFemenino3.isSelected();
					hijo3EC = (String) comboBoxEstadoCivil3.getSelectedItem();
					fechasNac.add(hijo3FN);
					sexo.add(hijo3Fem);
					estadoCivil.add(hijo3EC);
					
					hijo4FN = (Date) FechaNac4.getValue();
					hijo4Fem = rdbtnFemenino4.isSelected();
					hijo4EC = (String) comboBoxEstadoCivil4.getSelectedItem();
					fechasNac.add(hijo4FN);
					sexo.add(hijo4Fem);
					estadoCivil.add(hijo4EC);
					
					hijo5FN = (Date) FechaNac5.getValue();
					hijo5Fem = rdbtnFemenino5.isSelected();
					hijo5EC = (String) comboBoxEstadoCivil5.getSelectedItem();
					fechasNac.add(hijo5FN);
					sexo.add(hijo5Fem);
					estadoCivil.add(hijo5EC);
					
				case 4: 
					hijo1FN = (Date) FechaNac1.getValue();
					hijo1Fem = rdbtnFemenino1.isSelected();
					hijo1EC = (String) comboBoxEstadoCivil1.getSelectedItem();
					fechasNac.add(hijo1FN);
					sexo.add(hijo1Fem);
					estadoCivil.add(hijo1EC);
					
					hijo2FN = (Date) FechaNac2.getValue();
					hijo2Fem = rdbtnFemenino2.isSelected();
					hijo2EC = (String) comboBoxEstadoCivil2.getSelectedItem();
					fechasNac.add(hijo2FN);
					sexo.add(hijo2Fem);
					estadoCivil.add(hijo2EC);
					
					hijo3FN = (Date) FechaNac3.getValue();
					hijo3Fem = rdbtnFemenino3.isSelected();
					hijo3EC = (String) comboBoxEstadoCivil3.getSelectedItem();
					fechasNac.add(hijo3FN);
					sexo.add(hijo3Fem);
					estadoCivil.add(hijo3EC);
					
					hijo4FN = (Date) FechaNac4.getValue();
					hijo4Fem = rdbtnFemenino4.isSelected();
					hijo4EC = (String) comboBoxEstadoCivil4.getSelectedItem();
					fechasNac.add(hijo4FN);
					sexo.add(hijo4Fem);
					estadoCivil.add(hijo4EC);
					
				case 3: 
					hijo1FN = (Date) FechaNac1.getValue();
					hijo1Fem = rdbtnFemenino1.isSelected();
					hijo1EC = (String) comboBoxEstadoCivil1.getSelectedItem();
					fechasNac.add(hijo1FN);
					sexo.add(hijo1Fem);
					estadoCivil.add(hijo1EC);
					
					hijo2FN = (Date) FechaNac2.getValue();
					hijo2Fem = rdbtnFemenino2.isSelected();
					hijo2EC = (String) comboBoxEstadoCivil2.getSelectedItem();
					fechasNac.add(hijo2FN);
					sexo.add(hijo2Fem);
					estadoCivil.add(hijo2EC);
					
					hijo3FN = (Date) FechaNac3.getValue();
					hijo3Fem = rdbtnFemenino3.isSelected();
					hijo3EC = (String) comboBoxEstadoCivil3.getSelectedItem();
					fechasNac.add(hijo3FN);
					sexo.add(hijo3Fem);
					estadoCivil.add(hijo3EC);
					
				case 2:
					hijo1FN = (Date) FechaNac1.getValue();
					hijo1Fem = rdbtnFemenino1.isSelected();
					hijo1EC = (String) comboBoxEstadoCivil1.getSelectedItem();
					fechasNac.add(hijo1FN);
					sexo.add(hijo1Fem);
					estadoCivil.add(hijo1EC);
					
					hijo2FN = (Date) FechaNac2.getValue();
					hijo2Fem = rdbtnFemenino2.isSelected();
					hijo2EC = (String) comboBoxEstadoCivil2.getSelectedItem();
					fechasNac.add(hijo2FN);
					sexo.add(hijo2Fem);
					estadoCivil.add(hijo2EC);
				
				case 1:
					hijo1FN = (Date) FechaNac1.getValue();
					hijo1Fem = rdbtnFemenino1.isSelected();
					hijo1EC = (String) comboBoxEstadoCivil1.getSelectedItem();
					fechasNac.add(hijo1FN);
					sexo.add(hijo1Fem);
					estadoCivil.add(hijo1EC);
				}
				
				FachadaPoliza.getInstance().ingresarHijos(polDTO,fechasNac,sexo,estadoCivil,a);
				
				
				Cobertura cobertura = new Cobertura(polDTO,clienteDTO);
				cobertura.setVisible(true);
				dispose();
			}
		});
		btnSiguiente.setBounds(689, 531, 90, 25);
		panel.add(btnSiguiente);
		
		JLabel lblDeclaracion = new JLabel("Declaraci\u00F3n de hijo/s");
		lblDeclaracion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDeclaracion.setBounds(5, 5, 240, 30);
		panel.add(lblDeclaracion);
		
		ButtonGroup Sexo2=new ButtonGroup();
		
		ButtonGroup Sexo3=new ButtonGroup();
		
		ButtonGroup Sexo4=new ButtonGroup();
		
		ButtonGroup Sexo5=new ButtonGroup();
		switch(a) {
		case 1:
			FechaNac2.setEnabled(false);
			rdbtnFemenino2.setEnabled(false);
			rdbtnMasculino2.setEnabled(false);
			comboBoxEstadoCivil2.setEnabled(false);
			FechaNac3.setEnabled(false);
			rdbtnFemenino3.setEnabled(false);
			rdbtnMasculino3.setEnabled(false);
			comboBoxEstadoCivil3.setEnabled(false);
			FechaNac4.setEnabled(false);
			rdbtnFemenino4.setEnabled(false);
			rdbtnMasculino4.setEnabled(false);
			comboBoxEstadoCivil4.setEnabled(false);
			FechaNac5.setEnabled(false);
			rdbtnFemenino5.setEnabled(false);
			rdbtnMasculino5.setEnabled(false);
			comboBoxEstadoCivil5.setEnabled(false);
			
		case 2:
			FechaNac3.setEnabled(false);
			rdbtnFemenino3.setEnabled(false);
			rdbtnMasculino3.setEnabled(false);
			comboBoxEstadoCivil3.setEnabled(false);
			FechaNac4.setEnabled(false);
			rdbtnFemenino4.setEnabled(false);
			rdbtnMasculino4.setEnabled(false);
			comboBoxEstadoCivil4.setEnabled(false);
			FechaNac5.setEnabled(false);
			rdbtnFemenino5.setEnabled(false);
			rdbtnMasculino5.setEnabled(false);
			comboBoxEstadoCivil5.setEnabled(false);
		case 3:
			FechaNac4.setEnabled(false);
			rdbtnFemenino4.setEnabled(false);
			rdbtnMasculino4.setEnabled(false);
			comboBoxEstadoCivil4.setEnabled(false);
			FechaNac5.setEnabled(false);
			rdbtnFemenino5.setEnabled(false);
			rdbtnMasculino5.setEnabled(false);
			comboBoxEstadoCivil5.setEnabled(false);
		case 4:
			FechaNac5.setEnabled(false);
			rdbtnFemenino5.setEnabled(false);
			rdbtnMasculino5.setEnabled(false);
			comboBoxEstadoCivil5.setEnabled(false);		
		default:
	}
	}
}
