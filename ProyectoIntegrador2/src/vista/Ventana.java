package vista;

import javax.swing.*;

import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;

public class Ventana extends JFrame implements IVentana {

	private JLabel lblLogo;
	private JButton btnSubir;
	private JButton btnVer;
	private JButton btnBorrar;

	public Ventana() {
		super("Administrador de Proyectos");
		inicializarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		lblLogo = new JLabel();
//		lblLogo.setIcon(new ImageIcon(Ventana.class.getResource("/img/logo1.png")));
		lblLogo.setBounds(60, 79, 166, 173);
		getContentPane().add(lblLogo);

		btnSubir = new JButton("Subir Proyecto");
		btnSubir.setBounds(250, 138, 200, 50);
		getContentPane().add(btnSubir);

		btnVer = new JButton("Ver Proyecto");
//		btnVer.addActionListener(new ActionListener());
		btnVer.setBounds(250, 54, 200, 50);
		getContentPane().add(btnVer);

		btnBorrar = new JButton("Borrar Proyecto");
		btnBorrar.setBounds(250, 221, 200, 50);
		getContentPane().add(btnBorrar);

		setSize(512, 384);
		setLocationRelativeTo(null);
	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	@Override
	public void setControlador(ControladorPrincipal_Ver c) {
		btnVer.addActionListener(c);
	}

	public void setControlador(ControladorPrincipal_Subir controladorP_S) {
		btnSubir.addActionListener(controladorP_S);
	}
}
