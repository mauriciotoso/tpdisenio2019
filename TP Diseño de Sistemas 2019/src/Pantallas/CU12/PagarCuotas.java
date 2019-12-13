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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
	
	public PagarCuotas(PolizaDTO polDTO, ArrayList<CuotaDTO> cuotasPagar,float importe) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		importeTotal=importe;
		
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
		table.setEnabled(false);
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
		btnCancelar.setBounds(10, 239, 110, 25);
		contentPane.add(btnCancelar);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(Float.parseFloat(tfImportePagado.getText())<importeTotal) {
					JOptionPane.showMessageDialog(null, "El monto ingresado es menor que el importe total", "Error", JOptionPane.INFORMATION_MESSAGE);
				}else {
					ReciboDTO reciboDTO = FachadaPoliza.getInstance().generarRecibo(Float.valueOf(tfImportePagado.getText()), cuotasPagar, polDTO, importeTotal);
					DetallePago dp = new DetallePago(polDTO,cuotasPagar,reciboDTO,importe);
					dp.setVisible(true);
					dispose();
				}
			}
		});
		
		btnPagar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnPagar.setBackground(Color.WHITE);
		btnPagar.setBounds(647, 239, 127, 25);
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
		btnCambiarCuotas.setBounds(497, 239, 140, 25);
		contentPane.add(btnCambiarCuotas);
		
		tfImporte = new JTextField();
		tfImporte.setBounds(130, 205, 127, 25);
		contentPane.add(tfImporte);
		tfImporte.setColumns(10);
		tfImporte.setEditable(false);
		
		tfImporte.setText(Float.toString(importeTotal));
		
		JLabel lblImportePagado = new JLabel("Importe pagado:");
		lblImportePagado.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblImportePagado.setBounds(497, 203, 140, 25);
		contentPane.add(lblImportePagado);
		
		btnPagar.setEnabled(false);
		
		//table.edit;
		
		tfImportePagado = new JTextField();
		tfImportePagado.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				String importePagadoAux=tfImportePagado.getText();
				String importePagado="";
				
				for (int x=0; x < importePagadoAux.length(); x++) {
					  if (importePagadoAux.charAt(x) != ' ')
						  importePagado += importePagadoAux.charAt(x);
				}
				
				if(importePagado!="") btnPagar.setEnabled(true);
				else btnPagar.setEnabled(false);
			}
		});
		
		tfImportePagado.setText((String) null);
		tfImportePagado.setColumns(10);
		tfImportePagado.setBounds(647, 203, 127, 25);
		contentPane.add(tfImportePagado);
	}
}
