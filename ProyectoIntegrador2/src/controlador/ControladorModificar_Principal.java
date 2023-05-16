package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaEditar;
import vista.VentanaModificar;

public class ControladorModificar_Principal implements ActionListener {

	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
	private VentanaModificar vm;
//	private VentanaContraseña vc;

	public ControladorModificar_Principal(VentanaModificar vm, Ventana v ){
		this.vm = vm;
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vm.dispose();
		v.hacerVisible();
		
	}
}
