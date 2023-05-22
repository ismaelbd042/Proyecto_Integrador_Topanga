package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.VentanaBuscarAlumno;
import vista.VentanaSubir;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorSubir_BuscarAlumno implements ActionListener {

	//Ventanas que vamos a usar
	private VentanaSubir vs;
	private VentanaBuscarAlumno vba;

	/**
	 * Constructor de ControladorSubir_BuscarAlumno
	 * @param vs ventana subir
	 * @param vba ventana buscar alumno
	 */
	public ControladorSubir_BuscarAlumno(VentanaSubir vs, VentanaBuscarAlumno vba) {
		this.vs = vs;
		this.vba = vba;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Cerramos la ventana subir
		vs.dispose();
		//Añadimos datos a la variable
		String nombreApellido = vba.getTxtBuscador().getText();
		// Limpiamos la lista
		vba.getListAlumnos().clearSelection();
		//Reallenamos otra vez
		vba.rellenarJlistAlumno(AccesoBBDD.conseguirNombresyApellidos(nombreApellido));
		//Abrimos la ventana subir alumno
		vba.hacerVisible();
	}

}
