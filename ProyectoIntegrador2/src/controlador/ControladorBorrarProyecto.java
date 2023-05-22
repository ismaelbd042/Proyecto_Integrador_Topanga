package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import conexionBBDD.AccesoBBDD;
import vista.VentanaAlumno;
import vista.VentanaBuscarAlumno;
import vista.VentanaModificar;

public class ControladorBorrarProyecto implements ActionListener {

//	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
	private VentanaModificar vm;
//	private VentanaContraseña vc;
//	private VentanaBuscarAlumno vba;
//	private VentanaAlumno va;

	public ControladorBorrarProyecto(VentanaModificar vm) {
		this.vm = vm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombreProyectoSeleccionado = vm.proyectos.getSelectedValue();

        if (nombreProyectoSeleccionado != null) { // Verificar si se ha seleccionado un proyecto
            // Ejecutar la sentencia SQL DELETE para eliminar el proyecto de la base de datos
            if (AccesoBBDD.borrarProyecto(nombreProyectoSeleccionado)) {
                // Proyecto eliminado correctamente
                // Actualizar la lista o mostrar un mensaje de éxito
            	vm.rellenarJlist(AccesoBBDD.conseguirNombresProyectos());
            	JOptionPane.showMessageDialog(vm.getContentPane(), "Proyecto eliminado", "Aviso", JOptionPane.ERROR_MESSAGE);
            } 
        } else {
            JOptionPane.showMessageDialog(vm.getContentPane(), "No hay ningún proyecto seleccionado", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
	}
	

}
