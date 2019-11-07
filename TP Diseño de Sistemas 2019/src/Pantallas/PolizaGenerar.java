package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;

public class PolizaGenerar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PolizaGenerar frame = new PolizaGenerar();
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
	public PolizaGenerar() {
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
		
		JPanel panel_DatosCliente = new JPanel();
		panel_DatosCliente.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_DatosCliente.setBounds(10, 11, 764, 150);
		panel.add(panel_DatosCliente);
		panel_DatosCliente.setLayout(null);
		
		JLabel lblDatosClienteTitulo = new JLabel("Datos Cliente");
		lblDatosClienteTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDatosClienteTitulo.setForeground(Color.BLACK);
		lblDatosClienteTitulo.setBackground(Color.DARK_GRAY);
		lblDatosClienteTitulo.setBounds(5, 5, 105, 20);
		panel_DatosCliente.add(lblDatosClienteTitulo);
		
		JLabel lblNmeroDeCliente = new JLabel("N\u00FAmero de cliente:");
		lblNmeroDeCliente.setBounds(5, 30, 118, 15);
		panel_DatosCliente.add(lblNmeroDeCliente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(5, 50, 57, 15);
		panel_DatosCliente.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(5, 70, 57, 15);
		panel_DatosCliente.add(lblApellido);
		
		JLabel lblTipoDocumento = new JLabel("Tipo documento:");
		lblTipoDocumento.setBounds(5, 90, 94, 15);
		panel_DatosCliente.add(lblTipoDocumento);
		
		JLabel lblNmeroDeDocumento = new JLabel("N\u00FAmero de documento:");
		lblNmeroDeDocumento.setBounds(5, 110, 138, 15);
		panel_DatosCliente.add(lblNmeroDeDocumento);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(5, 130, 57, 15);
		panel_DatosCliente.add(lblDomicilio);
		
		JTextField textFieldNumeroCliente = new JTextField();
		textFieldNumeroCliente.setEditable(false);
		textFieldNumeroCliente.setBounds(145, 26, 100, 18);
		panel_DatosCliente.add(textFieldNumeroCliente);
		textFieldNumeroCliente.setColumns(10);
		
		JTextField textFieldNombreCliente = new JTextField();
		textFieldNombreCliente.setEditable(false);
		textFieldNombreCliente.setColumns(10);
		textFieldNombreCliente.setBounds(145, 46, 100, 18);
		panel_DatosCliente.add(textFieldNombreCliente);
		
		JTextField textFieldNumeroDoc = new JTextField();
		textFieldNumeroDoc.setEditable(false);
		textFieldNumeroDoc.setColumns(10);
		textFieldNumeroDoc.setBounds(145, 106, 100, 18);
		panel_DatosCliente.add(textFieldNumeroDoc);
		
		JTextField textFieldApellidoCliente = new JTextField();
		textFieldApellidoCliente.setEditable(false);
		textFieldApellidoCliente.setColumns(10);
		textFieldApellidoCliente.setBounds(145, 66, 100, 18);
		panel_DatosCliente.add(textFieldApellidoCliente);
		
		JTextField textFieldTipoDoc = new JTextField();
		textFieldTipoDoc.setEditable(false);
		textFieldTipoDoc.setColumns(10);
		textFieldTipoDoc.setBounds(145, 86, 100, 18);
		panel_DatosCliente.add(textFieldTipoDoc);
		
		JTextField textFieldDomicilio = new JTextField();
		textFieldDomicilio.setEditable(false);
		textFieldDomicilio.setColumns(10);
		textFieldDomicilio.setBounds(145, 126, 100, 18);
		panel_DatosCliente.add(textFieldDomicilio);
		
		JPanel panel_DatosPoliza = new JPanel();
		panel_DatosPoliza.setToolTipText("");
		panel_DatosPoliza.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_DatosPoliza.setBounds(10, 170, 764, 345);
		panel.add(panel_DatosPoliza);
		panel_DatosPoliza.setLayout(null);
		
		JLabel lblDatosPolizaTitulo = new JLabel("Datos P\u00F3liza");
		lblDatosPolizaTitulo.setForeground(Color.BLACK);
		lblDatosPolizaTitulo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDatosPolizaTitulo.setBackground(Color.DARK_GRAY);
		lblDatosPolizaTitulo.setBounds(5, 5, 105, 20);
		panel_DatosPoliza.add(lblDatosPolizaTitulo);
		
		JLabel lblProvincia = new JLabel("Provincia:");
		lblProvincia.setBounds(5, 30, 64, 15);
		panel_DatosPoliza.add(lblProvincia);
		
		JLabel lblMarca = new JLabel("Marca: ");
		lblMarca.setBounds(5, 50, 64, 15);
		panel_DatosPoliza.add(lblMarca);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(270, 30, 64, 15);
		panel_DatosPoliza.add(lblLocalidad);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(270, 50, 64, 15);
		panel_DatosPoliza.add(lblModelo);
		
		JLabel lblSumaAsegurada = new JLabel("Suma asegurada:");
		lblSumaAsegurada.setBounds(5, 70, 105, 15);
		panel_DatosPoliza.add(lblSumaAsegurada);
		
		JLabel lblAo = new JLabel("A\u00F1o:");
		lblAo.setBounds(530, 50, 37, 15);
		panel_DatosPoliza.add(lblAo);
		
		JComboBox comboBoxProvincia = new JComboBox();
		comboBoxProvincia.setMaximumRowCount(6);
		comboBoxProvincia.setToolTipText("");
		comboBoxProvincia.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una provincia", "Santa Fe", "Entre Rios", "Buenos Aires", "C\u00F3rdoba"}));
		comboBoxProvincia.setSelectedIndex(0);
		comboBoxProvincia.setEditable(true);
		comboBoxProvincia.setBounds(90, 26, 170, 18);
		panel_DatosPoliza.add(comboBoxProvincia);
		
		JComboBox comboBoxMarca = new JComboBox();
		comboBoxMarca.setToolTipText("");
		comboBoxMarca.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una marca", "Volkswagen", "Chevrolet", "Mazda", "Nissan"}));
		comboBoxMarca.setSelectedIndex(0);
		comboBoxMarca.setMaximumRowCount(6);
		comboBoxMarca.setEditable(true);
		comboBoxMarca.setBounds(90, 46, 170, 18);
		panel_DatosPoliza.add(comboBoxMarca);
		
		JComboBox comboBoxLocalidad = new JComboBox();
		comboBoxLocalidad.setToolTipText("");
		comboBoxLocalidad.setModel(new DefaultComboBoxModel(new String[] {"Seleccione una localidad", "Santa Fe", "Col\u00E1stine", "Rincon", "Laguna Paiva"}));
		comboBoxLocalidad.setSelectedIndex(0);
		comboBoxLocalidad.setMaximumRowCount(6);
		comboBoxLocalidad.setEditable(true);
		comboBoxLocalidad.setBounds(340, 26, 170, 18);
		panel_DatosPoliza.add(comboBoxLocalidad);
		
		JComboBox comboBoxModelo = new JComboBox();
		comboBoxModelo.setToolTipText("");
		comboBoxModelo.setModel(new DefaultComboBoxModel(new String[] {"Seleccione un modelo", "Gol Trend", "Corsa", "MX-5", "GT-R"}));
		comboBoxModelo.setSelectedIndex(0);
		comboBoxModelo.setMaximumRowCount(6);
		comboBoxModelo.setEditable(true);
		comboBoxModelo.setBounds(340, 48, 170, 18);
		panel_DatosPoliza.add(comboBoxModelo);
		
		JSpinner spinnerAnio = new JSpinner();
		spinnerAnio.setModel(new SpinnerNumberModel(2019, 1980, 2019, 1));
		spinnerAnio.setBounds(560, 48, 60, 18);
		panel_DatosPoliza.add(spinnerAnio);
		
		JTextField textFieldSumaAsegurada = new JTextField();
		textFieldSumaAsegurada.setEditable(false);
		textFieldSumaAsegurada.setBounds(110, 65, 150, 20);
		panel_DatosPoliza.add(textFieldSumaAsegurada);
		textFieldSumaAsegurada.setColumns(10);
		
		JLabel lblPatente = new JLabel("Patente:");
		lblPatente.setBounds(5, 90, 64, 15);
		panel_DatosPoliza.add(lblPatente);
		
		JLabel lblChasis = new JLabel("Chasis: ");
		lblChasis.setBounds(5, 110, 64, 15);
		panel_DatosPoliza.add(lblChasis);
		
		JLabel lblKmsao = new JLabel("Kms/a\u00F1o:");
		lblKmsao.setBounds(270, 90, 64, 15);
		panel_DatosPoliza.add(lblKmsao);
		
		JLabel lblMotor = new JLabel("Motor:");
		lblMotor.setBounds(270, 110, 64, 15);
		panel_DatosPoliza.add(lblMotor);
		
		JSpinner spinnerKms = new JSpinner();
		spinnerKms.setModel(new SpinnerNumberModel(new Long(0), new Long(0), null, new Long(10000)));
		spinnerKms.setBounds(340, 88, 170, 18);
		panel_DatosPoliza.add(spinnerKms);
		
		JTextField txtFieldChasis = new JTextField();
		txtFieldChasis.setBounds(90, 106, 170, 18);
		panel_DatosPoliza.add(txtFieldChasis);
		txtFieldChasis.setColumns(10);
		
		JTextField textFieldMotor = new JTextField();
		textFieldMotor.setBounds(340, 110, 170, 18);
		panel_DatosPoliza.add(textFieldMotor);
		textFieldMotor.setColumns(10);
		
		JFormattedTextField formattedTextFieldPatente = new JFormattedTextField();
		formattedTextFieldPatente.setToolTipText("");
		formattedTextFieldPatente.setBounds(90, 86, 170, 18);
		panel_DatosPoliza.add(formattedTextFieldPatente);
		MaskFormatter mask = null;
		try {
			mask = new MaskFormatter("?? ### ??");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		mask.install(formattedTextFieldPatente);
		
		JLabel lblMedidasDeSeguridad = new JLabel("Medidas de seguridad:");
		lblMedidasDeSeguridad.setBounds(5, 140, 128, 18);
		panel_DatosPoliza.add(lblMedidasDeSeguridad);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u00BFSe guarda en garage?");
		chckbxNewCheckBox.setBounds(5, 160, 170, 18);
		panel_DatosPoliza.add(chckbxNewCheckBox);
		
		JCheckBox chckbxtieneAlarma = new JCheckBox("\u00BFTiene alarma?");
		chckbxtieneAlarma.setBounds(5, 180, 155, 18);
		panel_DatosPoliza.add(chckbxtieneAlarma);
		
		JCheckBox chckbxposeeDispositivoDe = new JCheckBox("\u00BFPosee dispositivo de rastreo vehicular?");
		chckbxposeeDispositivoDe.setBounds(5, 200, 265, 18);
		panel_DatosPoliza.add(chckbxposeeDispositivoDe);
		
		JCheckBox chckbxposeeTuercasAntirrobo = new JCheckBox("\u00BFPosee tuercas antirrobo en las cuatro ruedas?");
		chckbxposeeTuercasAntirrobo.setBounds(5, 220, 310, 18);
		panel_DatosPoliza.add(chckbxposeeTuercasAntirrobo);
		
		JLabel lblNumeroDeSiniestros = new JLabel("Numero de siniestros en el ultimo a\u00F1o:");
		lblNumeroDeSiniestros.setBounds(340, 140, 194, 18);
		panel_DatosPoliza.add(lblNumeroDeSiniestros);
		
		JRadioButton rdbtnNinguno = new JRadioButton("Ninguno");
		rdbtnNinguno.setSelected(true);
		rdbtnNinguno.setBounds(340, 160, 109, 18);
		panel_DatosPoliza.add(rdbtnNinguno);
		
		JRadioButton rdbtnUno = new JRadioButton("Uno");
		rdbtnUno.setBounds(340, 180, 109, 18);
		panel_DatosPoliza.add(rdbtnUno);
		
		JRadioButton rdbtnDos = new JRadioButton("Dos");
		rdbtnDos.setBounds(340, 200, 109, 18);
		panel_DatosPoliza.add(rdbtnDos);
		
		JRadioButton rdbtnTresOMs = new JRadioButton("Tres o m\u00E1s");
		rdbtnTresOMs.setBounds(340, 220, 109, 18);
		panel_DatosPoliza.add(rdbtnTresOMs);
		
		ButtonGroup buttonGroupSiniestros = new ButtonGroup();
		buttonGroupSiniestros.add(rdbtnNinguno);
		buttonGroupSiniestros.add(rdbtnUno);
		buttonGroupSiniestros.add(rdbtnDos);
		buttonGroupSiniestros.add(rdbtnTresOMs);
		
		JLabel lblposeeHijosEntre = new JLabel("\u00BFPosee hijos entre 18 y 30 a\u00F1os?");
		lblposeeHijosEntre.setBounds(5, 250, 200, 18);
		panel_DatosPoliza.add(lblposeeHijosEntre);
		
		JRadioButton rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setBounds(200, 250, 50, 18);
		panel_DatosPoliza.add(rdbtnSi);
		
		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setSelected(true);
		rdbtnNo.setBounds(270, 250, 50, 18);
		panel_DatosPoliza.add(rdbtnNo);
		
		JLabel lblIndiqueCantidadDe = new JLabel("Indique cantidad de hijos:");
		lblIndiqueCantidadDe.setBounds(5, 270, 200, 18);
		panel_DatosPoliza.add(lblIndiqueCantidadDe);
		
		JSpinner spinnerCantHijos = new JSpinner();
		spinnerCantHijos.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spinnerCantHijos.setEnabled(false);
		spinnerCantHijos.setBounds(200, 270, 40, 18);
		panel_DatosPoliza.add(spinnerCantHijos);
		
		
		ButtonGroup buttonGruopHijos = new ButtonGroup();
		buttonGruopHijos.add(rdbtnSi);
		buttonGruopHijos.add(rdbtnNo);		
		rdbtnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spinnerCantHijos.setEnabled(true);
			}
		});
		rdbtnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spinnerCantHijos.setValue(1);
				spinnerCantHijos.setEnabled(false);
			}
		});
		
		JButton btnAtrasPAG = new JButton("Atrás");
		btnAtrasPAG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Desea volver atrás?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					BuscarCliente buscarCliente = new BuscarCliente();
					buscarCliente.setVisible(true);
					dispose();
				}
			}
		});
		btnAtrasPAG.setBounds(110, 526, 70, 25);
		panel.add(btnAtrasPAG);
		
		JButton btnCancelarPAG = new JButton("Cancelar");
		btnCancelarPAG.setBounds(10, 526, 90, 25);
		btnCancelarPAG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int input = JOptionPane.showConfirmDialog(null, "Desea cancelar la transacción?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					MenuProductorSeguro menuProductorSeguro = new MenuProductorSeguro();
					menuProductorSeguro.setVisible(true);
					dispose();
				}
			}
		});
		panel.add(btnCancelarPAG);
		
		JButton btnConfirmarPAG = new JButton("Siguiente");
		btnConfirmarPAG.setBounds(674, 526, 100, 25);
		btnConfirmarPAG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnSi.isSelected()) {
					AgregarHijos agregarHijos = new AgregarHijos((int) spinnerCantHijos.getValue());
					agregarHijos.setVisible(true);
					dispose();
				} else {
					Cobertura cobertura = new Cobertura();
					cobertura.setVisible(true);
					dispose();
				}
			}
		});
		panel.add(btnConfirmarPAG);
	}
}
