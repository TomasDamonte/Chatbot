import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

import com.mysql.jdbc.Statement;

public class ConnectionManager {

	private final static String url = "jdbc:mysql://localhost:3306/chatbot";    
	private final static String username = "root";   
	private final static String password = "";
	
	public static LinkedList<Libro> getLibrosTodos() { 
		LinkedList<Libro> libros = new LinkedList<>();
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from biblioteca");
			while (rs.next()) {
				String titulo = rs.getString(2);	
				String autor = rs.getString(3);
				String editorial = rs.getString(4);
				String categoria = rs.getString(5);
				Libro libro = new Libro (titulo,autor,editorial,categoria);
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
	
	public static LinkedList<Libro> getLibrosTitulo(String str) { 
		LinkedList<Libro> libros = new LinkedList<>();
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from biblioteca where titulo like '%"+str+"%'");
			while (rs.next()) {
				String titulo = rs.getString(2);	
				String autor = rs.getString(3);
				String editorial = rs.getString(4);
				String categoria = rs.getString(5);
				Libro libro = new Libro (titulo,autor,editorial,categoria);
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
	
	public static LinkedList<Libro> getLibrosAutor(String str) { 
		LinkedList<Libro> libros = new LinkedList<>();
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from biblioteca where autor like '%"+str+"%'");
			while (rs.next()) {
				String titulo = rs.getString(2);	
				String autor = rs.getString(3);
				String editorial = rs.getString(4);
				String categoria = rs.getString(5);
				Libro libro = new Libro (titulo,autor,editorial,categoria);
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
	
	public static LinkedList<Libro> getLibrosEditorial(String str) { 
		LinkedList<Libro> libros = new LinkedList<>();
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from biblioteca where editorial like '%"+str+"%'");
			while (rs.next()) {
				String titulo = rs.getString(2);	
				String autor = rs.getString(3);
				String editorial = rs.getString(4);
				String categoria = rs.getString(5);
				Libro libro = new Libro (titulo,autor,editorial,categoria);
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
	
	public static LinkedList<Libro> getLibrosCategoria(String str) { 
		LinkedList<Libro> libros = new LinkedList<>();
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery("select * from biblioteca where categoria like '%"+str+"%'");
			while (rs.next()) {
				String titulo = rs.getString(2);	
				String autor = rs.getString(3);
				String editorial = rs.getString(4);
				String categoria = rs.getString(5);
				Libro libro = new Libro (titulo,autor,editorial,categoria);
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
	
	public static void setRespuesta(String str) {
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			stmt.executeUpdate("insert into respuestas (idRespuesta, descripcion) values (null, '"+str+"')");
			stmt.close();
			conn.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public static String getRespuesta(String id) { 
		String respuesta = "";
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery("select descripcion from respuestas where idRespuesta = '"+id+"'");
			while (rs.next()) {
				respuesta = rs.getString(1);
			}
			stmt.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return respuesta;
	}
	
	public static void setConsulta(String consulta) {
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			stmt.executeUpdate("insert into consultas (idConsulta, consulta) values (null, '"+consulta+"')");
			stmt.close();
			conn.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public static String getConsulta(String id) {
		String respuesta = "";
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery("select consulta from consultas where idConsulta = '"+id+"'");
			while (rs.next()) {
				respuesta = rs.getString(1);
			}
			stmt.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return respuesta;
	}
	
	public static ArrayList<String> getCategorias() { 
		ArrayList<String> respuesta = new ArrayList<String>();
		try {
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT DISTINCT categoria FROM biblioteca");
			while (rs.next()) {				
				respuesta.add(rs.getString(1));				
			}
			stmt.close();
			conn.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return respuesta;
	}
	
}