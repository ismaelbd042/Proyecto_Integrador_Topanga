package main;

import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import conexionBBDD.AccesoBBDD;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Principal;
import vista.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesoBBDD prueba = new AccesoBBDD();

		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				Ventana v = new Ventana();
				VentanaVer vv = new VentanaVer();
//				VentanaContraseña vc = new VentanaContraseña();
				VentanaSubir vs = new VentanaSubir();
				VentanaModificar vm = new VentanaModificar();
//				VentanaInfo vi = new VentanaInfo();
				VentanaEditar ve = new VentanaEditar();
				ControladorPrincipal_Ver controladorP_V = new ControladorPrincipal_Ver(v, vv);
				ControladorPrincipal_Subir controladorP_S = new ControladorPrincipal_Subir(v, vs);
				ControladorPrincipal_Modificar controladorP_M = new ControladorPrincipal_Modificar(v, vm);
				ControladorModificar_Editar controladorM_E = new ControladorModificar_Editar(vm, ve);
				ControladorSubir_Principal controladorS_P = new ControladorSubir_Principal(v, vs);
				ControladorVer_Principal controladorV_P = new ControladorVer_Principal(v, vv);
				ControladorModificar_Principal controladorM_P = new ControladorModificar_Principal(vm, v);


				v.setControlador(controladorP_V);
				v.setControlador(controladorP_S);
				v.setControlador(controladorP_M);
				vm.setControlador(controladorM_E);
				vs.setControlador(controladorS_P);
				vv.setControlador(controladorV_P);
				vm.setControlador(controladorM_P);
				v.hacerVisible();

			}
		});
//		Prueba para imprimir los nombres de los alumnos
		prueba.getConexion();
		prueba.prueba();
	}

}
