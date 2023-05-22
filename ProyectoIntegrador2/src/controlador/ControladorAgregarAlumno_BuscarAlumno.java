package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import vista.VentanaBuscarAlumno;
import vista.VentanaSubir;

public class ControladorAgregarAlumno_BuscarAlumno implements ActionListener {
	
	//Creo las variables 
	private VentanaBuscarAlumno vba;
	private VentanaSubir vs;
	
	//Creo variable static arrayList de Strings 
	static ArrayList<String> alumnoSeleccionado = new ArrayList<>();
	
	//Creamos Construtor de la Clase de ControladorAgregarAlumno_BuscarAlumno
	public ControladorAgregarAlumno_BuscarAlumno(VentanaBuscarAlumno vba, VentanaSubir vs) {
		this.vba = vba;
		this.vs = vs;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// Obtenemos el alumno seleccionado del JList de la clase de buscar alumno
		alumnoSeleccionado.add(vba.getListAlumnos().getSelectedValue());
		//Llamamos a la clase ventana subir y llamamos al metodo rellenarJList para añadir los alumnos
		vs.rellenarJlist(alumnoSeleccionado);
		
		//Ocultamos la ventana de buscar Alumno
		vba.dispose();
		//Hacemos visible la ventana Subir
		vs.hacerVisible();

	}

}
