package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaEditar;
import vista.VentanaModificar;
import vista.VentanaVer;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorModificar_Editar implements ActionListener{

	// Ventana que vamos a usar
	private VentanaEditar ve;
	private VentanaModificar vm;

	/**
	 * Constructor de ControladorModificar_Editar
	 * @param vm
	 * @param ve
	 */
	public ControladorModificar_Editar(VentanaModificar vm, VentanaEditar ve) {
		this.vm = vm;
		this.ve = ve;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Cerramos la ventana modificar y abrimos la de editar
		vm.dispose();
		ve.hacerVisible();
		
	}

	

}
