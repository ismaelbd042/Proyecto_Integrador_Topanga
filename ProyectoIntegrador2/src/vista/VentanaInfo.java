package vista;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

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
import modelo.Alumnos;
import modelo.ProyectosIntegradores;

import java.awt.Color;
import java.awt.Font;

/**
 * 
 * @author Ismael Bodas, Álvaro Serrano y Lucca Manfredotti
 *
 */
public class VentanaInfo extends JFrame implements IVentana {

	//Creamos las variables de la clase ventanaInfo
	private JLabel lblColaboradores;
	private JLabel lblUltimaModi;
	private JLabel lblAno;
	private JLabel lblCurso;
	private JLabel lblGrupo;
	private JLabel lblNota;
	private JLabel lblArea;
	private JLabel lblurl;

	private JLabel lblNombre2;
	private JList<String> listColaboradores2;
	private JLabel lblUltimaModi2;
	private JLabel lblAno2;
	private JLabel lblCurso2;
	private JLabel lblGrupo2;
	private JLabel lblNota2;
	private JLabel lblArea2;
	private JLabel lblurl2;

	private JButton btnatras;

	/**
	 * Llamamos a esta ventana información proyecto
	 */
	public VentanaInfo() {
		super("Información Proyecto");
		inicializarComponentes();
		getContentPane().setBackground(new Color(137,217,194));
	}

