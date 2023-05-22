package vista;

import javax.swing.*;

import controlador.ControladorSubirProyecto;
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
	
	private JList<String> listaAlu;

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
	private ButtonGroup cursoGroup;
	
	private JRadioButton rbtnDefault;
	
	ArrayList<String> aux;
	JComboBox<String> areas;
	ListenerRadioButtonCurso listenerRbtn;
	ListenerComboBoxAREAS listenerCbAreas;
	
	DefaultListModel<VentanaBuscarAlumno> modeloAlumnosAñadidos;

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
		DefaultListModel<String> mod = new DefaultListModel<>();
		// mod.addElement(new Alumno ("Lucca", "Manfredotti", "465484156B", 19));
		// mod.addElement(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
		// mod.addElement(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
		// mod.addElement(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		listaAlu.setModel(mod);
		
		JScrollPane panelScrollAlumnos = new JScrollPane();
		panelScrollAlumnos.setBounds(38, 221, 222, 53);
		getContentPane().add(panelScrollAlumnos);
		panelScrollAlumnos.setViewportView(listaAlu);
		
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

		cursoGroup = new ButtonGroup();

		rbtn1 = new JRadioButton("1º");
		rbtn1.setBounds(367, 98, 37, 20);
		cursoGroup.add(rbtn1);
		getContentPane().add(rbtn1);

		rbtn2 = new JRadioButton("2º");
		rbtn2.setBounds(412, 98, 55, 20);
		cursoGroup.add(rbtn2);
		getContentPane().add(rbtn2);

		
		rbtnDefault = new JRadioButton("");
		rbtnDefault.setSelected(true);
		cursoGroup.add(rbtnDefault);

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
	
	public void setControlador(ControladorSubirProyecto c) {
		btnsubir.addActionListener(c);
	}
	

	public void rellenarAreas(ArrayList<String> a) {
		aux = a;
		for (int i = 0; i < aux.size(); i++) {
			areas.addItem(aux.get(i));
		}
	}
	
	public void rellenarJlist(ArrayList<String> a) {
		aux = a;
		DefaultListModel<String> mod = (DefaultListModel<String>) listaAlu.getModel(); // Obtener el modelo de la JList
		mod.clear(); // Limpiar el modelo

		for (int i = 0; i < aux.size(); i++) {
			mod.addElement(aux.get(i)); // Agregar el nombre del proyecto al modelo
		}
	}

	public ProyectosIntegradores getDatosProyecto() {

		ProyectosIntegradores proyecto = new ProyectosIntegradores(null, null, 0, 0, null, null, 0, 0);

		proyecto.setNombre_proyecto(nombre.getText());
		proyecto.setURL(txturl.getText());
		proyecto.setComponentes(listaAlu.getModel().getSize());
		proyecto.setAño(Integer.parseInt(txtano.getText()));
		proyecto.setCurso(listenerRbtn.getCurso());
		proyecto.setGrupo(txtgrupo.getText());
		proyecto.setNota(Integer.parseInt(txtnota.getText()));
		proyecto.setCod_area(ListenerComboBoxAREAS.cambioArea_CodArea());

		return proyecto;
	}
	
	public void agregarAlumno(VentanaBuscarAlumno alumno) {
	    modeloAlumnosAñadidos.addElement(alumno);
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

	public JList<String> getListaAlu() {
		return listaAlu;
	}

	public void setListaAlu(JList<String> listaAlu) {
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

	public ButtonGroup getCursoGroup() {
		return cursoGroup;
	}

	public void setCursoGroup(ButtonGroup cursoGroup) {
		this.cursoGroup = cursoGroup;
	}

	public JRadioButton getRbtnDefault() {
		return rbtnDefault;
	}

	public void setRbtnDefault(JRadioButton rbtnDefault) {
		this.rbtnDefault = rbtnDefault;
	}
	
}
