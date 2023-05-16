package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaEditar;
import vista.VentanaModificar;
import vista.VentanaVer;

public class ControladorModificar_Editar implements ActionListener{

//	private Ventana v;
//	private VentanaVer vv;
	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
	private VentanaModificar vm;
//	private VentanaContraseña vc;

	public ControladorModificar_Editar(VentanaModificar vm, VentanaEditar ve) {
		this.vm = vm;
		this.ve = ve;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vm.dispose();
		ve.hacerVisible();
		
	}

	

}
