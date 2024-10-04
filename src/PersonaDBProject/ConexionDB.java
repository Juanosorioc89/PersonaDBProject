package PersonaDBProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	
	private static final String url = "jdbc:mysql://localhost:3306/personas_db";
	private static final String usuario = "root";
	private static final String CLAVE = "";
	
	public static Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(url, usuario, CLAVE);
			System.out.println("La conexión ha sido exitosa");
		} catch(SQLException e) {
			System.out.println("Error al conectar la base de datos" + e.getMessage());
		}
		
		return conexion;
	}

}
