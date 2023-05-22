package modelo;

public class ProyectosIntegradores {
	
	private String nombre_proyecto;
	private String URL;
	private int componentes;
	private int año;
	private String curso;
	private String grupo;
	private int nota;
	private int cod_area;
	private int[][] alumnoRealizaProyecto;
	private String ultima_modificacion;
	
	public ProyectosIntegradores(String nombre_proyecto, String URL, int componentes, int año, String curso,
			String grupo, int nota, int cod_area, int[][] alumnoRealizaProyecto) {
		this.nombre_proyecto = nombre_proyecto;
		this.URL = URL;
		this.componentes = componentes;
		this.año = año;
		this.curso = curso;
		this.grupo = grupo;
		this.nota = nota;
		this.cod_area = cod_area;
		this.alumnoRealizaProyecto = alumnoRealizaProyecto;
	}

	public String getNombre_proyecto() {
		return nombre_proyecto;
	}

	public void setNombre_proyecto(String nombre_proyecto) {
		this.nombre_proyecto = nombre_proyecto;
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}

	public int getComponentes() {
		return componentes;
	}

	public void setComponentes(int componentes) {
		this.componentes = componentes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public int getCod_area() {
		return cod_area;
	}

	public void setCod_area(int cod_area) {
		this.cod_area = cod_area;
	}

	public int[][] getAlumnoRealizaProyecto() {
		return alumnoRealizaProyecto;
	}

	public void setAlumnoRealizaProyecto(int[][] alumnoRealizaProyecto) {
		this.alumnoRealizaProyecto = alumnoRealizaProyecto;
	}

	public String getUltima_modificacion() {
		return ultima_modificacion;
	}

	public void setUltima_modificacion(String ultima_modificacion) {
		this.ultima_modificacion = ultima_modificacion;
	}
	
	

}
