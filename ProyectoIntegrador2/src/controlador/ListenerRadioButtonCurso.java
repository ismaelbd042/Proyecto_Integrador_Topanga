package controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import vista.VentanaSubir;

public class ListenerRadioButtonCurso implements ItemListener {
	static String curso;
	JRadioButton rbtn1;
	JRadioButton rbtn2;
	
	public ListenerRadioButtonCurso(JRadioButton rbtn1, JRadioButton rbtn2) {
		super();
		this.rbtn1 = rbtn1;
		this.rbtn2 = rbtn2;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

		if (rbtn1.isSelected()) {
			curso = "1º";
		} else if (rbtn2.isSelected()) {
			curso = "2º";
		}
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		ListenerRadioButtonCurso.curso = curso;
	}
	

}
