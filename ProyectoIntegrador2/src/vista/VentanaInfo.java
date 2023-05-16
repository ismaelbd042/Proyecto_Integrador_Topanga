package vista;

import javax.swing.*;

import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;

public class VentanaInfo extends JFrame implements IVentana {

	JLabel lblNombre;
	JLabel lblColaboradores;
	JLabel lblUltimaModi;
	JLabel lblAno;
	JLabel lblCurso;
	JLabel lblGrupo;
	JLabel lblNota;
	JLabel lblArea;

	JLabel lblNombre2;
	JLabel lblColaboradores2;
	JLabel lblUltimaModi2;
	JLabel lblAno2;
	JLabel lblCurso2;
	JLabel lblGrupo2;
	JLabel lblNota2;
	JLabel lblArea2;

	public VentanaInfo() {
		super("Información Proyecto");
		inicializarComponentes();
	}

	@Override
	public void inicializarComponentes() {
		// TODO Auto-generated method stub

		getContentPane().setLayout(null);

		lblNombre = new JLabel("Nombre :");
		lblNombre.setBounds(30, 28, 104, 20);
		getContentPane().add(lblNombre);

		lblColaboradores = new JLabel("Colaboradores :");
		lblColaboradores.setBounds(30, 59, 123, 20);
		getContentPane().add(lblColaboradores);

		lblUltimaModi = new JLabel("Ultima Modificación :");
		lblUltimaModi.setBounds(30, 90, 133, 20);
		getContentPane().add(lblUltimaModi);

		lblAno = new JLabel("Año :");
		lblAno.setBounds(30, 121, 133, 20);
		getContentPane().add(lblAno);

		lblCurso = new JLabel("Curso :");
		lblCurso.setBounds(30, 152, 123, 20);
		getContentPane().add(lblCurso);

		lblGrupo = new JLabel("Grupo :");
		lblGrupo.setBounds(30, 183, 133, 20);
		getContentPane().add(lblGrupo);

		lblNota = new JLabel("Nota :");
		lblNota.setBounds(30, 214, 104, 20);
		getContentPane().add(lblNota);

		lblArea = new JLabel("Área :");
		lblArea.setBounds(30, 245, 104, 20);
		getContentPane().add(lblArea);

		lblNombre2 = new JLabel("-- TOPANGA --");
		lblNombre2.setBounds(163, 28, 230, 20);
		getContentPane().add(lblNombre2);

		lblColaboradores2 = new JLabel("-- Ismael Bodas, Álvaro Serrano, Lucca Mnafredotti --");
		lblColaboradores2.setBounds(163, 59, 280, 20);
		getContentPane().add(lblColaboradores2);

		lblUltimaModi2 = new JLabel("-- 08/05/2023 --");
		lblUltimaModi2.setBounds(163, 90, 230, 20);
		getContentPane().add(lblUltimaModi2);

		lblAno2 = new JLabel("-- 2023 --");
		lblAno2.setBounds(163, 121, 230, 20);
		getContentPane().add(lblAno2);

		lblCurso2 = new JLabel("-- 1º --");
		lblCurso2.setBounds(163, 152, 230, 20);
		getContentPane().add(lblCurso2);

		lblGrupo2 = new JLabel("-- T1 --");
		lblGrupo2.setBounds(163, 183, 230, 20);
		getContentPane().add(lblGrupo2);

		lblNota2 = new JLabel("-- 10 --");
		lblNota2.setBounds(163, 214, 230, 20);
		getContentPane().add(lblNota2);

		lblArea2 = new JLabel("-- DAW, DESAROLLO DE APLICACIONES WEB --");
		lblArea2.setBounds(163, 245, 230, 20);
		getContentPane().add(lblArea2);

		setSize(469, 315);
		setLocationRelativeTo(null);

	}

	@Override
	public void hacerVisible() {
		setVisible(false);
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
	public void setControlador(ControladorPrincipal_Modificar c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setControlador(ControladorModificar_Editar c) {
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

}
