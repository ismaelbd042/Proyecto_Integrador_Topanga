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
//	private VentanaContraseña vc;

	public ControladorPrincipal_Modificar(Ventana v, VentanaModificar vm) {
		this.v = v;
		this.vm = vm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		v.dispose();
		vm.hacerVisible();
	}

}
