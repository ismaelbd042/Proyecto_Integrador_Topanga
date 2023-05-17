package conexionBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modelo.ProyectosIntegradores;

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
	
//	public int registrar(ProyectosIntegradores proyectos, AccesoBBDD accesoBBDD) {
//		int rs = 0;
//		String sql = "INSERT INTO proyectos VALUES (?,?,?,?,?)";
//		
//		try (java.sql.PreparedStatement ps = accesoBBDD.getConexion().prepareStatement(sql)){
//			ps.setString(1, proyectos.getNombre_proyecto());
//			ps.setInt(2, proyectos.getAño());
//			ps.setString(3, proyectos.getURL());
//			ps.setInt(4, proyectos.getNota());
//			ps.setString(5, proyectos.getGrupo());
//			
//			
//			rs = ps.executeUpdate();
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		return rs;
//	}
}