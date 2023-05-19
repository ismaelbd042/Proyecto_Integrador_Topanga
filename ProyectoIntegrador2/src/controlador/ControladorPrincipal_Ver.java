package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
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
		vv.rellenarAreas(AccesoBBDD.conseguirAreas());
		vv.hacerVisible();

	}

}

// Hasta aqui funciona y pasa de la ventana principal a la de ver.
// Es posible que haya que hacer una IVentana para cada vista
// Meter el "public void setControlador(ControladorPrincipal_Ver c);" 
// cambiando el ControladorPrincipal_Ver por el controlador que corresponda