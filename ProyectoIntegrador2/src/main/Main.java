package main;

import controlador.ControladorAgregarAlumno_BuscarAlumno;
import controlador.ControladorAlumno_BuscarAlumno;
import controlador.ControladorBorrarProyecto;
import controlador.ControladorBuscarAlumno_Alumno;
import controlador.ControladorBuscarAlumno_Subir;
import controlador.ControladorContraseña_Modificar;
import controlador.ControladorEditar_Modificar;
import controlador.ControladorInfo_Ver;
import controlador.ControladorLupaBuscarAlumno;
import controlador.ControladorLupaModificar;
import controlador.ControladorLupaVer;
import controlador.ControladorModificar_Editar;
import controlador.ControladorModificar_Principal;
import conexionBBDD.AccesoBBDD;
import controlador.ControladorPrincipal_Modificar_Contra;
import controlador.ControladorContraseña_Subir;
import controlador.ControladorPrincipal_Subir_Contra;
import controlador.ControladorPrincipal_Ver;
import controlador.ControladorSubirProyecto;
import controlador.ControladorSubir_BuscarAlumno;
import controlador.ControladorSubir_Principal;
import controlador.ControladorVer_Info;
import controlador.ControladorVer_Principal;
import vista.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccesoBBDD prueba = new AccesoBBDD();

		java.awt.EventQueue.invokeLater(new Runnable() {

			/**
			 * Metodo run(), que inicializa y configura las ventanas y los controladores de la aplicación
			 */
			public void run() {
				//Creamos las instancias de las ventanas
				Ventana v = new Ventana();
				VentanaVer vv = new VentanaVer();
				VentanaContraseña1 vc1 = new VentanaContraseña1();
				VentanaContraseña2 vc2 = new VentanaContraseña2();
				VentanaSubir vs = new VentanaSubir();
				VentanaModificar vm = new VentanaModificar();
				VentanaInfo vi = new VentanaInfo();
				VentanaEditar ve = new VentanaEditar();
				VentanaAlumno va = new VentanaAlumno();
				VentanaBuscarAlumno vba = new VentanaBuscarAlumno();

				//Creamos las instancias de los controladores
				//Controladores Principal -> Algo
				ControladorPrincipal_Ver controladorP_V = new ControladorPrincipal_Ver(v, vv);
				ControladorPrincipal_Subir_Contra controladorP_S_C = new ControladorPrincipal_Subir_Contra(v, vc1);
				ControladorPrincipal_Modificar_Contra controladorP_M = new ControladorPrincipal_Modificar_Contra(vc2);

				// Controladores Contraseña -> Algo
				ControladorContraseña_Subir controladorC_S = new ControladorContraseña_Subir(vc1, vs, v);
				ControladorContraseña_Modificar controladorC_M = new ControladorContraseña_Modificar(vc2, vm, v);

				//Controladores de Modificar y Editar
				ControladorModificar_Editar controladorM_E = new ControladorModificar_Editar(vm, ve);
				ControladorEditar_Modificar controladorE_M = new ControladorEditar_Modificar(vm, ve);
				ControladorModificar_Principal controladorM_P = new ControladorModificar_Principal(vm, v);

				//Controladores de ventanaSubir
				ControladorSubir_Principal controladorS_P = new ControladorSubir_Principal(v, vs);
				ControladorSubir_BuscarAlumno controladorS_BA = new ControladorSubir_BuscarAlumno(vs, vba);
				ControladorSubirProyecto controladorS = new ControladorSubirProyecto(vs);
				
				//Controladores de buscarAlumno
				ControladorBuscarAlumno_Subir controladorBA_S = new ControladorBuscarAlumno_Subir(vba, vs);
				ControladorBuscarAlumno_Alumno controladorBA_A = new ControladorBuscarAlumno_Alumno(vba, va);
				ControladorAgregarAlumno_BuscarAlumno controladorAG_BA = new ControladorAgregarAlumno_BuscarAlumno(vba, vs);
				
				//Controladores de ventana ver
				ControladorVer_Principal controladorV_P = new ControladorVer_Principal(v, vv);
				ControladorVer_Info controladorV_I = new ControladorVer_Info(vv, vi);
				
				//Controlador de Alumno --> BuscarAlumno
				ControladorAlumno_BuscarAlumno controladorA_BA = new ControladorAlumno_BuscarAlumno(va, vba);
				
				//Controladores de lupa
				ControladorLupaVer controladorLV = new ControladorLupaVer(vv);
				ControladorLupaModificar controladorLM = new ControladorLupaModificar(vm);
				ControladorLupaBuscarAlumno controladorLBA = new ControladorLupaBuscarAlumno(vba);
				
				//Controlador de borrarProyecto
				ControladorBorrarProyecto controladorB = new ControladorBorrarProyecto(vm);
				
				//Controlador de ventana info
				ControladorInfo_Ver controladorI_V = new ControladorInfo_Ver(vv,vi);

				
				//Establecemos los controladores para la ventana principal
				v.setControlador(controladorP_V);
				v.setControlador(controladorP_S_C);
				v.setControlador(controladorP_M);
				v.hacerVisible();

				//Establecemos los controladores para la ventana modificar
				vm.setControlador(controladorM_E);
				vm.setControlador(controladorM_P);
				vm.setControlador(controladorLM);
				vm.setControlador(controladorB);
				
				//Establecemos los controladores para la ventana contraseña
				vc1.setControlador(controladorC_S);
				vc2.setControlador(controladorC_M);

				//Establecemos los controladores para la ventana ver
				vv.setControlador(controladorV_P);
				vv.setControlador(controladorV_I);
				vv.setControlador(controladorLV);

				//Establecemos los controladores para la ventana subir
				vs.setControlador(controladorS_P);
				vs.setControlador(controladorS_BA);
				vs.setControlador(controladorS);
				
				//Establecemos el controlador para la ventana editar
				ve.setControlador(controladorE_M);
				
				//Establecemos los controladores para la ventana buscar alumnos
				vba.setControlador(controladorBA_A);
				vba.setControlador(controladorBA_S);
				vba.setControlador(controladorLBA);
				vba.setControlador(controladorAG_BA);
				
				//Establecemos el controlador para la ventana alumno
				va.setControlador(controladorA_BA);
				
				//Establecemos el controlador para la ventana info
				vi.setControlador(controladorI_V);

			}
		});
//		Prueba para imprimir los nombres de los alumnos
//		AccesoBBDD.getConexion();
//		AccesoBBDD.prueba();
	}

}
