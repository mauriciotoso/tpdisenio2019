package Pantallas.CU01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import DTO.ClienteDTO;
import DTO.PolizaDTO;
import Logica.FachadaPoliza;
import Pantallas.InicioSesion;
import Pantallas.MenuProductorSeguro;

public class PolizaGenerada extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public PolizaGenerada(PolizaDTO polDTO,ClienteDTO clienteDTO,int anio,int numeroHijos) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel polizaGenerada = new JPanel();
		polizaGenerada.setBounds(0, 0, 784, 561);
		polizaGenerada.setLayout(null);
		contentPane.add(polizaGenerada);
		
		JSplitPane polizaGeneradaSplit = new JSplitPane();
		polizaGeneradaSplit.setBounds(25, 80, 734, 380);
		polizaGeneradaSplit.setEnabled(false);
		polizaGeneradaSplit.setOrientation(JSplitPane.VERTICAL_SPLIT);
		polizaGeneradaSplit.setDividerLocation(200);
		polizaGenerada.add(polizaGeneradaSplit);
		
		JPanel panelArriba = new JPanel();
		panelArriba.setBorder(new LineBorder(new Color(0, 0, 0)));
		polizaGeneradaSplit.setLeftComponent(panelArriba);
		panelArriba.setLayout(null);
		
		JLabel lblTitular = new JLabel("Titular del seguro");
		lblTitular.setBounds(10, 10, 138, 20);
		lblTitular.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelArriba.add(lblTitular);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(25, 35, 50, 20);
		panelArriba.add(lblNombre);
		
		JTextField tfNombre = new JTextField();
		tfNombre.setBounds(85, 35, 100, 20);
		tfNombre.setEditable(false);
		panelArriba.add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(210, 35, 50, 20);
		panelArriba.add(lblApellido);
		
		JTextField tfApellido = new JTextField();
		tfApellido.setBounds(265, 35, 100, 20);
		tfApellido.setEditable(false);
		tfApellido.setColumns(10);
		panelArriba.add(tfApellido);
		
		JLabel lblDatos = new JLabel("Datos del veh\u00EDculo");
		lblDatos.setBounds(10, 65, 140, 20);
		lblDatos.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelArriba.add(lblDatos);
		
		JLabel lblMarca = new JLabel("Marca:");
		lblMarca.setBounds(25, 90, 50, 20);
		panelArriba.add(lblMarca);
		
		JTextField tfMarca = new JTextField();
		tfMarca.setBounds(85, 90, 100, 20);
		tfMarca.setEditable(false);
		tfMarca.setColumns(10);
		panelArriba.add(tfMarca);
		
		JLabel lblModelo = new JLabel("Modelo:");
		lblModelo.setBounds(210, 90, 50, 20);
		panelArriba.add(lblModelo);
		
		JTextField tfModelo = new JTextField();
		tfModelo.setBounds(265, 90, 100, 20);
		tfModelo.setEditable(false);
		tfModelo.setColumns(10);
		panelArriba.add(tfModelo);
		
		JLabel lblMotor = new JLabel("Motor:");
		lblMotor.setBounds(25, 115, 50, 20);
		panelArriba.add(lblMotor);
		
		JTextField tfMotor = new JTextField();
		tfMotor.setBounds(85, 115, 100, 20);
		tfMotor.setEditable(false);
		tfMotor.setColumns(10);
		panelArriba.add(tfMotor);
		
		JLabel lblChasis = new JLabel("Chasis:");
		lblChasis.setBounds(210, 115, 50, 20);
		panelArriba.add(lblChasis);
		
		JTextField tfChasis = new JTextField();
		tfChasis.setBounds(265, 115, 100, 20);
		tfChasis.setEditable(false);
		tfChasis.setColumns(10);
		panelArriba.add(tfChasis);
		
		JLabel lblPatente = new JLabel("Patente:");
		lblPatente.setBounds(390, 115, 50, 20);
		panelArriba.add(lblPatente);
		
		JTextField tfPatente = new JTextField();
		tfPatente.setBounds(445, 115, 100, 20);
		tfPatente.setEditable(false);
		tfPatente.setColumns(10);
		panelArriba.add(tfPatente);
		
		JLabel lblVigencia = new JLabel("Vigencia");
		lblVigencia.setBounds(10, 145, 80, 20);
		lblVigencia.setFont(new Font("Tahoma", Font.BOLD, 15));
		panelArriba.add(lblVigencia);
		
		JLabel lblFechaIni = new JLabel("Fecha de inicio:");
		lblFechaIni.setBounds(25, 170, 90, 20);
		panelArriba.add(lblFechaIni);
		
		JTextField tfFechaIni = new JTextField();
		tfFechaIni.setBounds(125, 170, 180, 20);
		tfFechaIni.setEditable(false);
		tfFechaIni.setColumns(10);
		panelArriba.add(tfFechaIni);
		
		JLabel lblFechaFin = new JLabel("Fecha de fin:");
		lblFechaFin.setBounds(330, 170, 80, 20);
		panelArriba.add(lblFechaFin);
		
		JTextField tfFechaFin = new JTextField();
		tfFechaFin.setBounds(420, 170, 180, 20);
		tfFechaFin.setEditable(false);
		tfFechaFin.setColumns(10);
		panelArriba.add(tfFechaFin);
		
		JPanel panelAbajo = new JPanel();
		panelAbajo.setBorder(new LineBorder(new Color(0, 0, 0)));
		polizaGeneradaSplit.setRightComponent(panelAbajo);
		panelAbajo.setLayout(null);
		
		JLabel lblSumaAseg = new JLabel("Suma asegurada:");
		lblSumaAseg.setBounds(25, 10, 115, 20);
		panelAbajo.add(lblSumaAseg);
		
		JTextField tfSumaAseg = new JTextField();
		tfSumaAseg.setBounds(160, 10, 100, 20);
		tfSumaAseg.setEditable(false);
		tfSumaAseg.setColumns(10);
		panelAbajo.add(tfSumaAseg);
		
		JLabel lblPremio = new JLabel("Premio:");
		lblPremio.setBounds(25, 41, 115, 20);
		panelAbajo.add(lblPremio);
		
		JTextField tfPremio = new JTextField();
		tfPremio.setBounds(160, 41, 100, 20);
		tfPremio.setEditable(false);
		tfPremio.setColumns(10);
		panelAbajo.add(tfPremio);
		
		JLabel lblUltimoDia = new JLabel("\u00DAltimo d\u00EDa de pago:");
		lblUltimoDia.setBounds(25, 72, 115, 20);
		panelAbajo.add(lblUltimoDia);
		
		JTextField tfUltimoDia = new JTextField();
		tfUltimoDia.setBounds(160, 72, 100, 20);
		tfUltimoDia.setEditable(false);
		tfUltimoDia.setColumns(10);
		panelAbajo.add(tfUltimoDia);
		
		JLabel lblMontoCuota = new JLabel("Monto por cuota:");
		lblMontoCuota.setBounds(25, 103, 115, 20);
		panelAbajo.add(lblMontoCuota);
		
		JTextField tfMontoCuota = new JTextField();
		tfMontoCuota.setBounds(160, 103, 100, 20);
		tfMontoCuota.setEditable(false);
		tfMontoCuota.setColumns(10);
		panelAbajo.add(tfMontoCuota);
		
		JLabel lblMontoTotal = new JLabel("Monto total a pagar:");
		lblMontoTotal.setBounds(25, 134, 115, 20);
		panelAbajo.add(lblMontoTotal);
		
		JTextField tfMontoTotal = new JTextField();
		tfMontoTotal.setBounds(160, 134, 100, 20);
		tfMontoTotal.setEditable(false);
		tfMontoTotal.setColumns(10);
		panelAbajo.add(tfMontoTotal);
		
		JLabel lblDescuento = new JLabel("Importe por descuento:");
		lblDescuento.setBounds(285, 41, 140, 20);
		panelAbajo.add(lblDescuento);
		
		JTextField tfDescuento = new JTextField();
		tfDescuento.setBounds(450, 41, 100, 20);
		tfDescuento.setEditable(false);
		tfDescuento.setColumns(10);
		panelAbajo.add(tfDescuento);
		
		JLabel lblDatosPoliza = new JLabel("Datos de la p\u00F3liza");
		lblDatosPoliza.setBounds(50, 25, 203, 31);
		lblDatosPoliza.setFont(new Font("Tahoma", Font.PLAIN, 25));
		polizaGenerada.add(lblDatosPoliza);
		
		JButton btnCancelarPG = new JButton("Cancelar");
		btnCancelarPG.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCancelarPG.setBackground(Color.WHITE);
		btnCancelarPG.setBounds(10, 526, 90, 25);
		btnCancelarPG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Desea cancelar la transacción?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					InicioSesion inicioSesion = new InicioSesion();
					inicioSesion.setVisible(true);
					dispose();
				}
			}
		});
		polizaGenerada.add(btnCancelarPG);
		
		JButton btnCambioCobertura = new JButton("Cambiar cobertura");
		btnCambioCobertura.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCambioCobertura.setBackground(Color.WHITE);
		btnCambioCobertura.setBounds(514, 526, 150, 25);
		btnCambioCobertura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Desea cambiar el tipo de cobertura?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					Cobertura cobertura = new Cobertura(polDTO,clienteDTO,anio,numeroHijos);
					cobertura.setVisible(true);
					dispose();
				}
			}
		});
		polizaGenerada.add(btnCambioCobertura);
		
		JButton btnConfirmarPG = new JButton("Confirmar");
		btnConfirmarPG.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnConfirmarPG.setBackground(Color.WHITE);
		btnConfirmarPG.setBounds(674, 526, 100, 25);
		btnConfirmarPG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = JOptionPane.showConfirmDialog(null, "Desea confirmar la transacción?", "Confirmación", JOptionPane.YES_NO_OPTION);
				if (input==0) {
					JOptionPane.showMessageDialog(null, "Póliza generada con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
					
					FachadaPoliza.getInstance().altaPoliza(polDTO);
					
					MenuProductorSeguro menuProductorSeguro = new MenuProductorSeguro();
					menuProductorSeguro.setVisible(true);
					dispose();
					
					
		
				}
				
			}
			
		});
		polizaGenerada.add(btnConfirmarPG);
		
		tfNombre.setText(polDTO.getCliente().getNombre());
		tfApellido.setText(polDTO.getCliente().getApellido());
		tfMarca.setText(polDTO.getMarca());
		tfModelo.setText(polDTO.getModelo());
		tfMotor.setText(polDTO.getMotor());
		tfChasis.setText(polDTO.getChasis());
		tfPatente.setText(polDTO.getPatente());
		//tener en cuenta el formato de fecha al usar el string 
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");  
		String fechaInicio = dateFormat.format(polDTO.getFechaInicio()); 
		String fechaFin = dateFormat.format(polDTO.getFechaFin()); 
		
		tfFechaIni.setText(fechaInicio);
		tfFechaFin.setText(fechaFin);
		tfSumaAseg.setText("0");
		tfPremio.setText("0");
		tfDescuento.setText("0");
		
		Calendar c = Calendar.getInstance();
		c.setTime(polDTO.getFechaInicio());
		c.add(Calendar.DATE, -1);
		Date ultimoDiaPago = c.getTime();
		
		String ultimoDia = dateFormat.format(ultimoDiaPago); 
		
		tfDescuento.setText("0");
		tfUltimoDia.setText(ultimoDia);
		
		if(polDTO.getTipoPoliza()=="MENSUAL") {
			tfMontoCuota.setText(Float.toString(polDTO.getMontoTotal()/6));
		}else {
			tfMontoCuota.setText(Float.toString(polDTO.getMontoTotal()));	
		}
		
		tfMontoTotal.setText(Float.toString(polDTO.getMontoTotal()));
		
		System.out.println(polDTO);
	}

}
