package controlador;

import java.util.List;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ListenerJList implements ListSelectionListener {

	//Variable
	static String nombreProyecto;

	/**
	 * Metodo de valueChanged
	 */
	@Override
	public void valueChanged(ListSelectionEvent e) {
		//Cogemos el valor de la lista
		JList<String> list = (JList<String>) e.getSource();
		List<String> selectedValues = list.getSelectedValuesList();

		
		if (!selectedValues.isEmpty()) {
			nombreProyecto = selectedValues.get(0);

			if (e.getValueIsAdjusting()) {
				System.out.println("Seleccion en curso: " + ((JList) e.getSource()).getSelectedValuesList());
			} else {
				System.out.println("Seleccion definitiva: " + ((JList) e.getSource()).getSelectedValuesList());
			}
		}

	}

}
