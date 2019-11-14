package Pantallas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.SpinnerDateModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import DTO.ClienteDTO;
import DTO.PolizaDTO;
import Logica.FachadaPoliza;

public class Cobertura extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cobertura frame = new Cobertura();
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
	public Cobertura(PolizaDTO polDTO, ClienteDTO clienteDTO) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel alternativasCobertura = new JPanel();
		alternativasCobertura.setBounds(0, 0, 784, 561);
		alternativasCobertura.setLayout(null);
		contentPane.add(alternativasCobertura);
		
		JLabel lblSeleccione = new JLabel("Seleccione tipo de p\u00F3liza");
		lblSeleccione.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSeleccione.setBounds(50, 25, 280, 25);
		alternativasCobertura.add(lblSeleccione);
		
		JTable tableAC = new JTable();
		tableAC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tableAC.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableAC.setModel(new DefaultTableModel(
			new Object[][] {
				{"Responsabilidad civil", null, null},
				{"Responsabilidad civil - Robo - Incendio total", null, null},
				{"Todo total", null, null},
				{"Terceros completos", null, null},
				{"Todo riesgo con franquicia", null, null},
			},
			new String[] {
				"Tipo de cobertura", "Descripci\u00F3n", ""
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, String.class, Boolean.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		tableAC.getColumnModel().getColumn(0).setResizable(false);
		tableAC.getColumnModel().getColumn(0).setPreferredWidth(250);
		tableAC.getColumnModel().getColumn(0).setMinWidth(5);
		tableAC.getColumnModel().getColumn(0).setMaxWidth(500);
		tableAC.getColumnModel().getColumn(1).setPreferredWidth(409);
		tableAC.setBounds(25, 100, 734, 80);
		alternativasCobertura.add(tableAC);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio de vigencia de la p\u00F3liza: ");
		lblFechaInicio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFechaInicio.setBounds(25, 195, 313, 25);
		alternativasCobertura.add(lblFechaInicio);
		
		JLabel lblFormaPago = new JLabel("Forma de pago:");
		lblFormaPago.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFormaPago.setBounds(25, 223, 121, 25);
		alternativasCobertura.add(lblFormaPago);
		
		JRadioButton rdBtnMensual = new JRadioButton("MENSUAL");
		rdBtnMensual.setBounds(152, 226, 100, 23);
		alternativasCobertura.add(rdBtnMensual);
		
		JRadioButton rdBtnSemestral = new JRadioButton("SEMESTRAL");
		rdBtnSemestral.setBounds(260, 226, 110, 23);
		alternativasCobertura.add(rdBtnSemestral);
		
		ButtonGroup eleccion = new ButtonGroup();
		eleccion.add(rdBtnMensual);
		eleccion.add(rdBtnSemestral);
		
		JButton btnAtrasAC = new JButton("Atr\u00E1s");
		btnAtrasAC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAtrasAC.setBackground(Color.WHITE);
		btnAtrasAC.setBounds(25, 526, 90, 25);
		btnAtrasAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PolizaGenerar polizaGenerar = new PolizaGenerar(clienteDTO);
				polizaGenerar.setVisible(true);
				dispose();
			}
		});
		alternativasCobertura.add(btnAtrasAC);
		
		JButton btnCancelarAC = new JButton("Cancelar");
		btnCancelarAC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelarAC.setBackground(Color.WHITE);
		btnCancelarAC.setBounds(125, 526, 90, 25);
		btnCancelarAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Desea cancelar la transacción?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					MenuProductorSeguro menuProductorSeguro = new MenuProductorSeguro();
					menuProductorSeguro.setVisible(true);
					dispose();
				}
			}
		});
		alternativasCobertura.add(btnCancelarAC);
		
		Calendar actualDate = Calendar.getInstance();
		Calendar proxDate = Calendar.getInstance();
		proxDate.add(Calendar.DATE, 1);
		Calendar postDate = Calendar.getInstance();
		postDate.add(Calendar.DATE, 30);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(proxDate.getTime(), actualDate.getTime(), postDate.getTime(), Calendar.DAY_OF_YEAR));
		spinner.setBounds(343, 195, 120, 25);
		alternativasCobertura.add(spinner);
		
		JLabel lblTipoDeCobertura = new JLabel("Tipo de cobertura");
		lblTipoDeCobertura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDeCobertura.setBounds(27, 75, 141, 19);
		alternativasCobertura.add(lblTipoDeCobertura);
		
		JLabel label = new JLabel("Descripci\u00F3n");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(277, 75, 96, 19);
		alternativasCobertura.add(label);
		
		boolean datosValidos = FachadaPoliza.getInstance().validarPoliza(polDTO);
		
		if (!datosValidos) {
			JOptionPane.showMessageDialog(null, "Datos ingresados erróneos, vuelva a intentarlo.", "Error", JOptionPane.ERROR_MESSAGE);
			PolizaGenerar polizaGenerar = new PolizaGenerar(clienteDTO);
			polizaGenerar.setVisible(true);
			dispose();
		} 
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.setBounds(663, 526, 96, 25);
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean[] seleccionado = new boolean[5];
				int contSeleccion=0;
				
				if (rdBtnMensual.isSelected() || rdBtnSemestral.isSelected()) {
					/*for (int i=0;i<5;i++) {
						seleccionado[i]=(boolean) tableAC.getModel().getValueAt(i, 2);
						if (seleccionado[i]==true)
							contSeleccion++;
					}*///ARREGLAR!
					if (contSeleccion==0 && datosValidos) {
						int f = tableAC.getSelectedRow();
						String cobertura= (String) tableAC.getValueAt(f, 0);
						Date inicioVigencia = (Date) spinner.getValue();
						String tipoPoliza;
						if (rdBtnMensual.isSelected())
							tipoPoliza="MENSUAL";
						else 
							tipoPoliza="SEMESTRAL";
						
						FachadaPoliza.getInstance().setCobertura(polDTO,cobertura,inicioVigencia,tipoPoliza);
						
						PolizaGenerada polizaGenerada = new PolizaGenerada(polDTO,clienteDTO);
						polizaGenerada.setVisible(true);
						dispose();
					} else
						JOptionPane.showMessageDialog(null, "Solo puede seleccionar un tipo de poliza.", "Error", JOptionPane.ERROR_MESSAGE);
				} else
					JOptionPane.showMessageDialog(null, "Debe seleccionar una forma de pago.", "Error", JOptionPane.ERROR_MESSAGE);
				
			}
		});
		alternativasCobertura.add(btnSiguiente);
		
	}
}
