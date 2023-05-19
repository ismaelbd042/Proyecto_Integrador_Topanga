package conexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

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

	public static void prueba() {

		try {
			Statement statement = con.createStatement();
			// Creamos la query
			String query = "select * from alumno";
			// Guardamos en un Resultset la ejecución de la query anterior
			ResultSet resultado = statement.executeQuery(query);
			while (resultado.next()) {
				System.out.println(resultado.getString("nombre_alumno"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

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

	public static ArrayList<String> seleccionarAreas() {
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

}