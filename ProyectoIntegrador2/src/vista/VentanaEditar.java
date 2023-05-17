package vista;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorEditar_Modificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;

import javax.swing.JButton;

public class VentanaEditar extends JFrame implements IVentana {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JButton btnatras;
	private JButton btnactualizar;
	
	private JLabel lblnombre;
	private JLabel lblcolaboradores;
	private JLabel lblultimamodi;

	public VentanaEditar() {
		super("Editar proyecto");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		lblnombre = new JLabel("Nombre:");
		lblnombre.setBounds(26, 43, 143, 13);
		getContentPane().add(lblnombre);

		lblcolaboradores = new JLabel("Colaboradores:");
		lblcolaboradores.setBounds(26, 94, 161, 13);
		getContentPane().add(lblcolaboradores);

		lblultimamodi = new JLabel("Última modificación:");
		lblultimamodi.setBounds(26, 148, 177, 13);
		getContentPane().add(lblultimamodi);

		textField = new JTextField();
		textField.setBounds(248, 39, 151, 19);
		getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(248, 90, 151, 19);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(249, 144, 150, 19);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);

		btnactualizar = new JButton("Actualizar datos");
		btnactualizar.setBounds(250, 198, 177, 34);
		getContentPane().add(btnactualizar);	
		
		btnatras = new JButton("Volver Atras");
		btnatras.setBounds(48, 198, 177, 34);
		getContentPane().add(btnatras);	
		
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
	public void setControlador(ControladorModificar_Editar c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorEditar_Modificar c) {
		btnatras.addActionListener(c);

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
	public void setControlador(ControladorSubir_Principal c) {
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
  
	public void setControlador(ControladorContraseña_Modificar c) {
		// TODO Auto-generated method stub
		
	}

}
