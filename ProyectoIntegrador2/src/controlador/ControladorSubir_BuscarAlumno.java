package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.VentanaBuscarAlumno;
import vista.VentanaSubir;

public class ControladorSubir_BuscarAlumno implements ActionListener {

//	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;
	private VentanaBuscarAlumno vba;

	public ControladorSubir_BuscarAlumno(VentanaSubir vs, VentanaBuscarAlumno vba) {
		this.vs = vs;
		this.vba = vba;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vs.dispose();
		String nombreApellido = vba.getTxtBuscador().getText();
		vba.getListAlumnos().clearSelection();
		vba.rellenarJlistAlumno(AccesoBBDD.conseguirNombresyApellidos(nombreApellido));
		vba.hacerVisible();
	}

}
