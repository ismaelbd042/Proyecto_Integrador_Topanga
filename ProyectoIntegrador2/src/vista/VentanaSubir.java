package vista;

import javax.swing.*;

import controlador.ControladorModificar_Editar;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
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

	public VentanaSubir() {
		super("Subir proyecto");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Introduce los datos para subir el proyecto");
		lblNewLabel.setBounds(117, 10, 196, 18);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Nombre del grupo:");
		lblNewLabel_1.setBounds(10, 54, 131, 13);
		getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Colaboradores:");
		lblNewLabel_2.setBounds(10, 90, 112, 13);
		getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Última modificación:");
		lblNewLabel_3.setBounds(10, 122, 112, 13);
		getContentPane().add(lblNewLabel_3);

		textField = new JTextField();
		textField.setBounds(101, 51, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(82, 87, 96, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(101, 119, 96, 19);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("URL:");
		lblNewLabel_4.setBounds(10, 150, 45, 13);
		getContentPane().add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Contraseña:");
		lblNewLabel_5.setBounds(10, 184, 63, 13);
		getContentPane().add(lblNewLabel_5);

		passwordField = new JPasswordField();
		passwordField.setBounds(66, 181, 75, 19);
		getContentPane().add(passwordField);

		JButton btnNewButton = new JButton("Volver atrás");
		btnNewButton.setBounds(53, 220, 104, 21);
		getContentPane().add(btnNewButton);

		JLabel lblNewLabel_1_1 = new JLabel("Año:");
		lblNewLabel_1_1.setBounds(239, 54, 131, 13);
		getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_2_1 = new JLabel("Curso:");
		lblNewLabel_2_1.setBounds(239, 90, 112, 13);
		getContentPane().add(lblNewLabel_2_1);

		JLabel lblNewLabel_3_1 = new JLabel("Grupo:");
		lblNewLabel_3_1.setBounds(239, 122, 112, 13);
		getContentPane().add(lblNewLabel_3_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(263, 51, 96, 19);
		getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(273, 87, 96, 19);
		getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(274, 119, 96, 19);
		getContentPane().add(textField_5);

		JLabel lblNewLabel_4_1 = new JLabel("Nota:");
		lblNewLabel_4_1.setBounds(239, 150, 45, 13);
		getContentPane().add(lblNewLabel_4_1);

		JLabel lblNewLabel_5_1 = new JLabel("Área:");
		lblNewLabel_5_1.setBounds(239, 184, 63, 13);
		getContentPane().add(lblNewLabel_5_1);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(264, 147, 75, 19);
		getContentPane().add(passwordField_1);

		JButton btnNewButton_1 = new JButton("Subir proyecto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(247, 220, 104, 21);
		getContentPane().add(btnNewButton_1);

		JComboBox<Áreas> comboBox = new JComboBox();
		comboBox.setBounds(273, 180, 69, 21);
//		comboBox.addItem(new ComboBox ("DAW", "Manfredotti", "465484156B", 19));
//		comboBox.addItem(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
//		comboBox.addItem(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
//		comboBox.addItem(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		getContentPane().add(comboBox);

		textField_6 = new JTextField();
		textField_6.setBounds(37, 147, 96, 19);
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
	public void setControlador(ControladorPrincipal_Modificar c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorModificar_Editar c) {
		// TODO Auto-generated method stub
		
	}
}
