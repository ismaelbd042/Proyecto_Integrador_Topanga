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
import modelo.Alumnos;
import modelo.Áreas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaSubir extends JFrame implements IVentana {
	private JTextField nombre;
	private JButton colaboradores;
	private JTextField año;
	private JTextField nota;
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JTextField grupo;
	private JTextField url;
	private JList<Alumnos> listaAlu;
	
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
		nombre.setBounds(164, 51, 96, 19);
		getContentPane().add(nombre);
		nombre.setColumns(10);

		lblintroducir = new JLabel("Introduce los datos para subir el proyecto");
		lblintroducir.setBounds(126, 10, 244, 18);
		getContentPane().add(lblintroducir);

		lblnombreGrupo = new JLabel("Nombre del proyecto:");
		lblnombreGrupo.setBounds(38, 55, 131, 13);
		getContentPane().add(lblnombreGrupo);

		lblcolaboradores = new JLabel("Colaboradores:");
		lblcolaboradores.setBounds(38, 192, 112, 18);
		getContentPane().add(lblcolaboradores);
		
		colaboradores = new JButton("Añadir Alumno");
		colaboradores.setBounds(137, 191, 123, 19);
		getContentPane().add(colaboradores);
		
		listaAlu = new JList<>();
		DefaultListModel<Alumnos> mod = new DefaultListModel<>();
		// mod.addElement(new Alumno ("Lucca", "Manfredotti", "465484156B", 19));
		// mod.addElement(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
		// mod.addElement(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
		// mod.addElement(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		listaAlu.setModel(mod);
		// listadoAlumnos.setBounds(300, 45, 20, 20);
		// getContentPane().add(listadoAlumnos);
		JScrollPane panelScrollAlumnos = new JScrollPane();
		panelScrollAlumnos.setBounds(38, 221, 222, 53);
		getContentPane().add(panelScrollAlumnos);
		panelScrollAlumnos.setViewportView(listaAlu);
		// ListenerListadoAlumnos escuchadorLista = new ListenerListadoAlumnos();
		// listAlumnos.addListSelectionListener(escuchadorLista);

		año = new JTextField();
		año.setBounds(164, 98, 96, 19);
		getContentPane().add(año);
		año.setColumns(10);

		lblurl = new JLabel("URL:");
		lblurl.setBounds(38, 148, 45, 13);
		getContentPane().add(lblurl);

		btnatras = new JButton("Volver atrás");
		btnatras.setBounds(103, 285, 131, 36);
		getContentPane().add(btnatras);

		lblano = new JLabel("Año de entrega:");
		lblano.setBounds(38, 102, 112, 13);
		getContentPane().add(lblano);

		lblcurso = new JLabel("Curso:");
		lblcurso.setBounds(295, 102, 37, 13);
		getContentPane().add(lblcurso);

		lblgrupo = new JLabel("Grupo:");
		lblgrupo.setBounds(295, 148, 45, 13);
		getContentPane().add(lblgrupo);

		nota = new JTextField();
		nota.setColumns(10);
		nota.setBounds(352, 51, 96, 19);
		getContentPane().add(nota);
		
		ButtonGroup curso = new ButtonGroup();
		rbtn1 = new JRadioButton("1º");
		rbtn1.setBounds(352, 98, 58, 20);
		curso.add(rbtn1);
		getContentPane().add(rbtn1);
		
		rbtn2 = new JRadioButton("2º");
		rbtn2.setBounds(412, 98, 55, 20);
		curso.add(rbtn2);
		getContentPane().add(rbtn2);

		grupo = new JTextField();
		grupo.setColumns(10);
		grupo.setBounds(352, 144, 96, 19);
		getContentPane().add(grupo);

		lblnota = new JLabel("Nota:");
		lblnota.setBounds(297, 55, 45, 13);
		getContentPane().add(lblnota);

		lblarea = new JLabel("Área:");
		lblarea.setBounds(295, 195, 45, 13);
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
		url.setBounds(106, 144, 154, 19);
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
