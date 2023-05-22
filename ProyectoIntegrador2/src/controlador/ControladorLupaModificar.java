package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.VentanaModificar;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorLupaModificar implements ActionListener{

	//Ventana que vamos a usar
	private VentanaModificar vm;
	
	/**
	 * Constructor de ControladorLupaModificar
	 * @param vm
	 */
	public ControladorLupaModificar(VentanaModificar vm) {
		this.vm = vm;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Añadimos datos a las variables
		String nombreBuscado = vm.getTxtBuscarNombre().getText();
		int area = ListenerComboBoxAREAS.cambioArea_CodArea();
		// Limpiamos la lista
		vm.getProyectos().clearSelection();
		// la rellanamos otra vez
		vm.rellenarJlist(AccesoBBDD.conseguirNombresProyectosLupa(nombreBuscado, area));
		
	}
}
