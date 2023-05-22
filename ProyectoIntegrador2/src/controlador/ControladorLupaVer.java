package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.VentanaVer;

public class ControladorLupaVer implements ActionListener{

	private VentanaVer vv;
	
	
	
	public ControladorLupaVer(VentanaVer vv) {
		this.vv = vv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombreBuscado = vv.getTxtBuscarNombre().getText();
		int area = ListenerComboBoxAREAS.cambioArea_CodArea();
		vv.getProyectos().clearSelection();
		vv.rellenarJlist(AccesoBBDD.conseguirNombresProyectosLupa(nombreBuscado, area));
		
	}

}
