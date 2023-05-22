package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaAlumno;
import vista.VentanaBuscarAlumno;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorBuscarAlumno_Alumno implements ActionListener {

	//Variables y metemos datos dentro de ellas
	private VentanaBuscarAlumno vba;
	private VentanaAlumno va;

	/**
	 * Constructor de ControladorBuscarAlumno_Alumno
	 * @param vba Ventana Buscar Alumno
	 * @param va Ventana Alumno
	 */
	public ControladorBuscarAlumno_Alumno(VentanaBuscarAlumno vba, VentanaAlumno va) {
		this.vba = vba;
		this.va = va;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Hacemos visible la ventana alumno
		va.hacerVisible();
	}

}
