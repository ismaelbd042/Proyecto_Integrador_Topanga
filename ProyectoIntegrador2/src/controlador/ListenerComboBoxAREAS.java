package controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import modelo.Áreas;

public class ListenerComboBoxAREAS implements ItemListener {
	static String nombreArea;

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		JComboBox<Áreas> areas = (JComboBox<Áreas>) e.getSource();

		nombreArea = (String) areas.getSelectedItem();

	}

	public static int cambioArea_CodArea() {
		int cod = 0;
		if (nombreArea.equals("DAW")) {
			cod = 1;
		} else if (nombreArea.equals("DAM")) {
			cod = 2;
		} else if (nombreArea.equals("ASIR")) {
			cod = 3;
		}
		return cod;
	}

}
