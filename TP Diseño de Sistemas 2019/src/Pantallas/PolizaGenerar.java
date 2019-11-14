package Pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.ArrayList;

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

import BDD.FachadaBDD;
import DTO.ClienteDTO;
import DTO.PolizaDTO;
import Entidades.*;
import Logica.FachadaPoliza;

public class PolizaGenerar extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public PolizaGenerar(ClienteDTO clienteDTO) {
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
		textFieldNumeroCliente.setBounds(145, 26, 400, 18);
		panel_DatosCliente.add(textFieldNumeroCliente);
		textFieldNumeroCliente.setText(clienteDTO.getNroCliente());
		textFieldNumeroCliente.setColumns(10);
		
		JTextField textFieldNombreCliente = new JTextField();
		textFieldNombreCliente.setEditable(false);
		textFieldNombreCliente.setColumns(10);
		textFieldNombreCliente.setBounds(145, 46, 400, 18);
		textFieldNombreCliente.setText(clienteDTO.getNombre());
		panel_DatosCliente.add(textFieldNombreCliente);
		
		JTextField textFieldNumeroDoc = new JTextField();
		textFieldNumeroDoc.setEditable(false);
		textFieldNumeroDoc.setColumns(10);
		textFieldNumeroDoc.setBounds(145, 106, 400, 18);
		textFieldNumeroDoc.setText(clienteDTO.getNroDocumento());
		panel_DatosCliente.add(textFieldNumeroDoc);
		
		JTextField textFieldApellidoCliente = new JTextField();
		textFieldApellidoCliente.setEditable(false);
		textFieldApellidoCliente.setColumns(10);
		textFieldApellidoCliente.setBounds(145, 66, 400, 18);
		textFieldApellidoCliente.setText(clienteDTO.getApellido());
		panel_DatosCliente.add(textFieldApellidoCliente);
		
		JTextField textFieldTipoDoc = new JTextField();
		textFieldTipoDoc.setEditable(false);
		textFieldTipoDoc.setColumns(10);
		textFieldTipoDoc.setBounds(145, 86, 400, 18);
		textFieldTipoDoc.setText(clienteDTO.getTipoDocumento().toString());
		panel_DatosCliente.add(textFieldTipoDoc);
		
		JTextField textFieldDomicilio = new JTextField();
		textFieldDomicilio.setEditable(false);
		textFieldDomicilio.setColumns(10);
		textFieldDomicilio.setBounds(145, 126, 400, 18);
		textFieldDomicilio.setText(clienteDTO.getDireccionDTO().mostrarDomicilio());
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
		lblProvincia.setBounds(270, 30, 64, 15);
		panel_DatosPoliza.add(lblProvincia);
		
		JLabel lblMarca = new JLabel("Marca: ");
		lblMarca.setBounds(5, 50, 64, 15);
		panel_DatosPoliza.add(lblMarca);
		
		JLabel lblLocalidad = new JLabel("Localidad:");
		lblLocalidad.setBounds(520, 30, 64, 15);
		panel_DatosPoliza.add(lblLocalidad);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(270, 50, 64, 15);
		panel_DatosPoliza.add(lblModelo);
		
		JLabel lblSumaAsegurada = new JLabel("Suma asegurada:");
		lblSumaAsegurada.setBounds(5, 70, 105, 15);
		panel_DatosPoliza.add(lblSumaAsegurada);
		
		JLabel lblAo = new JLabel("A\u00F1o:");
		lblAo.setBounds(520, 50, 37, 15);
		panel_DatosPoliza.add(lblAo);
		
		FachadaBDD fachadaBDD = new FachadaBDD();
		ArrayList<Provincia> provincias = (ArrayList<Provincia>) fachadaBDD.getProvincias();

		String[] listaProvincias = new String[provincias.size()+1];
 		listaProvincias[0]="Seleccione una provincia";
 		int cont=1;
 		for(Provincia p:provincias) {
 			listaProvincias[cont]=p.getNombre();
 			cont++;
 		}
		
		JComboBox comboBoxProvincia = new JComboBox();

		comboBoxProvincia.setMaximumRowCount(6);
		comboBoxProvincia.setToolTipText("");
		comboBoxProvincia.setModel(new DefaultComboBoxModel(listaProvincias));
		comboBoxProvincia.setSelectedIndex(0);
		comboBoxProvincia.setEditable(true);
		comboBoxProvincia.setBounds(340, 28, 170, 18);
		panel_DatosPoliza.add(comboBoxProvincia);
		
		ArrayList<Marca> marcas = (ArrayList<Marca>) fachadaBDD.getMarcas();
		String[] listaMarcas = new String[marcas.size()+1];
 		listaMarcas[0]="Seleccione una marca";
 		cont=1;
 		for(Marca m:marcas) {
 			listaMarcas[cont]=m.getMarca();
 			cont++;
 		}
		
