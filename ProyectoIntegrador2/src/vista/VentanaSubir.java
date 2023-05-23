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
import java.awt.Color;
import java.awt.event.ActionEvent;

/**
 * 
 * @author Ismael Bodas, Álvaro Serrano y Lucca Manfredotti
 *
 */
public class VentanaSubir extends JFrame implements IVentana {
	// Creamos las variabkes de la clase ventana subir
	private JTextField nombre;
	private JButton colaboradores;
	private JTextField txtano;
	private JTextField txtnota;
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JTextField txtgrupo;
	private JTextField txturl;
	private JLabel lblFotoAlmacen;

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

	/**
	 * Llamamos a esta clase Subir Proyecto
	 */
	public VentanaSubir() {
		super("Subir proyecto");
		inicializarComponentes();
		getContentPane().setBackground(new Color(137,217,194));
	}

	/**
	 * Metodo inicializar componentes que sirve para darle tamaño y ajustar los
	 * componentes a la ventana
	 */
	@Override
	public void inicializarComponentes() {
		getContentPane().setLayout(null);

		nombre = new JTextField();
		nombre.setBounds(164, 51, 96, 19);
		getContentPane().add(nombre);
		nombre.setColumns(10);
		
		lblFotoAlmacen = new JLabel();
		lblFotoAlmacen.setIcon(new ImageIcon(Ventana.class.getResource("/img/fotoalmacen.png")));
		lblFotoAlmacen.setBounds(317, 221, 131, 60);
		getContentPane().add(lblFotoAlmacen);

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
		rbtn1.setBackground(new Color(137,217,194));
		cursoGroup.add(rbtn1);
		getContentPane().add(rbtn1);

		rbtn2 = new JRadioButton("2º");
		rbtn2.setBounds(412, 98, 55, 20);
		rbtn2.setBackground(new Color(137,217,194));
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

	/**
	 * Metodo hacer visible que sirve para hacer visible la ventana
	 */
	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	/**
	 * SetControlador que sirve para darle funcionalidad al boton de volver atras
	 * 
	 * @param c
	 */
	public void setControlador(ControladorSubir_Principal c) {
		btnatras.addActionListener(c);

	}

	/**
	 * SetControlador que sirve para darle funcionalidad al boton de colaboradores
	 * 
	 * @param c
	 */
	public void setControlador(ControladorSubir_BuscarAlumno c) {
		colaboradores.addActionListener(c);

	}

	/**
	 * SetControlador que sirve para darle funcionalidad al boton de subir
	 * 
	 * @param c
	 */
	public void setControlador(ControladorSubirProyecto c) {
		btnsubir.addActionListener(c);
	}

	/**
	 * Metodo rellenar Areas que sirve para rellenar el arraylista de areas
	 * 
	 * @param a
	 */
	public void rellenarAreas(ArrayList<String> a) {
		aux = a;
		for (int i = 0; i < aux.size(); i++) {
			areas.addItem(aux.get(i));
		}
	}

	/**
	 * Metodo rellenarJList que sirve para rellenar la JList listaAlu
	 * 
	 * @param a
	 */
	public void rellenarJlist(ArrayList<String> a) {
		aux = a;
		DefaultListModel<String> mod = (DefaultListModel<String>) listaAlu.getModel(); // Obtener el modelo de la JList
		mod.clear(); // Limpiar el modelo

		for (int i = 0; i < aux.size(); i++) {
			mod.addElement(aux.get(i)); // Agregar el nombre del proyecto al modelo
		}
	}

	/**
	 * Metodo getDatosProyecto que sirve para obtener los datos de los proyectos
	 * integradores
	 * 
	 * @return proyectos
	 */
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

	/**
	 * Metodo agregarAlumno que sirve para agregar alumnos
	 * 
	 * @param alumno
	 */
//	public void agregarAlumno(VentanaBuscarAlumno alumno) {
//	    modeloAlumnosAñadidos.addElement(alumno);
//	}

	/**
	 * Getter de la variable nombre
	 * 
	 * @return nombre
	 */
	public JTextField getNombre() {
		return nombre;
	}

	/**
	 * Setter de la variable nombre
	 * 
	 * @param nombre
	 */
	public void setNombre(JTextField nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter de la variable colaboradores
	 * 
	 * @return colaboradores
	 */
	public JButton getColaboradores() {
		return colaboradores;
	}

	/**
	 * Setter de la variable colaboradores
	 * 
	 * @param colaboradores
	 */
	public void setColaboradores(JButton colaboradores) {
		this.colaboradores = colaboradores;
	}

	/**
	 * Getter de la variable año
	 * 
	 * @return txtano
	 */
	public JTextField getTxtano() {
		return txtano;
	}

	/**
	 * Setter de la variable año
	 * 
	 * @param txtano
	 */
	public void setTxtano(JTextField txtano) {
		this.txtano = txtano;
	}

	/**
	 * Getter de la variable nota
	 * 
	 * @return txtnota
	 */
	public JTextField getTxtnota() {
		return txtnota;
	}

	/**
	 * Setter de la variable nota
	 * 
	 * @param txtnota
	 */
	public void setTxtnota(JTextField txtnota) {
		this.txtnota = txtnota;
	}

	/**
	 * Getter de la variable radiobutton 1
	 * 
	 * @return rbtn1
	 */
	public JRadioButton getRbtn1() {
		return rbtn1;
	}

	/**
	 * Setter de la variable radioButton1
	 * 
	 * @param rbtn1
	 */
	public void setRbtn1(JRadioButton rbtn1) {
		this.rbtn1 = rbtn1;
	}

	/**
	 * Getter de la variable radioButon2
	 * 
	 * @return rbtn2
	 */
	public JRadioButton getRbtn2() {
		return rbtn2;
	}

	/**
	 * Setter de la variable radioButton2
	 * 
	 * @param rbtn2
	 */
	public void setRbtn2(JRadioButton rbtn2) {
		this.rbtn2 = rbtn2;
	}

	/**
	 * Getter de la variable grupo
	 * 
	 * @return txtgrupo
	 */
	public JTextField getTxtgrupo() {
		return txtgrupo;
	}

	/**
	 * Setter de la variable grupo
	 * 
	 * @param txtgrupo
	 */
	public void setTxtgrupo(JTextField txtgrupo) {
		this.txtgrupo = txtgrupo;
	}

	/**
	 * Getter de la variable url
	 * 
	 * @return txturl
	 */
	public JTextField getTxturl() {
		return txturl;
	}

	/**
	 * Setter de la variable url
	 * 
	 * @param txturl
	 */
	public void setTxturl(JTextField txturl) {
		this.txturl = txturl;
	}

	/**
	 * Getter de la variable listaAlu
	 * 
	 * @return listaAlu
	 */
	public JList<String> getListaAlu() {
		return listaAlu;
	}

	/**
	 * Setter de la variable listaAlu
	 * 
	 * @param listaAlu
	 */
	public void setListaAlu(JList<String> listaAlu) {
		this.listaAlu = listaAlu;
	}

	/**
	 * Getter de la variable area
	 * 
	 * @return lblarea
	 */
	public JLabel getLblarea() {
		return lblarea;
	}

	/**
	 * Setter de la variable area
	 * 
	 * @param lblarea
	 */
	public void setLblarea(JLabel lblarea) {
		this.lblarea = lblarea;
	}

	/**
	 * Getter de la variable nota
	 * 
	 * @return lblnota
	 */
	public JLabel getLblnota() {
		return lblnota;
	}

	/**
	 * Setter de la variable nota
	 * 
	 * @param lblnota
	 */
	public void setLblnota(JLabel lblnota) {
		this.lblnota = lblnota;
	}

	/**
	 * Getter de la variable año
	 * 
	 * @return lblano
	 */
	public JLabel getLblano() {
		return lblano;
	}

	/**
	 * Setter de la variable año
	 * 
	 * @param lblano
	 */
	public void setLblano(JLabel lblano) {
		this.lblano = lblano;
	}

	/**
	 * Getter de la variable curso
	 * 
	 * @return lblcurso
	 */
	public JLabel getLblcurso() {
		return lblcurso;
	}

	/**
	 * Setter de la variable curso
	 * 
	 * @param lblcurso
	 */
	public void setLblcurso(JLabel lblcurso) {
		this.lblcurso = lblcurso;
	}

	/**
	 * Getter de la variable grupo
	 * 
	 * @return lblgrupo
	 */
	public JLabel getLblgrupo() {
		return lblgrupo;
	}

	/**
	 * Setter de la variable grupo
	 * 
	 * @param lblgrupo
	 */
	public void setLblgrupo(JLabel lblgrupo) {
		this.lblgrupo = lblgrupo;
	}

	/**
	 * Getter de la variable url
	 * 
	 * @return lblurl
	 */
	public JLabel getLblurl() {
		return lblurl;
	}

	/**
	 * Setter de la variable url
	 * 
	 * @param lblurl
	 */
	public void setLblurl(JLabel lblurl) {
		this.lblurl = lblurl;
	}

	/**
	 * Getter de la variable introducir
	 * 
	 * @return lblintroducir
	 */
	public JLabel getLblintroducir() {
		return lblintroducir;
	}

	/**
	 * Setter de la variable introducir
	 * 
	 * @param lblintroducir
	 */
	public void setLblintroducir(JLabel lblintroducir) {
		this.lblintroducir = lblintroducir;
	}

	/**
	 * Getter de la variable nombreGrupo
	 * 
	 * @return lblnombreGrupo
	 */
	public JLabel getLblnombreGrupo() {
		return lblnombreGrupo;
	}

	/**
	 * Setter de la variable nombre grupo
	 * 
	 * @param lblnombreGrupo
	 */
	public void setLblnombreGrupo(JLabel lblnombreGrupo) {
		this.lblnombreGrupo = lblnombreGrupo;
	}

	/**
	 * Getter de la variable colaboradores
	 * 
	 * @return lblcolaboradores
	 */
	public JLabel getLblcolaboradores() {
		return lblcolaboradores;
	}

	/**
	 * Setter de la variable colaboradores
	 * 
	 * @param lblcolaboradores
	 */
	public void setLblcolaboradores(JLabel lblcolaboradores) {
		this.lblcolaboradores = lblcolaboradores;
	}

	/**
	 * Getter de la variable boton atras
	 * 
	 * @return btnatras
	 */
	public JButton getBtnatras() {
		return btnatras;
	}

	/**
	 * Setter de la variable boton atras
	 * 
	 * @param btnatras
	 */
	public void setBtnatras(JButton btnatras) {
		this.btnatras = btnatras;
	}

	/**
	 * Getter de la variable boton subir
	 * 
	 * @return btnsubir
	 */
	public JButton getBtnsubir() {
		return btnsubir;
	}

	/**
	 * Setter de la variable boton subir
	 * 
	 * @param btnsubir
	 */
	public void setBtnsubir(JButton btnsubir) {
		this.btnsubir = btnsubir;
	}

	/**
	 * Getter de la variable auxiliar
	 * 
	 * @return aux
	 */
	public ArrayList<String> getAux() {
		return aux;
	}

	/**
	 * Setter de la variable auxiliar
	 * 
	 * @param aux
	 */
	public void setAux(ArrayList<String> aux) {
		this.aux = aux;
	}

	/**
	 * Getter de la variable areas
	 * 
	 * @return areas
	 */
	public JComboBox<String> getAreas() {
		return areas;
	}

	/**
	 * Setter de la variable areas
	 * 
	 * @param areas
	 */
	public void setAreas(JComboBox<String> areas) {
		this.areas = areas;
	}

	/**
	 * Getter de la variable cursoGroup
	 * 
	 * @return cursoGroup
	 */
	public ButtonGroup getCursoGroup() {
		return cursoGroup;
	}

	/**
	 * Setter de la variable cursoGroup
	 * 
	 * @param cursoGroup
	 */
	public void setCursoGroup(ButtonGroup cursoGroup) {
		this.cursoGroup = cursoGroup;
	}

	/**
	 * Getter de la variable Radiobuton default
	 * 
	 * @return rbtnDefault
	 */
	public JRadioButton getRbtnDefault() {
		return rbtnDefault;
	}

	/**
	 * Setter de la variable radiobutton default
	 * 
	 * @param rbtnDefault
	 */
	public void setRbtnDefault(JRadioButton rbtnDefault) {
		this.rbtnDefault = rbtnDefault;
	}

	/**
	 * Getter de la variable Modelo Alumnos Añadidos
	 * 
	 * @return modeloAlumnosAñadidos
	 */
//	public DefaultListModel<VentanaBuscarAlumno> getModeloAlumnosAñadidos() {
//		return modeloAlumnosAñadidos;
//	}
//
//	/**
//	 * Setter de la variable modelo alumnos añadidos 
//	 * @param modeloAlumnosAñadidos
//	 */
//	public void setModeloAlumnosAñadidos(DefaultListModel<VentanaBuscarAlumno> modeloAlumnosAñadidos) {
//		this.modeloAlumnosAñadidos = modeloAlumnosAñadidos;
//	}
//	
//	

}