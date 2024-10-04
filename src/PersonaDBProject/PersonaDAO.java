package PersonaDBProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonaDAO {
	
	public void insertarPersona(String nombre, String apellido, int edad, String email) {
		Connection conexion = ConexionDB.conectar();
		String sql = "INSERT INTO persona (nombre, apellido, edad, email) VALUES(?, ?, ?, ?)";
		
		try {
			PreparedStatement statement = conexion.prepareStatement(sql);
			statement.setString(1, nombre);
			statement.setString(2, apellido);
			statement.setInt(3, edad);
			statement.setString(4, email);
			int filasinsertadas = statement.executeUpdate();
			if (filasinsertadas > 0){
				System.out.println("Filas insertadas correctamente");				
			}
			
		}catch(SQLException e){
			System.out.println("Error al insertar persona" + e.getMessage());
		}
		
	}
	
	public void mostrarPersonas() {
		Connection conexion = ConexionDB.conectar();
		String sql = "SELECT * FROM persona";
		
		try {
			PreparedStatement statement = conexion.prepareStatement(sql);
			ResultSet resultado = statement.executeQuery();
			while (resultado.next()) {
				System.out.println("ID: " + resultado.getInt("id"));
                System.out.println("Nombre: " + resultado.getString("nombre"));
                System.out.println("Apellido: " + resultado.getString("apellido"));
                System.out.println("Edad: " + resultado.getInt("edad"));
                System.out.println("Email: " + resultado.getString("email"));
                System.out.println("----------------------------");
			}
			
		} catch (SQLException e ) {
			System.out.println("Error al mostrar personas " + e.getMessage());
		}
	}

}
