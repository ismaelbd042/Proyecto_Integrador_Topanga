package vista;

import javax.swing.*;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorEditar_Modificar;
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
	private JTextField nombre;
	private JTextField colaboradores;
	private JTextField año;
	private JTextField nota;
	private JTextField curso;
	private JTextField grupo;
	private JTextField url;
	
	private JLabel lblarea;
	private JLabel lblnota;
	private JLabel lblano;
	private JLabel lblcurso;
	private JLabel lblgrupo;
	private JLabel lblurl;
	
	private JLabel lblintroducir;
	private JLabel lblnombreGrupo;
	private JLabel lblcolaboradores;
	
	private JButton btnatras;
	private JButton btnsubir;

	public VentanaSubir() {
		super("Subir proyecto");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		nombre = new JTextField();
		nombre.setBounds(151, 51, 96, 19);
		getContentPane().add(nombre);
		nombre.setColumns(10);

		lblintroducir = new JLabel("Introduce los datos para subir el proyecto");
		lblintroducir.setBounds(117, 10, 253, 18);
		getContentPane().add(lblintroducir);

		lblnombreGrupo = new JLabel("Nombre del grupo:");
		lblnombreGrupo.setBounds(10, 55, 131, 13);
		getContentPane().add(lblnombreGrupo);

		lblcolaboradores = new JLabel("Nº de colaboradores:");
		lblcolaboradores.setBounds(10, 99, 131, 18);
		getContentPane().add(lblcolaboradores);

		colaboradores = new JTextField();
		colaboradores.setBounds(151, 98, 96, 19);
		getContentPane().add(colaboradores);
		colaboradores.setColumns(10);

		año = new JTextField();
		año.setBounds(151, 144, 96, 19);
		getContentPane().add(año);
		año.setColumns(10);

		lblurl = new JLabel("URL:");
		lblurl.setBounds(10, 195, 45, 13);
		getContentPane().add(lblurl);

		btnatras = new JButton("Volver atrás");
		btnatras.setBounds(103, 285, 131, 36);
		getContentPane().add(btnatras);

		lblano = new JLabel("Año de entrega:");
		lblano.setBounds(10, 148, 112, 13);
		getContentPane().add(lblano);

		lblcurso = new JLabel("Curso:");
		lblcurso.setBounds(287, 102, 37, 13);
		getContentPane().add(lblcurso);

		lblgrupo = new JLabel("Grupo:");
		lblgrupo.setBounds(287, 148, 45, 13);
		getContentPane().add(lblgrupo);

		nota = new JTextField();
		nota.setColumns(10);
		nota.setBounds(352, 51, 96, 19);
		getContentPane().add(nota);

		curso = new JTextField();
		curso.setColumns(10);
		curso.setBounds(352, 98, 96, 19);
		getContentPane().add(curso);

		grupo = new JTextField();
		grupo.setColumns(10);
		grupo.setBounds(352, 144, 96, 19);
		getContentPane().add(grupo);

		lblnota = new JLabel("Nota:");
		lblnota.setBounds(287, 55, 45, 13);
		getContentPane().add(lblnota);

		lblarea = new JLabel("Área:");
		lblarea.setBounds(287, 195, 45, 13);
		getContentPane().add(lblarea);

		btnsubir = new JButton("Subir proyecto");
		btnsubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnsubir.setBounds(271, 285, 122, 36);
		getContentPane().add(btnsubir);

		JComboBox<Áreas> areas = new JComboBox();
		areas.setBounds(352, 191, 96, 21);
//		comboBox.addItem(new Área ("DAW", "Manfredotti", "465484156B", 19));
//		comboBox.addItem(new Área ("Mateo", "Manfredotti", "789987898Z", 16));
//		comboBox.addItem(new Área("Aldo", "Manfredotti", "120654894Z", 64));
//		comboBox.addItem(new Área ("Karina", "Garcia", "465489421Z", 53));
		getContentPane().add(areas);

		url = new JTextField();
		url.setBounds(64, 191, 183, 19);
		getContentPane().add(url);
		url.setColumns(10);

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
  
  @Override
	public void setControlador(ControladorContraseña_Modificar c) {
		// TODO Auto-generated method stub
		
	}

@Override
public void setControlador(ControladorEditar_Modificar c) {
	// TODO Auto-generated method stub
	
}
}
