package vista;

import java.awt.event.ActionListener;

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
import java.awt.Font;

public class VentanaInfo extends JFrame implements IVentana {

	private JLabel lblColaboradores;
	private JLabel lblUltimaModi;
	private JLabel lblAno;
	private JLabel lblCurso;
	private JLabel lblGrupo;
	private JLabel lblNota;
	private JLabel lblArea;
	private JLabel lblurl;

	private JLabel lblNombre2;
	private JList<Alumnos> listColaboradores2;
	private JLabel lblUltimaModi2;
	private JLabel lblAno2;
	private JLabel lblCurso2;
	private JLabel lblGrupo2;
	private JLabel lblNota2;
	private JLabel lblArea2;
	private JLabel lblurl2;

	private JButton btnatras;

	public VentanaInfo() {
		super("Información Proyecto");
		inicializarComponentes();
	}

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
		lblNombre2.setFont(new Font("Times New Roman", Font.BOLD, 11));
		lblNombre2.setBounds(10, 11, 230, 20);
		getContentPane().add(lblNombre2);

		listColaboradores2 = new JList<>();
		DefaultListModel<Alumnos> mod = new DefaultListModel<>();
		// mod.addElement(new Alumno ("Lucca", "Manfredotti", "465484156B", 19));
		// mod.addElement(new Alumno ("Mateo", "Manfredotti", "789987898Z", 16));
		// mod.addElement(new Alumno ("Aldo", "Manfredotti", "120654894Z", 64));
		// mod.addElement(new Alumno ("Karina", "Garcia", "465489421Z", 53));
		listColaboradores2.setModel(mod);

		JScrollPane barradesplazamientoAlu = new JScrollPane();
		barradesplazamientoAlu.setBounds(55, 155, 181, 43);
		getContentPane().add(barradesplazamientoAlu);
		barradesplazamientoAlu.setRowHeaderView(listColaboradores2);

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

		btnatras = new JButton("Volver Atras");
		btnatras.setBounds(163, 240, 125, 25);
		getContentPane().add(btnatras);

		setSize(469, 315);
		setLocationRelativeTo(null);

	}

	@Override
	public void hacerVisible() {
		setVisible(true);
	}

	public void setControlador(ControladorInfo_Ver c) {
		// TODO Auto-generated method stub
		btnatras.addActionListener(c);

	}

}
