package controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;

import modelo.Áreas;

public class ListenerComboBoxAREAS implements ItemListener {

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		JComboBox<Áreas> areas = (JComboBox<Áreas>) e.getSource();
		
		String nombreArea = (String) areas.getSelectedItem();

	}

}
