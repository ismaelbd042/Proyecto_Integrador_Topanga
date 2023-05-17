package vista;

import java.awt.HeadlessException;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorEditar_Modificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar_Contra;
import controlador.ControladorContraseña_Subir;
import controlador.ControladorPrincipal_Subir_Contra;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;
import modelo.Alumnos;
import modelo.ProyectosIntegradores;

public class VentanaBuscarAlumno extends JFrame implements IVentana {

	private JTextField txtBuscador;
	private JButton btnCrear;
	private JButton btnAñadir;
	private JList<Alumnos> listAlumnos;
	private JButton btnLupa;

	public VentanaBuscarAlumno() {
		super("Buscar Alumno");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		btnAñadir = new JButton("Añadir alumno");
		btnAñadir.setBounds(45, 266, 196, 50);
		getContentPane().add(btnAñadir);

		btnCrear = new JButton("Crear alumno");
		// btnBuscar.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/logo1.png")));
		btnCrear.setBounds(251, 266, 196, 50);
		getContentPane().add(btnCrear);

		JComboBox<ProyectosIntegradores> comboBox = new JComboBox();
		comboBox.setBounds(277, 28, 195, 52);
		getContentPane().add(comboBox);

		txtBuscador = new JTextField();
		txtBuscador.setBounds(25, 32, 195, 45);
		getContentPane().add(txtBuscador);
		txtBuscador.setColumns(10);
		
		listAlumnos = new JList<>();
		DefaultListModel<Alumnos> mod = new DefaultListModel<>();
		//mod.addElement(new Alumno ("Lucca", "Manfredotti", "465484156B", 19));
		//mod.addElement(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
		//mod.addElement(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
		//mod.addElement(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		listAlumnos.setModel(mod);
		
		JScrollPane barradesplazamientoAlu = new JScrollPane();
		barradesplazamientoAlu.setBounds(157, 101, 181, 116);
		getContentPane().add(barradesplazamientoAlu);
		barradesplazamientoAlu.setViewportView(listAlumnos);
		
		btnLupa = new JButton();
		btnLupa.setIcon(new ImageIcon(VentanaVer.class.getResource("/img/botonLUPA.png")));
		
		btnLupa.setBounds(230, 37, 37, 37);
		btnLupa.setBorderPainted(false);
		getContentPane().add(btnLupa);

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
	public void setControlador(ControladorContraseña_Subir c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorPrincipal_Modificar_Contra c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorSubir_Principal c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorVer_Principal c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorModificar_Principal c) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setControlador(ControladorContraseña_Modificar c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorEditar_Modificar c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorPrincipal_Subir_Contra c) {
		// TODO Auto-generated method stub
		
	}


}
