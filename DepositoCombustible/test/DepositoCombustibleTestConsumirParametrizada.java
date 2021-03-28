import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;;

@RunWith(Parameterized.class)
public class DepositoCombustibleTestConsumirParametrizada {
	private double nivel;//nivel del depósito
	private double amount;//cantidad a consumir
	private double res;//resultado esperado

	public DepositoCombustibleTestConsumirParametrizada(double n1, double n2, double r) {
		nivel=n1;
		amount=n2;
		res=r;
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][]{
			{50.0, 10.0, 40.0},{50.0, 40.0, 10.0},{50.0, 60.0, 0.0},{50.0, -10.0, 60.0},{50.0, 0.0, 50.0},{50.0, 24.5, 25.5}
		});
	}
	
	
	@Test
	public void testConsumir() {
		DepositoCombustible dc = new DepositoCombustible(100.0, nivel);//He asignado 100 al max de depósito porque no importa al comprobar consumir
		dc.consumir(amount);
		assertEquals(res,dc.getDepositoNivel(), 0);
	}
	
}
