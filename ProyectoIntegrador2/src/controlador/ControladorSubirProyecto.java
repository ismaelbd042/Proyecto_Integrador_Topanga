package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import conexionBBDD.AccesoBBDD;
import vista.Ventana;
import vista.VentanaSubir;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorSubirProyecto implements ActionListener {

	// Ventana que vamos a usar
	private VentanaSubir vs;
	private Ventana v;

	/**
	 * Constructor de ControladorSubirProyecto
	 * 
	 * @param vs ventana subir
	 */
	public ControladorSubirProyecto(VentanaSubir vs, Ventana v) {
		this.vs = vs;
		this.v = v;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			// Creamos un if para que cuando en el radiobutton haya algo seleccionado,
			// tambien en el label del nombre, url, curso y grupo, entonces se llame al
			// metodo subirProyecto
			if (!vs.getRbtnDefault().isSelected() && !vs.getNombre().equals("") && !vs.getLblurl().equals("")
					&& !vs.getLblano().equals("") && !vs.getLblcurso().equals("") && !vs.getLblgrupo().equals("")) {
				Integer.parseInt(vs.getTxtnota().getText());
				Integer.parseInt(vs.getTxtano().getText());
				vs.getDatosProyecto();
				System.out.println("1");
				AccesoBBDD.relacionarProyectoAlumno(vs.getDatosProyecto().getNombre_proyecto(), vs.getAux());
				System.out.println("2");
				AccesoBBDD.registrar(vs.getDatosProyecto());
				System.out.println("3");
				vs.dispose();
				v.hacerVisible();
				
			} else {
				JOptionPane.showMessageDialog(vs.getContentPane(), "Rellene los Campos", "Aviso",
						JOptionPane.ERROR_MESSAGE);
			}
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(vs.getContentPane(), "El año y/o la nota son incorrectos. \nTienen que ser números sin decimales.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

	}

}
