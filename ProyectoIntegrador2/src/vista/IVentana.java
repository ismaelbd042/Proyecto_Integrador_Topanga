package vista;

import controlador.Controlador;

public interface IVentana {

	public void inicializarComponentes();

	public void hacerVisible();

	public void setControlador(Controlador c);
}
