import junit.framework.TestCase;
import org.junit.runner.JUnitCore;

public class MoneyTest extends TestCase 
{
    @Test
  	public void testCurrency() 
    {
		assertEquals("USD", Money.dollar(1).currency());
		assertEquals("CHF", Money.franc(1).currency());
	}

    @Test
    public void testEquality() 
    {
		assertTrue(Money.dollar(5).equals(Money.dollar(5)));
		assertFalse(Money.dollar(5).equals(Money.dollar(6)));
		assertFalse(Money.franc(5).equals(Money.dollar(5)));
	}
}