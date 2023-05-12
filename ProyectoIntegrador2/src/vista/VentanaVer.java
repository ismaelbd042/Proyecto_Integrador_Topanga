package vista;

import javax.swing.JFrame;

import controlador.ControladorPrincipal_Ver;
import extras.TextPrompt;
import modelo.ProyectosIntegradores;

import javax.swing.*;
import java.awt.Font;

public class VentanaVer extends JFrame implements IVentana {
	private JTextField txtNombreDelProyecto;

	public VentanaVer() {
		super("Ver proyectos");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Buscar...");
		btnNewButton.setBounds(138, 92, 173, 29);
		getContentPane().add(btnNewButton);

		JComboBox<ProyectosIntegradores> comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setToolTipText("");
		comboBox.setBounds(233, 26, 168, 29);
		getContentPane().add(comboBox);

		txtNombreDelProyecto = new JTextField();
		txtNombreDelProyecto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNombreDelProyecto.setBounds(38, 26, 168, 29);
		TextPrompt placeholder = new TextPrompt("Nombre del proyecto", txtNombreDelProyecto);
		getContentPane().add(txtNombreDelProyecto);

		setSize(239, 198);
		setLocationRelativeTo(null);
	
	}

	@Override
	public void hacerVisible() {
		setVisible(false);
	}

	@Override
	public void setControlador(ControladorPrincipal_Ver c) {
		// TODO Auto-generated method stub

	}
}
