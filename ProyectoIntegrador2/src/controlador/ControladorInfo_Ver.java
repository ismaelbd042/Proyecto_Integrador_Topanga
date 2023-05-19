package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.VentanaInfo;
import vista.VentanaVer;

public class ControladorInfo_Ver implements ActionListener{
	
//	private Ventana v;
	private VentanaVer vv;
//	private VentanaEditar ve;
	private VentanaInfo vi;
//	private VentanaSubir vs;
//	private VentanaModificar vm;
//	private VentanaContraseña vc;
//	private VentanaBuscarAlumno vba;

	public ControladorInfo_Ver(VentanaVer vv, VentanaInfo vi) {
		this.vv = vv;
		this.vi = vi;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		vi.dispose();
		vv.hacerVisible();
	}
	

}
