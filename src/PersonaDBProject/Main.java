package PersonaDBProject;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PersonaDAO personaDAO = new PersonaDAO();
		Scanner sc = new Scanner(System.in);
		
		//insertar personas
		System.out.println("Ingrese el nombre");
		String nombre = sc.nextLine();
		System.out.println("Ingrese el apellido");
		String apellido = sc.nextLine();
		System.out.println("Ingrese la edad");
		int edad = sc.nextInt();
		sc.nextLine();  // Limpiar buffer
		System.out.println("Ingrese el email");
		String email = sc.nextLine();
		
		personaDAO.insertarPersona(nombre, apellido, edad, email);
		
		// mostrar personas
		
		System.out.println("Personas en la base de datos: ");
		personaDAO.mostrarPersonas();
		

	}

}
