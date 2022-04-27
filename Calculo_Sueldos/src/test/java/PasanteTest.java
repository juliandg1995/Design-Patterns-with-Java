import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unlp.info.oo2.Calculo_Sueldos.Pasante;

class PasanteTest {

	Pasante pasante;
	
	@BeforeEach
	void setup() {
		pasante = new Pasante("Carlos", 20000.0, 2);
	}
	
	@Test
	void calcularSueldoBase() {
		assertEquals(20000.0,pasante.calcularSueldoBase());
	}
	
	@Test
	void calcularAdicional() {
		assertEquals(4000.0,pasante.calcularAdicional());
	}

}
