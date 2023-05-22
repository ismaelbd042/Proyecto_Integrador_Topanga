package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.VentanaVer;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorLupaVer implements ActionListener{

	//Ventana que vamos a usar
	private VentanaVer vv;
	
	/**
	 * Constructor de ControladorLupaVer
	 * @param vv ventana ver
	 */
	public ControladorLupaVer(VentanaVer vv) {
		this.vv = vv;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Añadimos datos a las variables
		String nombreBuscado = vv.getTxtBuscarNombre().getText();
		int area = ListenerComboBoxAREAS.cambioArea_CodArea();
		// Limpiamos la lista
		vv.getProyectos().clearSelection();
		//La rellenamos otra vez
		vv.rellenarJlist(AccesoBBDD.conseguirNombresProyectosLupa(nombreBuscado, area));
		
	}

}