		JComboBox comboBoxMarca = new JComboBox();
		comboBoxMarca.setToolTipText("");
		comboBoxMarca.setModel(new DefaultComboBoxModel(listaMarcas));
		comboBoxMarca.setSelectedIndex(0);
		comboBoxMarca.setMaximumRowCount(6);
		comboBoxMarca.setEditable(true);
		comboBoxMarca.setBounds(90, 46, 170, 18);
		panel_DatosPoliza.add(comboBoxMarca);
		
		ArrayList<Localidad> localidades = (ArrayList<Localidad>) fachadaBDD.getLocalidades();
		String[] listaLocalidades = new String[localidades.size()+1];
 		listaLocalidades[0]="Seleccione una localidad";
 		cont=1;
 		for(Localidad l:localidades) {
 			listaLocalidades[cont]=l.getNombre();
 			cont++;
 		}
		/*if(comboBoxProvincia.getSelectedItem()!=null) {
		ArrayList<Localidad> localidadesProv = new ArrayList<Localidad>();
		String provSeleccionada = (String) comboBoxProvincia.getSelectedItem();
		if(!provSeleccionada.isBlank()) {
		for(Localidad loc:localidades){
		if(!loc.getProvincia().getNombre().isEmpty()) {
			if(loc.getProvincia().getNombre().compareTo(provSeleccionada)==0) {
			localidadesProv.add(loc);
		}}
		}
		
 		}
		}*/
 		
