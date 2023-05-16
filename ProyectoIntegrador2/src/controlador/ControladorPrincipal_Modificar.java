package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

public class ControladorPrincipal_Modificar implements ActionListener {

	private Ventana v;
	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
	private VentanaModificar vm;
	private VentanaContraseña vc;

	public ControladorPrincipal_Modificar(Ventana v, VentanaContraseña vc) {
		this.v = v;
		this.vc = vc;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vc.hacerVisible();
	}

}
