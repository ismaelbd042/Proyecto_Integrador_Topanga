package controlador;

import java.util.List;

import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ListenerJList implements ListSelectionListener {

	static String nombreProyecto;

	@Override
	public void valueChanged(ListSelectionEvent e) {
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
