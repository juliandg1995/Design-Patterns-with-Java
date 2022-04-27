package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SocioTest {
	
	private Socio unSocio;
	private String nombre;
	private String email;
	private String legajo; 

	@BeforeEach
	void setUp() throws Exception {
		nombre = "Carlos Saul Menem";
		email = "nolosvoyadefraudar@hotmail.com";
		legajo = "1234567/00";
		unSocio = new Socio(nombre,email,legajo);
	}

	@Test
	void testGetNombre() {
		assertEquals(nombre,unSocio.getNombre());
		assertNotEquals("Este no es Menem", unSocio.getNombre());
	}
	
	@Test
	void testGetEmail() {
		assertEquals(email, unSocio.getEmail());
		assertNotEquals("unMailFalso@coldmail.com", unSocio.getEmail());
	}
	
	@Test
	void testGetLegajol() {
		assertEquals(legajo, unSocio.getLegajo());
		assertNotEquals("00000000", unSocio.getLegajo());
	}
	
	@Test
	void testSetNombre() {
		this.nombre = "Mauricio Macri";
		unSocio.setNombre(nombre);
		assertEquals("Mauricio Macri", unSocio.getNombre());
		assertNotEquals("Carlos Saul Menem", unSocio.getNombre());
	}
	
	@Test
	void testSetEmail() {
		this.email = "otroEmail@boobaloo.com";
		unSocio.setEmail(email);
		assertEquals("otroEmail@boobaloo.com", unSocio.getEmail());
		assertNotEquals("nolosvoyadefraudar@hotmail.com", unSocio.getEmail());
	}
	
	@Test
	void testSetLegajo() {
		this.legajo = "8765432/10";
		unSocio.setLegajo(legajo);
		assertEquals("8765432/10", unSocio.getLegajo());
		assertNotEquals("1234567/00", unSocio.getEmail());
	}

}
