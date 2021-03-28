import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DepositoCombustibleTest.class, DepositoCombustibleTestConsumirParametrizada.class,
		DepositoCombustibleTestLlenarParametrizada.class })
public class PruebasTest {

}
