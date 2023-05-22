package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import modelo.ProyectosIntegradores;
import vista.VentanaInfo;
import vista.VentanaVer;

public class ControladorVer_Info implements ActionListener {

//	private Ventana v;
	private VentanaVer vv;
//	private VentanaEditar ve;
	private VentanaInfo vi;
//	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;
//	private VentanaBuscarAlumno vba;

	public ControladorVer_Info(VentanaVer vv, VentanaInfo vi) {
		this.vv = vv;
		this.vi = vi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vv.dispose();
		vi.rellenarInfo(AccesoBBDD.conseguirInfo(vv.getProyectos().getSelectedValue()),
				AccesoBBDD.conseguirColaboradores(vv.getProyectos().getSelectedValue()));
		String nombreArea = "";
		if (vi.getLblArea2().getText().equals("1")) {
			nombreArea = "DAW";
		} else if (vi.getLblArea2().getText().equals("2")) {
			nombreArea = "DAM";
		} else if (vi.getLblArea2().getText().equals("3")) {
			nombreArea = "ASIR";
		} else if (vi.getLblArea2().getText().equals("4")) {
			nombreArea = "A3D";
		} else if (vi.getLblArea2().getText().equals("5")) {
			nombreArea = "VDJ";
		} else {

		}
		vi.getLblArea2().setText(nombreArea);

		vi.hacerVisible();

	}

}
