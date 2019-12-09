package Pantallas;

import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.text.MaskFormatter;
import BDD.FachadaBDD;
import BDD.GestorBDD;
import DTO.ClienteDTO;
import DTO.HijoDTO;
import DTO.MedidasSeguridadDTO;
import DTO.PolizaDTO;
import Entidades.*;
import Logica.FachadaPoliza;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PolizaGenerar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ArrayList<Pais> paises = new ArrayList<>();
	private String[] listaPaises = {"Seleccione un pais"};
	private ArrayList<Provincia> provincias = new ArrayList<>();
	private String[] listaProvincias= {"Seleccione una provincia"};
	private ArrayList<Localidad> localidades = new ArrayList<>();
	private String[] listaLocalidades= {"Seleccione una localidad"};
	private ArrayList<Marca> marcas = new ArrayList<>();
	private String[] listaMarcas= {"Seleccione una marca"};
	private ArrayList<Modelo> modelos = new ArrayList<>();
	private String[] listaModelos= {"Seleccione un modelo"};
	private ArrayList<Anio> anios = new ArrayList<>();
	private String[] listaAnios = {"Seleccione un año"};
	private JTextField tfChasis;
	private JTextField tfMotor;
	private JFormattedTextField tfPatente;
	private JSpinner spinnerKms;
	private JComboBox<String> comboBoxPais;
	private JComboBox<String> comboBoxProvincia;
	private JComboBox<String> comboBoxLocalidad;
	private JComboBox<String> comboBoxMarca;
	private JComboBox<String> comboBoxModelo;
	private JComboBox<String> comboBoxAnio;
	private JButton btnConfirmar;
	private MaskFormatter mask1;
	private MaskFormatter mask2;
	
	public PolizaGenerar(ClienteDTO clienteDTO, PolizaDTO polDTO) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 784, 561);
		contentPane.add(panel);
		panel.setLayout(null);
		
		btnConfirmar = new JButton("Confirmar");
		btnConfirmar.setBounds(674, 526, 100, 25);
		btnConfirmar.setEnabled(false);
		panel.add(btnConfirmar);
		
		JPanel panel_DatosCliente = new JPanel();
		panel_DatosCliente.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_DatosCliente.setBounds(10, 11, 764, 150);
		panel.add(panel_DatosCliente);
		panel_DatosCliente.setLayout(null);
		
		JLabel lblDatosCliente = new JLabel("Datos Cliente");
		lblDatosCliente.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDatosCliente.setForeground(Color.BLACK);
		lblDatosCliente.setBackground(Color.DARK_GRAY);
		lblDatosCliente.setBounds(5, 5, 105, 20);
		panel_DatosCliente.add(lblDatosCliente);
		
		JLabel lblNroCliente = new JLabel("N\u00FAmero de cliente:");
		lblNroCliente.setBounds(5, 30, 118, 15);
		panel_DatosCliente.add(lblNroCliente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(5, 50, 57, 15);
		panel_DatosCliente.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(5, 70, 57, 15);
		panel_DatosCliente.add(lblApellido);
		
		JLabel lblTipoDocumento = new JLabel("Tipo documento:");
		lblTipoDocumento.setBounds(5, 90, 94, 15);
		panel_DatosCliente.add(lblTipoDocumento);
		
		JLabel lblNroDocumento = new JLabel("N\u00FAmero de documento:");
		lblNroDocumento.setBounds(5, 110, 138, 15);
		panel_DatosCliente.add(lblNroDocumento);
		
		JLabel lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setBounds(5, 130, 57, 15);
		panel_DatosCliente.add(lblDomicilio);
		
		JTextField tfNumeroCliente = new JTextField();
		tfNumeroCliente.setEditable(false);
		tfNumeroCliente.setBounds(145, 26, 400, 18);
		panel_DatosCliente.add(tfNumeroCliente);
		tfNumeroCliente.setText(clienteDTO.getNroCliente());
		tfNumeroCliente.setColumns(10);
		
		JTextField tfNombreCliente = new JTextField();
		tfNombreCliente.setEditable(false);
		tfNombreCliente.setColumns(10);
		tfNombreCliente.setBounds(145, 46, 400, 18);
		tfNombreCliente.setText(clienteDTO.getNombre());
		panel_DatosCliente.add(tfNombreCliente);
		
		JTextField tfNroDocumento = new JTextField();
		tfNroDocumento.setEditable(false);
		tfNroDocumento.setColumns(10);
		tfNroDocumento.setBounds(145, 106, 400, 18);
		tfNroDocumento.setText(clienteDTO.getNroDocumento());
		panel_DatosCliente.add(tfNroDocumento);
		
		JTextField tfApellidoCliente = new JTextField();
		tfApellidoCliente.setEditable(false);
		tfApellidoCliente.setColumns(10);
		tfApellidoCliente.setBounds(145, 66, 400, 18);
		tfApellidoCliente.setText(clienteDTO.getApellido());
		panel_DatosCliente.add(tfApellidoCliente);
		
		JTextField tfTipoDocumento = new JTextField();
		tfTipoDocumento.setEditable(false);
		tfTipoDocumento.setColumns(10);
		tfTipoDocumento.setBounds(145, 86, 400, 18);
		tfTipoDocumento.setText(clienteDTO.getTipoDocumento().toString());
		panel_DatosCliente.add(tfTipoDocumento);
		
		JTextField tfDomicilio = new JTextField();
		tfDomicilio.setEditable(false);
		tfDomicilio.setColumns(10);
		tfDomicilio.setBounds(145, 126, 400, 18);
		tfDomicilio.setText(clienteDTO.getDireccionDTO().mostrarDomicilio());
		panel_DatosCliente.add(tfDomicilio);
		
		JPanel panel_DatosPoliza = new JPanel();
		panel_DatosPoliza.setToolTipText("");
		panel_DatosPoliza.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_DatosPoliza.setBounds(10, 170, 764, 345);
		panel.add(panel_DatosPoliza);
		panel_DatosPoliza.setLayout(null);
		
		JLabel lblDatosPoliza = new JLabel("Datos P\u00F3liza");
		lblDatosPoliza.setForeground(Color.BLACK);
		lblDatosPoliza.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDatosPoliza.setBackground(Color.DARK_GRAY);
		lblDatosPoliza.setBounds(5, 5, 105, 20);
		panel_DatosPoliza.add(lblDatosPoliza);
		
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
		lblSumaAsegurada.setBounds(5, 70, 84, 15);
		panel_DatosPoliza.add(lblSumaAsegurada);
		
		JLabel lblAnio = new JLabel("A\u00F1o:");
		lblAnio.setBounds(520, 50, 37, 15);
		panel_DatosPoliza.add(lblAnio);
		
		
		JTextField tfSumaAsegurada = new JTextField();
		tfSumaAsegurada.setText(String.valueOf((FachadaBDD.getInstance().getSumaAsegurada())));
		tfSumaAsegurada.setEditable(false);
		tfSumaAsegurada.setBounds(90, 65, 170, 20);
		panel_DatosPoliza.add(tfSumaAsegurada);
		tfSumaAsegurada.setColumns(10);
		
		JLabel lblPatente = new JLabel("Patente:");
		lblPatente.setBounds(5, 110, 64, 15);
		panel_DatosPoliza.add(lblPatente);
		
		JLabel lblChasis = new JLabel("Chasis: ");
		lblChasis.setBounds(270, 90, 64, 15);
		panel_DatosPoliza.add(lblChasis);
		
		JLabel lblKms = new JLabel("Kms/a\u00F1o:");
		lblKms.setBounds(520, 90, 64, 15);
		panel_DatosPoliza.add(lblKms);
		
		JLabel lblMotor = new JLabel("Motor:");
		lblMotor.setBounds(270, 110, 64, 15);
		panel_DatosPoliza.add(lblMotor);
		
		spinnerKms = new JSpinner();
		spinnerKms.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), new Integer(1000000), new Integer(10000)));
		spinnerKms.setBounds(584, 88, 170, 18);
		panel_DatosPoliza.add(spinnerKms);
		((DefaultEditor) spinnerKms.getEditor()).getTextField().setEditable(false);
		
		tfChasis = new JTextField();
		tfChasis.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				desbloquearConfirmar();
			}
		});
		tfChasis.setBounds(340, 88, 170, 18);
		panel_DatosPoliza.add(tfChasis);
		tfChasis.setColumns(10);
		
		tfMotor = new JTextField();
		tfMotor.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				desbloquearConfirmar();
			}
		});
		tfMotor.setBounds(340, 110, 170, 18);
		panel_DatosPoliza.add(tfMotor);
		tfMotor.setColumns(10);
		
		tfPatente = new JFormattedTextField();
		tfPatente.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				desbloquearConfirmar();
			}
		});
		tfPatente.setToolTipText("");
		tfPatente.setBounds(90, 108, 170, 18);
		panel_DatosPoliza.add(tfPatente);
		try {
			mask1 = new MaskFormatter("?? ### ??");
			mask2 = new MaskFormatter("??? ###");
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		mask1.install(tfPatente);
		//mask2.install(tfPatente);
		
		JLabel lblMedidasDeSeguridad = new JLabel("Medidas de seguridad:");
		lblMedidasDeSeguridad.setBounds(5, 140, 128, 18);
		panel_DatosPoliza.add(lblMedidasDeSeguridad);
		
		JCheckBox cbGarage = new JCheckBox("\u00BFSe guarda en garage?");
		cbGarage.setBounds(5, 160, 170, 18);
		panel_DatosPoliza.add(cbGarage);
		
		JCheckBox cbAlarma = new JCheckBox("\u00BFTiene alarma?");
		cbAlarma.setBounds(5, 180, 155, 18);
		panel_DatosPoliza.add(cbAlarma);
		
		JCheckBox cbRastreo = new JCheckBox("\u00BFPosee dispositivo de rastreo vehicular?");
		cbRastreo.setBounds(5, 200, 265, 18);
		panel_DatosPoliza.add(cbRastreo);
		
		JCheckBox cbTuercas = new JCheckBox("\u00BFPosee tuercas antirrobo en las cuatro ruedas?");
		cbTuercas.setBounds(5, 220, 310, 18);
		panel_DatosPoliza.add(cbTuercas);
		
		JLabel lblNumeroDeSiniestros = new JLabel("Numero de siniestros en el ultimo a\u00F1o:");
		lblNumeroDeSiniestros.setBounds(340, 140, 210, 18);
		panel_DatosPoliza.add(lblNumeroDeSiniestros);
		
		JRadioButton rbNinguno = new JRadioButton("Ninguno");
		rbNinguno.setSelected(true);
		rbNinguno.setBounds(340, 160, 109, 18);
		rbNinguno.setEnabled(false);
		panel_DatosPoliza.add(rbNinguno);
		
		JRadioButton rbUno = new JRadioButton("Uno");
		rbUno.setBounds(340, 180, 109, 18);
		rbUno.setEnabled(false);
		panel_DatosPoliza.add(rbUno);
		
		JRadioButton rbDos = new JRadioButton("Dos");
		rbDos.setBounds(340, 200, 109, 18);
		rbDos.setEnabled(false);
		panel_DatosPoliza.add(rbDos);
		
		JRadioButton rbTres = new JRadioButton("Tres o m\u00E1s");
		rbTres.setBounds(340, 220, 109, 18);
		rbTres.setEnabled(false);
		panel_DatosPoliza.add(rbTres);
		
		ButtonGroup buttonGroupSiniestros = new ButtonGroup();
		buttonGroupSiniestros.add(rbNinguno);
		buttonGroupSiniestros.add(rbUno);
		buttonGroupSiniestros.add(rbDos);
		buttonGroupSiniestros.add(rbTres);
		rbTres.setEnabled(false);
		
		JLabel lblPoseeHijos = new JLabel("\u00BFPosee hijos entre 18 y 30 a\u00F1os?");
		lblPoseeHijos.setBounds(5, 250, 200, 18);
		panel_DatosPoliza.add(lblPoseeHijos);
		
		JRadioButton rbSi = new JRadioButton("Si");
		rbSi.setBounds(200, 250, 50, 18);
		panel_DatosPoliza.add(rbSi);
		
		JRadioButton rbNo = new JRadioButton("No");
		rbNo.setSelected(true);
		rbNo.setBounds(270, 250, 50, 18);
		panel_DatosPoliza.add(rbNo);
		
		JLabel lblIndiqueCantidad = new JLabel("Indique cantidad de hijos:");
		lblIndiqueCantidad.setBounds(5, 270, 200, 18);
		panel_DatosPoliza.add(lblIndiqueCantidad);
		
		JLabel lblPais = new JLabel("Pa\u00EDs ");
		lblPais.setBounds(5, 30, 64, 15);
		panel_DatosPoliza.add(lblPais);
		
		paises = (ArrayList<Pais>) FachadaBDD.getInstance().getPaises();
		listaPaises = new String[paises.size()+1];
 		listaPaises[0]="Seleccione un pais";
 		int cont=1;
 		for(Pais p:paises) {
 			listaPaises[cont]=p.getNombre();
 			cont++;
 		}
 		
 		comboBoxPais = new JComboBox<String>();
 		comboBoxPais.setToolTipText("");
		comboBoxPais.setModel(new DefaultComboBoxModel<String>(listaPaises));
		comboBoxPais.setEnabled(false);
		comboBoxPais.setSelectedIndex(1);
		comboBoxPais.setEditable(true);
		comboBoxPais.setBounds(90, 27, 170, 18);
		panel_DatosPoliza.add(comboBoxPais);
				
		comboBoxProvincia = new JComboBox<String>();
		comboBoxProvincia.setMaximumRowCount(6);
		comboBoxProvincia.setToolTipText("");
		comboBoxProvincia.setModel(new DefaultComboBoxModel<String>(listaProvincias));
		comboBoxProvincia.setSelectedIndex(0);
		comboBoxProvincia.setEditable(true);
		comboBoxProvincia.setBounds(340, 28, 170, 18);
		panel_DatosPoliza.add(comboBoxProvincia);

		cont=1;	
		
		provincias = (ArrayList<Provincia>) FachadaBDD.getInstance().getProvincias(comboBoxPais.getSelectedIndex());		
		listaProvincias = new String[provincias.size()+1];
 		
		for(Provincia p:provincias) {
 			listaProvincias[cont]=p.getNombre();
 			cont++;
 		}
		listaProvincias[0]="Seleccione una Provincia";
		comboBoxProvincia.setModel(new DefaultComboBoxModel<String>(listaProvincias));
		comboBoxProvincia.setEnabled(true);

		comboBoxLocalidad = new JComboBox<String>();
		comboBoxLocalidad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				desbloquearConfirmar();
			}
		});
		comboBoxLocalidad.setToolTipText("");
		comboBoxLocalidad.setModel(new DefaultComboBoxModel<String>(listaLocalidades));
		comboBoxLocalidad.setSelectedIndex(0);
		comboBoxLocalidad.setMaximumRowCount(6);
		comboBoxLocalidad.setEditable(true);
		comboBoxLocalidad.setBounds(584, 28, 170, 18);
		panel_DatosPoliza.add(comboBoxLocalidad);
		comboBoxLocalidad.setEnabled(false);

		marcas = (ArrayList<Marca>) FachadaBDD.getInstance().getMarcas();
		listaMarcas = new String[marcas.size()+1];
 		listaMarcas[0]="Seleccione una marca";
 		cont=1;
 		for(Marca m:marcas) {
 			listaMarcas[cont]=m.getMarca();
 			cont++;
 		}
 		
		comboBoxMarca = new JComboBox<String>();
		comboBoxMarca.setToolTipText("");
		comboBoxMarca.setModel(new DefaultComboBoxModel<String>(listaMarcas));
		comboBoxMarca.setSelectedIndex(0);
		comboBoxMarca.setMaximumRowCount(6);
		comboBoxMarca.setEditable(true);
		comboBoxMarca.setBounds(90, 46, 170, 18);
		panel_DatosPoliza.add(comboBoxMarca);
		//comboBoxProvincia.setEnabled(false);
 		
		comboBoxModelo = new JComboBox<String>();
 		//listaModelos={"Seleccione una Marca"};
		comboBoxModelo.setToolTipText("");
		comboBoxModelo.setModel(new DefaultComboBoxModel<String>(listaModelos));
		comboBoxModelo.setSelectedIndex(0);
		comboBoxModelo.setMaximumRowCount(6);
		comboBoxModelo.setEditable(true);
		comboBoxModelo.setBounds(340, 48, 170, 18);
		panel_DatosPoliza.add(comboBoxModelo);
		comboBoxModelo.setEnabled(false);
 		
 		comboBoxAnio = new JComboBox<String>();
 		comboBoxAnio.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				desbloquearConfirmar();	
 			}
 		});
		comboBoxAnio.setToolTipText("");
		comboBoxAnio.setModel(new DefaultComboBoxModel<String>(listaAnios));
		comboBoxAnio.setSelectedIndex(0);
		comboBoxAnio.setMaximumRowCount(6);
		comboBoxAnio.setEditable(true);
		comboBoxAnio.setBounds(584, 47, 170, 18);
		panel_DatosPoliza.add(comboBoxAnio);
		comboBoxAnio.setEnabled(false);

		comboBoxPais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				comboBoxProvincia.setEnabled(false);
				comboBoxProvincia.setModel(new DefaultComboBoxModel<String>(listaProvincias));
				comboBoxLocalidad.setEnabled(false);
				comboBoxLocalidad.setModel(new DefaultComboBoxModel<String>(listaLocalidades));

				if(comboBoxPais.getSelectedItem()==null || comboBoxPais.getSelectedItem().toString().compareTo("Seleccione un pais")==0) {
					comboBoxProvincia.setEnabled(false);
					comboBoxLocalidad.setEnabled(false);
					comboBoxProvincia.setModel(new DefaultComboBoxModel<String>(listaProvincias));
					comboBoxLocalidad.setModel(new DefaultComboBoxModel<String>(listaLocalidades));
				}else {
					int cont=1;	
					
					provincias = (ArrayList<Provincia>) FachadaBDD.getInstance().getProvincias(comboBoxPais.getSelectedIndex());		
					listaProvincias = new String[provincias.size()+1];
			 		
					for(Provincia p:provincias) {
			 			listaProvincias[cont]=p.getNombre();
			 			cont++;
			 		}
					listaProvincias[0]="Seleccione una Provincia";
					comboBoxProvincia.setModel(new DefaultComboBoxModel<String>(listaProvincias));
					comboBoxProvincia.setEnabled(true);
				}
				desbloquearConfirmar();
			}
		});
		
		comboBoxProvincia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxLocalidad.setEnabled(false);
				comboBoxLocalidad.setModel(new DefaultComboBoxModel<String>(listaLocalidades));
				if(comboBoxProvincia.getSelectedItem()==null || comboBoxProvincia.getSelectedItem().toString().compareTo("Seleccione una provincia")==0 )
				{
					comboBoxLocalidad.setEnabled(false);
					comboBoxLocalidad.setModel(new DefaultComboBoxModel<String>(listaLocalidades));
				}else {
					
					int cont=1;
					int idProvincia =  provincias.get(comboBoxProvincia.getSelectedIndex()-1).getIdProvincia();
					localidades = (ArrayList<Localidad>) FachadaBDD.getInstance().getLocalidades(idProvincia);
					listaLocalidades = new String[localidades.size()+1];
			 		
					for(Localidad p:localidades) {
			 			listaLocalidades[cont]=p.getNombre();
			 			cont++;
			 		}
					listaLocalidades[0]="Seleccione una Localidad";
					comboBoxLocalidad.setModel(new DefaultComboBoxModel<String>(listaLocalidades));
					comboBoxLocalidad.setEnabled(true);
				}
				desbloquearConfirmar();
			}
		});
		
		comboBoxMarca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxModelo.setEnabled(false);
				comboBoxModelo.setModel(new DefaultComboBoxModel<String>(listaModelos));
				comboBoxAnio.setEnabled(false);
				comboBoxAnio.setModel(new DefaultComboBoxModel<String>(listaAnios));
				if(comboBoxMarca.getSelectedIndex()==0)
				{
					comboBoxAnio.setEnabled(false);
					comboBoxAnio.setModel(new DefaultComboBoxModel<String>(listaAnios));
					comboBoxModelo.setEnabled(false);
					comboBoxModelo.setModel(new DefaultComboBoxModel<String>(listaModelos));
				}else {
					int cont=1;
					int idMarca =  marcas.get(comboBoxMarca.getSelectedIndex()-1).getIdMarca();
					modelos = (ArrayList<Modelo>) FachadaBDD.getInstance().getModelos(idMarca);
					listaModelos = new String[modelos.size()+1];
					for(Modelo m:modelos) {
			 			listaModelos[cont]=m.getNombre();
			 			cont++;
			 		}
					
					listaModelos[0]="Seleccione un Modelo";
					comboBoxModelo.setModel(new DefaultComboBoxModel<String>(listaModelos));
					comboBoxModelo.setEnabled(true);
					
				}
				desbloquearConfirmar();
			}
		});
		
		comboBoxModelo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBoxAnio.setEnabled(false);
				comboBoxAnio.setModel(new DefaultComboBoxModel<String>(listaAnios));
				System.out.println("Hola1");
				if(comboBoxModelo.getSelectedIndex()==0)
				{
					System.out.println("Hola2");
					
					comboBoxAnio.setEnabled(false);
					comboBoxAnio.setModel(new DefaultComboBoxModel<String>(listaAnios));
				}else {
					int cont=1;
					int idModelo =  modelos.get(comboBoxModelo.getSelectedIndex()-1).getIdModelo();
					anios = (ArrayList<Anio>) FachadaBDD.getInstance().getAnios(idModelo);
					listaAnios = new String[anios.size()+1];
			 		
					for(Anio p:anios) {
			 			listaAnios[cont]=String.valueOf(p.getAnio());
			 			cont++;
			 		}
					
					listaAnios[0]="Seleccione un Año";
					comboBoxAnio.setModel(new DefaultComboBoxModel<String>(listaAnios));
					comboBoxAnio.setEnabled(true);
					
				}
				desbloquearConfirmar();
			}
		});
		
		JSpinner spinnerCantidadHijos = new JSpinner();
		spinnerCantidadHijos.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		spinnerCantidadHijos.setEnabled(false);
		spinnerCantidadHijos.setBounds(200, 270, 40, 18);
		panel_DatosPoliza.add(spinnerCantidadHijos);
		((DefaultEditor) spinnerCantidadHijos.getEditor()).getTextField().setEditable(false);
		
		ButtonGroup buttonGruopHijos = new ButtonGroup();
		buttonGruopHijos.add(rbSi);
		buttonGruopHijos.add(rbNo);

		JRadioButton rbFP2 = new JRadioButton("AA 999 AA");
		rbFP2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rbFP2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mask1.install(tfPatente);
				btnConfirmar.setEnabled(false);
			}
		});
		rbFP2.setSelected(true);
		rbFP2.setBounds(177, 88, 83, 18);
		panel_DatosPoliza.add(rbFP2);
		
		JRadioButton rbFP1 = new JRadioButton("AAA 999");
		rbFP1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		rbFP1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mask2.install(tfPatente);
				btnConfirmar.setEnabled(false);
				
			}
		});
		
		rbFP1.setBounds(100, 88, 70, 18);
		panel_DatosPoliza.add(rbFP1);
		
		ButtonGroup buttonFP = new ButtonGroup();
		buttonFP.add(rbFP1);
		buttonFP.add(rbFP2);
		
		rbSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spinnerCantidadHijos.setEnabled(true);
			}
		});
		rbNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				spinnerCantidadHijos.setValue(1);
				spinnerCantidadHijos.setEnabled(false);
			}
		});
		
		JButton btnAtras = new JButton("Atrás");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Desea volver atrás?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					BuscarCliente buscarCliente = new BuscarCliente();
					buscarCliente.setVisible(true);
					dispose();
				}
			}
		});
		btnAtras.setBounds(110, 526, 70, 25);
		panel.add(btnAtras);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 526, 90, 25);
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
		panel.add(btnCancelar);
		
		comboBoxPais.setEditable(false);
		comboBoxProvincia.setEditable(false);
		comboBoxLocalidad.setEditable(false);
		comboBoxMarca.setEditable(false);
		comboBoxModelo.setEditable(false);
		comboBoxAnio.setEditable(false);
		
		JLabel lblFormatoPatente = new JLabel("Formato patente: ");
		lblFormatoPatente.setBounds(5, 90, 105, 15);
		panel_DatosPoliza.add(lblFormatoPatente);

		
		
		
		
		
		
		//SI POLDTO NO ES NULA, ENTONCES:
		if(polDTO!=null) {
		spinnerKms.setValue(polDTO.getKmAnio());
		tfChasis.setText(polDTO.getChasis());
		tfMotor.setText(polDTO.getMotor());
		tfPatente.setText(polDTO.getPatente());
		MedidasSeguridadDTO msDTO = polDTO.getMedidasSeguridad();
		if(msDTO.isAlarma()) cbAlarma.setSelected(true);
		if(msDTO.isGarage()) cbGarage.setSelected(true);
		if(msDTO.isRastreoVehicular()) cbRastreo.setSelected(true);
		if(msDTO.isTuercasAntirrobo()) cbTuercas.setSelected(true);
		ArrayList<HijoDTO> hijos = (ArrayList<HijoDTO>) polDTO.getHijos();
		if(hijos!=null) {
		spinnerCantidadHijos.setValue(hijos.size());
		if(hijos.size()>0) {
			rbSi.setSelected(true);
			rbNo.setSelected(false);
		}else {
			rbNo.setSelected(true);
			rbSi.setSelected(false);
		}
		}
		Localidad localidad = GestorBDD.getInstance().getLocalidad(polDTO);
		comboBoxProvincia.setSelectedItem(localidad.getProvincia().getNombre());
		comboBoxLocalidad.setSelectedItem(localidad.getNombre());
		comboBoxMarca.setSelectedItem(polDTO.getMarca());
		comboBoxModelo.setSelectedItem(polDTO.getModelo());
		Anio anioModelo = GestorBDD.getInstance().getAnio(polDTO);
		comboBoxAnio.setSelectedItem(anioModelo.getAnio());
		
	}
		
		
		
		
		
		
		
		//BOTONES QUE USAN DATOS
		
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int idLocalidad = comboBoxLocalidad.getSelectedIndex();
				Localidad localidadPoliza = localidades.get(idLocalidad-1);
				int anioModelo = comboBoxAnio.getSelectedIndex();
				Anio anioPoliza = anios.get(anioModelo-1);
				
				String patenteAux = tfPatente.getText().toUpperCase();
				String patente="";
				
				for (int x=0; x < patenteAux.length(); x++) {
					  if (patenteAux.charAt(x) != ' ')
					    patente += patenteAux.charAt(x);
					}
				
				String chasis = tfChasis.getText().toUpperCase();
				String motor = tfMotor.getText().toUpperCase();
				int kmAnio = (int) spinnerKms.getValue(); 
				boolean garage = cbGarage.isSelected();
				boolean alarma = cbAlarma.isSelected();
				boolean dispRastreo = cbRastreo.isSelected();
				boolean tuercasAntirrobo = cbTuercas.isSelected();
				int nroSiniestros = FachadaBDD.getInstance().getNroSiniestros(clienteDTO);
				
				PolizaDTO polDTO = FachadaPoliza.getInstance().ingresarDatos(localidadPoliza,anioPoliza,patente,chasis,motor,kmAnio,
						garage,alarma,dispRastreo,tuercasAntirrobo,nroSiniestros,clienteDTO);
				
				boolean datosValidos = FachadaPoliza.getInstance().validarPoliza(polDTO);
				
				if ((rbFP2.isSelected()&&patente.length()!=7)||(rbFP1.isSelected()&&patente.length()!=6)) {
					
					JOptionPane.showMessageDialog(null, "La patente ingresada no es válida", "Error", JOptionPane.ERROR_MESSAGE);
					
				} else if (!datosValidos) {
					JOptionPane.showMessageDialog(null, "Ya existe una póliza para la patente, chasis y/o el motor ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
					
				}else {
				
				System.out.println(polDTO);
				
				if (rbSi.isSelected()) {
					AgregarHijos agregarHijos = new AgregarHijos(polDTO, clienteDTO, (int) spinnerCantidadHijos.getValue(),Integer.parseInt((String)comboBoxAnio.getSelectedItem()));
					agregarHijos.setVisible(true);
					dispose();
				}else{
					Cobertura cobertura = new Cobertura(polDTO, clienteDTO,Integer.parseInt((String) comboBoxAnio.getSelectedItem()));
					cobertura.setVisible(true);
					dispose();
				}
			}}
		});
		
	}
	
	private void desbloquearConfirmar() {
		
		btnConfirmar.setEnabled(false);
		
		if(comboBoxPais.getSelectedIndex()!=0 && comboBoxProvincia.getSelectedIndex()!=0 && comboBoxLocalidad.getSelectedIndex()!=0 && 
			comboBoxMarca.getSelectedIndex()!=0 && comboBoxModelo.getSelectedIndex()!=0 && comboBoxAnio.getSelectedIndex()!=0 &&
			tfChasis.getText().compareTo("")!=0 && tfMotor.getText().compareTo("")!=0 && (tfPatente.getText().compareTo("         ")!=0)) {
			btnConfirmar.setEnabled(true);
		}
	}
}