	/**
	 * Metodo inicializar componentes que sirve para poner tamaño y ajustar los componentes a la ventana
	 */
	@Override
	public void inicializarComponentes() {
		// TODO Auto-generated method stub

		getContentPane().setLayout(null);

		lblColaboradores = new JLabel("Colaboradores :");
		lblColaboradores.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblColaboradores.setBounds(39, 124, 123, 20);
		getContentPane().add(lblColaboradores);

		lblUltimaModi = new JLabel("Ultima modificación:");
		lblUltimaModi.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblUltimaModi.setBounds(39, 82, 123, 20);
		getContentPane().add(lblUltimaModi);

		lblAno = new JLabel("Año de entrega:");
		lblAno.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblAno.setBounds(39, 42, 104, 20);
		getContentPane().add(lblAno);

		lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCurso.setBounds(287, 82, 44, 20);
		getContentPane().add(lblCurso);

		lblGrupo = new JLabel("Grupo:");
		lblGrupo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblGrupo.setBounds(287, 124, 52, 20);
		getContentPane().add(lblGrupo);

		lblNota = new JLabel("Nota:");
		lblNota.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNota.setBounds(287, 42, 52, 20);
		getContentPane().add(lblNota);

		lblArea = new JLabel("Área:");
		lblArea.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArea.setBounds(287, 168, 52, 20);
		getContentPane().add(lblArea);

		lblNombre2 = new JLabel("-- TOPANGA --");
		lblNombre2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNombre2.setBounds(10, 11, 230, 20);
		getContentPane().add(lblNombre2);

		listColaboradores2 = new JList<>();
		DefaultListModel<String> mod = new DefaultListModel<>();
		listColaboradores2.setModel(mod);

		JScrollPane panelScrollAlumnos = new JScrollPane();
		panelScrollAlumnos.setBounds(55, 155, 181, 43);
		getContentPane().add(panelScrollAlumnos);
		panelScrollAlumnos.setViewportView(listColaboradores2);

		lblUltimaModi2 = new JLabel("-- 08/05/2023 --");
		lblUltimaModi2.setBounds(163, 82, 105, 20);
		getContentPane().add(lblUltimaModi2);

		lblAno2 = new JLabel("-- 2023 --");
		lblAno2.setBounds(170, 42, 70, 20);
		getContentPane().add(lblAno2);

		lblCurso2 = new JLabel("-- 1º --");
		lblCurso2.setBounds(350, 82, 44, 20);
		getContentPane().add(lblCurso2);

		lblGrupo2 = new JLabel("-- T1 --");
		lblGrupo2.setBounds(350, 124, 44, 20);
		getContentPane().add(lblGrupo2);

		lblNota2 = new JLabel("-- 10 --");
		lblNota2.setBounds(349, 42, 44, 20);
		getContentPane().add(lblNota2);

		lblArea2 = new JLabel("-- DAW --");
		lblArea2.setBounds(352, 168, 64, 20);
		getContentPane().add(lblArea2);

		lblurl = new JLabel("URL:");
		lblurl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblurl.setBounds(39, 209, 52, 20);
		getContentPane().add(lblurl);

		lblurl2 = new JLabel("https://github.com/ismaelbd042/Proyecto_Integrador_Topanga");
		lblurl2.setBounds(80, 209, 363, 20);
		getContentPane().add(lblurl2);

		//Boton de volver atras
		btnatras = new JButton("Volver Atras");
		btnatras.setBounds(163, 240, 125, 25);
		getContentPane().add(btnatras);

		//Ponemos tamaño a la ventana
		setSize(469, 315);
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
	 * @param c
	 */
	public void setControlador(ControladorInfo_Ver c) {
		// TODO Auto-generated method stub
		btnatras.addActionListener(c);
	}

	/**
	 * Getter de la variable nombre 
	 * @return lblnombre
	 */
	public JLabel getLblNombre2() {
		return lblNombre2;
	}

	/**
	 * Setter de la variable nombre2
	 * @param lblNombre2
	 */
	public void setLblNombre2(JLabel lblNombre2) {
		this.lblNombre2 = lblNombre2;
	}

	/**
	 * Getter de la variable ListColaboradores2
	 * @return listColaboradores2
	 */
	public JList<String> getListColaboradores2() {
		return listColaboradores2;
	}

	/**
	 * Setter de la variable ListColaboradores2
	 * @param listColaboradores2
	 */
	public void setListColaboradores2(JList<String> listColaboradores2) {
		this.listColaboradores2 = listColaboradores2;
	}

	/**
	 * Getter de la variable ultimaModi2
	 * @return lblUltimaModi2
	 */
	public JLabel getLblUltimaModi2() {
		return lblUltimaModi2;
	}

	/**
	 * Setter de la variable ultima modificación
	 * @param lblUltimaModi2
	 */
	public void setLblUltimaModi2(JLabel lblUltimaModi2) {
		this.lblUltimaModi2 = lblUltimaModi2;
	}

	/**
	 * Getter de la variable año2
	 * @return lblAno2
	 */
	public JLabel getLblAno2() {
		return lblAno2;
	}

	/**
	 * Setter de la variable Año2
	 * @param lblAno2
	 */
	public void setLblAno2(JLabel lblAno2) {
		this.lblAno2 = lblAno2;
	}

	/**
	 * Getter de la variable curso2
	 * @return lblCurso2
	 */
	public JLabel getLblCurso2() {
		return lblCurso2;
	}

	/**
	 * Setter de la variable curso2
	 * @param lblCurso2
	 */
	public void setLblCurso2(JLabel lblCurso2) {
		this.lblCurso2 = lblCurso2;
	}

	/**
	 * Getter de la variable Grupo2
	 * @return lblGrupo2
	 */
	public JLabel getLblGrupo2() {
		return lblGrupo2;
	}

	/**
	 * Stter de la variable Grupo2
	 * @param lblGrupo2
	 */
	public void setLblGrupo2(JLabel lblGrupo2) {
		this.lblGrupo2 = lblGrupo2;
	}

	/**
	 * Getter de la variable nota2
	 * @return lblNota2
	 */
	public JLabel getLblNota2() {
		return lblNota2;
	}

	/**
	 * Setter de la variable nota2
	 * @param lblNota2
	 */
	public void setLblNota2(JLabel lblNota2) {
		this.lblNota2 = lblNota2;
	}

	/**
	 * Getter de la variable Area2
	 * @return lblArea2
	 */
	public JLabel getLblArea2() {
		return lblArea2;
	}

	/**
	 * Setter de la variable Area2
	 * @param lblArea2
	 */
	public void setLblArea2(JLabel lblArea2) {
		this.lblArea2 = lblArea2;
	}

	/**
	 * Getter de la variable url2
	 * @return lblurl2
	 */
	public JLabel getLblurl2() {
		return lblurl2;
	}

	/**
	 * Setter de la variable url2
	 * @param lblurl2
	 */
	public void setLblurl2(JLabel lblurl2) {
		this.lblurl2 = lblurl2;
	}

	/**
	 * Metodo rellenarInfo que sirve para rellenar la información de los proyectos
	 * @param proyecto
	 * @param a
	 */
	public void rellenarInfo(ProyectosIntegradores proyecto, ArrayList<String> a) {
		lblNombre2.setText(proyecto.getNombre_proyecto());
		//Creamos un defaultListModel llamado listModel
		DefaultListModel<String> listModel = new DefaultListModel<>();
		for (int i = 0; i < a.size(); i++) {
			listModel.addElement(a.get(i));
		}
		//En la linea de setModel establece el modelo listModel en listaColaboradores2
		listColaboradores2.setModel(listModel);
		//En las lineas de setText establece el texto con el valor devuelto por el get
		lblUltimaModi2.setText(proyecto.getUltima_modificacion());
		lblAno2.setText(String.valueOf(proyecto.getAño()));
		lblCurso2.setText(proyecto.getCurso());
		lblGrupo2.setText(proyecto.getGrupo());
		lblNota2.setText(String.valueOf(proyecto.getNota()));
		lblArea2.setText(String.valueOf(proyecto.getCod_area()));
		lblurl2.setText(proyecto.getURL());
	}

}
