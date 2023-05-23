package vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controlador.ControladorAgregarAlumno_BuscarAlumno;
import controlador.ControladorBuscarAlumno_Alumno;
import controlador.ControladorBuscarAlumno_Subir;
import controlador.ControladorContraseña_Modificar;
import controlador.ControladorEditar_Modificar;
import controlador.ControladorInfo_Ver;
import controlador.ControladorLupaBuscarAlumno;
import controlador.ControladorLupaModificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar_Contra;
import controlador.ControladorContraseña_Subir;
import controlador.ControladorPrincipal_Subir_Contra;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;
import controlador.ListenerComboBoxAREAS;
import modelo.Alumnos;
import modelo.ProyectosIntegradores;
import modelo.Áreas;

/**
 * 
 * @author Ismael Bodas, Álvaro Serrano y Lucca Manfredotti
 *
 */
public class VentanaBuscarAlumno extends JFrame implements IVentana {

	//Creamos las variables de la clase VentanaBuscarAlumno
	private JTextField txtBuscador;
	private JButton btnCrear;
	private JButton btnAñadir;
	public JList<String> listAlumnos;
	private JButton btnLupa;
	private JButton btnCancelar;
	private JLabel lblBusca;
	private JLabel lblFotoAlumno;
	ArrayList<String> aux;

	/**
	 * Llamamos a esta ventana Buscar Alumno
	 */
	public VentanaBuscarAlumno() {
		super("Buscar Alumno");
		inicializarComponentes();
		getContentPane().setBackground(new Color(137,217,194));
	}

	/**
	 * Metodo inicializar componentes que sire para darle tamaño y ajustar los componentes a la ventana 
	 */
	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);
		
		lblBusca = new JLabel("¡¡Busca a tu alumno!!");
		lblBusca.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblBusca.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusca.setBounds(114, 26, 259, 30);
		getContentPane().add(lblBusca);
		
		lblFotoAlumno = new JLabel();
		lblFotoAlumno.setIcon(new ImageIcon(Ventana.class.getResource("/img/alumn.png")));
		lblFotoAlumno.setBounds(9, 74, 130, 151);
		getContentPane().add(lblFotoAlumno);

		//Boton que sirve para añadir un alumno
		btnAñadir = new JButton("Añadir alumno");
		btnAñadir.setBounds(61, 251, 159, 30);
		getContentPane().add(btnAñadir);

		//Boton para crear alumno
		btnCrear = new JButton("Crear alumno");
		// btnBuscar.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/logo1.png")));
		btnCrear.setBounds(277, 251, 159, 30);
		getContentPane().add(btnCrear);

		txtBuscador = new JTextField();
		txtBuscador.setBounds(149, 74, 196, 20);
		getContentPane().add(txtBuscador);
		txtBuscador.setColumns(10);

		listAlumnos = new JList<>();
		DefaultListModel<String> mod = new DefaultListModel<>();
		// mod.addElement(new Alumno ("Lucca", "Manfredotti", "465484156B", 19));
		// mod.addElement(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
		// mod.addElement(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
		// mod.addElement(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		listAlumnos.setModel(mod);

		JScrollPane barradesplazamientoAlu = new JScrollPane();
		barradesplazamientoAlu.setBounds(149, 124, 196, 98);
		getContentPane().add(barradesplazamientoAlu);
		barradesplazamientoAlu.setViewportView(listAlumnos);

		//Boton lupa
		btnLupa = new JButton();
		btnLupa.setIcon(new ImageIcon(VentanaVer.class.getResource("/img/botonLUPA.png")));
		btnLupa.setBounds(355, 66, 37, 38);
		btnLupa.setBorderPainted(false);
		getContentPane().add(btnLupa);

		//Boton cancelar
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(176, 297, 159, 30);
		getContentPane().add(btnCancelar);

		//Ponemos tamaño a la ventana 
		setSize(512, 384);
		setLocationRelativeTo(null);

	}

	/**
	 * Creamos metodo hacer visible para hacer visible la ventana
	 */
	@Override
	public void hacerVisible() {
		setVisible(true);

	}

	/**
	 * Getter de la variable txtBuscador
	 * @return txtBuscador
	 */
	public JTextField getTxtBuscador() {
		return txtBuscador;
	}

	/**
	 * Setter de la variable txtBuscador
	 * @param txtBuscador
	 */
	public void setTxtBuscador(JTextField txtBuscador) {
		this.txtBuscador = txtBuscador;
	}

	/**
	 * Getter de la variable listAlumnos
	 * @return listAlumnos
	 */
	public JList<String> getListAlumnos() {
		return listAlumnos;
	}

	/**
	 * Setter de variable listAlumnos
	 * @param listAlumnos
	 */
	public void setListAlumnos(JList<String> listAlumnos) {
		this.listAlumnos = listAlumnos;
	}

	/**
	 * SetControlador para darle funcionalidad al boton Lupa
	 * @param c
	 */
	public void setControlador(ControladorLupaBuscarAlumno c) {
		btnLupa.addActionListener(c);
	}
	
	/**
	 * SetControlador para darle funcionalidad al boton de Crear
	 * @param c
	 */
	public void setControlador(ControladorBuscarAlumno_Alumno c) {
		btnCrear.addActionListener(c);
	}

	/**
	 * SetControlador para darle funcionalidad al boton de cancelar
	 * @param c
	 */
	public void setControlador(ControladorBuscarAlumno_Subir c) {
		btnCancelar.addActionListener(c);
	}
	
	/**
	 * SetControlador para darle funcionalidad al boton de añadir 
	 * @param c
	 */
	public void setControlador(ControladorAgregarAlumno_BuscarAlumno c) {
		btnAñadir.addActionListener(c);
	}
	
	/**
	 * Metodo rellenarJListAlumno sirve para rellenar la lista de alumnos 
	 * @param a
	 */
	public void rellenarJlistAlumno(ArrayList<String> a) {
		aux = a;
		DefaultListModel<String> mod = (DefaultListModel<String>) listAlumnos.getModel(); // Obtener el modelo de la JList
		mod.clear(); // Limpiar el modelo

		for (int i = 0; i < aux.size(); i++) {
			mod.addElement(aux.get(i)); // Agregar el nombre del proyecto al modelo
		}
	}
}
