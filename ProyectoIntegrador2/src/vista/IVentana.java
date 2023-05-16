package vista;

import controlador.ControladorContraseña_Modificar;
import controlador.ControladorModificar_Editar;
import controlador.ControladorPrincipal_Modificar;
import controlador.ControladorPrincipal_Subir;
import controlador.ControladorPrincipal_Ver;

public interface IVentana {

	public void inicializarComponentes();

	public void hacerVisible();

	public void setControlador(ControladorPrincipal_Ver c);
	
	public void setControlador(ControladorPrincipal_Subir c);
	
	public void setControlador(ControladorPrincipal_Modificar c);

	public void setControlador(ControladorModificar_Editar c);

	public void setControlador(ControladorContraseña_Modificar c);
}