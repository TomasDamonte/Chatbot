import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestConnectionManager {
	
	private String expected = "Titulo: El pistolero Autor: Stephen King Editorial: El Ateneo Genero: Fantasía Fecha de publicacion: 1982-11-08";

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetLibrosTodos() {
		assertEquals(expected,ConnectionManager.getLibrosTodos().get(0).toString());		
	}
	
	@Test
	void testGetLibrosTitulo() {
		assertEquals(expected,ConnectionManager.getLibrosTitulo("stol").get(0).toString());		
	}
	
	@Test
	void testGetLibrosAutor() {
		assertEquals(expected,ConnectionManager.getLibrosAutor("phe").get(0).toString());		
	}
	
	@Test
	void testGetLibrosMateria() {
		assertEquals(expected,ConnectionManager.getLibrosMateria("gramac").get(0).toString());		
	}

}
