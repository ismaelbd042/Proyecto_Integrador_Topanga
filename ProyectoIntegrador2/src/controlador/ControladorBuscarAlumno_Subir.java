package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaBuscarAlumno;
import vista.VentanaSubir;

public class ControladorBuscarAlumno_Subir implements ActionListener {

//	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;
	private VentanaBuscarAlumno vba;

	public ControladorBuscarAlumno_Subir(VentanaBuscarAlumno vba, VentanaSubir vs) {
		this.vba = vba;
		this.vs = vs;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vba.dispose();
		vs.hacerVisible();
	}

}
