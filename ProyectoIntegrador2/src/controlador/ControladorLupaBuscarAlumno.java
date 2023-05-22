package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.VentanaBuscarAlumno;
import vista.VentanaModificar;

public class ControladorLupaBuscarAlumno implements ActionListener{

	private VentanaBuscarAlumno vba;
	
	public ControladorLupaBuscarAlumno(VentanaBuscarAlumno vba) {
		this.vba = vba;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombreApellido = vba.getTxtBuscador().getText();
		vba.getListAlumnos().clearSelection();
		vba.rellenarJlistAlumno(AccesoBBDD.conseguirNombresyApellidos(nombreApellido));
		
	}

}
