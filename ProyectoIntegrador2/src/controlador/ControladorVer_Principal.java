package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaVer;

public class ControladorVer_Principal implements ActionListener {

	private Ventana v;
	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;

	public ControladorVer_Principal(Ventana v, VentanaVer vv) {
		this.v = v;
		this.vv = vv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vv.dispose();
		v.hacerVisible();

	}


}
