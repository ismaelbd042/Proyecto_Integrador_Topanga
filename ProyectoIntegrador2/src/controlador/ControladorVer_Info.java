package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaInfo;
import vista.VentanaVer;

public class ControladorVer_Info implements ActionListener {

//	private Ventana v;
	private VentanaVer vv;
//	private VentanaEditar ve;
	private VentanaInfo vi;
//	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;
//	private VentanaBuscarAlumno vba;

	public ControladorVer_Info(VentanaVer vv, VentanaInfo vi) {
		this.vv = vv;
		this.vi = vi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vv.dispose();
		vi.hacerVisible();
	}

}
