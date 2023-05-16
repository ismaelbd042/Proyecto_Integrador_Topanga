package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaContraseña;
import vista.VentanaModificar;
import vista.VentanaVer;

public class ControladorContraseña_Modificar implements ActionListener {

	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
	private VentanaModificar vm;
	private VentanaContraseña vc;

	public ControladorContraseña_Modificar(VentanaContraseña vc, VentanaModificar vm, Ventana v) {
		this.vc = vc;
		this.vm = vm;
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (vc.getPassword().equals("Profesor")) {
			vc.dispose();
			v.dispose();
			vm.hacerVisible();
		} else {
			
		}
	}
}
