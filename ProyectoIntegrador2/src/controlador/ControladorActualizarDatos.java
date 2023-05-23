package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import conexionBBDD.AccesoBBDD;
import vista.VentanaEditar;
import vista.VentanaModificar;

public class ControladorActualizarDatos implements ActionListener {

	// Ventanas que vamos a utilizar
	private VentanaEditar ve;
	private VentanaModificar vm;

	/**
	 * Constructor de ControladorActualizarDatos
	 * 
	 * @param ve Ventana Editar
	 * @param vm Ventana Modificar
	 */
	public ControladorActualizarDatos(VentanaEditar ve, VentanaModificar vm) {
		// TODO Auto-generated constructor stub
		this.ve = ve;
		this.vm = vm;
	}

	/**
	 * Metodo del actionPerformed
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// Variable y le metemos los datos
		try {
			if (ve.getUrl().equals("") || ve.getNota().equals("") || ve.getNombre().equals("")) {
				JOptionPane.showMessageDialog(ve.getContentPane(), "Rellena todos los campos", "Aviso",
						JOptionPane.WARNING_MESSAGE);
			} else {
				Integer.parseInt(ve.getNota().getText());
				AccesoBBDD.actualizarProyecto(ve.getLbldatonombreAntiguo().getText(), ve.getNombre().getText(),
						ve.getUrl().getText(), ve.getNota().getText());
				ve.dispose();
				vm.hacerVisible();
			}
		} catch (Exception exception) {
			JOptionPane.showMessageDialog(ve.getContentPane(), "Un dato no es correcto", "Error",
					JOptionPane.ERROR_MESSAGE);
		}
	}
}