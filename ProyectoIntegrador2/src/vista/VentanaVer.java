package vista;

import javax.swing.JFrame;

import controlador.ControladorPrincipal_Ver;
import modelo.ProyectosIntegradores;

import javax.swing.*;

public class VentanaVer extends JFrame implements IVentana {
	private JTextField textField;

	public VentanaVer() {
		super("Ver proyectos");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Inspeccionar");
		btnNewButton.setBounds(154, 254, 195, 45);
		getContentPane().add(btnNewButton);

		JComboBox<ProyectosIntegradores> comboBox = new JComboBox();
		comboBox.setBounds(264, 28, 195, 52);
		getContentPane().add(comboBox);

		textField = new JTextField();
		textField.setBounds(25, 32, 195, 45);
		getContentPane().add(textField);
		textField.setColumns(10);

		setSize(512, 384);
		setLocationRelativeTo(null);

	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	@Override
	public void setControlador(ControladorPrincipal_Ver c) {
		// TODO Auto-generated method stub

	}
}