		JComboBox<String> comboBoxLocalidad = new JComboBox<String>();
		comboBoxLocalidad.setToolTipText("");
		comboBoxLocalidad.setModel(new DefaultComboBoxModel<String>(listaLocalidades));
		comboBoxLocalidad.setSelectedIndex(0);
		comboBoxLocalidad.setMaximumRowCount(6);
		comboBoxLocalidad.setEditable(true);
		comboBoxLocalidad.setBounds(584, 28, 170, 18);
		panel_DatosPoliza.add(comboBoxLocalidad);
		comboBoxLocalidad.setEnabled(false);
		comboBoxProvincia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxProvincia.getSelectedItem()==null || comboBoxProvincia.getSelectedItem().toString().compareTo("Seleccione una provincia")==0) {
					comboBoxLocalidad.setEnabled(false);
				}else {
					comboBoxLocalidad.setEnabled(true);
				}
			}
		});
		
		ArrayList<Modelo> modelos = (ArrayList<Modelo>) fachadaBDD.getModelos();
		String[] listaModelos = new String[modelos.size()+1];
 		listaModelos[0]="Seleccione un modelo";
 		cont=1;
 		for(Modelo m:modelos) {
 			listaModelos[cont]=m.getNombre();
 			cont++;
 		}
 		
		JComboBox comboBoxModelo = new JComboBox();
		comboBoxModelo.setToolTipText("");
		comboBoxModelo.setModel(new DefaultComboBoxModel(listaModelos));
		comboBoxModelo.setSelectedIndex(0);
		comboBoxModelo.setMaximumRowCount(6);
		comboBoxModelo.setEditable(true);
		comboBoxModelo.setBounds(340, 48, 170, 18);
		panel_DatosPoliza.add(comboBoxModelo);
		comboBoxModelo.setEnabled(false);
		comboBoxMarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxMarca.getSelectedItem()==null || comboBoxMarca.getSelectedItem().toString().compareTo("Seleccione una marca")==0) {
					comboBoxModelo.setEnabled(false);
				}else {
					comboBoxModelo.setEnabled(true);
				}
			}
		});
		
		ArrayList<Pais> paises = (ArrayList<Pais>) fachadaBDD.getPaises();
		String[] listaPaises = new String[paises.size()+1];
 		listaPaises[0]="Seleccione un pais";
 		cont=1;
 		for(Pais p:paises) {
 			listaPaises[cont]=p.getNombre();
 			cont++;
 		}
 		comboBoxProvincia.setEnabled(false);
		JComboBox comboBoxPais = new JComboBox();
		comboBoxPais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxPais.getSelectedItem()==null || comboBoxPais.getSelectedItem().toString().compareTo("Seleccione un pais")==0) {
					comboBoxProvincia.setEnabled(false);
				}else {
					comboBoxProvincia.setEnabled(true);
				}
			}
		});
		comboBoxPais.setToolTipText("");
		comboBoxPais.setModel(new DefaultComboBoxModel(listaPaises));
		comboBoxPais.setSelectedIndex(0);
		comboBoxPais.setMaximumRowCount(6);
		comboBoxPais.setEditable(true);
		comboBoxPais.setBounds(90, 27, 170, 18);
		panel_DatosPoliza.add(comboBoxPais);
		
		ArrayList<Anio> anios = (ArrayList<Anio>) fachadaBDD.getAnios();
		String[] listaAnios = new String[anios.size()+1];
 		listaAnios[0]="Seleccione un año";
 		cont=1;
 		for(Anio a:anios) {
 			listaAnios[cont]=String.valueOf(a.getAnio());
 			cont++;
 		}
 		
		System.out.println(provincias);
		System.out.println(marcas);
		System.out.println(localidades);
		System.out.println(modelos);
		System.out.println(paises);
		System.out.println(anios);
		System.out.println(clienteDTO);
		
		JComboBox comboBoxAnioModelo = new JComboBox();
		comboBoxAnioModelo.setToolTipText("");
		comboBoxAnioModelo.setModel(new DefaultComboBoxModel(listaAnios));
		comboBoxAnioModelo.setSelectedIndex(0);
		comboBoxAnioModelo.setMaximumRowCount(6);
		comboBoxAnioModelo.setEditable(true);
		comboBoxAnioModelo.setBounds(584, 47, 170, 18);
		panel_DatosPoliza.add(comboBoxAnioModelo);
		comboBoxAnioModelo.setEnabled(false);
		comboBoxModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(comboBoxModelo.getSelectedItem()==null || comboBoxModelo.getSelectedItem().toString().compareTo("Seleccione un modelo")==0) {
					comboBoxAnioModelo.setEnabled(false);
				}else {
					comboBoxAnioModelo.setEnabled(true);
				}
			}
		});
		
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
		spinnerKms.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(10000)));
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
		rdbtnNinguno.setEnabled(false);
		panel_DatosPoliza.add(rdbtnNinguno);
		
		JRadioButton rdbtnUno = new JRadioButton("Uno");
		rdbtnUno.setBounds(340, 180, 109, 18);
		rdbtnUno.setEnabled(false);
		panel_DatosPoliza.add(rdbtnUno);
		
		JRadioButton rdbtnDos = new JRadioButton("Dos");
		rdbtnDos.setBounds(340, 200, 109, 18);
		rdbtnDos.setEnabled(false);
		panel_DatosPoliza.add(rdbtnDos);
		
		JRadioButton rdbtnTresOMs = new JRadioButton("Tres o m\u00E1s");
		rdbtnTresOMs.setBounds(340, 220, 109, 18);
		rdbtnTresOMs.setEnabled(false);
		panel_DatosPoliza.add(rdbtnTresOMs);
		
		ButtonGroup buttonGroupSiniestros = new ButtonGroup();
		buttonGroupSiniestros.add(rdbtnNinguno);
		buttonGroupSiniestros.add(rdbtnUno);
		buttonGroupSiniestros.add(rdbtnDos);
		buttonGroupSiniestros.add(rdbtnTresOMs);
		rdbtnTresOMs.setEnabled(false);
		
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
		
		JLabel lblPais = new JLabel("Pa\u00EDs ");
		lblPais.setBounds(5, 30, 64, 15);
		panel_DatosPoliza.add(lblPais);
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
				
				String pais = (String) comboBoxPais.getSelectedItem();
				String prov = (String) comboBoxProvincia.getSelectedItem();
				String loc = (String) comboBoxLocalidad.getSelectedItem();
				int idLocalidad = comboBoxLocalidad.getSelectedIndex();
				
				Localidad localidadPoliza = localidades.get(idLocalidad-1);
				
				String marca = (String) comboBoxMarca.getSelectedItem();
				String modelo = (String) comboBoxModelo.getSelectedItem();
				String txAnioModelo = (String) comboBoxAnioModelo.getSelectedItem();
				int anioModelo = comboBoxAnioModelo.getSelectedIndex();
				
				Anio anioPoliza = anios.get(anioModelo-1);
				
				String patente = formattedTextFieldPatente.getText();
				String chasis = txtFieldChasis.getText();
				String motor = textFieldMotor.getText();
				int kmAnio = (int) spinnerKms.getValue(); 
				boolean garage = chckbxNewCheckBox.isSelected();
				boolean alarma = chckbxtieneAlarma.isSelected();
				boolean dispRastreo = chckbxposeeDispositivoDe.isSelected();
				boolean tuercasAntirrobo = chckbxposeeTuercasAntirrobo.isSelected();
				
				int nroSiniestros = fachadaBDD.getNroSiniestros(clienteDTO);
				
				PolizaDTO polDTO = FachadaPoliza.getInstance().ingresarDatos(localidadPoliza,anioPoliza,patente,chasis,motor,kmAnio,
						garage,alarma,dispRastreo,tuercasAntirrobo,nroSiniestros,clienteDTO);
				
				System.out.println(polDTO);
				
				if (rdbtnSi.isSelected()) {
					AgregarHijos agregarHijos = new AgregarHijos(polDTO, clienteDTO, (int) spinnerCantHijos.getValue());
					agregarHijos.setVisible(true);
					dispose();
				}else {
					Cobertura cobertura = new Cobertura(polDTO, clienteDTO);
					cobertura.setVisible(true);
					dispose();
				}
			}
		});
		panel.add(btnConfirmarPAG);
	}
}
