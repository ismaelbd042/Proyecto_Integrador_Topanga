package modelo;

/**
 * 
 * @author Ismael Bodas, Álvaro Serrano y Lucca Manfredotti
 *
 */
public class Áreas {
	
	//Creamos las variables de la clase Áreas
	private String nombre_area;
	private String descripcion;
	
	/**
	 * Creamos el constructor de la clase Áreas
	 * @param nombre_area nombre del área
	 * @param descripcion descripción del área
	 */
	public Áreas(String nombre_area, String descripcion) {
		this.nombre_area = nombre_area;
		this.descripcion = descripcion;
	}

	/**
	 * Getter de la variable nombre_area
	 * @return nombre_area nombre del area
	 */
	public String getNombre_area() {
		return nombre_area;
	}

	/**
	 * Setter de la variable nombre_area
	 * @param nombre_area nombre del area
	 */
	public void setNombre_area(String nombre_area) {
		this.nombre_area = nombre_area;
	}

	/**
	 * Getter de la variable descripcion
	 * @return descripcion descripcion del área
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Setter de la variable descripcion
	 * @param descripcion descripcion del área
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
