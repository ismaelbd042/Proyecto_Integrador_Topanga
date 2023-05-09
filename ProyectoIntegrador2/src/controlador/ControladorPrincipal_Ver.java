package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.*;

public class ControladorPrincipal_Ver implements ActionListener {

	private Ventana v;
	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;

	public ControladorPrincipal_Ver(Ventana v, VentanaVer vv) {
		this.v = v;
		this.vv = vv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		v.dispose();
		vv.setVisible(true);
	}

}
