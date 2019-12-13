package Pantallas.CU12;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import DTO.*;
import Logica.FachadaPoliza;
import Pantallas.InicioSesion;
import Pantallas.MenuCobrador;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class DetallePago extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfImporte;
	private JTextField tfImporteAbonado;
	private JTextField tfVuelto;

	public DetallePago(PolizaDTO polDTO,ArrayList<CuotaDTO> cuotasPagar, ReciboDTO reciboDTO,float importe) {
		
		this.setTitle("El Asegurado");
		setIconImage(Toolkit.getDefaultToolkit().getImage(InicioSesion.class.getResource("/Pantallas/protection.png")));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(283, 84, 400, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		setContentPane(contentPane);
		
		JButton button = new JButton("Aceptar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FachadaPoliza.getInstance().registrarPago(polDTO, reciboDTO);
				
				JOptionPane.showMessageDialog(null, "Recibo de pago emitido con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
				MenuCobrador menuCobrador = new MenuCobrador();
				menuCobrador.setVisible(true);
				dispose();
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 12));
		button.setBackground(Color.WHITE);
		button.setBounds(284, 125, 90, 25);
		contentPane.add(button);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 364, 95);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblImporte = new JLabel("Importe:");
		lblImporte.setBounds(38, 11, 98, 15);
		panel.add(lblImporte);
		lblImporte.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblImporteAbonado = new JLabel("Importe abonado:");
		lblImporteAbonado.setBounds(38, 38, 142, 15);
		panel.add(lblImporteAbonado);
		lblImporteAbonado.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblVuelto = new JLabel("Vuelto:");
		lblVuelto.setBounds(38, 64, 98, 15);
		panel.add(lblVuelto);
		lblVuelto.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		tfImporte = new JTextField();
		tfImporte.setEditable(false);
		tfImporte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfImporte.setBounds(190, 7, 126, 24);
		panel.add(tfImporte);
		tfImporte.setColumns(10);
		
		tfImporteAbonado = new JTextField();
		tfImporteAbonado.setEditable(false);
		tfImporteAbonado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfImporteAbonado.setColumns(10);
		tfImporteAbonado.setBounds(190, 33, 126, 24);
		panel.add(tfImporteAbonado);
		
		tfVuelto = new JTextField();
		tfVuelto.setEditable(false);
		tfVuelto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		tfVuelto.setColumns(10);
		tfVuelto.setBounds(190, 60, 126, 24);
		panel.add(tfVuelto);
		
		tfImporte.setText(Float.toString(reciboDTO.getImporte()));
		tfImporteAbonado.setText(Float.toString(reciboDTO.getImportePagado()));
		tfVuelto.setText(Float.toString(reciboDTO.getVuelto()));
		
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
		btnCancelar.setBounds(10, 127, 90, 25);
		contentPane.add(btnCancelar);
		
		JButton btnAtras = new JButton("Atr\u00E1s");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PagarCuotas pc = new PagarCuotas(polDTO,cuotasPagar,importe);
				pc.setVisible(true);
				dispose();
			}
		});
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAtras.setBackground(Color.WHITE);
		btnAtras.setBounds(110, 125, 90, 25);
		contentPane.add(btnAtras);
	}
}
