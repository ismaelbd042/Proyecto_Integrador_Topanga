package vista;

import javax.swing.*;

import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;
import modelo.Áreas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaSubir extends JFrame implements IVentana {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JPasswordField passwordField;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField_1;
	private JTextField textField_6;
	
	private JLabel lblarea;
	private JLabel lblnota;
	private JLabel lblano;
	private JLabel lblcurso;
	private JLabel lblgrupo;
	private JLabel lblurl;
	private JLabel lblcontrasena;
	
	private JButton btnatras;
	private JButton btnsubir;

	public VentanaSubir() {
		super("Subir proyecto");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Introduce los datos para subir el proyecto");
		lblNewLabel.setBounds(117, 10, 253, 18);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre del grupo:");
		lblNewLabel_1.setBounds(10, 55, 131, 13);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Colaboradores:");
		lblNewLabel_2.setBounds(10, 99, 112, 18);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Última modificación:");
		lblNewLabel_3.setBounds(10, 148, 131, 13);
		getContentPane().add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(151, 51, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(151, 98, 96, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(151, 144, 96, 19);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		lblurl = new JLabel("URL:");
		lblurl.setBounds(10, 195, 45, 13);
		getContentPane().add(lblurl);

		lblcontrasena = new JLabel("Contraseña:");
		lblcontrasena.setBounds(10, 244, 112, 13);
		getContentPane().add(lblcontrasena);

		passwordField = new JPasswordField();
		passwordField.setBounds(172, 240, 75, 19);
		getContentPane().add(passwordField);

		btnatras = new JButton("Volver atrás");
		btnatras.setBounds(83, 285, 131, 36);
		getContentPane().add(btnatras);

		lblano = new JLabel("Año:");
		lblano.setBounds(287, 54, 31, 13);
		getContentPane().add(lblano);

		lblcurso = new JLabel("Curso:");
		lblcurso.setBounds(287, 102, 37, 13);
		getContentPane().add(lblcurso);

		lblgrupo = new JLabel("Grupo:");
		lblgrupo.setBounds(287, 148, 45, 13);
		getContentPane().add(lblgrupo);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(352, 50, 96, 19);
		getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(352, 98, 96, 19);
		getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(342, 144, 96, 19);
		getContentPane().add(textField_5);

		lblnota = new JLabel("Nota:");
		lblnota.setBounds(287, 199, 45, 13);
		getContentPane().add(lblnota);

		lblarea = new JLabel("Área:");
		lblarea.setBounds(287, 244, 45, 13);
		getContentPane().add(lblarea);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(358, 195, 75, 19);
		getContentPane().add(passwordField_1);

		btnsubir = new JButton("Subir proyecto");
		btnsubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnsubir.setBounds(271, 285, 122, 36);
		getContentPane().add(btnsubir);

		JComboBox<Áreas> comboBox = new JComboBox();
		comboBox.setBounds(358, 240, 69, 21);
//		comboBox.addItem(new ComboBox ("DAW", "Manfredotti", "465484156B", 19));
//		comboBox.addItem(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
//		comboBox.addItem(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
//		comboBox.addItem(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		getContentPane().add(comboBox);

		textField_6 = new JTextField();
		textField_6.setBounds(151, 196, 96, 19);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);

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
	public void setControlador(ControladorPrincipal_Subir c) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setControlador(ControladorSubir_Principal c) {
		btnatras.addActionListener(c);
		
	}


	@Override
	public void setControlador(ControladorPrincipal_Modificar c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorModificar_Editar c) {
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
}
