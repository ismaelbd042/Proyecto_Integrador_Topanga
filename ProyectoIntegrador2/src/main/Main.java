package main;

import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
import vista.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				Ventana v = new Ventana();
				VentanaVer vv = new VentanaVer();
//				VentanaContraseña vc = new VentanaContraseña();
				VentanaSubir vs = new VentanaSubir();
				VentanaModificar vm = new VentanaModificar();
//				VentanaInfo vi = new VentanaInfo();
//				VentanaEditar ve = new VentanaEditar();
				ControladorPrincipal_Ver controladorP_V = new ControladorPrincipal_Ver(v, vv);
				ControladorPrincipal_Subir controladorP_S = new ControladorPrincipal_Subir(v, vs);
				ControladorPrincipal_Modificar controladorP_M = new ControladorPrincipal_Modificar(v, vm);


				v.setControlador(controladorP_V);
				v.setControlador(controladorP_S);
				v.setControlador(controladorP_M);
				v.hacerVisible();

			}
		});
	}

}
