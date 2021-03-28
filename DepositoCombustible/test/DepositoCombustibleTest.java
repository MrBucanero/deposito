import static org.junit.Assert.*;

import org.junit.Test;

public class DepositoCombustibleTest {
	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible dc = new DepositoCombustible(50.0, 32.0);
		double nivel = dc.getDepositoNivel();
		assertEquals(32.0, nivel, 0);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible dc = new DepositoCombustible(50.0, 32.0);
		double max = dc.getDepositoMax();
		assertEquals(50.0, max, 0);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible dc = new DepositoCombustible(50.0, 0.0);
		assertTrue(dc.estaVacio());
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible dc = new DepositoCombustible(50.0, 25.0);
		assertTrue(dc.estaLleno());
	}


}
