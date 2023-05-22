package conexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JList;

import modelo.Alumnos;
import modelo.ProyectosIntegradores;
import vista.VentanaInfo;

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

	public int registrar(ProyectosIntegradores proyectos, AccesoBBDD accesoBBDD) {
		int rs = 0;
		String sql = "INSERT INTO proyectos VALUES (?,?,?,?,?,?,?,?,?)";

		try (PreparedStatement ps = accesoBBDD.getConexion().prepareStatement(sql)) {
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
		ProyectosIntegradores datosProyecto = new ProyectosIntegradores("", "", 0, 0, "", "", 0, 0, null);

		try {
			Statement statement = con.createStatement();
			String query = "select url from proyectos where nombre_proyecto = '" + nombre + "'";
			ResultSet resultado = statement.executeQuery(query);
			datosProyecto.setURL(resultado.toString());
//			ventana.setLblurl2((JLabel) resultado);

//			query = "select componentes from proyectos where nombre_proyecto = '" + nombre + "'";
//			resultado = statement.executeQuery(query);
//			ventana.setlbl((JLabel) resultado);

			query = "select ultima_modificacion from proyectos where nombre_proyecto = '" + nombre + "'";
			resultado = statement.executeQuery(query);
			datosProyecto.setUltima_modificacion(resultado.toString());
//			ventana.setLblUltimaModi2((JLabel) resultado);

			query = "select año from proyectos where nombre_proyecto = '" + nombre + "'";
			resultado = statement.executeQuery(query);
			datosProyecto.setAño(Integer.parseInt(resultado.toString()));
//			ventana.setLblAno2((JLabel) resultado);

			query = "select curso from proyectos where nombre_proyecto = '" + nombre + "'";
			resultado = statement.executeQuery(query);
			datosProyecto.setCurso(resultado.toString());
//			ventana.setLblCurso2((JLabel) resultado);

			query = "select grupo from proyectos where nombre_proyecto = '" + nombre + "'";
			resultado = statement.executeQuery(query);
			datosProyecto.setGrupo(resultado.toString());
//			ventana.setLblGrupo2((JLabel) resultado);

			query = "select nota from proyectos where nombre_proyecto = '" + nombre + "'";
			resultado = statement.executeQuery(query);
			datosProyecto.setNota(Integer.parseInt(resultado.toString()));
//			ventana.setLblNota2((JLabel) resultado);

			query = "select cod_area from proyectos where nombre_proyecto = '" + nombre + "'";
			resultado = statement.executeQuery(query);
			datosProyecto.setCod_area(Integer.parseInt(resultado.toString()));
//			ventana.setLblurl2((JLabel) resultado);

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
	    	String query = "SELECT nombre_proyecto FROM proyectos where nombre_proyecto like '%" + nombreBuscado + "%' and cod_area = " + area;
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

	public ArrayList<String> conseguirColaboradores(ProyectosIntegradores proyecto) {
		int idProyecto = 0;
		ArrayList<String> lista = null;
		try {
			String query = "SELECT alumno.nombre_alumno, alumno.apellido_alumno " + "FROM alumno "
					+ "JOIN realiza ON alumno.id_alumno = realiza.id_alumno " + "WHERE realiza.id_proyecto = ?";

			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, idProyecto);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				String nombreAlumno = rs.getString("nombre_alumno");
				String apellidoAlumno = rs.getString("apellido_alumno");
				lista.add(nombreAlumno + " " + apellidoAlumno);
				System.out.println("Nombre: " + nombreAlumno + " " + apellidoAlumno);
			}
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

            return filasAfectadas > 0; // Verificar si se eliminó alguna fila
        } catch (SQLException e) {
            e.printStackTrace();
            return false; // Error al ejecutar la sentencia SQL
        }
	}

}
