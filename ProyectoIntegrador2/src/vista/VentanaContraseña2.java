package vista;

import java.awt.event.*;

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

/**
 * 
 * @author Ismael Bodas, Álvaro Serrano, Lucca Manfredotti
 *
 */
public class VentanaContraseña2 extends JFrame implements IVentana {

	//Creamos las variables de la clase VentanaContraseña2
	private JLabel lblIntroduzca;
	private JButton btnVerificar;
	private JButton btnverContrasena;
	public JPasswordField contraseña;
	private JButton verContraseña;
	private boolean seVe;
	private char echoChar;
	public JLabel incorrecto;

	/**
	 * Llamamos a esta ventana Verificar Contraseña
	 */
	public VentanaContraseña2() {
		super("Verificar Contraseña");
		inicializarComponentes();
	}

	/**
	 * Metodo inicializar componentes que sirve para poner tamaño y ajustar los componentes a la ventana
	 */
	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		lblIntroduzca = new JLabel("Introduzca la contraseña:");
		lblIntroduzca.setBounds(39, 35, 168, 20);
		getContentPane().add(lblIntroduzca);

		//Boton de verificar para verificar la contraseña
		btnVerificar = new JButton("Verificar Contraseña");
		btnVerificar.setBounds(33, 104, 219, 29);
		getContentPane().add(btnVerificar);

		contraseña = new JPasswordField();
		contraseña.setBounds(33, 66, 162, 20);
		getContentPane().add(contraseña);

		incorrecto = new JLabel();
		incorrecto.setBounds(39, 143, 168, 20);
		getContentPane().add(incorrecto);

		seVe = false;
		echoChar = contraseña.getEchoChar();
		JButton verContraseña = new JButton();
		verContraseña.addActionListener(new ActionListener() {

			//Sirve poder ocultar la contraseña, o mostrarla
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

		verContraseña.setIcon(new ImageIcon(VentanaContraseña2.class.getResource("/img/botonOJO.png")));
		verContraseña.setBounds(222, 60, 30, 30);
		getContentPane().add(verContraseña);

		//Ponemos tamaño a la ventana
		setSize(300, 217);
		setLocationRelativeTo(null);

	}

	/**
	 * Metodo getPassword que sirve para obtener la contraseña
	 * @return
	 */
	public String getPassword() {
		char[] PwrdChar = contraseña.getPassword();
		String pwrd = new String(PwrdChar);

		return pwrd;
	}

	/**
	 * Metodo hacer visible que sirve para hacer visible la ventana 
	 */
	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	/**
	 * SetControlador que sirve para darle funcionalidad al boton de verficar
	 * @param c
	 */
	public void setControlador(ControladorContraseña_Modificar c) {
		btnVerificar.addActionListener(c);
	}

}
