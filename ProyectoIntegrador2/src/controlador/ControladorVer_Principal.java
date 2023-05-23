package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaVer;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorVer_Principal implements ActionListener {

	//Ventanas que vamos a usar
	private Ventana v;
	private VentanaVer vv;

	/**
	 * Constructor de ControladorVer_Principal
	 * @param v ventana principal
	 * @param vv ventana ver
	 */
	public ControladorVer_Principal(Ventana v, VentanaVer vv) {
		this.v = v;
		this.vv = vv;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Cerramo la ventana ver y abrimos la principal
		vv.dispose();
		v.hacerVisible();

	}


}
