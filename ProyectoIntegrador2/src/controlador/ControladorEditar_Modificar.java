package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaEditar;
import vista.VentanaModificar;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorEditar_Modificar implements ActionListener {

	// Ventanas que vamos a usar
	private VentanaEditar ve;
	private VentanaModificar vm;
 /**
  * Constructor de ControladorEditar_Modificar
  * @param vm ventana modificar
  * @param ve ventana editar
  */
	public ControladorEditar_Modificar(VentanaModificar vm, VentanaEditar ve) {
		this.vm = vm;
		this.ve = ve;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Cerramos la ventana editar
		ve.dispose();
		// Abrimos la ventana modificar
		vm.hacerVisible();
		
	}

}
