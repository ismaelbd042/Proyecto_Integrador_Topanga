package vista;

import java.awt.HeadlessException;

import javax.swing.*;

import controlador.Controlador;

public class Ventana extends JFrame implements IVentana {

	private JLabel lblLogo;
	private JButton btnSubir;
	private JButton btnVer;
	private JButton btnBorrar;

	public Ventana() {
		super("Administrador de Proyectos");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		lblLogo = new JLabel("Logo");
		// lblLogo.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		lblLogo.setBounds(155, 34, 135, 131);
		getContentPane().add(lblLogo);

		btnSubir = new JButton("Subir Proyecto");
		btnSubir.setBounds(10, 202, 125, 48);
		getContentPane().add(btnSubir);

		btnVer = new JButton("Ver Proyecto");
		btnVer.setBounds(299, 202, 125, 48);
		getContentPane().add(btnVer);

		btnBorrar = new JButton("Borrar Proyecto");
		btnBorrar.setBounds(155, 202, 125, 48);
		getContentPane().add(btnBorrar);
	}

	@Override
	public void hacerVisible() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(Controlador c) {
		// TODO Auto-generated method stub

	}

}
