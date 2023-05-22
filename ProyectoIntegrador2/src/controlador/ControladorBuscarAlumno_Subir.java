package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaBuscarAlumno;
import vista.VentanaSubir;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorBuscarAlumno_Subir implements ActionListener {

	// Ventanas que vamos a utilizar
	private VentanaSubir vs;
	private VentanaBuscarAlumno vba;

	/**
	 * Constructor de ControladorBuscarAlumno_Subir
	 * @param vba Ventana Buscar Alumno
	 * @param vs Ventana Subir
	 */
	public ControladorBuscarAlumno_Subir(VentanaBuscarAlumno vba, VentanaSubir vs) {
		this.vba = vba;
		this.vs = vs;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Cerramos la ventana buscar alumno y abrimos la de subir
		vba.dispose();
		vs.hacerVisible();
	}

}
