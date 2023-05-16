package conexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoBBDD {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/proyectointegrador";
	private String usuario = "root";
	private String pwd = "rootroot";
	private Connection con = null;

	/**
	 * Método getConexion() que se encarga de crear la conexión con la base de datos
	 * 
	 * @return objeto de tipo Connection
	 */
	public Connection getConexion() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, usuario, pwd);

		} catch (Exception e) {
			System.out.println("Error al establecer conexión con BBDD:");
			e.printStackTrace();
		}

		return con;
	}

	public void prueba() {
		
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
	public void cerrarConexion() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Error al cerrar BBDD");
			e.printStackTrace();
		}
	}
}