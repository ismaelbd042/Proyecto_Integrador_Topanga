package modelo;

public class Alumnos {
	
	private int id_alumno;
	private String nombre_alumno;
	private String apellido_alumno;
	private String num_expediente;
	
	public Alumnos(int id_alumno, String nombre_alumno, String apellido_alumno, String num_expediente) {
		this.id_alumno = id_alumno;
		this.nombre_alumno = nombre_alumno;
		this.apellido_alumno = apellido_alumno;
		this.num_expediente = num_expediente;
	}

	public int getId_alumno() {
		return id_alumno;
	}

	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}

	public String getNombre_alumno() {
		return nombre_alumno;
	}

	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	public String getApellido_alumno() {
		return apellido_alumno;
	}

	public void setApellido_alumno(String apellido_alumno) {
		this.apellido_alumno = apellido_alumno;
	}

	public String getNum_expediente() {
		return num_expediente;
	}

	public void setNum_expediente(String num_expediente) {
		this.num_expediente = num_expediente;
	}
	
	

}
