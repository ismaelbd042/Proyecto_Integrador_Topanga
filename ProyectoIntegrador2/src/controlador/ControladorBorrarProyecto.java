package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import conexionBBDD.AccesoBBDD;
import vista.VentanaAlumno;
import vista.VentanaBuscarAlumno;
import vista.VentanaModificar;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorBorrarProyecto implements ActionListener {

	// Ventanas que vamos a utilizar
	private VentanaModificar vm;

	/**
	 * Constructor de ControladorBorrarProyecto
	 * @param vm Ventana Modificar
	 */
	public ControladorBorrarProyecto(VentanaModificar vm) {
		this.vm = vm;
	}

	/**
	 * Metodo del actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Variable y le metemos los datos
		String nombreProyectoSeleccionado = vm.proyectos.getSelectedValue();

		// Verificar si se ha seleccionado un proyecto
        if (nombreProyectoSeleccionado != null) {
            // Llamamos al metodo de AccesoBBDD para borrar el proyecto
            if (AccesoBBDD.borrarProyecto(nombreProyectoSeleccionado)) {
                // Actualizamos la lista y mostramos ventana de aviso
            	vm.rellenarJlist(AccesoBBDD.conseguirNombresProyectos());
            	JOptionPane.showMessageDialog(vm.getContentPane(), "Proyecto eliminado", "Aviso", JOptionPane.ERROR_MESSAGE);
            } 
        } else {
        	//Si no hay proyecto seleccionado, mensaje de aviso
            JOptionPane.showMessageDialog(vm.getContentPane(), "No hay ningún proyecto seleccionado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
	}
	

}
