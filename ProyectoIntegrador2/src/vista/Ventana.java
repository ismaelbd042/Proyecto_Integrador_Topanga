package vista;

import java.awt.Color;

import javax.swing.*;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorEditar_Modificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;
import java.awt.Font;

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
		lblLogo.setIcon(new ImageIcon(Ventana.class.getResource("/img/logo1.png")));
		lblLogo.setBounds(39, 76, 175, 175);
		getContentPane().add(lblLogo);

		btnSubir = new JButton("Subir Proyecto");
		btnSubir.setBounds(250, 138, 200, 50);
		btnSubir.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		btnSubir.setBorderPainted(false);
		btnSubir.setForeground(new Color(255, 255, 255));
		btnSubir.setBackground(new Color(59,79,123));
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

		btnBorrar = new JButton("Borrar Proyecto");
		btnBorrar.setBounds(250, 221, 200, 50);
		btnBorrar.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		btnBorrar.setBorderPainted(false);
		btnBorrar.setForeground(new Color(255, 255, 255));
		btnBorrar.setBackground(new Color(0,58,102));
		btnBorrar.setFocusable(false);
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

	public void setControlador(ControladorPrincipal_Subir c) {
		btnSubir.addActionListener(c);
	}
	
	public void setControlador(ControladorPrincipal_Modificar c) {
		btnBorrar.addActionListener(c);
	}
	
	public void setControlador(ControladorModificar_Editar c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorSubir_Principal c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorVer_Principal c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorModificar_Principal c) {
  		// TODO Auto-generated method stub

  }
  
	@Override
  public void setControlador(ControladorContraseña_Modificar c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorEditar_Modificar c) {
		// TODO Auto-generated method stub
		
	}
}
