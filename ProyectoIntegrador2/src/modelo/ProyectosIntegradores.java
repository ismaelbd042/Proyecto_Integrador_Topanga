package modelo;

/**
 * 
 * @author Ismael Bodas, Álvaro Serrano, Lucca Manfredotti
 *
 */
public class ProyectosIntegradores {

	//Creamos las variables de la clase ProyectosIntegradores
	private String nombre_proyecto;
	private String URL;
	private int componentes;
	private int año;
	private String curso;
	private String grupo;
	private int nota;
	private int cod_area;
	private String ultima_modificacion;

	/**
	 * Creamos el constructor de la clase ProyectosIntegradores
	 * @param nombre_proyecto nombre del proyecto
	 * @param URL url del proyecto
	 * @param componentes componnetes del proyecto
	 * @param año año de entrega
	 * @param curso curso en el que se realiza el proyecto
	 * @param grupo grupo horario (Mañana/Tarde...)
	 * @param nota nota del proyecto
	 * @param cod_area área a la que pertenece el proyecto
	 */
	public ProyectosIntegradores(String nombre_proyecto, String URL, int componentes, int año, String curso,
			String grupo, int nota, int cod_area) {
		this.nombre_proyecto = nombre_proyecto;
		this.URL = URL;
		this.componentes = componentes;
		this.año = año;
		this.curso = curso;
		this.grupo = grupo;
		this.nota = nota;
		this.cod_area = cod_area;
	}

	/**
	 * Getter de la variable nombre_proyecto
	 * @return nombre_proyecto nombre del proyecto
	 */
	public String getNombre_proyecto() {
		return nombre_proyecto;
	}

	/**
	 * Setter de la variable nombre_proyecto
	 * @param nombre_proyecto nombre del proyecto
	 */
	public void setNombre_proyecto(String nombre_proyecto) {
		this.nombre_proyecto = nombre_proyecto;
	}

	/**
	 * Getter de la variable URL
	 * @return URL url del proyecto
	 */
	public String getURL() {
		return URL;
	}

	/**
	 * Setter de la variable URL
	 * @param uRL url del proyecto
	 */
	public void setURL(String uRL) {
		URL = uRL;
	}

	/**
	 * Getter de la variable componentes
	 * @return componentes componentes del proyecto
	 */
	public int getComponentes() {
		return componentes;
	}

	/**
	 * Setter de la variable componentes
	 * @param componentes componentes del proyecto
	 */
	public void setComponentes(int componentes) {
		this.componentes = componentes;
	}

	/**
	 * Getter de la variable año
	 * @return año Año de entrega
	 */
	public int getAño() {
		return año;
	}

	/**
	 * Setter de la variable año 
	 * @param año Año de entrega
	 */
	public void setAño(int año) {
		this.año = año;
	}

	/**
	 * Getter de la variable curso
	 * @return curso Curso en el que se realiza el proyecto
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * Setter de la variable curso
	 * @param curso Curso en el que se realiza el proyecto
	 */
	public void setCurso(String curso) {
		this.curso = curso;
	}

	/**
	 * Getter de la variable grupo
	 * @return grupo Grupo horario
	 */
	public String getGrupo() {
		return grupo;
	}

	/**
	 * Setter de la variable grupo
	 * @param grupo Grupo horario
	 */
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	/**
	 * Getter de la variable nota
	 * @return nota Nota del proyecto
	 */
	public int getNota() {
		return nota;
	}

	/**
	 * Setter de la variable nota 
	 * @param nota Nota del proyecto
	 */
	public void setNota(int nota) {
		this.nota = nota;
	}

	/**
	 * Getter de la variable cod_area
	 * @return cod_area Área a la que pertenece el proyecto
	 */
	public int getCod_area() {
		return cod_area;
	}

	/**
	 * Setter de la variable cod_area
	 * @param cod_area Área a la que pertenece el proyecto
	 */
	public void setCod_area(int cod_area) {
		this.cod_area = cod_area;
	}

	/**
	 * Getter de la variable ultima_modificacion
	 * @return ultima_modificacion fecha de la ultima modificacion que se realiza en el proyecto
	 */
	public String getUltima_modificacion() {
		return ultima_modificacion;
	}

	/**
	 * Setter de la variable ultima_modificacion
	 * @param ultima_modificacion fecha de la ultima modificacion que se realiza en el proyecto
	 */
	public void setUltima_modificacion(String ultima_modificacion) {
		this.ultima_modificacion = ultima_modificacion;
	}

}
