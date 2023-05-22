package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import vista.VentanaSubir;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorSubirProyecto implements ActionListener {
	
	//Ventana que vamos a usar
	private VentanaSubir vs;
	
	/**
	 * Constructor de ControladorSubirProyecto
	 * @param vs ventana subir
	 */
	public ControladorSubirProyecto(VentanaSubir vs) {
		this.vs = vs;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		//Creamos un if para que cuando en el radiobutton haya  algo seleccionado,  tambien en el label del nombre, url, curso y grupo, entonces se llame al metodo subirProyecto
		if (!vs.getRbtnDefault().isSelected() && !vs.getNombre().equals("") && !vs.getLblurl().equals("") && !vs.getLblano().equals("") && !vs.getLblcurso().equals("") && !vs.getLblgrupo().equals("")) {
			vs.cogerDatosProyecto();
		} else {
			JOptionPane.showMessageDialog(vs.getContentPane(), "Rellene los Campos", "Aviso", JOptionPane.ERROR_MESSAGE);
		}


	}

}
