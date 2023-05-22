package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaInfo;
import vista.VentanaVer;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorInfo_Ver implements ActionListener{
	
	// Ventanas que vamos a usar
	private VentanaVer vv;
	private VentanaInfo vi;

	/**
	 * Constructor de ControladorInfo_Ver
	 * @param vv ventana ver
	 * @param vi ventana info
	 */
	public ControladorInfo_Ver(VentanaVer vv, VentanaInfo vi) {
		this.vv = vv;
		this.vi = vi;
	}
	
	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Cerramos la ventana info y abrimos la de ver
		vi.dispose();
		vv.hacerVisible();
	}
	

}
