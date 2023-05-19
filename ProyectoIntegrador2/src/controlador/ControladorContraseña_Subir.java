package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import conexionBBDD.AccesoBBDD;
import vista.*;

public class ControladorContraseña_Subir implements ActionListener {

	private Ventana v;
//	private VentanaVer vv;
//	private VentanaEditar ve;
//	private VentanaInfo vi;
	private VentanaSubir vs;
//	private VentanaModificar vm;
	private VentanaContraseña1 vc1;
	private VentanaContraseña2 vc2;

	public ControladorContraseña_Subir(VentanaContraseña1 vc1, VentanaSubir vs, Ventana v) {
		this.vc1 = vc1;
		this.vs = vs;
		this.v = v;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (vc1.getPassword().equals("Profesor")) {
			vc1.dispose();
			v.dispose();
			vs.getTxtano().setText(null);
			vs.getTxtnota().setText(null);
			vs.getTxtgrupo().setText(null);
			vs.getTxturl().setText(null);;
			vs.getNombre().setText(null);
//			vs.getColaboradores().setTe
			vs.getListaAlu().clearSelection();
			vs.getRbtn1().setSelected(false);
			vs.getRbtn2().setSelected(false);
			vs.getAreas().removeAllItems();
			
			vs.rellenarAreas(AccesoBBDD.conseguirAreas());

			vs.hacerVisible();
			vc1.incorrecto.setText("");
			vc1.contraseña.setText(null);
		} else {
			vc1.incorrecto.setText("Contraseña incorrecta");
		}
	}

}
