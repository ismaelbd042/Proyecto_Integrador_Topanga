package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

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
		//alumnos.addItem(new Alumno ("Lucca", "Manfredotti", "465484156B", 19));
		//alumnos.addItem(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
		//alumnos.addItem(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
		//alumnos.addItem(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		getContentPane().add(proyectos);
		
		btnEditar = new JButton("BntEditar");
		//lblLogo.setIcon(new ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		btnEditar.setBounds(22, 99, 136, 29);
		getContentPane().add(btnEditar);
		
		btnBorrar = new JButton("BntBorrar");
		//lblLogo.setIcon(new ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		btnBorrar.setBounds(168, 99, 136, 29);
		getContentPane().add(btnBorrar);
	
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
