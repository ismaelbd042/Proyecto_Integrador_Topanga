package vista;

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

public class VentanaAlumno extends JFrame implements IVentana {

	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblExpediente;
	public JTextField txtNombre;
	public JTextField txtApellidos;
	public JTextField txtExpediente;
	private JButton btnAñadir;
	
	public VentanaAlumno() {
		super("Nuevo Alumno");
		inicializarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void inicializarComponentes() {
		
		getContentPane().setLayout(null);

		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(48, 41, 93, 27);
		getContentPane().add(lblNombre);

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

		setSize(302, 306);
		setLocationRelativeTo(null);
		
	}

	@Override
	public void hacerVisible() {
		setVisible(true);
		
	}
	
	public void setControlador(ControladorAlumno_BuscarAlumno c) {
		btnAñadir.addActionListener(c);
	}

}
