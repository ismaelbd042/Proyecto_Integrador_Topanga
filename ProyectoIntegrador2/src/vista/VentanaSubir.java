package vista;

import javax.swing.*;

import controlador.ControladorSubir_BuscarAlumno;
import controlador.ControladorSubir_Principal;
import controlador.ListenerComboBoxAREAS;
import controlador.ListenerRadioButtonCurso;
import modelo.Alumnos;
import modelo.ProyectosIntegradores;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaSubir extends JFrame implements IVentana {
	private JTextField nombre;
	private JButton colaboradores;
	private JTextField txtano;
	private JTextField txtnota;
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JTextField txtgrupo;
	private JTextField txturl;
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
	ArrayList<String> aux;
	JComboBox<String> areas;
	ProyectosIntegradores proyectointegrador;
	ListenerRadioButtonCurso listenerRbtn;
	ListenerComboBoxAREAS listenerCbAreas;

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

		txtano = new JTextField();
		txtano.setBounds(164, 98, 96, 19);
		getContentPane().add(txtano);
		txtano.setColumns(10);

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

		txtnota = new JTextField();
		txtnota.setColumns(10);
		txtnota.setBounds(352, 51, 96, 19);
		getContentPane().add(txtnota);

		ButtonGroup cursoGroup = new ButtonGroup();
		rbtn1 = new JRadioButton("1º");
		rbtn1.setBounds(367, 98, 37, 20);
		cursoGroup.add(rbtn1);
		getContentPane().add(rbtn1);

		rbtn2 = new JRadioButton("2º");
		rbtn2.setBounds(412, 98, 55, 20);
		cursoGroup.add(rbtn2);
		getContentPane().add(rbtn2);

		listenerRbtn = new ListenerRadioButtonCurso(rbtn1, rbtn2);
		rbtn1.addItemListener(listenerRbtn);
		rbtn2.addItemListener(listenerRbtn);

		txtgrupo = new JTextField();
		txtgrupo.setColumns(10);
		txtgrupo.setBounds(352, 144, 96, 19);
		getContentPane().add(txtgrupo);

		lblnota = new JLabel("Nota:");
		lblnota.setBounds(297, 55, 45, 13);
		getContentPane().add(lblnota);

		lblarea = new JLabel("Área:");
		lblarea.setBounds(295, 195, 45, 13);
		getContentPane().add(lblarea);

		btnsubir = new JButton("Subir proyecto");
		btnsubir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				subirProyecto();
			}
		});
		btnsubir.setBounds(271, 285, 122, 36);
		getContentPane().add(btnsubir);

		areas = new JComboBox<String>();
		listenerCbAreas = new ListenerComboBoxAREAS();
		areas.addItemListener(listenerCbAreas);
		areas.setBounds(352, 191, 96, 21);
		getContentPane().add(areas);

		txturl = new JTextField();
		txturl.setBounds(106, 144, 154, 19);
		getContentPane().add(txturl);
		txturl.setColumns(10);

		setSize(512, 384);
		setLocationRelativeTo(null);
	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	public void setControlador(ControladorSubir_Principal c) {
		btnatras.addActionListener(c);

	}

	public void setControlador(ControladorSubir_BuscarAlumno c) {
		colaboradores.addActionListener(c);

	}

	public void rellenarAreas(ArrayList<String> a) {
		aux = a;
		for (int i = 0; i < aux.size(); i++) {
			areas.addItem(aux.get(i));
		}
	}

	public void subirProyecto() {

		String cursodato = listenerRbtn.getCurso();
		System.out.println(cursodato);
		int cod_area = ListenerComboBoxAREAS.cambioArea_CodArea();
		System.out.println(cod_area);
		String nombre_proyecto = nombre.getText().toString();
		int año = Integer.parseInt(txtano.getText().toString());
		String url = txturl.getText().toString();
		int nota = Integer.parseInt(txtnota.getText().toString());
		String grupo = txtgrupo.getText().toString();
		int componentes = 0;
		int[][] alumnoRealiza = null;

		proyectointegrador = new ProyectosIntegradores(nombre_proyecto, url, componentes, año, cursodato, grupo, nota,
				cod_area, alumnoRealiza);

//		AccesoBBDD accesobbdd = new AccesoBBDD();
//		int estado = accesobbdd.registrar(proyectosintegradores, accesobbdd);
//
//		if (estado > 0) {
//			JOptionPane.showMessageDialog(getContentPane(), "Proyecto subido");
//		} else {
//			JOptionPane.showMessageDialog(getContentPane(), "No se consiguió subir", "Aviso",
//					JOptionPane.WARNING_MESSAGE);
//		}
	}

	public JTextField getNombre() {
		return nombre;
	}

	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}

	public JButton getColaboradores() {
		return colaboradores;
	}

	public void setColaboradores(JButton colaboradores) {
		this.colaboradores = colaboradores;
	}

	public JTextField getTxtano() {
		return txtano;
	}

	public void setTxtano(JTextField txtano) {
		this.txtano = txtano;
	}

	public JTextField getTxtnota() {
		return txtnota;
	}

	public void setTxtnota(JTextField txtnota) {
		this.txtnota = txtnota;
	}

	public JRadioButton getRbtn1() {
		return rbtn1;
	}

	public void setRbtn1(JRadioButton rbtn1) {
		this.rbtn1 = rbtn1;
	}

	public JRadioButton getRbtn2() {
		return rbtn2;
	}

	public void setRbtn2(JRadioButton rbtn2) {
		this.rbtn2 = rbtn2;
	}

	public JTextField getTxtgrupo() {
		return txtgrupo;
	}

	public void setTxtgrupo(JTextField txtgrupo) {
		this.txtgrupo = txtgrupo;
	}

	public JTextField getTxturl() {
		return txturl;
	}

	public void setTxturl(JTextField txturl) {
		this.txturl = txturl;
	}

	public JList<Alumnos> getListaAlu() {
		return listaAlu;
	}

	public void setListaAlu(JList<Alumnos> listaAlu) {
		this.listaAlu = listaAlu;
	}

	public JLabel getLblarea() {
		return lblarea;
	}

	public void setLblarea(JLabel lblarea) {
		this.lblarea = lblarea;
	}

	public JLabel getLblnota() {
		return lblnota;
	}

	public void setLblnota(JLabel lblnota) {
		this.lblnota = lblnota;
	}

	public JLabel getLblano() {
		return lblano;
	}

	public void setLblano(JLabel lblano) {
		this.lblano = lblano;
	}

	public JLabel getLblcurso() {
		return lblcurso;
	}

	public void setLblcurso(JLabel lblcurso) {
		this.lblcurso = lblcurso;
	}

	public JLabel getLblgrupo() {
		return lblgrupo;
	}

	public void setLblgrupo(JLabel lblgrupo) {
		this.lblgrupo = lblgrupo;
	}

	public JLabel getLblurl() {
		return lblurl;
	}

	public void setLblurl(JLabel lblurl) {
		this.lblurl = lblurl;
	}

	public JLabel getLblintroducir() {
		return lblintroducir;
	}

	public void setLblintroducir(JLabel lblintroducir) {
		this.lblintroducir = lblintroducir;
	}

	public JLabel getLblnombreGrupo() {
		return lblnombreGrupo;
	}

	public void setLblnombreGrupo(JLabel lblnombreGrupo) {
		this.lblnombreGrupo = lblnombreGrupo;
	}

	public JLabel getLblcolaboradores() {
		return lblcolaboradores;
	}

	public void setLblcolaboradores(JLabel lblcolaboradores) {
		this.lblcolaboradores = lblcolaboradores;
	}

	public JButton getBtnatras() {
		return btnatras;
	}

	public void setBtnatras(JButton btnatras) {
		this.btnatras = btnatras;
	}

	public JButton getBtnsubir() {
		return btnsubir;
	}

	public void setBtnsubir(JButton btnsubir) {
		this.btnsubir = btnsubir;
	}

	public ArrayList<String> getAux() {
		return aux;
	}

	public void setAux(ArrayList<String> aux) {
		this.aux = aux;
	}

	public JComboBox<String> getAreas() {
		return areas;
	}

	public void setAreas(JComboBox<String> areas) {
		this.areas = areas;
	}

	public ProyectosIntegradores getProyectosintegradores() {
		return proyectointegrador;
	}

	public void setProyectosintegradores(ProyectosIntegradores proyectosintegradores) {
		this.proyectointegrador = proyectosintegradores;
	}

}
