package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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

import javax.swing.JButton;
import java.awt.Font;

public class VentanaEditar extends JFrame implements IVentana {
	private JTextField nombre;
	private JTextField nota;
	private JTextField url;

	private JButton btnatras;
	private JButton btnactualizar;

	private JLabel lblHacer;
	private JLabel lblnombre;
	private JLabel lblnota;
	private JLabel lblurl;
	private JLabel lblnombreAntiguo;
	private JLabel lblnotaAntiguo;
	private JLabel lblurlAntiguo;
	private JLabel lbldatonombreAntiguo;
	private JLabel lbldatonotaAntiguo;
	private JLabel lbldatourlAntiguo;

	public VentanaEditar() {
		super("Editar proyecto");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		lblHacer = new JLabel("Modifica los datos de tu proyecto");
		lblHacer.setFont(new Font("Arial", Font.BOLD, 11));
		lblHacer.setBounds(161, 21, 286, 13);
		getContentPane().add(lblHacer);
		
		lblnombre = new JLabel("Nuevo nombre:");
		lblnombre.setBounds(100, 83, 125, 13);
		getContentPane().add(lblnombre);

		lblnota = new JLabel("Nueva nota:");
		lblnota.setBounds(100, 159, 143, 13);
		getContentPane().add(lblnota);

		lblurl = new JLabel("Nueva URL:");
		lblurl.setBounds(100, 232, 78, 13);
		getContentPane().add(lblurl);
		
		lblnombreAntiguo = new JLabel("Nombre del proyecto:");
		lblnombreAntiguo.setBounds(100, 59, 125, 13);
		getContentPane().add(lblnombreAntiguo);

		lblnotaAntiguo = new JLabel("Nota:");
		lblnotaAntiguo.setBounds(100, 134, 143, 13);
		getContentPane().add(lblnotaAntiguo);

		lblurlAntiguo = new JLabel("URL:");
		lblurlAntiguo.setBounds(100, 208, 78, 13);
		getContentPane().add(lblurlAntiguo);
		
		lbldatonombreAntiguo = new JLabel();
		lbldatonombreAntiguo.setBounds(235, 53, 151, 19);
		getContentPane().add(lbldatonombreAntiguo);

		lbldatonotaAntiguo = new JLabel();
		lbldatonotaAntiguo.setBounds(235, 129, 95, 19);
		getContentPane().add(lbldatonotaAntiguo);

		lbldatourlAntiguo = new JLabel();
		lbldatourlAntiguo.setBounds(188, 202, 198, 19);
		getContentPane().add(lbldatourlAntiguo);

		nombre = new JTextField();
		nombre.setBounds(235, 79, 151, 19);
		getContentPane().add(nombre);
		nombre.setColumns(10);

		nota = new JTextField();
		nota.setBounds(235, 155, 95, 19);
		getContentPane().add(nota);
		nota.setColumns(10);

		url = new JTextField();
		url.setBounds(188, 228, 198, 19);
		getContentPane().add(url);
		url.setColumns(10);

		btnactualizar = new JButton("Actualizar datos");
		btnactualizar.setBounds(253, 287, 177, 34);
		getContentPane().add(btnactualizar);

		btnatras = new JButton("Volver Atras");
		btnatras.setBounds(66, 287, 177, 34);
		getContentPane().add(btnatras);

		setSize(512, 384);
		setLocationRelativeTo(null);
	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	public void setControlador(ControladorEditar_Modificar c) {
		btnatras.addActionListener(c);

	}

}
