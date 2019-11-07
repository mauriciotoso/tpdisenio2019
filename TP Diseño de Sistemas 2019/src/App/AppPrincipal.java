package App;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Pantallas.InicioSesion;


public class AppPrincipal {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppPrincipal window = new AppPrincipal();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public AppPrincipal() {
		initialize();
	}

	private void initialize() {
		InicioSesion inicioSesion = new InicioSesion();
		inicioSesion.setVisible(true);
	}

}
