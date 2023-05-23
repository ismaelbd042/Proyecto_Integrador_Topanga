package modelo;

/**
 * 
 * @author Ismael Bodas, Álvaro Serrano, Lucca Manfredotti
 *
 */
public class Alumnos {
	
	//Creamos las variables de la clase alumno
	private int id_alumno;
	private String nombre_alumno;
	private String apellido_alumno;
	private String num_expediente;
	/**
	 * Constructor de la Clase Alumnos con los diferentes parametros
	 * @param id_alumno id del alumno
	 * @param nombre_alumno nombre del alumno
	 * @param apellido_alumno apellido del alumno
	 * @param num_expediente numero de expediente del alumno
	 */
	public Alumnos(int id_alumno, String nombre_alumno, String apellido_alumno, String num_expediente) {
		this.id_alumno = id_alumno;
		this.nombre_alumno = nombre_alumno;
		this.apellido_alumno = apellido_alumno;
		this.num_expediente = num_expediente;
	}

	/**
	 * Getter de la variable id_alumno
	 * @return id_alumno id del alumno
	 */
	public int getId_alumno() {
		return id_alumno;
	}

	/**
	 * Setter de la variable id_alumno
	 * @param id_alumno id del alumno
	 */
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}

	/**
	 * Getter de la variable nombre_alumno
	 * @return nombre_alumno nombre del alumno
	 */
	public String getNombre_alumno() {
		return nombre_alumno;
	}

	/**
	 * Setter de la variable nombre_alumno
	 * @param nombre_alumno nombre del alumno
	 */
	public void setNombre_alumno(String nombre_alumno) {
		this.nombre_alumno = nombre_alumno;
	}

	/**
	 * Getter de la variable apellido_alumno
	 * @return apellido_alumno apellido del alumno
	 */
	public String getApellido_alumno() {
		return apellido_alumno;
	}

	/**
	 * Setter de la variable apellido_alumno
	 * @param apellido_alumno apellido del alumno
	 */
	public void setApellido_alumno(String apellido_alumno) {
		this.apellido_alumno = apellido_alumno;
	}

	/**
	 * Getter de la variable num_expediente
	 * @return num_expediente numero de expediente del alumno
	 */
	public String getNum_expediente() {
		return num_expediente;
	}

	/**
	 * Setter de la variable num_expediente
	 * @param num_expediente numero de expediente del alumno
	 */
	public void setNum_expediente(String num_expediente) {
		this.num_expediente = num_expediente;
	}
	
	

}
