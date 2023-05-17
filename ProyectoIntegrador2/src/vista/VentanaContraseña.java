package vista;

import java.awt.event.*;

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

public class VentanaContraseña extends JFrame implements IVentana {

	private JLabel lblIntroduzca;
	private JButton btnVerificar;
	private JButton btnverContrasena;
	private JPasswordField contraseña;
	private JButton verContraseña;
	private boolean seVe;
	private char echoChar;

	public VentanaContraseña() {
		super("Verificar Contraseña");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		lblIntroduzca = new JLabel("Introduzca la contraseña:");
		lblIntroduzca.setBounds(21, 40, 135, 29);
		getContentPane().add(lblIntroduzca);

		btnVerificar = new JButton("Verificar Contraseña");
		btnVerificar.setBounds(33, 104, 219, 29);
		getContentPane().add(btnVerificar);

		contraseña = new JPasswordField();
		contraseña.setBounds(10, 63, 159, 20);
		getContentPane().add(contraseña);

		seVe = false;
		echoChar = contraseña.getEchoChar();
		btnverContrasena = new JButton("Ver");
		btnverContrasena.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (!seVe) {
					contraseña.setEchoChar((char) 0);
					seVe = true;
				} else {
					contraseña.setEchoChar(echoChar);
					seVe = false;
				}

			}
		});

//		btnverContrasena.setIcon(new ImageIcon(VentanaContrasena.class.getResource("/img/botonOJO.png")));
		btnverContrasena.setBounds(195, 53, 77, 40);
		getContentPane().add(btnverContrasena);

		setSize(300, 200);
		setLocationRelativeTo(null);

	}
	
	public String getPassword() {
		char[] PwrdChar = contraseña.getPassword();
		String pwrd = new String(PwrdChar);
		
		return pwrd;
	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	@Override
	public void setControlador(ControladorPrincipal_Ver c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorModificar_Editar c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorPrincipal_Subir c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorPrincipal_Modificar c) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void setControlador(ControladorContraseña_Modificar c) {
		btnVerificar.addActionListener(c);
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
	public void setControlador(ControladorEditar_Modificar c) {
		// TODO Auto-generated method stub
		
	}
}
