package vista;

import java.util.ArrayList;

import javax.swing.*;

import controlador.ControladorBorrarProyecto;
import controlador.ControladorLupaModificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ListenerComboBoxAREAS;
import java.awt.Font;

public class VentanaModificar extends JFrame implements IVentana {

	private JButton btnEditar;
	private JButton btnBorrar;
	private JButton btnLupa;
	private JLabel lblBusca;
	public JList<String> proyectos;

	private JButton btnatras;
	private JTextField txtBuscarNombre;
	ArrayList<String> aux;
	JComboBox<String> areas;

	public VentanaModificar() {
		super("Administrar Proyectos");
		inicializarComponentes();
	}

	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		lblBusca = new JLabel("¡¡Busca tu proyecto!!");
		lblBusca.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 15));
		lblBusca.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusca.setBounds(114, 24, 259, 30);
		getContentPane().add(lblBusca);

		btnEditar = new JButton("Editar");
		// lblLogo.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		btnEditar.setBounds(33, 220, 184, 39);
		getContentPane().add(btnEditar);

		btnBorrar = new JButton("Borrar");
		// lblLogo.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		btnBorrar.setBounds(274, 220, 184, 39);
		getContentPane().add(btnBorrar);

		btnatras = new JButton("Volver Atras");
		// lblLogo.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		btnatras.setBounds(157, 270, 184, 39);
		getContentPane().add(btnatras);

		areas = new JComboBox<>();
		ListenerComboBoxAREAS listenerCbAreas = new ListenerComboBoxAREAS();
		areas.addItemListener(listenerCbAreas);
		areas.setBounds(274, 77, 184, 24);
		getContentPane().add(areas);

		txtBuscarNombre = new JTextField();
		txtBuscarNombre.setBounds(33, 77, 184, 24);
		getContentPane().add(txtBuscarNombre);
		txtBuscarNombre.setColumns(10);

		btnLupa = new JButton();
		btnLupa.setIcon(new ImageIcon(VentanaVer.class.getResource("/img/botonLUPA.png")));
		btnLupa.setBounds(227, 65, 37, 46);
		btnLupa.setBorderPainted(false);
		getContentPane().add(btnLupa);

		proyectos = new JList<>();
		DefaultListModel<String> mod = new DefaultListModel<>();
		proyectos.setModel(mod);

		JScrollPane barradesplazamiento = new JScrollPane();
		barradesplazamiento.setBounds(152, 122, 181, 87);
		getContentPane().add(barradesplazamiento);
		barradesplazamiento.setViewportView(proyectos);

		setSize(512, 384);
		setLocationRelativeTo(null);

	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	public JList<String> getProyectos() {
		return proyectos;
	}

	public void setProyectos(JList<String> proyectos) {
		this.proyectos = proyectos;
	}

	public JTextField getTxtBuscarNombre() {
		return txtBuscarNombre;
	}

	public void setTxtBuscarNombre(JTextField txtBuscarNombre) {
		this.txtBuscarNombre = txtBuscarNombre;
	}

	public void setControlador(ControladorModificar_Editar c) {
		btnEditar.addActionListener(c);
	}

	public void setControlador(ControladorBorrarProyecto c) {
		btnBorrar.addActionListener(c);
	}

	public void setControlador(ControladorModificar_Principal c) {
		btnatras.addActionListener(c);

	}

	public void setControlador(ControladorLupaModificar c) {
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
}
