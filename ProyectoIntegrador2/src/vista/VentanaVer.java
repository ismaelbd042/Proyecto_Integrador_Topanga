package vista;

import javax.swing.JFrame;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;
import modelo.ProyectosIntegradores;

import javax.swing.*;

public class VentanaVer extends JFrame implements IVentana {
	private JTextField textField;
	private JButton btninspeccionar;
	private JButton btnatras;

	public VentanaVer() {
		super("Ver proyectos");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		btninspeccionar = new JButton("Inspeccionar");
		btninspeccionar.setBounds(264, 239, 195, 45);
		getContentPane().add(btninspeccionar);
		
		btnatras = new JButton("Volver Atras");
		btnatras.setBounds(25, 239, 195, 45);
		getContentPane().add(btnatras);

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
	
	@Override
	public void setControlador(ControladorVer_Principal c) {
		btnatras.addActionListener(c);

	}

	@Override
	public void setControlador(ControladorPrincipal_Subir c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorPrincipal_Modificar c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorModificar_Editar c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorContraseña_Modificar c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorSubir_Principal c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorModificar_Principal c) {
		// TODO Auto-generated method stub
		
	}
}
