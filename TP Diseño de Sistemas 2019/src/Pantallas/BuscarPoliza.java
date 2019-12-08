package Pantallas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import BDD.FachadaBDD;
import BDD.GestorBDD;
import DTO.ClienteDTO;
import DTO.PolizaDTO;
import Entidades.Poliza;
import Enumerados.TipoDocumento;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class BuscarPoliza extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private PolizaDTO polBuscada;
	private PolizaDTO polSeleccionada;
	private JTable tabla;
	private ListSelectionModel model;


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

	/**
	 * Create the frame.
	 */
	public BuscarPoliza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel label = new JLabel("Ingrese numero de poliza:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(10, 11, 240, 25);
		contentPane.add(label);
		
		String[] columnas = {"Nro póliza","Tipo cobertura","Estado poliza","Monto total"};
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 119, 764, 251);
		contentPane.add(scrollPane);
		
		JButton button = new JButton("Cancelar");
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(Color.WHITE);
		button.setBounds(10, 525, 90, 25);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Seleccionar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//si tiene cuota atrasadas y sino ir a cutoas futuras
				if (!polSeleccionada.getCuotasA().isEmpty()) {
					PolizaCuotaAtrasada cuotaAtrasada = new PolizaCuotaAtrasada(polSeleccionada);
					cuotaAtrasada.setVisible(true);
					dispose();
				} else {
					PolizaCuotaFutura cuotaFutura = new PolizaCuotaFutura(polSeleccionada);
					cuotaFutura.setVisible(true);
					dispose();
				}
				
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(664, 525, 110, 25);
		button_1.setEnabled(false);
		contentPane.add(button_1);
		
		//INICIALIZAR TABLA CON DATO DE ENTRADA
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				tabla = new JTable(filtrarTabla(textField.getText()),columnas);
				scrollPane.setViewportView(tabla);
				tabla.setAutoCreateRowSorter(true);
				model = tabla.getSelectionModel();
				
				model.addListSelectionListener(new ListSelectionListener() {
					
					public void valueChanged(ListSelectionEvent e) {
						if(!model.isSelectionEmpty()) {
							
							button_1.setEnabled(true);
							polSeleccionada  = polBuscada;
							
							System.out.println(polSeleccionada);
						}
					}
				});
			}
		});
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(249, 11, 200, 25);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		//INICIALIZAR TABLA CON TODOS LAS POLIZAS
		Object[][] datosClientes=filtrarTabla(textField.getText());
		
		tabla = new JTable(datosClientes,columnas);
		model=tabla.getSelectionModel();
		tabla.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(tabla);
		tabla.editingCanceled(null);
		button_1.setEnabled(false);
		model.addListSelectionListener(new ListSelectionListener() {
			
			public void valueChanged(ListSelectionEvent e) {
				if(!model.isSelectionEmpty()) {
					
					button_1.setEnabled(true);
					polSeleccionada = polBuscada;
					
					System.out.println(polSeleccionada);
				}
			}
		});
		
	}
	
private Object[][] filtrarTabla(String nroPoliza) {
		
		System.out.println(nroPoliza);
		
		polBuscada = FachadaBDD.getInstance().getPoliza(nroPoliza);
		
		String[][] datos = new String[1][4];
		datos[1][1] = polBuscada.getNroPoliza();
		datos[1][2] = polBuscada.getTipoCobertura();
		datos[1][3] = polBuscada.getEstadoPoliza();
		datos[1][4] = Float.toString(polBuscada.getMontoTotal());
		
		System.out.println(polBuscada);
		return datos;
	}
}
