package vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;

public class VentanaAlumno extends JFrame implements IVentana {

	private JLabel lblNombre;
	private JLabel lblApellidos;
	private JLabel lblExpediente;
	private JTextField txtNombre;
	private JTextField txtApellidos;
	private JTextField txtExpediente;
	private JButton btnAñadir;
	
	public VentanaAlumno() {
		super("Nuevo Alumno");
		inicializarComponentes();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void inicializarComponentes() {
		
		getContentPane().setLayout(null);

		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(48, 41, 93, 27);
		getContentPane().add(lblNombre);

		btnAñadir = new JButton("Crear nuevo alumno");
		btnAñadir.setBounds(48, 185, 196, 50);
		getContentPane().add(btnAñadir);
		
		lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(48, 88, 93, 27);
		getContentPane().add(lblApellidos);
		
		lblExpediente = new JLabel("Expediente");
		lblExpediente.setBounds(48, 132, 93, 27);
		getContentPane().add(lblExpediente);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(151, 38, 93, 33);
		getContentPane().add(txtNombre);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(151, 82, 93, 33);
		getContentPane().add(txtApellidos);
		
		txtExpediente = new JTextField();
		txtExpediente.setBounds(151, 129, 93, 33);
		getContentPane().add(txtExpediente);

		setSize(302, 306);
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
	public void setControlador(ControladorContraseña_Modificar c) {
		// TODO Auto-generated method stub
		
	}

}
