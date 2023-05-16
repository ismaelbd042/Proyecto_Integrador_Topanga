package modelo;

public class Áreas {
	
	private String nombre_area;
	private String descripcion;
	
	public Áreas(String nombre_area, String descripcion) {
		this.nombre_area = nombre_area;
		this.descripcion = descripcion;
	}

	public String getNombre_area() {
		return nombre_area;
	}

	public void setNombre_area(String nombre_area) {
		this.nombre_area = nombre_area;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
