package Pantallas;

import java.awt.Color;


import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import BDD.FachadaBDD;
import DTO.*;
import Enumerados.*;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BuscarCliente extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfNroCliente;
	private JTextField tfApellido;
	private JTextField tfNombre;
	private JTextField tfNroDocumento;
	private JComboBox<TipoDocumento> comboBoxTD;
	private JTable busqueda;
	private ArrayList<ClienteDTO> clientes;
	private ListSelectionModel model;
    private ClienteDTO seleccion;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuscarCliente frame = new BuscarCliente();
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
	
	public BuscarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		String[] columnas= {"Nro. cliente","Apellido","Nombre","Tipo Documento","Nro. Documento"};
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBounds(0, 0, 784, 440);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnBuscarCliente = new JButton("Seleccionar cliente");
		btnBuscarCliente.setBackground(Color.WHITE);
		btnBuscarCliente.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnBuscarCliente.setBounds(617, 397, 157, 31);
		btnBuscarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PolizaGenerar polizaGenerar = new PolizaGenerar(seleccion);
				polizaGenerar.setVisible(true);
				dispose();
			}
		});
		panel.add(btnBuscarCliente);
		
		JButton btnCancelarBC = new JButton("Cancelar");
		btnCancelarBC.setBackground(Color.WHITE);
		btnCancelarBC.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnCancelarBC.setBounds(10, 397, 99, 31);
		btnCancelarBC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Desea cancelar la transacción?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					MenuProductorSeguro menuProductorSeguro = new MenuProductorSeguro();
					menuProductorSeguro.setVisible(true);
					dispose();
				}
			}
		});
		panel.add(btnCancelarBC);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 119, 764, 251);
		panel.add(scrollPane);
		
		tfNroCliente = new JTextField();
		tfNroCliente.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				busqueda=new JTable(filtrarTabla(tfNroCliente.getText(),tfApellido.getText(),tfNombre.getText(),(TipoDocumento)comboBoxTD.getSelectedItem(),tfNroDocumento.getText()),columnas);
				scrollPane.setViewportView(busqueda);
				busqueda.setAutoCreateRowSorter(true);
				model=busqueda.getSelectionModel();
				btnBuscarCliente.setEnabled(false);
				
				model.addListSelectionListener(new ListSelectionListener() {
					
					public void valueChanged(ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
							
							btnBuscarCliente.setEnabled(true);
							seleccion=clientes.get(model.getMinSelectionIndex());
							
							System.out.println(seleccion);
						}
					}
				});
			}
		});
		tfNroCliente.setBounds(10, 88, 142, 20);
		panel.add(tfNroCliente);
		tfNroCliente.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				busqueda=new JTable(filtrarTabla(tfNroCliente.getText(),tfApellido.getText(),tfNombre.getText(),(TipoDocumento)comboBoxTD.getSelectedItem(),tfNroDocumento.getText()),columnas);
				scrollPane.setViewportView(busqueda);
				busqueda.setAutoCreateRowSorter(true);
				model=busqueda.getSelectionModel();
				btnBuscarCliente.setEnabled(false);
				
				model.addListSelectionListener(new ListSelectionListener() {
					
					public void valueChanged(ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
							
							btnBuscarCliente.setEnabled(true);
							seleccion=clientes.get(model.getMinSelectionIndex());
							
							System.out.println(seleccion);
						}
					}
				});
			}
		});
		tfApellido.setColumns(10);
		tfApellido.setBounds(162, 88, 142, 20);
		panel.add(tfApellido);
		
		tfNombre = new JTextField();
		tfNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				busqueda=new JTable(filtrarTabla(tfNroCliente.getText(),tfApellido.getText(),tfNombre.getText(),(TipoDocumento)comboBoxTD.getSelectedItem(),tfNroDocumento.getText()),columnas);
				scrollPane.setViewportView(busqueda);
				busqueda.setAutoCreateRowSorter(true);
				model=busqueda.getSelectionModel();
				btnBuscarCliente.setEnabled(false);
				
				model.addListSelectionListener(new ListSelectionListener() {
					
					public void valueChanged(ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
							
							btnBuscarCliente.setEnabled(true);
							seleccion=clientes.get(model.getMinSelectionIndex());
							
							System.out.println(seleccion);
						}
					}
				});
			}
		});
		tfNombre.setColumns(10);
		tfNombre.setBounds(314, 88, 142, 20);
		panel.add(tfNombre);
		
		tfNroDocumento = new JTextField();
		tfNroDocumento.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				busqueda=new JTable(filtrarTabla(tfNroCliente.getText(),tfApellido.getText(),tfNombre.getText(),(TipoDocumento)comboBoxTD.getSelectedItem(),tfNroDocumento.getText()),columnas);
				scrollPane.setViewportView(busqueda);
				busqueda.setAutoCreateRowSorter(true);
				model=busqueda.getSelectionModel();
				btnBuscarCliente.setEnabled(false);
				
				model.addListSelectionListener(new ListSelectionListener() {
					
					public void valueChanged(ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
							
							btnBuscarCliente.setEnabled(true);
							seleccion=clientes.get(model.getMinSelectionIndex());
							
							System.out.println(seleccion);
						}
					}
				});
			}
		});
		tfNroDocumento.setColumns(10);
		tfNroDocumento.setBounds(621, 88, 142, 20);
		panel.add(tfNroDocumento);
		
		TipoDocumento[] listaTD = {TipoDocumento.DNI,TipoDocumento.CEDULA_IDENTIDAD,TipoDocumento.LIBRETA_CIVICA,TipoDocumento.LIBRETA_ENROLAMIENTO};
		
		comboBoxTD = new JComboBox<TipoDocumento>(listaTD);
		comboBoxTD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				busqueda=new JTable(filtrarTabla(tfNroCliente.getText(),tfApellido.getText(),tfNombre.getText(),(TipoDocumento)comboBoxTD.getSelectedItem(),tfNroDocumento.getText()),columnas);
				scrollPane.setViewportView(busqueda);
				busqueda.setAutoCreateRowSorter(true);
				model=busqueda.getSelectionModel();
				btnBuscarCliente.setEnabled(false);
				
				model.addListSelectionListener(new ListSelectionListener() {
					
					public void valueChanged(ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
							
							btnBuscarCliente.setEnabled(true);
							seleccion=clientes.get(model.getMinSelectionIndex());
							
							System.out.println(seleccion);
						}
					}
				});
			}
		});
		
		comboBoxTD.setBounds(466, 88, 142, 20);
		panel.add(comboBoxTD);
		
		JLabel lblNroCliente = new JLabel("Nro. Cliente:");
		lblNroCliente.setBounds(10, 63, 120, 14);
		panel.add(lblNroCliente);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(162, 63, 120, 14);
		panel.add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(314, 63, 120, 14);
		panel.add(lblNombre);
		
		JLabel lblTipoDocumento = new JLabel("Tipo Documento:");
		lblTipoDocumento.setBounds(466, 63, 120, 14);
		panel.add(lblTipoDocumento);
		
		JLabel lblNroDocumento = new JLabel("Nro. Documento");
		lblNroDocumento.setBounds(621, 63, 120, 14);
		panel.add(lblNroDocumento);
		
		JLabel lblIngreseLosCampos = new JLabel("Ingrese los campos a buscar del cliente");
		lblIngreseLosCampos.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblIngreseLosCampos.setBounds(10, 11, 446, 31);
		panel.add(lblIngreseLosCampos);
		
		Object[][] datosClientes=filtrarTabla(tfNroCliente.getText(),tfApellido.getText(),tfNombre.getText(),(TipoDocumento)comboBoxTD.getSelectedItem(),tfNroDocumento.getText());
		
		busqueda = new JTable(datosClientes,columnas);
		model=busqueda.getSelectionModel();
		busqueda.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(busqueda);
		busqueda.editingCanceled(null);
		
		btnBuscarCliente.setEnabled(false);
		
		model.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				if(!model.isSelectionEmpty()) {
					
					btnBuscarCliente.setEnabled(true);
					seleccion=clientes.get(model.getMinSelectionIndex());
					
					System.out.println(seleccion);
				}
			}
		});
		
	}
	
	private Object[][] filtrarTabla(String nroCliente,String apellido,String nombre,TipoDocumento tipoDoc,String nroDoc) {
		
		System.out.println(nroCliente +" "+ apellido +" "+ nombre +" "+ nroDoc);
		
		clientes = FachadaBDD.getInstance().getClientes(nroCliente, apellido, nombre, tipoDoc, nroDoc);
		
		String[][] datos = new String[clientes.size()][5];
		
		int cont=0;
		for(ClienteDTO c:clientes) {
			
			datos[cont][0]=c.getNroCliente();
			datos[cont][1]=c.getApellido();
			datos[cont][2]=c.getNombre();
			datos[cont][3]=c.getTipoDocumento().toString();
			datos[cont][4]=c.getNroDocumento();
			
			cont++;
		}
		
		System.out.println(clientes);
		return datos;
	}
}
