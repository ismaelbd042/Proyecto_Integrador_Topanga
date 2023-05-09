package vista;

import controlador.ControladorPrincipal_Ver;

public interface IVentana {

	public void inicializarComponentes();

	public void hacerVisible();

	public void setControlador(ControladorPrincipal_Ver c);
}