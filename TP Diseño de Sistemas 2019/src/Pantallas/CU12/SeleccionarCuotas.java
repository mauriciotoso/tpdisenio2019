package Pantallas.CU12;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import DTO.*;
import Pantallas.MenuCobrador;

import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class SeleccionarCuotas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNroCliente;
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfNroPoliza;
	private JTextField tfFechaInicio;
	private JTextField tfFechaFin;
	private JTextField tfMarca;
	private JTextField tfModelo;
	private JTextField tfPatente;
	private ArrayList<CuotaDTO> cuotasAtrasadas;
	private ArrayList<CuotaDTO> cuotasAtrasadasSeleccionadas;
	private ArrayList<CuotaDTO> cuotasFuturas;
	private ArrayList<CuotaDTO> cuotasFuturasSeleccionadas;
	private JTable tableCA;
	private JTable tableCF;
	private ListSelectionModel modelCA;
	private ListSelectionModel modelCF;
	private CuotaDTO seleccionCA;
	private CuotaDTO seleccionCF;
	private ArrayList<CuotaDTO> cuotasSeleccionadas;
	private Object[][] datosCuotasFuturas;
	private Object[][] datosCuotasAtrasadas;
	
	public SeleccionarCuotas(PolizaDTO polDTO) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		JLabel labelNroCliente = new JLabel("Numero de cliente:");
		labelNroCliente.setBounds(10, 11, 100, 20);
		contentPane.add(labelNroCliente);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(498, 11, 50, 20);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(267, 11, 50, 20);
		contentPane.add(lblApellido);
		
		JLabel lblNroPoliza = new JLabel("Numero de poliza:");
		lblNroPoliza.setBounds(10, 42, 90, 20);
		contentPane.add(lblNroPoliza);
		
		JLabel lblFechaInicio = new JLabel("Fecha inicio:");
		lblFechaInicio.setBounds(267, 42, 70, 20);
		contentPane.add(lblFechaInicio);
		
		JLabel lblFechaFin = new JLabel("Fecha fin:");
		lblFechaFin.setBounds(498, 42, 56, 20);
		contentPane.add(lblFechaFin);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(10, 73, 39, 20);
		contentPane.add(lblMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(267, 73, 50, 20);
		contentPane.add(lblModelo);
		
		JLabel lblPatente = new JLabel("Patente:");
		lblPatente.setBounds(498, 73, 50, 20);
		contentPane.add(lblPatente);
		
		tfNroCliente = new JTextField();
		tfNroCliente.setEditable(false);
		tfNroCliente.setColumns(10);
		tfNroCliente.setBounds(107, 11, 150, 20);
		contentPane.add(tfNroCliente);
		
		tfNombre = new JTextField();
		tfNombre.setEditable(false);
		tfNombre.setColumns(10);
		tfNombre.setBounds(555, 11, 150, 20);
		contentPane.add(tfNombre);
		
		tfApellido = new JTextField();
		tfApellido.setEditable(false);
		tfApellido.setColumns(10);
		tfApellido.setBounds(338, 11, 150, 20);
		contentPane.add(tfApellido);
		
		tfNroPoliza = new JTextField();
		tfNroPoliza.setEditable(false);
		tfNroPoliza.setColumns(10);
		tfNroPoliza.setBounds(107, 42, 150, 20);
		contentPane.add(tfNroPoliza);
		
		tfFechaInicio = new JTextField();
		tfFechaInicio.setEditable(false);
		tfFechaInicio.setColumns(10);
		tfFechaInicio.setBounds(338, 42, 150, 20);
		contentPane.add(tfFechaInicio);

		tfFechaFin = new JTextField();
		tfFechaFin.setEditable(false);
		tfFechaFin.setColumns(10);
		tfFechaFin.setBounds(555, 42, 150, 20);
		contentPane.add(tfFechaFin);

		tfMarca = new JTextField();
		tfMarca.setEditable(false);
		tfMarca.setColumns(10);
		tfMarca.setBounds(107, 73, 150, 20);
		contentPane.add(tfMarca);

		tfModelo = new JTextField();
		tfModelo.setEditable(false);
		tfModelo.setColumns(10);
		tfModelo.setBounds(338, 73, 150, 20);
		contentPane.add(tfModelo);

		tfPatente = new JTextField();
		tfPatente.setEditable(false);
		tfPatente.setColumns(10);
		tfPatente.setBounds(555, 73, 150, 20);
		contentPane.add(tfPatente);
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		String fechaInicio = dateFormat.format(polDTO.getFechaInicio()); 
		String fechaFin = dateFormat.format(polDTO.getFechaFin()); 
		
		tfNroCliente.setText(polDTO.getCliente().getNroCliente());
		tfNombre.setText(polDTO.getCliente().getNombre());
		tfApellido.setText(polDTO.getCliente().getApellido());
		tfNroPoliza.setText(polDTO.getNroPoliza());
		tfFechaInicio.setText(fechaInicio);
		tfFechaFin.setText(fechaFin);
		tfMarca.setText(polDTO.getMarca());
		tfModelo.setText(polDTO.getModelo());
		tfPatente.setText(polDTO.getPatente());
		
		//TABLA
		JPanel panelCA = new JPanel();
		panelCA.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCA.setBounds(10, 104, 764, 194);
		contentPane.add(panelCA);
		panelCA.setLayout(null);
		
		JLabel lblCuotasAtrasadas = new JLabel("Cuotas atrasadas");
		lblCuotasAtrasadas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCuotasAtrasadas.setBounds(10, 11, 185, 20);
		panelCA.add(lblCuotasAtrasadas);
		
		JScrollPane scrollPaneCA = new JScrollPane();
		scrollPaneCA.setBounds(10, 37, 650, 147);
		panelCA.add(scrollPaneCA);
	
		cuotasAtrasadas = polDTO.getCuotasA();
		datosCuotasAtrasadas = new Object[cuotasAtrasadas.size()][3];
		for(int i=0; i<=cuotasAtrasadas.size()-1;i++) {
			CuotaDTO c = cuotasAtrasadas.get(i);
			datosCuotasAtrasadas[i][0]= c.getNroCuota();
			datosCuotasAtrasadas[i][1]= c.getImporteCuota();
			datosCuotasAtrasadas[i][2]= c.getImporteCuota()+c.getRecargosPorMora();
		}
		
		String[] columnas = {"Nro. cuota","Valor original","Valor actualizado"};

		tableCA = new JTable(datosCuotasAtrasadas, columnas);
		tableCA.setRowHeight(20);
		modelCA=tableCA.getSelectionModel();
		scrollPaneCA.setViewportView(tableCA);
		
		JLabel lblSeleccionada = new JLabel("Seleccionada");
		lblSeleccionada.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSeleccionada.setBounds(670, 40, 103, 20);
		panelCA.add(lblSeleccionada);
		
		JCheckBox cbCA6 = new JCheckBox("");
		panelCA.add(cbCA6);
		
		JCheckBox cbCA5 = new JCheckBox("");
		panelCA.add(cbCA5);
		
		JCheckBox cbCA4 = new JCheckBox("");
		panelCA.add(cbCA4);
		
		JCheckBox cbCA3 = new JCheckBox("");
		panelCA.add(cbCA3);
		
		JCheckBox cbCA2 = new JCheckBox("");
		panelCA.add(cbCA2);
		
		JCheckBox cbCA1 = new JCheckBox("");
		panelCA.add(cbCA1);
		
		tableCA.editingCanceled(null);
		//BOTONES
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				MenuCobrador mc =new MenuCobrador();
				mc.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(10, 525, 90, 25);
		contentPane.add(btnCancelar);
		
		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PagarCuotas pagarCuotas = new PagarCuotas(polDTO,cuotasSeleccionadas);
				pagarCuotas.setVisible(true);
				dispose();
			}
		});
		
		btnSeleccionar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSeleccionar.setBackground(Color.WHITE);
		btnSeleccionar.setBounds(648, 525, 126, 25);
		contentPane.add(btnSeleccionar);
		
		JButton btnElegirPoliza = new JButton("Elegir otra p\u00F3liza");
		btnElegirPoliza.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BuscarPoliza bp = new BuscarPoliza();
				bp.setVisible(true);
				dispose();
			}
		});
		
		btnElegirPoliza.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnElegirPoliza.setBackground(Color.WHITE);
		btnElegirPoliza.setBounds(498, 525, 140, 25);
		contentPane.add(btnElegirPoliza);
		
		JPanel panelCF = new JPanel();
		panelCF.setLayout(null);
		panelCF.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelCF.setBounds(10, 301, 764, 213);
		contentPane.add(panelCF);
		
		JScrollPane scrollPaneCF = new JScrollPane();
		scrollPaneCF.setBounds(10, 37, 649, 147);
		panelCF.add(scrollPaneCF);

		JCheckBox cbCF2 = new JCheckBox("");
		panelCF.add(cbCF2);
		
		JCheckBox cbCF3 = new JCheckBox("");
		panelCF.add(cbCF3);
		
		JCheckBox cbCF4 = new JCheckBox("");
		panelCF.add(cbCF4);
		
		JCheckBox cbCF5 = new JCheckBox("");
		panelCF.add(cbCF5);
		
		JCheckBox cbCF6 = new JCheckBox("");
		panelCF.add(cbCF6);
		
		JCheckBox cbCF1 = new JCheckBox("");
		panelCF.add(cbCF1);
		
		cuotasFuturas = polDTO.getCuotasF();
		datosCuotasFuturas = new Object[cuotasFuturas.size()][3];
		for(int i=0; i<=cuotasFuturas.size()-1;i++) {
			CuotaDTO c = cuotasFuturas.get(i);
			datosCuotasFuturas[i][0]= c.getNroCuota();
			datosCuotasFuturas[i][1]= c.getImporteCuota();
			datosCuotasFuturas[i][2]= c.getImporteCuota()+c.getBonificacion();
		}
		
		tableCF = new JTable(datosCuotasFuturas, columnas);
		tableCF.setRowHeight(20);
		modelCF=tableCF.getSelectionModel();
		scrollPaneCF.setViewportView(tableCF);
		//tableCF.editingCanceled(null);
		
		JLabel lblCuotasFuturas = new JLabel("Cuotas futuras");
		lblCuotasFuturas.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCuotasFuturas.setBounds(10, 11, 185, 20);
		panelCF.add(lblCuotasFuturas);
		
		JLabel label = new JLabel("Seleccionada");
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(669, 40, 103, 20);
		panelCF.add(label);
		
		cbCF1.setEnabled(false);
		cbCF2.setEnabled(false);
		cbCF3.setEnabled(false);
		cbCF5.setEnabled(false);
		cbCF4.setEnabled(false);
		cbCF6.setEnabled(false);
		
		cbCA1.setEnabled(false);
		cbCA2.setEnabled(false);
		cbCA3.setEnabled(false);
		cbCA4.setEnabled(false);
		cbCA5.setEnabled(false);
		cbCA6.setEnabled(false);
		

		if(cuotasAtrasadas.size()>=1) cbCA1.setBounds(700, 61, 21, 23);
		if(cuotasAtrasadas.size()>=2) cbCA2.setBounds(700, 81, 21, 23);
		if(cuotasAtrasadas.size()>=3) cbCA3.setBounds(700, 101, 21, 23);
		if(cuotasAtrasadas.size()>=4) cbCA4.setBounds(700, 121, 21, 23);
		if(cuotasAtrasadas.size()>=5) cbCA5.setBounds(700, 141, 21, 23);
		if(cuotasAtrasadas.size()>=6) cbCA6.setBounds(700, 161, 21, 23);
		
		if(cuotasFuturas.size()>=1) cbCF1.setBounds(700, 61, 21, 23);
		if(cuotasFuturas.size()>=2) cbCF2.setBounds(700, 81, 21, 23);
		if(cuotasFuturas.size()>=3) cbCF3.setBounds(700, 101, 21, 23);
		if(cuotasFuturas.size()>=4) cbCF4.setBounds(700, 121, 21, 23);
		if(cuotasFuturas.size()>=5) cbCF5.setBounds(700, 141, 21, 23);
		if(cuotasFuturas.size()==6) cbCF6.setBounds(700, 161, 21, 23);

		btnSeleccionar.setEnabled(false);
		/*		
		cbCA1.setBounds(700, 62, 21, 23);
		cbCA2.setBounds(700, 82, 21, 23);
		cbCA3.setBounds(700, 102, 21, 23);
		cbCA4.setBounds(700, 122, 21, 23);
		cbCA5.setBounds(700, 142, 21, 23);
		cbCA6.setBounds(700, 162, 21, 23);
		
		cbCF1.setBounds(700, 62, 21, 23);
		cbCF2.setBounds(700, 82, 21, 23);
		cbCF3.setBounds(700, 102, 21, 23);
		cbCF4.setBounds(700, 122, 21, 23);
		cbCF5.setBounds(700, 142, 21, 23);
		cbCF6.setBounds(700, 162, 21, 23);
*/
		modelCA.addListSelectionListener(new ListSelectionListener() {	
			public void valueChanged(ListSelectionEvent e) {
				if(!modelCA.isSelectionEmpty()) {
					
					cbCA1.setSelected(false);
					cbCA2.setSelected(false);
					cbCA3.setSelected(false);
					cbCA4.setSelected(false);
					cbCA5.setSelected(false);
					cbCA6.setSelected(false);
					
					cbCF1.setSelected(false);
					cbCF2.setSelected(false);
					cbCF3.setSelected(false);
					cbCF4.setSelected(false);
					cbCF5.setSelected(false);
					cbCF6.setSelected(false);
					
					cuotasAtrasadasSeleccionadas=new ArrayList<>();
					seleccionCA=cuotasAtrasadas.get(modelCA.getMinSelectionIndex());
					
					if(seleccionCA.getNroCuota()!=0) {
						for(CuotaDTO c:cuotasAtrasadas) {
							if(c.getNroCuota()<=seleccionCA.getNroCuota()) cuotasAtrasadasSeleccionadas.add(c);
						}
					}else cuotasAtrasadasSeleccionadas=cuotasAtrasadas;
					
					cuotasFuturasSeleccionadas=new ArrayList<>();
					
					btnSeleccionar.setEnabled(true);
					
					cuotasSeleccionadas = new ArrayList<>();
					cuotasSeleccionadas.addAll(cuotasAtrasadasSeleccionadas);
					cuotasSeleccionadas.addAll(cuotasFuturasSeleccionadas);
					
					if(cuotasAtrasadasSeleccionadas.size()>=1) cbCA1.setSelected(true);
					if(cuotasAtrasadasSeleccionadas.size()>=2) cbCA2.setSelected(true);
					if(cuotasAtrasadasSeleccionadas.size()>=3) cbCA3.setSelected(true);
					if(cuotasAtrasadasSeleccionadas.size()>=4) cbCA4.setSelected(true);
					if(cuotasAtrasadasSeleccionadas.size()>=5) cbCA5.setSelected(true);
					if(cuotasAtrasadasSeleccionadas.size()==6) cbCA6.setSelected(true);
			
					System.out.println(cuotasSeleccionadas);
				}
			}
		});
		
		modelCF.addListSelectionListener(new ListSelectionListener() {	
			public void valueChanged(ListSelectionEvent e) {
				if(!modelCF.isSelectionEmpty()) {
					
					cbCF1.setSelected(false);
					cbCF2.setSelected(false);
					cbCF3.setSelected(false);
					cbCF4.setSelected(false);
					cbCF5.setSelected(false);
					cbCF6.setSelected(false);
					
					cuotasFuturasSeleccionadas=new ArrayList<>();
					seleccionCF=cuotasFuturas.get(modelCF.getMinSelectionIndex());
					
					if(seleccionCF.getNroCuota()!=0) {
						for(CuotaDTO c:cuotasFuturas) {
							if(c.getNroCuota()<=seleccionCF.getNroCuota()) cuotasFuturasSeleccionadas.add(c);
						}
					}else cuotasFuturasSeleccionadas=cuotasFuturas;
					
					cuotasAtrasadasSeleccionadas=cuotasAtrasadas;
					
					btnSeleccionar.setEnabled(true);
					
					cuotasSeleccionadas = new ArrayList<>();
					cuotasSeleccionadas.addAll(cuotasAtrasadasSeleccionadas);
					cuotasSeleccionadas.addAll(cuotasFuturasSeleccionadas);
										
					cbCA1.setSelected(true);
					cbCA2.setSelected(true);
					cbCA3.setSelected(true);
					cbCA4.setSelected(true);
					cbCA5.setSelected(true);
					cbCA6.setSelected(true);
					
					if(cuotasFuturasSeleccionadas.size()>=1) cbCF1.setSelected(true);
					if(cuotasFuturasSeleccionadas.size()>=2) cbCF2.setSelected(true);
					if(cuotasFuturasSeleccionadas.size()>=3) cbCF3.setSelected(true);
					if(cuotasFuturasSeleccionadas.size()>=4) cbCF4.setSelected(true);
					if(cuotasFuturasSeleccionadas.size()>=5) cbCF5.setSelected(true);
					if(cuotasFuturasSeleccionadas.size()==6) cbCF6.setSelected(true);
					
					System.out.println(cuotasSeleccionadas);
				}
			}
		});
	}
}