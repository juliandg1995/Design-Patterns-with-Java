import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo2.Calculo_Sueldos.Temporario;

class TemporarioTest {

	Temporario temporario;
	
	@BeforeEach
	void setup() {
		temporario = new Temporario("Carlos", 20000.0, 1, true, 2);
	}
	
	@Test
	void calcularSueldoBase() {
		assertEquals(20600.0,temporario.calcularSueldoBase());
	}
	
	@Test
	void calcularAdicional() {
		assertEquals(7000.0,temporario.calcularAdicional());
	}
	
	@Test
	void adicionalPorCasadoConHijos() {
		assertEquals(7000.0,temporario.adicionalPorCasadoConHijos());
	}

}
