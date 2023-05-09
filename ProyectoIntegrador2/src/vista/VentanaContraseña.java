package vista;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import controlador.Controlador;


public class VentanaContraseña extends JFrame implements IVentana {
	
	private JLabel lblIntroduzca;
	private JButton btnVerificar;
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
		lblIntroduzca.setBounds(21, 23, 135, 29);
		getContentPane().add(lblIntroduzca);
		
		btnVerificar = new JButton("Verificar Contraseña");
		btnVerificar.setBounds(33, 104, 219, 29);
		getContentPane().add(btnVerificar);
		
		contraseña = new JPasswordField();
		contraseña.setBounds(10, 63, 159, 20);
		getContentPane().add(contraseña);
		
		seVe = false;
		echoChar = contraseña.getEchoChar();
		JButton verContraseña = new JButton("Ver");
		verContraseña.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!seVe) {
					contraseña.setEchoChar((char) 0);
					seVe=true;
				} else {
					contraseña.setEchoChar(echoChar);
					seVe=false;
				}
				
			}
		});
		
		verContraseña.setIcon(new ImageIcon(VentanaContraseña.class.getResource("/img/botonOJO.png")));
		verContraseña.setBounds(195, 53, 77, 40);
		getContentPane().add(verContraseña);
		
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
