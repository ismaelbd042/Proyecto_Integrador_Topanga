package controlador;

import java.util.List;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Ismael Bodas, Álvaro Serrano y Lucca Manfredotti
 *
 */
public class ListenerJlistAlumno implements ListSelectionListener {

	static String nombreApellido;

	/**
	 * Metodo de valueChanged
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		//Creamos JList llamado list
		JList<String> list = (JList<String>) e.getSource();
		//Nueva lista de Strings llamada selected value
		List<String> selectedValues = list.getSelectedValuesList();

		//Creamos un if para comprobar si el selected value esta vacio
		if (!selectedValues.isEmpty()) {
			nombreApellido = selectedValues.get(0);

			//Creamos otro if para mostrar si esta seleccion en curso o seleccion definitiva
			if (e.getValueIsAdjusting()) {
				System.out.println("Seleccion en curso: " + ((JList) e.getSource()).getSelectedValuesList());
			} else {
				System.out.println("Seleccion definitiva: " + ((JList) e.getSource()).getSelectedValuesList());
			}
		}

	}

}
