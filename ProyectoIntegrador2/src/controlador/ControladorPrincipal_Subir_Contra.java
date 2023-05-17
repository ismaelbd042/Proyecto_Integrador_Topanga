package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

public class ControladorPrincipal_Subir_Contra implements ActionListener {

	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
//	private VentanaModificar vm;
	private VentanaContraseña1 vc1;
	private VentanaContraseña2 vc2;

	public ControladorPrincipal_Subir_Contra(Ventana v, VentanaContraseña1 vc) {
		this.v = v;
		this.vc1 = vc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vc1.hacerVisible();
	}

}
