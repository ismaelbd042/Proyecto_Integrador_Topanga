package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.VentanaBuscarAlumno;
import vista.VentanaModificar;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorLupaBuscarAlumno implements ActionListener{

	// Ventana que vamos a usar
	private VentanaBuscarAlumno vba;
	
	 /**
	  * Constructor de ControladorLupaBuscarAlumno
	  * @param vba Ventana Buscar Alumno
	  */
	public ControladorLupaBuscarAlumno(VentanaBuscarAlumno vba) {
		this.vba = vba;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Añadimos datos en la variable
		String nombreApellido = vba.getTxtBuscador().getText();
		// Vaciamos la lista
		vba.getListAlumnos().clearSelection();
		// Rellenamos otra vez la lista con lo que pida el usuario
		vba.rellenarJlistAlumno(AccesoBBDD.conseguirNombresyApellidos(nombreApellido));
		
	}

}
