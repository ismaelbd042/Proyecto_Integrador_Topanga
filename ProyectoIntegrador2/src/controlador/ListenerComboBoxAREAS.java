package controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import modelo.Áreas;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ListenerComboBoxAREAS implements ItemListener {
	//Variables
	JComboBox<Áreas> areas;
	static String nombreArea;

	/**
	 * Metodo de itemStateChanged
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		
		areas = (JComboBox<Áreas>) e.getSource();
		nombreArea = (String) areas.getSelectedItem();

	}

	/**
	 * Metodo para averiguar el codigo del area
	 * @return devuelves el codigo
	 */
	public static int cambioArea_CodArea() {
		int cod = 0;
		// Comparamos el nombre y le añadimos un codigo
		if (nombreArea.equals("DAW")) {
			cod = 1;
		} else if (nombreArea.equals("DAM")) {
			cod = 2;
		} else if (nombreArea.equals("ASIR")) {
			cod = 3;
		} else if (nombreArea.equals("A3D")) {
			cod = 4;
		} else if (nombreArea.equals("VDJ")) {
			cod = 5;
		}
		return cod;
	}

}
