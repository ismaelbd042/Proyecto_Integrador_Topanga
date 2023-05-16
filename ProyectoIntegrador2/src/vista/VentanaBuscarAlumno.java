package vista;

import java.awt.HeadlessException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
import modelo.Alumnos;

public class VentanaBuscarAlumno extends JFrame implements IVentana {

	private JTextField txtBuscador;
	private JButton btnBuscar;
	private JButton btnAñadir;
	private JList<Alumnos> listAlumnos;

	public VentanaBuscarAlumno() {
		super("Buscar Alumno");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		txtBuscador = new JTextField();
		txtBuscador.setBounds(48, 41, 93, 27);
		getContentPane().add(txtBuscador);

		btnAñadir = new JButton("Añadir alumno");
		btnAñadir.setBounds(48, 185, 196, 50);
		getContentPane().add(btnAñadir);

		btnBuscar = new JButton();
		// btnBuscar.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/logo1.png")));
		btnBuscar.setBounds(48, 185, 196, 50);
		getContentPane().add(btnBuscar);

		listAlumnos = new JList<Alumnos>();
		DefaultListModel<Alumnos> mod = new DefaultListModel<>();
		// mod.addElement(new Alumno ("Lucca", "Manfredotti", "465484156B", 19));
		// mod.addElement(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
		// mod.addElement(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
		// mod.addElement(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		listAlumnos.setModel(mod);
		// listadoAlumnos.setBounds(300, 45, 20, 20);
		// getContentPane().add(listadoAlumnos);
		JScrollPane panelScroll2 = new JScrollPane();
		panelScroll2.setBounds(360, 257, 115, 96);
		getContentPane().add(panelScroll2);
		panelScroll2.setViewportView(listAlumnos);
		// ListenerListadoAlumnos escuchadorLista = new ListenerListadoAlumnos();
		// listAlumnos.addListSelectionListener(escuchadorLista);

		setSize(512, 384);
		setLocationRelativeTo(null);

	}

	@Override
	public void hacerVisible() {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorPrincipal_Ver c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorModificar_Editar c) {
		// TODO Auto-generated method stub

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
	public void setControlador(ControladorContraseña_Modificar c) {
		// TODO Auto-generated method stub

	}

}
