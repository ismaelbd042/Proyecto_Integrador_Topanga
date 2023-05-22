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

//	public static void prueba() {
//
//		try {
//			Statement statement = con.createStatement();
//			// Creamos la query
//			String query = "select * from alumno";
//			// Guardamos en un Resultset la ejecución de la query anterior
//			ResultSet resultado = statement.executeQuery(query);
//			while (resultado.next()) {
//				System.out.println(resultado.getString("nombre_alumno"));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}

	/**
	 * 
	 */
	public static void cerrarConexion() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Error al cerrar BBDD");
			e.printStackTrace();
		}
	}

	public int registrar(ProyectosIntegradores proyectos) {
		int rs = 0;
		String sql = "INSERT INTO proyectos VALUES (?,?,?,?,?,?,?,?,?)";

		try (PreparedStatement ps = getConexion().prepareStatement(sql)) {
			ps.setString(1, proyectos.getNombre_proyecto());
			ps.setString(2, proyectos.getURL());
			ps.setInt(3, proyectos.getComponentes());
			ps.setInt(4, proyectos.getAño());
			ps.setString(5, proyectos.getCurso());
			ps.setString(6, proyectos.getGrupo());
			ps.setInt(7, proyectos.getNota());
			ps.setInt(8, proyectos.getCod_area());
			// ps.setInt(9, proyectos.getAlumnoRealizaProyecto());

			rs = ps.executeUpdate();

		} catch (Exception e) {
			// TODO: handle exception
		}

		return rs;
	}

	public static ArrayList<String> conseguirAreas() {
		getConexion();
		ArrayList<String> nombreAreas = new ArrayList<>();

		try {
			Statement statement = con.createStatement();
			String query = "SELECT nombre_area FROM area";
			ResultSet resultado = statement.executeQuery(query);

			while (resultado.next()) {
				nombreAreas.add(resultado.getString(1));
			}
			cerrarConexion();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return nombreAreas;
	}

	public static ProyectosIntegradores conseguirInfo(String nombre) {
		getConexion();
		ProyectosIntegradores datosProyecto = null;

		try {
			Statement statement = con.createStatement();
			String query = "SELECT * FROM proyectos WHERE nombre_proyecto = ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, nombre);
			ResultSet resultado = pstmt.executeQuery();

			if (resultado.next()) {
				datosProyecto = new ProyectosIntegradores(resultado.getString("nombre_proyecto"),
						resultado.getString("URL"), resultado.getInt("componentes"), resultado.getInt("año"),
						resultado.getString("curso"), resultado.getString("grupo"), resultado.getInt("nota"),
						resultado.getInt("cod_area"));

				datosProyecto.setUltima_modificacion(resultado.getString("ultima_modificacion"));
			}

			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return datosProyecto;
	}

	public static ArrayList<String> conseguirNombresProyectos() {
		getConexion();
		ArrayList<String> nombresProyectos = new ArrayList<>();

		try {
			Statement statement = con.createStatement();
			String query = "SELECT nombre_proyecto FROM proyectos";
			ResultSet resultado = statement.executeQuery(query);

			while (resultado.next()) {
				String nombre_proyecto = resultado.getString("nombre_proyecto");
				nombresProyectos.add(nombre_proyecto);
			}

			cerrarConexion();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nombresProyectos;
	}

	public static ArrayList<String> conseguirNombresProyectosLupa(String nombreBuscado, int area) {
		getConexion();
		ArrayList<String> nombresProyectos = new ArrayList<>();

		try {
			String query = "SELECT nombre_proyecto FROM proyectos where nombre_proyecto like '%" + nombreBuscado
					+ "%' and cod_area = " + area;
			Statement statement = con.createStatement();
			ResultSet resultado = statement.executeQuery(query);

			while (resultado.next()) {
				String nombre_proyecto = resultado.getString("nombre_proyecto");
				nombresProyectos.add(nombre_proyecto);
			}

			cerrarConexion();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nombresProyectos;
	}

	public static ArrayList<String> conseguirColaboradores(String proyecto) {
		getConexion();
		ArrayList<String> lista = new ArrayList<>();
		String query = "SELECT alumno.nombre_alumno, alumno.apellido_alumno " + "FROM alumno "
				+ "JOIN realiza ON alumno.id_alumno = realiza.id_alumno "
				+ "JOIN proyectos ON realiza.id_proyecto = proyectos.id_proyecto "
				+ "WHERE proyectos.nombre_proyecto = ?";
		try (PreparedStatement pstmt = con.prepareStatement(query)) {
			pstmt.setString(1, proyecto);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String nombreAlumno = rs.getString("nombre_alumno");
				String apellidoAlumno = rs.getString("apellido_alumno");
				lista.add(nombreAlumno + " " + apellidoAlumno);
			}
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return lista;

	}

	public static boolean borrarProyecto(String nombreProyecto) {
		getConexion();
		try {
			// Preparar la sentencia SQL DELETE
			String query = "DELETE FROM proyectos WHERE nombre_proyecto = ?";
			PreparedStatement statement = con.prepareStatement(query);

			// Establecer el valor del parámetro en la sentencia SQL
			statement.setString(1, nombreProyecto);

			// Ejecutar la sentencia SQL DELETE
			int filasAfectadas = statement.executeUpdate();
			cerrarConexion();
			return filasAfectadas > 0; // Verificar si se eliminó alguna fila

		} catch (SQLException e) {
			e.printStackTrace();
			return false; // Error al ejecutar la sentencia SQL
		}

	}

	public static ArrayList<String> conseguirNombresyApellidos(String nombreAlumno) {
		getConexion();
		ArrayList<String> nombresAlumnos = new ArrayList<>();

		try {
			Statement statement = con.createStatement();
			String query = "SELECT nombre_alumno, apellido_alumno, num_expediente FROM alumno WHERE CONCAT(nombre_alumno, ' ', apellido_alumno) LIKE '%"
					+ nombreAlumno + "%' OR num_expediente LIKE '" + nombreAlumno + "%'";

			ResultSet resultado = statement.executeQuery(query);

			while (resultado.next()) {
				String nombreApellido = resultado.getString("nombre_alumno") + " "
						+ resultado.getString("apellido_alumno") + " (" + resultado.getString("num_expediente") + ")";
				nombresAlumnos.add(nombreApellido);
			}

			cerrarConexion();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return nombresAlumnos;
	}

	public static void crearAlumno(String nombre_alumno, String apellido_alumno, String num_expediente) {
		try {
			// Establecer conexión con la base de datos
			getConexion();

			if (nombre_alumno.isEmpty() || apellido_alumno.isEmpty() || num_expediente.isEmpty()) {
				JOptionPane.showMessageDialog(null, "No se consiguió subir", "Aviso", JOptionPane.WARNING_MESSAGE);
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

			if (filasInsertadas > 0) {
				System.out.println("Alumno creado correctamente");
			} else {
				System.out.println("No se pudo crear el alumno");
			}

			// Cerrar la conexión
			cerrarConexion();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void relacionarProyectoAlumno(String nombreProyecto, ArrayList<String> nombresAlumnos) {
		getConexion();
		try {
			String query = "INSERT INTO realiza (id_alumno, id_proyecto) SELECT a.id_alumno, p.id_proyecto FROM alumno a, proyectos p WHERE a.nombre_alumno IN (";

			for (int i = 0; i < nombresAlumnos.size(); i++) {
				query += "?";
				if (i < nombresAlumnos.size() - 1) {
					query += ",";
				}
			}

			query += ") AND p.nombre_proyecto = ?";

			PreparedStatement pstmt = con.prepareStatement(query);
			for (int i = 0; i < nombresAlumnos.size(); i++) {
				pstmt.setString(i + 1, nombresAlumnos.get(i));
			}

			pstmt.setString(nombresAlumnos.size() + 1, nombreProyecto);

			int rowsAffected = pstmt.executeUpdate();
			if (rowsAffected > 0) {
				System.out.println("Relación creada correctamente.");
			} else {
				System.out.println("No se encontró el proyecto o los alumnos especificados.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
