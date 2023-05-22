package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.VentanaModificar;

public class ControladorLupaModificar implements ActionListener{

	private VentanaModificar vm;
	
	public ControladorLupaModificar(VentanaModificar vm) {
		this.vm = vm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nombreBuscado = vm.getTxtBuscarNombre().getText();
		int area = ListenerComboBoxAREAS.cambioArea_CodArea();
		vm.getProyectos().clearSelection();
		vm.rellenarJlist(AccesoBBDD.conseguirNombresProyectosLupa(nombreBuscado, area));
		
	}
}
