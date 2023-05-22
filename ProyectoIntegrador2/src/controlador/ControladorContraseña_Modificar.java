package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.Ventana;
import vista.VentanaContraseña1;
import vista.VentanaContraseña2;
import vista.VentanaModificar;
import vista.VentanaVer;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorContraseña_Modificar implements ActionListener {

	// Ventanas que vamos a usar
	private Ventana v;
	private VentanaModificar vm;
	private VentanaContraseña2 vc2;

	/**
	 * Constructor de ControladorContraseña_Modificar
	 * @param vc2 Ventana Contraseña 2
	 * @param vm Ventana Modificar
	 * @param v Ventana principal
	 */
	public ControladorContraseña_Modificar(VentanaContraseña2 vc2, VentanaModificar vm, Ventana v) {
		this.vc2 = vc2;
		this.vm = vm;
		this.v = v;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Si la contraseña que escribe el usuario es igual a esta se hace lo siguiente
		if (vc2.getPassword().equals("Profesor")) {
			// Se cierra la ventana contraseña2
			vc2.dispose();
			// Se cierra la ventana principal
			v.dispose();
			// Se rellenan las areas con el metodo conseguirAreas
			vm.rellenarAreas(AccesoBBDD.conseguirAreas());
			// Rellenamos la lista con los nombre de los proyectos
			vm.rellenarJlist(AccesoBBDD.conseguirNombresProyectos());
			// Hacemos visible la ventana modificar
			vm.hacerVisible();
			// Aqui se vacia la lbl de incorreto para que no aparezca siempre incorrecto
			vc2.incorrecto.setText("");
			// Aqui se vacia el textfield para q no aparezca siempre la contraseña puesta
			vc2.contraseña.setText(null);
		} else {
			// Si falla la contraseña se muestra esto en la lbl
			vc2.incorrecto.setText("Contraseña incorrecta");
		}

	}
}
