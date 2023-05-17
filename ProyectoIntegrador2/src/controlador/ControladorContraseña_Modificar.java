package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Ventana;
import vista.VentanaContraseña1;
import vista.VentanaContraseña2;
import vista.VentanaModificar;
import vista.VentanaVer;

public class ControladorContraseña_Modificar implements ActionListener {

	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
	private VentanaModificar vm;
	private VentanaContraseña1 vc1;
	private VentanaContraseña2 vc2;

	public ControladorContraseña_Modificar(VentanaContraseña2 vc2, VentanaModificar vm, Ventana v) {
		this.vc2 = vc2;
		this.vm = vm;
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (vc2.getPassword().equals("Profesor")) {
			vc2.dispose();
			v.dispose();
			vm.hacerVisible();
			vc2.incorrecto.setText("");
			vc2.contraseña.setText(null);
		} else {
			vc2.incorrecto.setText("Contraseña incorrecta");
		}

	}
}
