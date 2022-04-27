package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class VorheesExporterTest {
	
	private Socio unSocio;
	private List<Socio> listaDeSocios;
//	private VorheesExporter exporter;

	@BeforeEach
	void setUp() { 
		listaDeSocios.add(new Socio("Menem","menemcarlos@hotmail.com","1234567/89"));
		listaDeSocios.add(new Socio("Sergio Massa", "massateamasa@gmail.com", "6666666/66"));
		listaDeSocios.add(new Socio("Milei", "elmatazurdos@hotmail.com", "0000000/00"));
	}

	@Test
	void testExportar() {
		
	}

}
