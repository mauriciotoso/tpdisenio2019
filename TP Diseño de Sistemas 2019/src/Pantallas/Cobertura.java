package Pantallas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
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
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import BDD.FachadaBDD;
import DTO.ClienteDTO;
import DTO.PolizaDTO;
import Entidades.*;
import Logica.FachadaPoliza;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Cobertura extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Cobertura(PolizaDTO polDTO, ClienteDTO clienteDTO,int anio) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		
		JPanel alternativasCobertura = new JPanel();
		alternativasCobertura.setBounds(0, 11, 794, 561);
		alternativasCobertura.setLayout(null);
		contentPane.add(alternativasCobertura);
		
		JLabel lblSeleccione = new JLabel("Seleccione tipo de p\u00F3liza");
		lblSeleccione.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblSeleccione.setBounds(28, 25, 280, 25);
		alternativasCobertura.add(lblSeleccione);
		
		ArrayList<TipoCobertura> tipoCobertura;
		
		Calendar cal= Calendar.getInstance();
        int year= cal.get(Calendar.YEAR);
        
        if(year-anio>10) {
        	tipoCobertura = new ArrayList<TipoCobertura>();
    		
        	tipoCobertura.add(((ArrayList<TipoCobertura>) FachadaBDD.getInstance().getCoberturas()).get(0));
        	
        }else tipoCobertura = (ArrayList<TipoCobertura>) FachadaBDD.getInstance().getCoberturas();
		
        
		String[][] listaTC= new String[tipoCobertura.size()][2];
		
		//ButtonGroup groupCoberturas = new ButtonGroup();
		
		int cont=0;
		for(TipoCobertura tc:tipoCobertura) {
			
			listaTC[cont][0]=tc.getNombre();
			listaTC[cont][1]=tc.getDescripcion();
			
			/*JRadioButton aux = new JRadioButton();
			aux.setBounds(700,97+cont*26,109,23);
			groupCoberturas.add(aux);
			alternativasCobertura.add(aux);
			*/
			cont++;
		}
		
		JTable tableAC = new JTable();
		tableAC.setRowHeight(25);
		tableAC.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tableAC.setBorder(new LineBorder(new Color(0, 0, 0)));
		tableAC.setModel(new DefaultTableModel(listaTC,new String[] {"Tipo de cobertura", "Descripci\u00F3n"}));

		tableAC.getColumnModel().getColumn(0).setResizable(false);
		tableAC.getColumnModel().getColumn(0).setPreferredWidth(280);
		tableAC.getColumnModel().getColumn(0).setMinWidth(10);
		tableAC.getColumnModel().getColumn(0).setMaxWidth(500);
		tableAC.getColumnModel().getColumn(1).setPreferredWidth(409);
		tableAC.setBounds(20, 100, 739, 125);
		alternativasCobertura.add(tableAC);
		
		JLabel lblFechaInicio = new JLabel("Fecha de inicio de vigencia de la p\u00F3liza: ");
		lblFechaInicio.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFechaInicio.setBounds(20, 236, 313, 25);
		alternativasCobertura.add(lblFechaInicio);
		
		JLabel lblFormaPago = new JLabel("Forma de pago:");
		lblFormaPago.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFormaPago.setBounds(20, 272, 121, 25);
		alternativasCobertura.add(lblFormaPago);
		
		JRadioButton rdBtnMensual = new JRadioButton("MENSUAL");
		rdBtnMensual.setBounds(147, 275, 90, 23);
		alternativasCobertura.add(rdBtnMensual);
		
		JRadioButton rdBtnSemestral = new JRadioButton("SEMESTRAL");
		rdBtnSemestral.setBounds(246, 275, 110, 23);
		alternativasCobertura.add(rdBtnSemestral);
		rdBtnSemestral.setSelected(true);;
		
		ButtonGroup eleccion = new ButtonGroup();
		eleccion.add(rdBtnMensual);
		eleccion.add(rdBtnSemestral);
		
		JButton btnAtrasAC = new JButton("Atr\u00E1s");
		btnAtrasAC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAtrasAC.setBackground(Color.WHITE);
		btnAtrasAC.setBounds(10, 308, 90, 25);
		btnAtrasAC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PolizaGenerar polizaGenerar = new PolizaGenerar(clienteDTO,polDTO);
				polizaGenerar.setVisible(true);
				dispose();
			}
		});
		alternativasCobertura.add(btnAtrasAC);
		
		JButton btnCancelarAC = new JButton("Cancelar");
		btnCancelarAC.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelarAC.setBackground(Color.WHITE);
		btnCancelarAC.setBounds(110, 308, 90, 25);
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
		
		Calendar actual = Calendar.getInstance();
        Calendar unmes = Calendar.getInstance();
        Calendar undia = Calendar.getInstance();
        
        unmes.add(Calendar.MONTH, 1);
        undia.add(Calendar.DATE, 1);
        
		JSpinner spinner = new JSpinner(new SpinnerDateModel(undia.getTime(),actual.getTime(),unmes.getTime(), Calendar.DATE));
		JSpinner.DateEditor editor = new JSpinner.DateEditor(spinner, "dd/MM/yy");
		spinner.setEditor(editor);
		((DefaultEditor) spinner.getEditor()).getTextField().setEditable(false);
		
		
		spinner.setBounds(343, 238, 120, 25);
		alternativasCobertura.add(spinner);
		
		JLabel lblTipoDeCobertura = new JLabel("Tipo de cobertura");
		lblTipoDeCobertura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTipoDeCobertura.setBounds(27, 75, 141, 19);
		alternativasCobertura.add(lblTipoDeCobertura);
		
		JLabel lblDescripcion = new JLabel("Descripci\u00F3n");
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDescripcion.setBounds(301, 75, 96, 19);
		alternativasCobertura.add(lblDescripcion);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSiguiente.setBackground(Color.WHITE);
		btnSiguiente.setBounds(674, 308, 96, 25);
		btnSiguiente.setEnabled(false);
		
		tableAC.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent arg0) {
				btnSiguiente.setEnabled(true);
			}
		});
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String tipoPoliza;
				if (rdBtnMensual.isSelected())
					tipoPoliza="MENSUAL";
				else 
					tipoPoliza="SEMESTRAL";
				
				TipoCobertura cobertura= tipoCobertura.get(tableAC.getSelectedRow());
				Date inicioVigencia = (Date) spinner.getValue();
				
				FachadaPoliza.getInstance().setCobertura(polDTO,cobertura,inicioVigencia,tipoPoliza);
				PolizaGenerada polizaGenerada = new PolizaGenerada(polDTO,clienteDTO,anio);
				polizaGenerada.setVisible(true);
				dispose();
				
				/*//boolean[] seleccionado = new boolean[5];
				int contSeleccion=0;
				
				eleccion.isSelected(null);
				if (rdBtnMensual.isSelected() || rdBtnSemestral.isSelected()) {
					for (int i=0;i<5;i++) {
						seleccionado[i]=(boolean) tableAC.getModel().getValueAt(i, 2);
						if (seleccionado[i]==true)
							contSeleccion++;
					}//ARREGLAR!
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
				*/
			}
		});
		alternativasCobertura.add(btnSiguiente);
		
	}
}
