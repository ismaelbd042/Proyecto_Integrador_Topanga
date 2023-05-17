package vista;

import java.awt.event.*;

import javax.swing.*;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorEditar_Modificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar_Contra;
import controlador.ControladorContraseña_Subir;
import controlador.ControladorPrincipal_Subir_Contra;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;

public class VentanaContraseña1 extends JFrame implements IVentana {

	private JLabel lblIntroduzca;
	private JButton btnVerificar;
	private JButton btnverContrasena;
	private JPasswordField contraseña;
	private JButton verContraseña;
	private boolean seVe;
	private char echoChar;

	public VentanaContraseña1() {
		super("Verificar Contraseña");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		lblIntroduzca = new JLabel("Introduzca la contraseña:");
		lblIntroduzca.setBounds(39, 35, 168, 20);
		getContentPane().add(lblIntroduzca);

		btnVerificar = new JButton("Verificar Contraseña");
		btnVerificar.setBounds(33, 104, 219, 29);
		getContentPane().add(btnVerificar);

		contraseña = new JPasswordField();
		contraseña.setBounds(33, 66, 162, 20);
		getContentPane().add(contraseña);

		echoChar = contraseña.getEchoChar();
    
		JButton verContraseña = new JButton();
		verContraseña.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				seVe = false;
				if (!seVe) {
					contraseña.setEchoChar((char) 0);
					seVe = true;
				} else {
					contraseña.setEchoChar(echoChar);
					seVe = false;
				}

			}
		});

		verContraseña.setIcon(new ImageIcon(VentanaContraseña1.class.getResource("/img/botonOJO.png")));
		verContraseña.setBounds(222, 60, 30, 30);
		getContentPane().add(verContraseña);

		setSize(300, 217);
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
	public void setControlador(ControladorContraseña_Subir c) {
		btnVerificar.addActionListener(c);

	}

	@Override
	public void setControlador(ControladorPrincipal_Modificar_Contra c) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void setControlador(ControladorContraseña_Modificar c) {
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

	@Override
	public void setControlador(ControladorPrincipal_Subir_Contra c) {
		// TODO Auto-generated method stub
		
	}
}
