package vista;

import controlador.*;
import modelo.ProyectosIntegradores;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.*;

public class VentanaVer extends JFrame implements IVentana {
	
	private JLabel lblBusca;
	private JLabel lblFotoBuscar;
	private JTextField txtBuscarNombre;
	private JButton btninspeccionar;
	private JButton btnatras;
	private JList<String> proyectos;
	private JButton btnLupa;
	ArrayList<String> aux;
	JComboBox<String> areas;

	public VentanaVer() {
		super("Ver proyectos");
		inicializarComponentes();
		getContentPane().setBackground(new Color(137,217,194));
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);
		
		lblBusca = new JLabel("¡¡Busca tu proyecto!!");
		lblBusca.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblBusca.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusca.setBounds(114, 36, 259, 30);
		getContentPane().add(lblBusca);
		
		lblFotoBuscar = new JLabel();
		lblFotoBuscar.setIcon(new ImageIcon(Ventana.class.getResource("/img/fotobuscar.png")));
		lblFotoBuscar.setBounds(335, 19, 82, 69);
		getContentPane().add(lblFotoBuscar);

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

		txtBuscarNombre = new JTextField();
		txtBuscarNombre.setBounds(33, 99, 184, 24);
		getContentPane().add(txtBuscarNombre);
		txtBuscarNombre.setColumns(10);

		btnLupa = new JButton();
		btnLupa.setIcon(new ImageIcon(VentanaVer.class.getResource("/img/botonLUPA.png")));
		btnLupa.setBounds(227, 90, 37, 39);
		btnLupa.setBorderPainted(false);
		getContentPane().add(btnLupa);

		proyectos = new JList<>();
		DefaultListModel<String> mod = new DefaultListModel<>();
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
	

	public JTextField getTxtBuscarNombre() {
		return txtBuscarNombre;
	}

	public void setTxtBuscarNombre(JTextField txtBuscarNombre) {
		this.txtBuscarNombre = txtBuscarNombre;
	}

	public JList<String> getProyectos() {
		return proyectos;
	}

	public void setProyectos(JList<String> proyectos) {
		this.proyectos = proyectos;
	}

	public void setControlador(ControladorVer_Principal c) {
		btnatras.addActionListener(c);

	}

	public void setControlador(ControladorVer_Info c) {
		btninspeccionar.addActionListener(c);
	}
	
	public void setControlador(ControladorLupaVer c) {
		btnLupa.addActionListener(c);
	}
  
	public void rellenarAreas(ArrayList<String> a) {
		aux = a;
		for (int i = 0; i < aux.size(); i++) {
			areas.addItem(aux.get(i));
		}
	}
	
	public void rellenarJlist(ArrayList<String> a) {
		 	aux = a;
		    DefaultListModel<String> mod = (DefaultListModel<String>) proyectos.getModel(); // Obtener el modelo de la JList
		    mod.clear(); // Limpiar el modelo
		    
		    for (int i = 0; i < aux.size(); i++) {
		        mod.addElement(aux.get(i)); // Agregar el nombre del proyecto al modelo
		    }
	}

	public JComboBox<String> getAreas() {
		return areas;
	}

	public void setAreas(JComboBox<String> areas) {
		this.areas = areas;
	}
	
	
}
