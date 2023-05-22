package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.VentanaAlumno;
import vista.VentanaBuscarAlumno;

public class ControladorAlumno_BuscarAlumno implements ActionListener {

//	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
//	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;
	private VentanaBuscarAlumno vba;
	private VentanaAlumno va;

	public ControladorAlumno_BuscarAlumno(VentanaAlumno va, VentanaBuscarAlumno vba) {
		this.vba = vba;
		this.va = va;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		va.dispose();
		String nombre = va.txtNombre.getText();
        String apellidos = va.txtApellidos.getText();
        String expediente = va.txtExpediente.getText();

        // Llamar al método para crear el alumno y agregarlo a la base de datos
        AccesoBBDD.crearAlumno(nombre, apellidos, expediente);

        // Limpiar los campos de texto después de crear el alumno
        va.txtNombre.setText("");
        va.txtApellidos.setText("");
        va.txtExpediente.setText("");
        String nombreApellido = vba.getTxtBuscador().getText();
        vba.getListAlumnos().clearSelection();
		vba.rellenarJlistAlumno(AccesoBBDD.conseguirNombresyApellidos(nombreApellido));
	}

}
