package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorPrincipal_Subir_Contra implements ActionListener {

	//Ventana que vamos a usar
	private VentanaContraseña1 vc1;

	/**
	 * Constructor de ControladorPrincipal_Subir_Contra
	 * @param vc1 ventana contraseña 1
	 */
	public ControladorPrincipal_Subir_Contra(VentanaContraseña1 vc1) {
		this.vc1 = vc1;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Hacemos visible la ventana contraseña 1
		vc1.hacerVisible();
	}

}
