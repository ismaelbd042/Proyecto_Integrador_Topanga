package vista;

import javax.swing.JFrame;

import controlador.Controlador;
import modelo.ProyectosIntegradores;

import javax.swing.*;

public class VentanaVer extends JFrame implements IVentana {
	public VentanaVer() {
		super("Ver proyectos");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Inspeccionar");
		btnNewButton.setBounds(67, 104, 91, 21);
		getContentPane().add(btnNewButton);

		JComboBox<ProyectosIntegradores> comboBox = new JComboBox();
		comboBox.setBounds(25, 29, 168, 29);
		getContentPane().add(comboBox);
	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	@Override
	public void setControlador(Controlador c) {
		// TODO Auto-generated method stub

	}

}
