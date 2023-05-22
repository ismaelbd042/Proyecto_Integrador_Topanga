package controlador;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;

import vista.VentanaSubir;

/**
 * 
 * @author Ismael Bodas, Alvaro Serrano y Lucca Manfredotti
 *
 */
public class ListenerRadioButtonCurso implements ItemListener {
	
	//Variables
	static String curso;
	JRadioButton rbtn1;
	JRadioButton rbtn2;
	
	/**
	 * Constructor de ListenerRadioButtonCurso
	 * @param rbtn1
	 * @param rbtn2
	 */
	public ListenerRadioButtonCurso(JRadioButton rbtn1, JRadioButton rbtn2) {
		this.rbtn1 = rbtn1;
		this.rbtn2 = rbtn2;
	}

	/**
	 * Metodo de itemStateChanged
	 */
	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

		// Si esta el boton 1 seleccionado se pasa eso a curso
		if (rbtn1.isSelected()) {
			curso = "1º";
		// Si esta el boton 2 seleccionado se pasa eso a curso
		} else if (rbtn2.isSelected()) {
			curso = "2º";
		}
	}

	/**
	 * Getter de curso
	 * @return curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Setter de curso
	 * @param curso
	 */
	public void setCurso(String curso) {
		ListenerRadioButtonCurso.curso = curso;
	}
	

}
