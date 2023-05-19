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

public class VentanaEditar extends JFrame implements IVentana {
	private JTextField nombre;
	private JTextField nota;
	private JTextField url;
	
	private JButton btnatras;
	private JButton btnactualizar;
	
	private JLabel lblnombre;
	private JLabel lblnota;
	private JLabel lblurl;

	public VentanaEditar() {
		super("Editar proyecto");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		lblnombre = new JLabel("Nombre del proyecto:");
		lblnombre.setBounds(100, 43, 125, 13);
		getContentPane().add(lblnombre);

		lblnota = new JLabel("Nota:");
		lblnota.setBounds(100, 94, 143, 13);
		getContentPane().add(lblnota);

		lblurl = new JLabel("URL:");
		lblurl.setBounds(100, 148, 78, 13);
		getContentPane().add(lblurl);

		nombre = new JTextField();
		nombre.setBounds(235, 39, 151, 19);
		getContentPane().add(nombre);
		nombre.setColumns(10);

		nota = new JTextField();
		nota.setBounds(235, 90, 95, 19);
		getContentPane().add(nota);
		nota.setColumns(10);

		url = new JTextField();
		url.setBounds(188, 144, 198, 19);
		getContentPane().add(url);
		url.setColumns(10);

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
	public void setControlador(ControladorContraseña_Subir c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setControlador(ControladorPrincipal_Modificar_Contra c) {
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

	@Override
	public void setControlador(ControladorPrincipal_Subir_Contra c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorInfo_Ver c) {
		// TODO Auto-generated method stub
		
	}

}
