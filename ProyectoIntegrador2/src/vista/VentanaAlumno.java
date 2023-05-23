package vista;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ControladorAlumno_BuscarAlumno;
import controlador.ControladorContraseña_Modificar;
import controlador.ControladorEditar_Modificar;
import controlador.ControladorInfo_Ver;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar_Contra;
import controlador.ControladorContraseña_Subir;
import controlador.ControladorPrincipal_Subir_Contra;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;

/**
 * 
 * @author Ismael Bodas, Álvaro Serrano y Lucca Mnafredotti
 *
 */
public class VentanaAlumno extends JFrame implements IVentana {

	//Creamos las variables de la ventana alumno
	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblExpediente;
	public JTextField txtNombre;
	public JTextField txtApellidos;
	public JTextField txtExpediente;
	private JButton btnAñadir;
	
	/**
	 * Esta ventana se titulará administrador de proyectos
	 */
	public VentanaAlumno() {
		super("Nuevo Alumno");
		inicializarComponentes();
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		getContentPane().setBackground(new Color(137,217,194));
	}

	/**
	 * Metodo inicializar componentes que sirve para ajustar los componentes a la ventana poniendole tamaños y posiciones
	 */
	@Override
	public void inicializarComponentes() {
		
		getContentPane().setLayout(null);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(48, 41, 93, 27);
		getContentPane().add(lblNombre);

		//Boton para añadir un nuevo alumno
		btnAñadir = new JButton("Crear nuevo alumno");
		btnAñadir.setBounds(48, 185, 196, 50);
		getContentPane().add(btnAñadir);
		
		lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setBounds(48, 88, 93, 27);
		getContentPane().add(lblApellidos);
		
		lblExpediente = new JLabel("Expediente:");
		lblExpediente.setBounds(48, 132, 93, 27);
		getContentPane().add(lblExpediente);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(126, 44, 118, 20);
		getContentPane().add(txtNombre);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(126, 91, 118, 20);
		getContentPane().add(txtApellidos);
		
		txtExpediente = new JTextField();
		txtExpediente.setBounds(126, 135, 118, 20);
		getContentPane().add(txtExpediente);

		//Agregamos tamaño a la ventana en si
		setSize(302, 306);
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
	 * SetControlador que nos sirve para darle funcionalidad al boton de Añadir alumno
	 * @param c
	 */
	public void setControlador(ControladorAlumno_BuscarAlumno c) {
		btnAñadir.addActionListener(c);
	}

}
