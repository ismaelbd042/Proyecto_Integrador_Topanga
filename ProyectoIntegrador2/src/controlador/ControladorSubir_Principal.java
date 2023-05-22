package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaSubir;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorSubir_Principal implements ActionListener {

	//Ventanas que vamos a usar
	private Ventana v;
	private VentanaSubir vs;

	/**
	 * Constructor de ControladorSubir_Principal
	 * @param v ventana principal
	 * @param vs ventana subir
	 */
	public ControladorSubir_Principal(Ventana v, VentanaSubir vs) {
		this.v = v;
		this.vs = vs;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Cerramos la ventana subir y abrimos la principal
		vs.dispose();
		v.hacerVisible();
	}

}
