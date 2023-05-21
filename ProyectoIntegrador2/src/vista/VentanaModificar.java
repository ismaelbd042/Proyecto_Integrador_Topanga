package vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

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
import controlador.ListenerComboBoxAREAS;
import modelo.ProyectosIntegradores;
import modelo.Áreas;
import java.awt.Font;

public class VentanaModificar extends JFrame implements IVentana {

	private JButton btnEditar;
	private JButton btnBorrar;
	private JButton btnLupa;
	private JLabel lblBusca;
	private JList<ProyectosIntegradores> proyectos;

	private JButton btnatras;
	private JTextField textField;
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

		textField = new JTextField();
		textField.setBounds(33, 77, 184, 24);
		getContentPane().add(textField);
		textField.setColumns(10);

		btnLupa = new JButton();
		btnLupa.setIcon(new ImageIcon(VentanaVer.class.getResource("/img/botonLUPA.png")));
		btnLupa.setBounds(227, 65, 37, 46);
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

	public void setControlador(ControladorModificar_Editar c) {
		btnEditar.addActionListener(c);

	}

	public void setControlador(ControladorModificar_Principal c) {
		btnatras.addActionListener(c);

	}
  
	public void rellenarAreas(ArrayList<String> a) {
		aux = a;
		for (int i = 0; i < aux.size(); i++) {
			areas.addItem(aux.get(i));
		}
	}
}
