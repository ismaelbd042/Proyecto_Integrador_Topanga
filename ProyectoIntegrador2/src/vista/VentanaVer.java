package vista;

import controlador.*;
import modelo.ProyectosIntegradores;
import javax.swing.*;

public class VentanaVer extends JFrame implements IVentana {
	private JTextField textField;
	private JButton btninspeccionar;
	private JButton btnatras;
	private JList<ProyectosIntegradores> proyectos;
	private JButton btnLupa;

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
		comboBox.setBounds(277, 28, 195, 52);
		getContentPane().add(comboBox);

		textField = new JTextField();
		textField.setBounds(25, 32, 195, 45);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		proyectos = new JList<>();
		DefaultListModel<ProyectosIntegradores> mod = new DefaultListModel<>();
		//mod.addElement(new Alumno ("Lucca", "Manfredotti", "465484156B", 19));
		//mod.addElement(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
		//mod.addElement(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
		//mod.addElement(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		proyectos.setModel(mod);
		
		JScrollPane barradesplazamiento = new JScrollPane();
		barradesplazamiento.setBounds(152, 101, 181, 116);
		getContentPane().add(barradesplazamiento);
		barradesplazamiento.setViewportView(proyectos);
		
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
	public void setControlador(ControladorContraseña_Subir c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorPrincipal_Modificar_Contra c) {
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
	
	public void setControlador(ControladorVer_Info c) {
		btninspeccionar.addActionListener(c);

	}

	@Override
	public void setControlador(ControladorModificar_Principal c) {
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
