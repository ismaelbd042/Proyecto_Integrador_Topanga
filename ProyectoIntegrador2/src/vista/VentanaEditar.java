package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ControladorPrincipal_Ver;

import javax.swing.JButton;

public class VentanaEditar extends JFrame implements IVentana {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	public VentanaEditar() {
		super("Editar proyecto");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre:");
		lblNewLabel.setBounds(26, 43, 45, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Colaboradores:");
		lblNewLabel_1.setBounds(26, 94, 84, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Última modificación:");
		lblNewLabel_2.setBounds(26, 148, 110, 13);
		getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(81, 40, 96, 19);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 91, 96, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 145, 96, 19);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Actualizar datos");
		btnNewButton.setBounds(52, 191, 151, 21);
		getContentPane().add(btnNewButton);		
	}

	@Override
	public void hacerVisible() {
		setVisible(false);
	}

	@Override
	public void setControlador(ControladorPrincipal_Ver c) {
		// TODO Auto-generated method stub
		
	}

	
}
