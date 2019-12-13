package Pantallas.CU01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import DTO.ClienteDTO;
import DTO.PolizaDTO;
import Enumerados.EstadoCivil;
import Enumerados.Sexo;
import Logica.FachadaPoliza;
import Pantallas.InicioSesion;
import Pantallas.MenuProductorSeguro;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.JSpinner.DefaultEditor;

import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class AgregarHijos extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public AgregarHijos(PolizaDTO polDTO, ClienteDTO clienteDTO,int numeroHijos, int anio) {
		this.setTitle("El Asegurado");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InicioSesion.class.getResource("/Pantallas/protection.png")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 500, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 611);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panelHijo1 = new JPanel();
		panelHijo1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelHijo1.setBounds(5, 35, 470, 99);
		panel.add(panelHijo1);
		panelHijo1.setLayout(null);
		
		JLabel lblHijo1 = new JLabel("Hijo N\u00B01");
		lblHijo1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijo1.setBounds(5, 5, 71, 18);
		panelHijo1.add(lblHijo1);
		
		JLabel lblFechaDeNacimiento1 = new JLabel("Fecha de nacimiento:");
		lblFechaDeNacimiento1.setBounds(5, 26, 125, 14);
		panelHijo1.add(lblFechaDeNacimiento1);
		
		JLabel lblSexo1 = new JLabel("Sexo:");
		lblSexo1.setBounds(5, 49, 49, 14);
		panelHijo1.add(lblSexo1);
		
		JLabel lblEC1 = new JLabel("Estado civil:");
		lblEC1.setBounds(5, 74, 81, 14);
		panelHijo1.add(lblEC1);
		
		EstadoCivil[] listaEC= {EstadoCivil.CASADO,EstadoCivil.DIVORCIADO,EstadoCivil.SOLTERO,EstadoCivil.VIUDO};
		Sexo[] listaSexo= {Sexo.FEMENINO,Sexo.MASCULINO,Sexo.OTRO};
		
		JComboBox<EstadoCivil> comboBoxEC1 = new JComboBox<EstadoCivil>();
		comboBoxEC1.setModel(new DefaultComboBoxModel<EstadoCivil>(listaEC));
		comboBoxEC1.setBounds(135, 73, 169, 16);
		panelHijo1.add(comboBoxEC1);
		
		Date today = new Date();
		
        Calendar anio18 = Calendar.getInstance();
        Calendar anio30 = Calendar.getInstance();
        
        anio18.setTime(today);
        anio30.setTime(today);
        
        anio18.add(Calendar.YEAR, -18);
        anio30.add(Calendar.YEAR, -30);
        
		JSpinner fechaNac1 = new JSpinner(new SpinnerDateModel(anio18.getTime(),anio30.getTime(),anio18.getTime(), Calendar.MONTH));
		JSpinner.DateEditor editor = new JSpinner.DateEditor(fechaNac1, "dd/MM/yy");
		fechaNac1.setEditor(editor);
		
		fechaNac1.setBounds(135, 23, 169, 20);
		panelHijo1.add(fechaNac1);
		
		JComboBox<Sexo> comboBoxSexo1 = new JComboBox<Sexo>();
		comboBoxSexo1.setModel(new DefaultComboBoxModel<Sexo>(listaSexo));
		comboBoxSexo1.setBounds(135, 48, 169, 16);
		panelHijo1.add(comboBoxSexo1);
		
		JLabel lblDeclaracion = new JLabel("Declaraci\u00F3n de hijo/s");
		lblDeclaracion.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblDeclaracion.setBounds(5, 5, 240, 30);
		panel.add(lblDeclaracion);
		
		JPanel panelHijo2 = new JPanel();
		panelHijo2.setLayout(null);
		panelHijo2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelHijo2.setBounds(5, 145, 470, 99);
		panel.add(panelHijo2);
		
		JLabel lblHijo2 = new JLabel("Hijo N\u00B02");
		lblHijo2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijo2.setBounds(5, 5, 71, 18);
		panelHijo2.add(lblHijo2);
		
		JLabel lblFechaNacimiento2 = new JLabel("Fecha de nacimiento:");
		lblFechaNacimiento2.setBounds(5, 26, 125, 14);
		panelHijo2.add(lblFechaNacimiento2);
		
		JLabel lblSexo2 = new JLabel("Sexo:");
		lblSexo2.setBounds(5, 49, 49, 14);
		panelHijo2.add(lblSexo2);
		
		JLabel lblEC2 = new JLabel("Estado civil:");
		lblEC2.setBounds(5, 74, 81, 14);
		panelHijo2.add(lblEC2);
		
		JComboBox<EstadoCivil> comboBoxEC2 = new JComboBox<EstadoCivil>();
		comboBoxEC2.setModel(new DefaultComboBoxModel<EstadoCivil>(listaEC));
		comboBoxEC2.setBounds(135, 73, 169, 16);
		panelHijo2.add(comboBoxEC2);
		
		JSpinner fechaNac2 = new JSpinner(new SpinnerDateModel(anio18.getTime(),anio30.getTime(),anio18.getTime(), Calendar.MONTH));
		JSpinner.DateEditor editor2 = new JSpinner.DateEditor(fechaNac2, "dd/MM/yy");
		fechaNac2.setEditor(editor2);
		fechaNac2.setBounds(135, 23, 169, 20);
		panelHijo2.add(fechaNac2);
		
		JComboBox<Sexo> comboBoxSexo2 = new JComboBox<Sexo>();
		comboBoxSexo2.setModel(new DefaultComboBoxModel<Sexo>(listaSexo));
		comboBoxSexo2.setBounds(135, 49, 169, 16);
		panelHijo2.add(comboBoxSexo2);
		
		JPanel panelHijo3 = new JPanel();
		panelHijo3.setLayout(null);
		panelHijo3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelHijo3.setBounds(5, 255, 470, 99);
		panel.add(panelHijo3);
		
		JLabel lblHijo3 = new JLabel("Hijo N\u00B03");
		lblHijo3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijo3.setBounds(5, 5, 71, 18);
		panelHijo3.add(lblHijo3);
		
		JLabel lblFechaNacimiento3 = new JLabel("Fecha de nacimiento:");
		lblFechaNacimiento3.setBounds(5, 26, 125, 14);
		panelHijo3.add(lblFechaNacimiento3);
		
		JLabel lblSexo3 = new JLabel("Sexo:");
		lblSexo3.setBounds(5, 49, 49, 14);
		panelHijo3.add(lblSexo3);
		
		JLabel lblEC3 = new JLabel("Estado civil:");
		lblEC3.setBounds(5, 74, 81, 14);
		panelHijo3.add(lblEC3);
		
		JComboBox<EstadoCivil> comboBoxEC3 = new JComboBox<EstadoCivil>();
		comboBoxEC3.setModel(new DefaultComboBoxModel<EstadoCivil>(listaEC));
		comboBoxEC3.setBounds(135, 73, 169, 16);
		panelHijo3.add(comboBoxEC3);
		
		JSpinner fechaNac3 = new JSpinner(new SpinnerDateModel(anio18.getTime(),anio30.getTime(),anio18.getTime(), Calendar.MONTH));
		JSpinner.DateEditor editor3 = new JSpinner.DateEditor(fechaNac3, "dd/MM/yy");
		fechaNac3.setEditor(editor3);
		fechaNac3.setBounds(135, 23, 169, 20);
		panelHijo3.add(fechaNac3);
		
		JComboBox<Sexo> comboBoxSexo3 = new JComboBox<Sexo>();
		comboBoxSexo3.setModel(new DefaultComboBoxModel<Sexo>(listaSexo));
		comboBoxSexo3.setBounds(135, 49, 169, 16);
		panelHijo3.add(comboBoxSexo3);
		
		JPanel panelHijo4 = new JPanel();
		panelHijo4.setLayout(null);
		panelHijo4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelHijo4.setBounds(5, 365, 470, 99);
		panel.add(panelHijo4);
		
		JLabel lblHijo4 = new JLabel("Hijo N\u00B04");
		lblHijo4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijo4.setBounds(5, 5, 71, 18);
		panelHijo4.add(lblHijo4);
		
		JLabel lblFechaNacimiento4 = new JLabel("Fecha de nacimiento:");
		lblFechaNacimiento4.setBounds(5, 26, 125, 14);
		panelHijo4.add(lblFechaNacimiento4);
		
		JLabel lblSexo4 = new JLabel("Sexo:");
		lblSexo4.setBounds(5, 49, 49, 14);
		panelHijo4.add(lblSexo4);
		
		JLabel lblEC4 = new JLabel("Estado civil:");
		lblEC4.setBounds(5, 74, 81, 14);
		panelHijo4.add(lblEC4);
		
		JComboBox<EstadoCivil> comboBoxEC4 = new JComboBox<EstadoCivil>();
		comboBoxEC4.setModel(new DefaultComboBoxModel<EstadoCivil>(listaEC));
		comboBoxEC4.setBounds(135, 73, 169, 16);
		panelHijo4.add(comboBoxEC4);
		
		JSpinner fechaNac4 = new JSpinner(new SpinnerDateModel(anio18.getTime(),anio30.getTime(),anio18.getTime(), Calendar.MONTH));
		JSpinner.DateEditor editor4 = new JSpinner.DateEditor(fechaNac4, "dd/MM/yy");
		fechaNac4.setEditor(editor4);
		fechaNac4.setBounds(135, 23, 169, 20);
		panelHijo4.add(fechaNac4);
		
		JComboBox<Sexo> comboBoxSexo4 = new JComboBox<Sexo>();
		comboBoxSexo4.setModel(new DefaultComboBoxModel<Sexo>(listaSexo));
		comboBoxSexo4.setBounds(135, 49, 169, 16);
		panelHijo4.add(comboBoxSexo4);
		
		JPanel panelHijo5 = new JPanel();
		panelHijo5.setLayout(null);
		panelHijo5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelHijo5.setBounds(5, 475, 470, 99);
		panel.add(panelHijo5);
		
		JLabel lblHijo5 = new JLabel("Hijo N\u00B05");
		lblHijo5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHijo5.setBounds(5, 5, 71, 18);
		panelHijo5.add(lblHijo5);
		
		JLabel lblFechaNacimiento5 = new JLabel("Fecha de nacimiento:");
		lblFechaNacimiento5.setBounds(5, 26, 125, 14);
		panelHijo5.add(lblFechaNacimiento5);
		
		JLabel lblSexo5 = new JLabel("Sexo:");
		lblSexo5.setBounds(5, 49, 49, 14);
		panelHijo5.add(lblSexo5);
		
		JLabel lblEC5 = new JLabel("Estado civil:");
		lblEC5.setBounds(5, 74, 81, 14);
		panelHijo5.add(lblEC5);
		
		JComboBox<EstadoCivil> comboBoxEC5 = new JComboBox<EstadoCivil>();
		comboBoxEC5.setModel(new DefaultComboBoxModel<EstadoCivil>(listaEC));
		comboBoxEC5.setBounds(135, 73, 169, 16);
		panelHijo5.add(comboBoxEC5);
		
		JSpinner fechaNac5 = new JSpinner(new SpinnerDateModel(anio18.getTime(),anio30.getTime(),anio18.getTime(), Calendar.MONTH));
		JSpinner.DateEditor editor5 = new JSpinner.DateEditor(fechaNac5, "dd/MM/yy");
		fechaNac5.setEditor(editor5);
		fechaNac5.setBounds(135, 23, 169, 20);
		panelHijo5.add(fechaNac5);
		
		JComboBox<Sexo> comboBoxSexo5 = new JComboBox<Sexo>();
		comboBoxSexo5.setModel(new DefaultComboBoxModel<Sexo>(listaSexo));
		comboBoxSexo5.setBounds(135, 49, 169, 16);
		panelHijo5.add(comboBoxSexo5);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.setBounds(105, 581, 90, 25);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PolizaGenerar polizaGenerar = new PolizaGenerar(clienteDTO, polDTO,numeroHijos);
				polizaGenerar.setVisible(true);
				dispose();
			}
		});
		panel.add(btnAtras);
			
		if(numeroHijos<2) {
			fechaNac2.setEnabled(false);
			comboBoxSexo2.setEnabled(false);
			comboBoxEC2.setEnabled(false);
		}
		if(numeroHijos<3){
			fechaNac3.setEnabled(false);
			comboBoxSexo3.setEnabled(false);
			comboBoxEC3.setEnabled(false);
		}
		if(numeroHijos<4){
			fechaNac4.setEnabled(false);
			comboBoxSexo4.setEnabled(false);
			comboBoxEC4.setEnabled(false);
		}
		if(numeroHijos<5){
			fechaNac5.setEnabled(false);
			comboBoxSexo5.setEnabled(false);
			comboBoxEC5.setEnabled(false);
		}

		((DefaultEditor) fechaNac1.getEditor()).getTextField().setEditable(false);
		((DefaultEditor) fechaNac2.getEditor()).getTextField().setEditable(false);
		((DefaultEditor) fechaNac3.getEditor()).getTextField().setEditable(false);
		((DefaultEditor) fechaNac4.getEditor()).getTextField().setEditable(false);
		((DefaultEditor) fechaNac5.getEditor()).getTextField().setEditable(false);
		
		if(polDTO.getHijos()!=null) {
			if(polDTO.getHijos().size()>=1) {
				System.out.println(polDTO.getHijos().get(0));
				fechaNac1.setValue(polDTO.getHijos().get(0).getFechaNacimiento());
				comboBoxSexo1.setSelectedItem(polDTO.getHijos().get(0).getSexo());
				comboBoxEC1.setSelectedItem(polDTO.getHijos().get(0).getEstadoCivil());
			}
			if(polDTO.getHijos().size()>=2) {
				System.out.println(polDTO.getHijos().get(1));
				fechaNac2.setValue(polDTO.getHijos().get(1).getFechaNacimiento());
				comboBoxSexo2.setSelectedItem(polDTO.getHijos().get(1).getSexo());
				comboBoxEC2.setSelectedItem(polDTO.getHijos().get(1).getEstadoCivil());
			}
			if(polDTO.getHijos().size()>=3) {
				System.out.println(polDTO.getHijos().get(2));
				fechaNac3.setValue(polDTO.getHijos().get(2).getFechaNacimiento());
				comboBoxSexo3.setSelectedItem(polDTO.getHijos().get(2).getSexo());
				comboBoxEC3.setSelectedItem(polDTO.getHijos().get(2).getEstadoCivil());
			}
			if(polDTO.getHijos().size()>=4) {
				System.out.println(polDTO.getHijos().get(3));
				fechaNac4.setValue(polDTO.getHijos().get(3).getFechaNacimiento());
				comboBoxSexo4.setSelectedItem(polDTO.getHijos().get(3).getSexo());
				comboBoxEC4.setSelectedItem(polDTO.getHijos().get(3).getEstadoCivil());
			}
			if(polDTO.getHijos().size()>=5) {
				System.out.println(polDTO.getHijos().get(4));
				fechaNac5.setValue(polDTO.getHijos().get(4).getFechaNacimiento());
				comboBoxSexo5.setSelectedItem(polDTO.getHijos().get(4).getSexo());
				comboBoxEC5.setSelectedItem(polDTO.getHijos().get(4).getEstadoCivil());
			}
		}
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Date hijo1FN, hijo2FN, hijo3FN, hijo4FN, hijo5FN;
				EstadoCivil hijo1EC, hijo2EC, hijo3EC, hijo4EC, hijo5EC;
				Sexo hijo1Sexo, hijo2Sexo, hijo3Sexo, hijo4Sexo, hijo5Sexo;
				ArrayList<Date> fechasNac = new ArrayList<>();
				ArrayList<Sexo> sexo = new ArrayList<>(); //femenino true, masculino false
				ArrayList<EstadoCivil> estadoCivil = new ArrayList<>();
				
				hijo1FN = (Date) fechaNac1.getValue();
				hijo1Sexo = (Sexo) comboBoxSexo1.getSelectedItem();
				hijo1EC = (EstadoCivil) comboBoxEC1.getSelectedItem();
				fechasNac.add(hijo1FN);
				sexo.add(hijo1Sexo);
				estadoCivil.add(hijo1EC);
					
				if(numeroHijos>1) {
					hijo2FN = (Date) fechaNac2.getValue();
					hijo2Sexo = (Sexo) comboBoxSexo2.getSelectedItem();
					hijo2EC = (EstadoCivil) comboBoxEC2.getSelectedItem();
					fechasNac.add(hijo2FN);
					sexo.add(hijo2Sexo);
					estadoCivil.add(hijo2EC);
				}
				if(numeroHijos>2){
					hijo3FN = (Date) fechaNac3.getValue();
					hijo3Sexo = (Sexo) comboBoxSexo3.getSelectedItem();
					hijo3EC = (EstadoCivil) comboBoxEC3.getSelectedItem();
					fechasNac.add(hijo3FN);
					sexo.add(hijo3Sexo);
					estadoCivil.add(hijo3EC);	
				}
				if(numeroHijos>3){
					hijo4FN = (Date) fechaNac4.getValue();
					hijo4Sexo = (Sexo) comboBoxSexo4.getSelectedItem();
					hijo4EC = (EstadoCivil) comboBoxEC4.getSelectedItem();
					fechasNac.add(hijo4FN);
					sexo.add(hijo4Sexo);
					estadoCivil.add(hijo4EC);	
				}
				if(numeroHijos>4){
					hijo5FN = (Date) fechaNac5.getValue();
					hijo5Sexo = (Sexo) comboBoxSexo5.getSelectedItem();
					hijo5EC = (EstadoCivil) comboBoxEC5.getSelectedItem();
					fechasNac.add(hijo5FN);
					sexo.add(hijo5Sexo);
					estadoCivil.add(hijo5EC);	
				}
				
				FachadaPoliza.getInstance().ingresarDatos(polDTO,fechasNac,sexo,estadoCivil,numeroHijos);
				
				Cobertura cobertura = new Cobertura(polDTO,clienteDTO,anio,numeroHijos);
				cobertura.setVisible(true);
				dispose();
			}
		});
		
		btnSiguiente.setBounds(385, 581, 90, 25);
		panel.add(btnSiguiente);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int input = JOptionPane.showConfirmDialog(null, "Desea cancelar la transacción?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					MenuProductorSeguro menuProductorSeguro = new MenuProductorSeguro();
					menuProductorSeguro.setVisible(true);
					dispose();
				}
	
			}
		});
		btnCancelar.setBounds(5, 581, 90, 25);
		panel.add(btnCancelar);
	}
}
