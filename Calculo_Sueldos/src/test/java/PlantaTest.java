import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unlp.info.oo2.Calculo_Sueldos.Planta;

class PlantaTest {

	Planta planta;
	
	@BeforeEach
	void setup() {
		planta = new Planta("Carlos", 50000.0, true, 1, 3);
	}
	
	@Test
	void calcularSueldoBase() {
		assertEquals(50000.0,planta.calcularSueldoBase());
	}
	
	@Test
	void calcularAdicional() {
		assertEquals(13000.0,planta.calcularAdicional());
	}
	
	@Test
	void adicionalPorCasadoConHijos() {
		assertEquals(7000.0,planta.adicionalPorCasadoConHijos());
	}
}
