package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.*;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorPrincipal_Ver implements ActionListener {

	// Ventanas que vamos a usar
	private Ventana v;
	private VentanaVer vv;

	/**
	 * Constructor de ControladorPrincipal_Ver
	 * @param v ventana principal
	 * @param vv ventana ver
	 */
	public ControladorPrincipal_Ver(Ventana v, VentanaVer vv) {
		this.v = v;
		this.vv = vv;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Cerramos ventana principal
		v.dispose();
		vv.getAreas().removeAllItems();
		//Rellenamos las areas y la lista de proyectos
		vv.rellenarAreas(AccesoBBDD.conseguirAreas());
		vv.rellenarJlist(AccesoBBDD.conseguirNombresProyectos());
		vv.getTxtBuscarNombre().setText(null);
		// Hacemos visible la ventana ver
		vv.hacerVisible();

	}

}
