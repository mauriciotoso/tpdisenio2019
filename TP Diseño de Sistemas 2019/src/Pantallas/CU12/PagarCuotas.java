package Pantallas.CU12;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import DTO.CuotaDTO;
import DTO.PolizaDTO;
import DTO.ReciboDTO;
import Logica.FachadaPoliza;
import Pantallas.MenuCobrador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PagarCuotas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField tfImporte;
	private float importeTotal;
	private JTextField tfImportePagado;
	
	public PagarCuotas(PolizaDTO polDTO, ArrayList<CuotaDTO> cuotasPagar) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 21, 764, 171);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 37, 744, 123);
		panel_1.add(scrollPane);
		int tamCuotas=0;
		if(cuotasPagar!=null) {
			tamCuotas=cuotasPagar.size();
		}
		Object[][] datosCuotasPagar = new Object[tamCuotas][2];
		for(int i=0; i<=tamCuotas-1;i++) {
			CuotaDTO c = cuotasPagar.get(i);
			datosCuotasPagar[i][0]= c.getNroCuota();
			datosCuotasPagar[i][1]= c.getImporteCuota();
		}
		
		String[] columnas = {"Nro Cuota","Importe"};
		
		table = new JTable(datosCuotasPagar, columnas);
		//table = new JTable(new String[6][2], columnas);
		
		scrollPane.setViewportView(table);
		table.setAutoCreateRowSorter(true);
		table.editingCanceled(null);

		JLabel lblCuotasSeleccionadas = new JLabel("Cuotas seleccionadas");
		lblCuotasSeleccionadas.setBounds(10, 1, 172, 25);
		panel_1.add(lblCuotasSeleccionadas);
		lblCuotasSeleccionadas.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblImporteTotal = new JLabel("Importe total:");
		lblImporteTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblImporteTotal.setBounds(10, 203, 110, 25);
		contentPane.add(lblImporteTotal);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuCobrador mc = new MenuCobrador();
				mc.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelar.setBackground(Color.WHITE);
		btnCancelar.setBounds(10, 239, 110, 25);
		contentPane.add(btnCancelar);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(Float.parseFloat(tfImportePagado.getText())<importeTotal) {
					JOptionPane.showMessageDialog(null, "El monto ingresado es menor que el importe total", "Error", JOptionPane.INFORMATION_MESSAGE);
					
				}else {
				
				ReciboDTO reciboDTO = FachadaPoliza.getInstance().generarRecibo(Float.valueOf(tfImportePagado.getText()), cuotasPagar, polDTO, importeTotal);
				DetallePago dp = new DetallePago(polDTO,reciboDTO);
				dp.setVisible(true);
				dispose();
				}
				
			}
		});
		
		btnPagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPagar.setBackground(Color.WHITE);
		btnPagar.setBounds(657, 239, 117, 25);
		contentPane.add(btnPagar);
		
		JButton btnCambiarCuotas = new JButton("Cambiar cuotas");
		btnCambiarCuotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SeleccionarCuotas pca = new SeleccionarCuotas(polDTO);
				pca.setVisible(true);
				dispose();
			}
		});
		
		btnCambiarCuotas.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCambiarCuotas.setBackground(Color.WHITE);
		btnCambiarCuotas.setBounds(510, 239, 127, 25);
		contentPane.add(btnCambiarCuotas);
		
		tfImporte = new JTextField();
		tfImporte.setBounds(130, 205, 127, 25);
		contentPane.add(tfImporte);
		tfImporte.setColumns(10);
		tfImporte.setEnabled(false);
		
		if(cuotasPagar!=null) {
		for(CuotaDTO c: cuotasPagar) 
			importeTotal+=c.getImporteCuota();
		}
		
		tfImporte.setText(Float.toString(importeTotal));
		
		JLabel lblImportePagado = new JLabel("Importe pagado:");
		lblImportePagado.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblImportePagado.setBounds(510, 203, 140, 25);
		contentPane.add(lblImportePagado);
		
		tfImportePagado = new JTextField();
		tfImportePagado.setText((String) null);
		tfImportePagado.setColumns(10);
		tfImportePagado.setBounds(647, 203, 127, 25);
		contentPane.add(tfImportePagado);
	}
}
