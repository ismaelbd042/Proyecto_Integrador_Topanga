package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

public class ControladorPrincipal_Modificar_Contra implements ActionListener {

	private Ventana v;
	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
	private VentanaModificar vm;
	private VentanaContraseña1 vc1;
	private VentanaContraseña2 vc2;

	public ControladorPrincipal_Modificar_Contra(Ventana v, VentanaContraseña2 vc) {
		this.v = v;
		this.vc2 = vc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vc2.hacerVisible();
	}

}
