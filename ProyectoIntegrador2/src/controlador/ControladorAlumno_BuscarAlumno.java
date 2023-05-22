package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.VentanaAlumno;
import vista.VentanaBuscarAlumno;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorAlumno_BuscarAlumno implements ActionListener {

	// Ventanas que vamos a utilizar en esta clase
	private VentanaBuscarAlumno vba;
	private VentanaAlumno va;

	/**
	 * Constructor de ControladorAlumno_BuscarAlumno
	 * @param va Ventana Alumno
	 * @param vba Ventana Buscar Alumno
	 */
	public ControladorAlumno_BuscarAlumno(VentanaAlumno va, VentanaBuscarAlumno vba) {
		this.vba = vba;
		this.va = va;
	}

	/**
	 *  Metodo del actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Cerramos la ventana alumno
		va.dispose();
		
		// Variables y metemos datos de la ventana alumno
		String nombre = va.txtNombre.getText();
        String apellidos = va.txtApellidos.getText();
        String expediente = va.txtExpediente.getText();

        // Llamamos al método para crear el alumno y agregamos las variables a la base de datos
        AccesoBBDD.crearAlumno(nombre, apellidos, expediente);

        // Limpiamos los campos de texto después de crear el alumno
        va.txtNombre.setText("");
        va.txtApellidos.setText("");
        va.txtExpediente.setText("");
        
        //Esto es para ver lo que busca el usuario
        String nombreApellido = vba.getTxtBuscador().getText();
        //Limpiamos la seleccion
        vba.getListAlumnos().clearSelection();
        // Rellenamos la lista con los nombres
		vba.rellenarJlistAlumno(AccesoBBDD.conseguirNombresyApellidos(nombreApellido));
	}

}
