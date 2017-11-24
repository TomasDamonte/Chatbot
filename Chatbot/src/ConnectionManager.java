import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.mysql.jdbc.Statement;

public class ConnectionManager {

	private static String url = "jdbc:mysql://localhost:3306/chatbot";    
	private static String username = "root";   
	private static String password = "";
	
	public static LinkedList<Libro> getLibros() { 
		LinkedList<Libro> libros = new LinkedList<>();
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from biblioteca");
			while (rs.next()) {
				String titulo = rs.getString(2);	
				String autor = rs.getString(3);
				String editorial = rs.getString(4);
				String genero = rs.getString(5);
				String fechaPublicacion = rs.getString(6);
				Libro libro = new Libro (titulo,autor,editorial,genero,fechaPublicacion);
				libros.add(libro);
			}
			stmt.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return libros;
	}
}