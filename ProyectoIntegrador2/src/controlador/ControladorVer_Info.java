package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import conexionBBDD.AccesoBBDD;
import modelo.ProyectosIntegradores;
import vista.VentanaInfo;
import vista.VentanaVer;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ControladorVer_Info implements ActionListener {

	//Ventanas que vamos a usar
	private VentanaVer vv;
	private VentanaInfo vi;

	/**
	 * Constructor de ControladorVer_Info
	 * @param vv ventana ver
	 * @param vi ventana info
	 */
	public ControladorVer_Info(VentanaVer vv, VentanaInfo vi) {
		this.vv = vv;
		this.vi = vi;
	}

	/**
	 * Metodo de actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String nombreProyectoSeleccionado = vv.getProyectos().getSelectedValue();
		if (nombreProyectoSeleccionado != null) {
		//Cerramos la ventana ver
		vv.dispose();
		//Rellenamos la informacion con los datos
		vi.rellenarInfo(AccesoBBDD.conseguirInfo(vv.getProyectos().getSelectedValue()), AccesoBBDD.conseguirColaboradores(vv.getProyectos().getSelectedValue()));
		//Inicializamos la variable
		String nombreArea = "";
		//Comparamos el texto para poner el nombre del area
		if (vi.getLblArea2().getText().equals("1")) {
			nombreArea = "DAW";
		} else if (vi.getLblArea2().getText().equals("2")) {
			nombreArea = "DAM";
		} else if (vi.getLblArea2().getText().equals("3")) {
			nombreArea = "ASIR";
		} else if (vi.getLblArea2().getText().equals("4")) {
			nombreArea = "A3D";
		} else if (vi.getLblArea2().getText().equals("5")) {
			nombreArea = "VDJ";
		}
		//Añadimos en la lbl el nombre
		vi.getLblArea2().setText(nombreArea);
		// Hacemos visible la ventan info
		vi.hacerVisible();
		} else {
			// Si no hay proyecto seleccionado, mensaje de aviso
			JOptionPane.showMessageDialog(vv.getContentPane(), "No hay ningún proyecto seleccionado", "Aviso",
					JOptionPane.WARNING_MESSAGE);
		}

	}

}
