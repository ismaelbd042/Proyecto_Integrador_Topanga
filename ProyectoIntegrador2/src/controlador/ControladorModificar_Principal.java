package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaEditar;
import vista.VentanaModificar;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorModificar_Principal implements ActionListener {

	// Ventana que vamos a usar
	private Ventana v;
	private VentanaModificar vm;

	/**
	 * Constructor de ControladorModificar_Principal
	 * @param vm ventana modificar
	 * @param v ventana principal
	 */
	public ControladorModificar_Principal(VentanaModificar vm, Ventana v ){
		this.vm = vm;
		this.v = v;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// cerramos la ventana modificar y abrimos la principal
		vm.dispose();
		v.hacerVisible();
		
	}
}
