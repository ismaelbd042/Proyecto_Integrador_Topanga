package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

public class ControladorPrincipal_Subir implements ActionListener {

	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;

	public ControladorPrincipal_Subir(Ventana v, VentanaSubir vs) {
		this.v = v;
		this.vs = vs;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		v.dispose();
		vs.hacerVisible();
	}

}
