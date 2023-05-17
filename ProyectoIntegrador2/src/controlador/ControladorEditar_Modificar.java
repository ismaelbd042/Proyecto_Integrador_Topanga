package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaEditar;
import vista.VentanaModificar;

public class ControladorEditar_Modificar implements ActionListener {

//	private Ventana v;
//	private VentanaVer vv;
	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
	private VentanaModificar vm;
//	private VentanaContraseña vc;

	public ControladorEditar_Modificar(VentanaModificar vm, VentanaEditar ve) {
		this.vm = vm;
		this.ve = ve;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ve.dispose();
		vm.hacerVisible();
		
	}

}
