package vista;

import controlador.*;
import modelo.ProyectosIntegradores;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.*;

/**
 * 
 * @author Ismael Bodas, Álvaro Serrano y Lucca Manfredotti
 *
 */
public class VentanaVer extends JFrame implements IVentana {
	
	//Creamos las variables de la clase VentanaVer
	private JLabel lblBusca;
	private JTextField txtBuscarNombre;
	private JButton btninspeccionar;
	private JButton btnatras;
	private JList<String> proyectos;
	private JButton btnLupa;
	ArrayList<String> aux;
	JComboBox<String> areas;

	/**
	 * Llamamos a la ventana Ver Proyectos
	 */
	public VentanaVer() {
		super("Ver proyectos");
		inicializarComponentes();
	}

	/**
	 * Metodo inicializar componentes que sirve para poner tamaño y ajustar los componentes a la ventana
	 */
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

	/**
	 * Metodo hacer visible que sirve para hacer visible la ventana
	 */
	@Override
	public void hacerVisible() {
		setVisible(true);
	}
	

	/**
	 * Getter de la variable buscar nombre
	 * @return txtBuscarNombre
	 */
	public JTextField getTxtBuscarNombre() {
		return txtBuscarNombre;
	}

	/**
	 * Setter de la variable Buscar Nombre
	 * @param txtBuscarNombre
	 */
	public void setTxtBuscarNombre(JTextField txtBuscarNombre) {
		this.txtBuscarNombre = txtBuscarNombre;
	}

	/**
	 * Getter de la variable Proyectos
	 * @return proyectos
	 */
	public JList<String> getProyectos() {
		return proyectos;
	}

	/**
	 * Setter de la variable proyectos
	 * @param proyectos
	 */
	public void setProyectos(JList<String> proyectos) {
		this.proyectos = proyectos;
	}

	/**
	 * SetControlador que sirve para darle funcionalidad al boton de volver atras
	 * @param c
	 */
	public void setControlador(ControladorVer_Principal c) {
		btnatras.addActionListener(c);

	}

	/**
	 * SetControlador que sirve para darle funcionalidad al boton de inspeccionar
	 * @param c
	 */
	public void setControlador(ControladorVer_Info c) {
		btninspeccionar.addActionListener(c);
	}
	
	/**
	 * SetControlador que sirve para darle funcionalidad al boton de la lupa
	 * @param c
	 */
	public void setControlador(ControladorLupaVer c) {
		btnLupa.addActionListener(c);
	}
  
	/**
	 * Metodo rellenarAreas que sirve par arellenar las areas 
	 * @param a
	 */
	public void rellenarAreas(ArrayList<String> a) {
		aux = a;
		for (int i = 0; i < aux.size(); i++) {
			areas.addItem(aux.get(i));
		}
	}
	
	/**
	 * Metodo rellenarJList que sirve par arellenar la JList de proyectos
	 * @param a
	 */
	public void rellenarJlist(ArrayList<String> a) {
		 	aux = a;
		    DefaultListModel<String> mod = (DefaultListModel<String>) proyectos.getModel(); // Obtener el modelo de la JList
		    mod.clear(); // Limpiar el modelo
		    
		    for (int i = 0; i < aux.size(); i++) {
		        mod.addElement(aux.get(i)); // Agregar el nombre del proyecto al modelo
		    }
	}

	/**
	 * Getter de la variable areas
	 * @return areas
	 */
	public JComboBox<String> getAreas() {
		return areas;
	}

	/**
	 * Setter de la variable areas
	 * @param areas
	 */
	public void setAreas(JComboBox<String> areas) {
		this.areas = areas;
	}
	
	
}
