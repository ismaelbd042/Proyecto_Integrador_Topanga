package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.*;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorEditar_Modificar;
import controlador.ControladorInfo_Ver;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar_Contra;
import controlador.ControladorContraseña_Subir;
import controlador.ControladorPrincipal_Subir_Contra;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;

public class Ventana extends JFrame implements IVentana {

	private JLabel lblLogo;
	private JButton btnSubir;
	private JButton btnVer;
	private JButton btnBorrar;
	private JLabel lblFondo;
	private JLabel lblCopy;

	public Ventana() {
		super("Administrador de Proyectos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/img/logo1.png")));
		getContentPane().setBackground(new Color(255, 255, 255));
		setBackground(new Color(255, 255, 255));
		inicializarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		lblLogo = new JLabel();
		lblLogo.setIcon(new ImageIcon(Ventana.class.getResource("/img/logo1.png")));
		lblLogo.setBounds(39, 76, 175, 175);
		getContentPane().add(lblLogo);

		btnSubir = new JButton("Subir Proyecto");
		btnSubir.setBounds(250, 138, 200, 50);
		btnSubir.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		btnSubir.setBorderPainted(false);
		btnSubir.setForeground(new Color(255, 255, 255));
		btnSubir.setBackground(new Color(59, 79, 123));
		btnSubir.setFocusable(false);
		getContentPane().add(btnSubir);

		btnVer = new JButton("Ver Proyecto");
		btnVer.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		btnVer.setBounds(250, 54, 200, 50);
		btnVer.setBorderPainted(false);
		btnVer.setForeground(new Color(255, 255, 255));
		btnVer.setBackground(new Color(123, 43, 68));
		btnVer.setFocusable(false);
		getContentPane().add(btnVer);

		btnBorrar = new JButton("Modificar Proyecto");
		btnBorrar.setBounds(250, 221, 200, 50);
		btnBorrar.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		btnBorrar.setBorderPainted(false);
		btnBorrar.setForeground(new Color(255, 255, 255));
		btnBorrar.setBackground(new Color(0, 58, 102));
		btnBorrar.setFocusable(false);
		getContentPane().add(btnBorrar);

		lblCopy = new JLabel("Copyright © 2004, 2023, Topanga and/or its affiliates.");
		lblCopy.setForeground(new Color(255, 255, 255));
		lblCopy.setFont(new Font("Calibri", Font.BOLD, 13));
		lblCopy.setBounds(103, 297, 340, 23);
		getContentPane().add(lblCopy);

		lblFondo = new JLabel();
		lblFondo.setIcon(new ImageIcon(Ventana.class.getResource("/img/fondo.jpg")));
		lblFondo.setBounds(0, 0, 496, 345);
		getContentPane().add(lblFondo);

		setSize(512, 384);
		setLocationRelativeTo(null);
	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	public void setControlador(ControladorPrincipal_Ver c) {
		btnVer.addActionListener(c);
	}

	public void setControlador(ControladorContraseña_Subir c) {
	}

	public void setControlador(ControladorPrincipal_Modificar_Contra c) {
		btnBorrar.addActionListener(c);
	}

	public void setControlador(ControladorPrincipal_Subir_Contra c) {
		btnSubir.addActionListener(c);
	}

}
