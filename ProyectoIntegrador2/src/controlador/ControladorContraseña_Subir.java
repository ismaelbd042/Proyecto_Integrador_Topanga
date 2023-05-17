package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

public class ControladorContraseña_Subir implements ActionListener {

	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
	private VentanaSubir vs;
//	private VentanaModificar vm;
	private VentanaContraseña1 vc1;
	private VentanaContraseña2 vc2;

	public ControladorContraseña_Subir(VentanaContraseña1 vc1, VentanaSubir vs, Ventana v) {
		this.vc1 = vc1;
		this.vs = vs;
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (vc1.getPassword().equals("Profesor")) {
			vc1.dispose();
			v.dispose();
			vs.hacerVisible();
		} else {
			
		}
	}

}
