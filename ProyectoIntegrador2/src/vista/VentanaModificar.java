package vista;

import java.awt.event.ActionListener;

import javax.swing.*;

import controlador.ControladorModificar_Editar;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
import modelo.ProyectosIntegradores;

public class VentanaModificar extends JFrame implements IVentana {

	private JButton btnEditar;
	private JButton btnBorrar;

	public VentanaModificar() {
		super();
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		JComboBox<ProyectosIntegradores> proyectos = new JComboBox<>();
		proyectos.setBounds(22, 44, 282, 29);
		// alumnos.addItem(new Alumno ("Lucca", "Manfredotti", "465484156B", 19));
		// alumnos.addItem(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
		// alumnos.addItem(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
		// alumnos.addItem(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		getContentPane().add(proyectos);

		btnEditar = new JButton("BntEditar");
		// lblLogo.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		btnEditar.setBounds(22, 99, 136, 29);
		getContentPane().add(btnEditar);

		btnBorrar = new JButton("BntBorrar");
		// lblLogo.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		btnBorrar.setBounds(168, 99, 136, 29);
		getContentPane().add(btnBorrar);

		setSize(512, 384);
		setLocationRelativeTo(null);

	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	@Override
	public void setControlador(ControladorPrincipal_Ver c) {

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
		btnEditar.addActionListener(c);

	}

}
