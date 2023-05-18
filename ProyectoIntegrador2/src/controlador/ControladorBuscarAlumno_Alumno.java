package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaAlumno;
import vista.VentanaBuscarAlumno;
import vista.VentanaSubir;

public class ControladorBuscarAlumno_Alumno implements ActionListener {

//	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;
	private VentanaBuscarAlumno vba;
	private VentanaAlumno va;

	public ControladorBuscarAlumno_Alumno(VentanaBuscarAlumno vba, VentanaAlumno va) {
		this.vba = vba;
		this.va = va;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		va.hacerVisible();
	}

}
