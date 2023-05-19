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

public class VentanaModificar extends JFrame implements IVentana {

	private JButton btnEditar;
	private JButton btnBorrar;
	private JButton btnLupa;

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

		btnEditar = new JButton("Editar");
		// lblLogo.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		btnEditar.setBounds(33, 181, 184, 29);
		getContentPane().add(btnEditar);

		btnBorrar = new JButton("Borrar");
		// lblLogo.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		btnBorrar.setBounds(288, 181, 184, 29);
		getContentPane().add(btnBorrar);

		btnatras = new JButton("Volver Atras");
		// lblLogo.setIcon(new
		// ImageIcon(Ventana.class.getResource("/img/carpeta.png")));
		btnatras.setBounds(161, 229, 184, 29);
		getContentPane().add(btnatras);

		areas = new JComboBox<>();
		ListenerComboBoxAREAS listenerCbAreas = new ListenerComboBoxAREAS();
		areas.addItemListener(listenerCbAreas);
		areas.setBounds(277, 28, 195, 52);
		getContentPane().add(areas);

		textField = new JTextField();
		textField.setBounds(25, 32, 195, 45);
		getContentPane().add(textField);
		textField.setColumns(10);

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
}
