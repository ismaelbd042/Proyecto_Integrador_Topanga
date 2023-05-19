package main;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorEditar_Modificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import conexionBBDD.AccesoBBDD;
import controlador.ControladorPrincipal_Modificar_Contra;
import controlador.ControladorContraseña_Subir;
import controlador.ControladorPrincipal_Subir_Contra;
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
				VentanaContraseña1 vc1 = new VentanaContraseña1();
				VentanaContraseña2 vc2 = new VentanaContraseña2();
				VentanaSubir vs = new VentanaSubir();
				VentanaModificar vm = new VentanaModificar();
//				VentanaInfo vi = new VentanaInfo();
				VentanaEditar ve = new VentanaEditar();

				// Controladores Principal -> Algo
				ControladorPrincipal_Ver controladorP_V = new ControladorPrincipal_Ver(v, vv);
				ControladorPrincipal_Subir_Contra controladorP_S_C = new ControladorPrincipal_Subir_Contra(v, vc1);
				ControladorPrincipal_Modificar_Contra controladorP_M = new ControladorPrincipal_Modificar_Contra(v,
						vc2);

				// Controladores Contraseña -> Algo
				ControladorContraseña_Subir controladorC_S = new ControladorContraseña_Subir(vc1, vs, v);
				ControladorContraseña_Modificar controladorC_M = new ControladorContraseña_Modificar(vc2, vm, v);

				ControladorModificar_Editar controladorM_E = new ControladorModificar_Editar(vm, ve);
				ControladorEditar_Modificar controladorE_M = new ControladorEditar_Modificar(vm, ve);

				ControladorSubir_Principal controladorS_P = new ControladorSubir_Principal(v, vs);
				ControladorVer_Principal controladorV_P = new ControladorVer_Principal(v, vv);
				ControladorModificar_Principal controladorM_P = new ControladorModificar_Principal(vm, v);

				v.setControlador(controladorP_V);
				v.setControlador(controladorP_S_C);
				v.setControlador(controladorP_M);
				v.hacerVisible();

				vm.setControlador(controladorM_E);
				vm.setControlador(controladorM_P);

				vc1.setControlador(controladorC_S);
				vc2.setControlador(controladorC_M);

				vv.setControlador(controladorV_P);

				vs.setControlador(controladorS_P);

				ve.setControlador(controladorE_M);

			}
		});
//		Prueba para imprimir los nombres de los alumnos
//		AccesoBBDD.getConexion();
//		AccesoBBDD.prueba();
	}

}
