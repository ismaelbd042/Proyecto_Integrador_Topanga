package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorPrincipal_Modificar_Contra implements ActionListener {

	//Ventanas que vamos a usar
	private VentanaContraseña2 vc2;

	/**
	 * Constructor de ControladorPrincipal_Modificar_Contra
	 * @param vc2 ventana contraseña
	 */
	public ControladorPrincipal_Modificar_Contra(VentanaContraseña2 vc2) {
		this.vc2 = vc2;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Hacemos visible ventana contraseña 2
		vc2.hacerVisible();
	}

}
