package vista;

import controlador.*;
import modelo.ProyectosIntegradores;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.*;

public class VentanaVer extends JFrame implements IVentana {
	
	private JLabel lblBusca;
	private JTextField textField;
	private JButton btninspeccionar;
	private JButton btnatras;
	private JList<ProyectosIntegradores> proyectos;
	private JButton btnLupa;
	ArrayList<String> aux;
	JComboBox<String> areas;

	public VentanaVer() {
		super("Ver proyectos");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);
		
		lblBusca = new JLabel("¡¡Busca tu proyecto!!");
		lblBusca.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblBusca.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusca.setBounds(114, 36, 259, 30);
		getContentPane().add(lblBusca);

		btninspeccionar = new JButton("Inspeccionar");
		btninspeccionar.setBounds(276, 258, 182, 45);
		getContentPane().add(btninspeccionar);

		btnatras = new JButton("Volver Atras");
		btnatras.setBounds(33, 258, 184, 45);
		getContentPane().add(btnatras);

		areas = new JComboBox<>();
		ListenerComboBoxAREAS listenerCbAreas = new ListenerComboBoxAREAS();
		areas.addItemListener(listenerCbAreas);
		areas.setBounds(274, 99, 184, 24);
		getContentPane().add(areas);

		textField = new JTextField();
		textField.setBounds(33, 99, 184, 24);
		getContentPane().add(textField);
		textField.setColumns(10);

		btnLupa = new JButton();
		btnLupa.setIcon(new ImageIcon(VentanaVer.class.getResource("/img/botonLUPA.png")));
		btnLupa.setBounds(227, 90, 37, 39);
		btnLupa.setBorderPainted(false);
		getContentPane().add(btnLupa);

		proyectos = new JList<>();
		DefaultListModel<ProyectosIntegradores> mod = new DefaultListModel<>();
		// mod.addElement(new Alumno ("Lucca", "Manfredotti", "465484156B", 19));
		// mod.addElement(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
		// mod.addElement(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
		// mod.addElement(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		proyectos.setModel(mod);

		JScrollPane barradesplazamiento = new JScrollPane();
		barradesplazamiento.setBounds(152, 144, 181, 87);
		getContentPane().add(barradesplazamiento);
		barradesplazamiento.setViewportView(proyectos);

		setSize(512, 384);
		setLocationRelativeTo(null);

	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	public void setControlador(ControladorVer_Principal c) {
		btnatras.addActionListener(c);

	}

	public void setControlador(ControladorVer_Info c) {
		btninspeccionar.addActionListener(c);

	}
  
	public void rellenarAreas(ArrayList<String> a) {
		aux = a;
		for (int i = 0; i < aux.size(); i++) {
			areas.addItem(aux.get(i));
		}
	}
}
