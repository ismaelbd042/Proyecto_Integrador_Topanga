package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.DropMode;

import conexionBBDD.AccesoBBDD;
import vista.*;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorContraseña_Subir implements ActionListener {

	// Ventana que vamos a usar
	private Ventana v;
	private VentanaSubir vs;
	private VentanaContraseña1 vc1;

	/**
	 * Constructor de ControladorContraseña_Subir
	 * @param vc1 Ventana contraseña 1
	 * @param vs Ventana subir
	 * @param Ventana principal
	 */
	public ControladorContraseña_Subir(VentanaContraseña1 vc1, VentanaSubir vs, Ventana v) {
		this.vc1 = vc1;
		this.vs = vs;
		this.v = v;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Si la contraseña que escribe el usuario es igual a esta se hace lo siguiente
		if (vc1.getPassword().equals("Profesor")) {
			// Se cierra la ventana contraseña1
			vc1.dispose();
			// Se cierra la ventana principal
			v.dispose();
			// Vaciamos los campos
			vs.getTxtano().setText(null);
			vs.getTxtnota().setText(null);
			vs.getTxtgrupo().setText(null);
			vs.getTxturl().setText(null);
			vs.getNombre().setText(null);
			vs.getListaAlu().setModel(new DefaultListModel<String>());
			vs.getAreas().removeAllItems();
			vs.getRbtnDefault().setSelected(true);
			
			// Se rellenan las areas con el metodo conseguirAreas
			vs.rellenarAreas(AccesoBBDD.conseguirAreas());
			// Hacemos visible la ventana subir
			vs.hacerVisible();
			// Aqui se vacia la lbl de incorreto para que no aparezca siempre incorrecto
			vc1.incorrecto.setText("");
			// Aqui se vacia el textfield para q no aparezca siempre la contraseña puesta
			vc1.contraseña.setText(null);
		} else {
			// Si falla la contraseña se muestra esto en la lbl
			vc1.incorrecto.setText("Contraseña incorrecta");
		}
	}

}
