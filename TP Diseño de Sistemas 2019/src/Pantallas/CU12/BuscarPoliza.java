package Pantallas.CU12;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import BDD.*;
import DTO.*;
import Pantallas.MenuCobrador;
import Pantallas.MenuProductorSeguro;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class BuscarPoliza extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JFormattedTextField tfNroPoliza;
	private PolizaDTO seleccion;
	private JTable busqueda;
	private ListSelectionModel model;
	private ArrayList<PolizaDTO> polizas;
	private MaskFormatter maskNroPoliza;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarPoliza frame = new BuscarPoliza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public BuscarPoliza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		
		JLabel lblIngreseLosCampos = new JLabel("Ingrese los campos a buscar de la p\u00F3liza:");
		lblIngreseLosCampos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIngreseLosCampos.setBounds(10, 11, 550, 25);
		contentPane.add(lblIngreseLosCampos);
		
		String[] columnas = {"Nro. póliza","Nro. cliente","Apellido","Nombre","Tipo documento","Nro. documento","Ultimo pago"};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 78, 764, 251);
		contentPane.add(scrollPane);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {		
				int input = JOptionPane.showConfirmDialog(null, "Desea cancelar la transacción?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					MenuCobrador mc = new MenuCobrador();
					mc.setVisible(true);
					dispose();
				}
			}
		});
		
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(10, 340, 90, 25);
		contentPane.add(btnCancelar);
		
		//INICIALIZAR TABLA CON DATO DE ENTRADA				

		JButton btnSeleccionar = new JButton("Seleccionar");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SeleccionarCuotas cuotaAtrasada = new SeleccionarCuotas(seleccion);
				cuotaAtrasada.setVisible(true);
				dispose();
			}
		});
		
		tfNroPoliza = new JFormattedTextField();
		tfNroPoliza.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				busqueda=new JTable(filtrarTabla(tfNroPoliza.getText()),columnas);
				scrollPane.setViewportView(busqueda);
				busqueda.setAutoCreateRowSorter(true);
				model=busqueda.getSelectionModel();
				btnSeleccionar.setEnabled(false);
				
				model.addListSelectionListener(new ListSelectionListener() {
					
					public void valueChanged(ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
							
							btnSeleccionar.setEnabled(true);
							seleccion=polizas.get(model.getMinSelectionIndex());
							
							System.out.println(seleccion);
						}
					}
				});
			}
		});
		
		tfNroPoliza.setBounds(79, 47, 110, 20);
		contentPane.add(tfNroPoliza);
		tfNroPoliza.setColumns(10);
		CORREGIR ACA PARA QUE SAQUE LOS ESPACIOS
		try {
			maskNroPoliza = new MaskFormatter("####-#######-##");
		} catch (java.text.ParseException e1) {
			e1.printStackTrace();
		}
		maskNroPoliza.install(tfNroPoliza);
		
		btnSeleccionar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSeleccionar.setBackground(Color.WHITE);
		btnSeleccionar.setBounds(664, 340, 110, 25);
		btnSeleccionar.setEnabled(false);
		contentPane.add(btnSeleccionar);
		
		//INICIALIZAR TABLA CON TODOS LAS POLIZAS
		Object[][] datosPolizas=filtrarTabla(tfNroPoliza.getText());
		
		busqueda = new JTable(datosPolizas,columnas);
		model=busqueda.getSelectionModel();
		busqueda.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(busqueda);
		busqueda.editingCanceled(null);
		btnSeleccionar.setEnabled(false);
		
		JLabel lblNroPliza = new JLabel("Nro. P\u00F3liza:");
		lblNroPliza.setBounds(10, 50, 90, 14);
		contentPane.add(lblNroPliza);
		
		model.addListSelectionListener(new ListSelectionListener() {	
			public void valueChanged(ListSelectionEvent e) {
				if(!model.isSelectionEmpty()) {
					
					seleccion=polizas.get(model.getMinSelectionIndex());
					
					btnSeleccionar.setEnabled(true);
					
					System.out.println(seleccion);
				}
			}
		});

	}
	
	private Object[][] filtrarTabla(String nroPoliza) {

		polizas = FachadaBDD.getInstance().getPolizas(nroPoliza);
		
		String[][] datos = new String[polizas.size()][7];
		
		int cont=0;
		for(PolizaDTO p:polizas) {
			
			datos[cont][0]=p.getNroPoliza();
			datos[cont][1]=p.getCliente().getNroCliente();
			datos[cont][2]=p.getCliente().getApellido();
			datos[cont][3]=p.getCliente().getNombre();
			datos[cont][4]=p.getCliente().getTipoDocumento().toString();
			datos[cont][5]=p.getCliente().getNroDocumento();
			datos[cont][6]="-";
			
			
			for(CuotaDTO c:p.getCuotas()) 
				if(c.isEstaPago()) {
					DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
					String fecha = dateFormat.format(c.getFechaPago()); 
					
					datos[cont][6]=fecha;
				}
			cont++;
		}
		
		System.out.println(polizas);
		return datos;

	}
}
