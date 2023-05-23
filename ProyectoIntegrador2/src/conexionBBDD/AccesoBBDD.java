package conexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import modelo.ProyectosIntegradores;
import vista.VentanaEditar;
/**
 * 
 * @author Ismael Bodas, Álvaro Serrano y Lucca Manfredotti
 *
 */

public class AccesoBBDD {
	static String driver = "com.mysql.cj.jdbc.Driver";
	static String url = "jdbc:mysql://localhost/proyectointegrador";
	static String usuario = "root";
	static String pwd = "rootroot";
	private static Connection con = null;

	/**
	 * Método getConexion() que se encarga de crear la conexión con la base de datos
	 * 
	 * @return objeto de tipo Connection
	 */
	public static Connection getConexion() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, pwd);

		} catch (Exception e) {
			System.out.println("Error al establecer conexión con BBDD:");
			e.printStackTrace();
		}

		return con;
	}

	/**
	 * Metodo cerrarConexion() que se encarga de cerrar la conexión con la base de
	 * datos
	 */
	public static void cerrarConexion() {
		try {
			//Cerramos la conexión
			con.close();
		} catch (SQLException e) {
			System.out.println("Error al cerrar BBDD");
			e.printStackTrace();
		}
	}

	/**
	 * Metodo registrar que sirve para registrar un proyecto 
	 * @param proyecto Objeto de la Clase ProyectosIntegradores
	 */
	public static void registrar(ProyectosIntegradores proyecto) {
		//Llamamos metodo getConexion para establecer conexion
		getConexion();
		try {
			//Creamos la consulta insert
			String query = "INSERT INTO proyectos (nombre_proyecto, URL, componentes, ultima_modificacion, año, curso, grupo, nota, cod_area) "
					+ "VALUES (?, ?, ?, CURRENT_TIMESTAMP, ?, ?, ?, ?, ?)";

			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, proyecto.getNombre_proyecto());
			statement.setString(2, proyecto.getURL());
			statement.setInt(3, proyecto.getComponentes());
			statement.setInt(4, proyecto.getAño());
			statement.setString(5, proyecto.getCurso());
			statement.setString(6, proyecto.getGrupo());
			statement.setInt(7, proyecto.getNota());
			statement.setInt(8, proyecto.getCod_area());

			statement.executeUpdate();
			//Imprimimos por pantalla este mensaje para comprobar si se inserta correctamente los datos
			System.out.println("Proyecto insertado correctamente en la base de datos.");
			//Cerramos la conexion
			cerrarConexion();
			//Capturamos SQL Exception
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo conseguirAreas para conseguir el nombre de lasa areas con una consulta
	 * @return nombreAreas
	 */
	public static ArrayList<String> conseguirAreas() {
		//Establecemos la conexion
		getConexion();
		//Creamos un ArrayList de string llamada nombreAreas
		ArrayList<String> nombreAreas = new ArrayList<>();

		//Hacemos un try para capturar excepciones posibles
		try {
			Statement statement = con.createStatement();
			//Creamos la consulta para obtener el nombre_area de la tabla area
			String query = "SELECT nombre_area FROM area";
			
			//El metodo executeQuery lo utilizamos para realizar sentencias de tipo SELECT en la base de datos
			//y devuelve un objeto resultset.
			ResultSet resultado = statement.executeQuery(query);

			while (resultado.next()) {
				nombreAreas.add(resultado.getString(1));
			}
			//Cerramos la conexion
			cerrarConexion();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return nombreAreas;
	}

	/**
	 * Creamos metodo para conseguir la informacion de los ProyectosIntegradores
	 * @param nombre nombre del proyecto
	 * @return datosProyecto
	 */
	public static ProyectosIntegradores conseguirInfo(String nombre) {
		//Establecemos la conexion
		getConexion();
		//Creamos un objeto de ProyectosIntegradores y lo inicializamos a null
		ProyectosIntegradores datosProyecto = null;

		
		//Creamos un try para capturar las posibles excepciones que nos pueden surgir
		try {
			Statement statement = con.createStatement();
			//Creamos la consulta SELECT
			String query = "SELECT * FROM proyectos WHERE nombre_proyecto = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, nombre);
			
			//El metodo executeQuery lo utilizamos para realizar sentencias de tipo SELECT en la base de datos
			//y devuelve un objeto resultset.
			ResultSet resultado = pstmt.executeQuery();

			//Creamos un if 
			if (resultado.next()) {
				datosProyecto = new ProyectosIntegradores(resultado.getString("nombre_proyecto"),
						resultado.getString("URL"), resultado.getInt("componentes"), resultado.getInt("año"),
						resultado.getString("curso"), resultado.getString("grupo"), resultado.getInt("nota"),
						resultado.getInt("cod_area"));

				datosProyecto.setUltima_modificacion(resultado.getString("ultima_modificacion"));
			}

			//Cerramos la conexion
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return datosProyecto;
	}

	/**
	 * Creamos metodo conseguirNombresProyectos para consrguir los nombres
	 * @return nombresProyectos nombre de los proyectos
	 */
	public static ArrayList<String> conseguirNombresProyectos() {
		//Establecemos la conexion
		getConexion();
		//Creamos ArrayList de String llamado nombreProyectos
		ArrayList<String> nombresProyectos = new ArrayList<>();

		//Creamos el try para capturar las posibles excepciones
		try {
			Statement statement = con.createStatement();
			//Creamos la consulta select, para obtener nombre_proyecto de la tabla proyectos
			String query = "SELECT nombre_proyecto FROM proyectos";
			
			//El metodo executeQuery lo utilizamos para realizar sentencias de tipo SELECT en la base de datos
			//y devuelve un objeto resultset.
			ResultSet resultado = statement.executeQuery(query);

			while (resultado.next()) {
				String nombre_proyecto = resultado.getString("nombre_proyecto");
				//Agregamos el valor a la lista
				nombresProyectos.add(nombre_proyecto);
			}

			//Cerramos la Conexion
			cerrarConexion();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nombresProyectos;
	}

	/**
	 * Creamos metodo conseguirNombreaProyectosLupa
	 * @param nombreBuscado nombre buscado
	 * @param area area del proyecto
	 * @return nombresProyectos
	 */
	public static ArrayList<String> conseguirNombresProyectosLupa(String nombreBuscado, int area) {
		//Establecemos la conexion
		getConexion();
		//Creamos ArrayList de Strings llamado nombresProyectos
		ArrayList<String> nombresProyectos = new ArrayList<>();

		//Creamos el try para capturar las posibles excepciones
		try {
			//Creamos la consulta SELECT
			String query = "SELECT nombre_proyecto FROM proyectos where nombre_proyecto like '%" + nombreBuscado
					+ "%' and cod_area = " + area;
			Statement statement = con.createStatement();
			
			//El metodo executeQuery lo utilizamos para realizar sentencias de tipo SELECT en la base de datos
			//y devuelve un objeto resultset.
			ResultSet resultado = statement.executeQuery(query);

			while (resultado.next()) {
				String nombre_proyecto = resultado.getString("nombre_proyecto");
				//Agregamos el valor a la lista
				nombresProyectos.add(nombre_proyecto);
			}

			//Cerramos la conexion
			cerrarConexion();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nombresProyectos;
	}

	/**
	 * Creamos metodo conseguirColaboradores para conseguir los colaboradores del proyecto
	 * @param proyecto String proyecto
	 * @return lista
	 */
	public static ArrayList<String> conseguirColaboradores(String proyecto) {
		//Establecemos la Conexion
		getConexion();
		//Creamos ArrayList de Strings llamado lista
		ArrayList<String> lista = new ArrayList<>();
		//Creamos la sentencia SELECT
		String query = "SELECT alumno.nombre_alumno, alumno.apellido_alumno " + "FROM alumno "
				+ "JOIN realiza ON alumno.id_alumno = realiza.id_alumno "
				+ "JOIN proyectos ON realiza.id_proyecto = proyectos.id_proyecto "
				+ "WHERE proyectos.nombre_proyecto = ?";
		//Creamos un try para capturar las posibles excepciones
		try (PreparedStatement pstmt = con.prepareStatement(query)) {
			pstmt.setString(1, proyecto);

			//El metodo executeQuery lo utilizamos para realizar sentencias de tipo SELECT en la base de datos
			//y devuelve un objeto resultset.
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String nombreAlumno = rs.getString("nombre_alumno");
				String apellidoAlumno = rs.getString("apellido_alumno");
				//Añadimos a la lista el nombre junto al apellido del alumno
				lista.add(nombreAlumno + " " + apellidoAlumno);
			}
			//Cerramos la Conexión
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;

	}

	/**
	 * Creamos metodo borrarProyecto para borrar el proyecto que seleccionemos 
	 * @param nombreProyecto nombre del proyecto
	 * @return false
	 */
	public static boolean borrarProyecto(String nombreProyecto) {
		//Establecemos la conexion
		getConexion();
		try {
			// Preparar la sentencia SQL DELETE
			String query = "DELETE FROM proyectos WHERE nombre_proyecto = ?";
			PreparedStatement statement = con.prepareStatement(query);

			// Establecer el valor del parámetro en la sentencia SQL
			statement.setString(1, nombreProyecto);

			// Ejecutar la sentencia SQL DELETE
			int filasAfectadas = statement.executeUpdate();
			//Cerramos la conexion
			cerrarConexion();
			return filasAfectadas > 0; // Verificar si se eliminó alguna fila

		} catch (SQLException e) {
			e.printStackTrace();
			return false; // Error al ejecutar la sentencia SQL
		}

	}

	/**
	 * Creamos metodo conseguirNombreyApellidos
	 * @param nombreAlumno nombre del alumno
	 * @return nombresAlumnos
	 */
	public static ArrayList<String> conseguirNombresyApellidos(String nombreAlumno) {
		//Establecemos la conexion
		getConexion();
		//Creamos ArrayLista de Strings llamado nombresAlumnos
		ArrayList<String> nombresAlumnos = new ArrayList<>();

		//Creamos un try para capturar las posibles excepciones
		try {
			Statement statement = con.createStatement();
			//Creamos la consulta
			String query = "SELECT nombre_alumno, apellido_alumno, num_expediente FROM alumno WHERE CONCAT(nombre_alumno, ' ', apellido_alumno) LIKE '%"
					+ nombreAlumno + "%' OR num_expediente LIKE '" + nombreAlumno + "%'";

			//El metodo executeQuery lo utilizamos para realizar sentencias de tipo SELECT en la base de datos
			//y devuelve un objeto resultset.
			ResultSet resultado = statement.executeQuery(query);

			while (resultado.next()) {
				String nombreApellido = resultado.getString("nombre_alumno") + " "
						+ resultado.getString("apellido_alumno") + " (" + resultado.getString("num_expediente") + ")";
				//Añadimos a nombresAlumnos el nombreApellido
				nombresAlumnos.add(nombreApellido);
			}

			//Cerramos la Conexion
			cerrarConexion();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nombresAlumnos;
	}

	/**
	 * Creamos metodo crear alumno para crear un alumno y luego poder añadirlo a diferentes proyectos
	 * @param nombre_alumno nombre del alumno
	 * @param apellido_alumno apellido del alumno
	 * @param num_expediente numero del expediente del alumno
	 */
	public static void crearAlumno(String nombre_alumno, String apellido_alumno, String num_expediente) {
		try {
			// Establecer conexión con la base de datos
			getConexion();

			//Creamos un if para comprobar si esta vacio
			if (nombre_alumno.isEmpty() || apellido_alumno.isEmpty() || num_expediente.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No se consiguió subir", "Aviso", JOptionPane.WARNING_MESSAGE);
				return; // Salir del método sin ejecutar la inserción
			}
			
			// Verificar si el alumno ya está creado
	        String consulta = "SELECT * FROM alumno WHERE num_expediente = ?";
	        PreparedStatement consultaStatement = con.prepareStatement(consulta);
	        consultaStatement.setString(1, num_expediente);
	        ResultSet resultado = consultaStatement.executeQuery();

	        if (resultado.next()) {
	            JOptionPane.showMessageDialog(null, "El alumno ya está creado", "Error", JOptionPane.ERROR_MESSAGE);
	            return; // Salir del método sin ejecutar la inserción
	        }

			// Crear sentencia SQL INSERT
			String sql = "INSERT INTO alumno (nombre_alumno, apellido_alumno, num_expediente) VALUES (?, ?, ?)";

			// Preparar la sentencia SQL
			PreparedStatement statement = con.prepareStatement(sql);
			statement.setString(1, nombre_alumno);
			statement.setString(2, apellido_alumno);
			statement.setString(3, num_expediente);

			// Ejecutar la sentencia SQL
			int filasInsertadas = statement.executeUpdate();

			//Creamos un if para mostrar si el alumno se a insertado correctamente o no
			if (filasInsertadas > 0) {
				System.out.println("Alumno creado correctamente");
			} else {
				System.out.println("No se pudo crear el alumno");
			}

			// Cerramos la conexión
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Creamos metodo relacionarProyectoAlumno para relacionar los datos del proyecto con los del alumno
	 * @param nombreProyecto nombre del proyecto
	 * @param nombresAlumnos nombre del alumno
	 * @throws SQLException Si ocurre algún error de SQL.
	 */
	public static void relacionarProyectoAlumno(String nombreProyecto, ArrayList<String> nombresAlumnos) {
		//Establecemos la conexión
		getConexion();
		
		//Creamos un try para capturar las posibles excepciones 
		try {
			//Creamos la consulta SELECT
			String proyectoQuery = "SELECT id_proyecto FROM proyectos WHERE nombre_proyecto = ?";
			try (PreparedStatement proyectoStmt = con.prepareStatement(proyectoQuery)) {
				proyectoStmt.setString(1, nombreProyecto);
				//El metodo executeQuery lo utilizamos para realizar sentencias de tipo SELECT en la base de datos
				//y devuelve un objeto resultset.
				ResultSet proyectoResult = proyectoStmt.executeQuery();

				
				if (proyectoResult.next()) {
					int idProyecto = proyectoResult.getInt("id_proyecto");
					String realizaQuery = "INSERT INTO realiza (id_alumno, id_proyecto) VALUES (?, ?)";
					try (PreparedStatement realizaStmt = con.prepareStatement(realizaQuery)) {
						for (String alumno : nombresAlumnos) {
							String[] nombres = alumno.split(" ");
							String nombreAlumno = nombres[0];
							String apellidoAlumno = nombres[1];

							String alumnoQuery = "SELECT id_alumno FROM alumno WHERE nombre_alumno = ? AND apellido_alumno = ?";
							try (PreparedStatement alumnoStmt = con.prepareStatement(alumnoQuery)) {
								alumnoStmt.setString(1, nombreAlumno);
								alumnoStmt.setString(2, apellidoAlumno);
								//El metodo executeQuery lo utilizamos para realizar sentencias de tipo SELECT en la base de datos
								//y devuelve un objeto resultset.
								ResultSet alumnoResult = alumnoStmt.executeQuery();

								if (alumnoResult.next()) {
									int idAlumno = alumnoResult.getInt("id_alumno");
									realizaStmt.setInt(1, idAlumno);
									realizaStmt.setInt(2, idProyecto);
									realizaStmt.executeUpdate();
								}
							}
						}
					}
				}
			}
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Creamos metodo rellenarDatosModificar para rellenar datos de la ventana modificar
	 * @param ventana Ventana editar
	 * @param nombreProyecto nombre del proyecto
	 */
	public static void rellenarDatosModificar(VentanaEditar ventana, String nombreProyecto) {
		//Establecemos la conexion
		getConexion();
		try {
			//Creamos la consulta SELECT
			String query = "SELECT nombre_proyecto, url, nota FROM proyectos WHERE nombre_proyecto = ?";
			PreparedStatement statement = con.prepareStatement(query);
			statement.setString(1, nombreProyecto);
			//El metodo executeQuery lo utilizamos para realizar sentencias de tipo SELECT en la base de datos
			//y devuelve un objeto resultset.
			ResultSet rs = statement.executeQuery();
			//Creamos un if en el que cogemos el texto las variables de la clase ventana
			if (rs.next()) {
				ventana.getNombre().setText(rs.getString("nombre_proyecto"));
				ventana.getNota().setText(rs.getString("nota"));
				ventana.getUrl().setText(rs.getString("url"));
				ventana.getLbldatonombreAntiguo().setText(rs.getString("nombre_proyecto"));
				ventana.getLbldatonotaAntiguo().setText(rs.getString("nota"));
				ventana.getLbldatourlAntiguo().setText(rs.getString("url"));
			}
			
			//Cerramos la conexion
			cerrarConexion();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Creamos metodo actualizarProyecto para actualizar los datos del proyecto
	 * @param nombreProyecto nombre del proyecto
	 * @param nuevoNombre nuevo nombre del proyecto
	 * @param nuevaUrl nueva url del proyecto
	 * @param nuevaNota nueva nota del proyecto
	 */
	public static void actualizarProyecto(String nombreProyecto, String nuevoNombre, String nuevaUrl, String nuevaNota) {
		//Establecemos la conexion
	    getConexion();
	    //Creamos un try para capturar las posibles excepciones 
	    try {
	    	//Creamos la consulta UPDATE para actualizar los datos de la base de datos
	        String query = "UPDATE proyectos SET nombre_proyecto = ?, url = ?, nota = ? WHERE nombre_proyecto = ?";
	        PreparedStatement statement = con.prepareStatement(query);
	        statement.setString(1, nuevoNombre);
	        statement.setString(2, nuevaUrl);
	        statement.setString(3, nuevaNota);
	        statement.setString(4, nombreProyecto);
	        //Creamos variable filasActualizadas y hacemos executeUpdate que utilizamos para
	        //ejecurtar diferentes sentencias sql las cuales realizan cambios en la base de datos.
	        int filasActualizadas = statement.executeUpdate();
	        
	        //Creamos un if para mostrar si se han actualizado correctamente o no
	        if (filasActualizadas > 0) {
	            System.out.println("Proyecto actualizado correctamente.");
	        } else {
	            System.out.println("No se encontró el proyecto a actualizar.");
	        }
	        cerrarConexion();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
