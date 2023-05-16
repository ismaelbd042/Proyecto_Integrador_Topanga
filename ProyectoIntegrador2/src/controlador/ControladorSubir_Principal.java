package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaSubir;

public class ControladorSubir_Principal implements ActionListener {

	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;

	public ControladorSubir_Principal(Ventana v, VentanaSubir vs) {
		this.v = v;
		this.vs = vs;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vs.dispose();
		v.hacerVisible();
	}

}
