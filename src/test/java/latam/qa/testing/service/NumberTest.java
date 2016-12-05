package latam.qa.testing.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void creatingString_twoSimpleNumbers_ReturnStringWithCommaBetween(){
        Number n = new Number();
        String result = n.stringCalc(1, 2);
        assertEquals(String.format("%d,%d", 1, 2), result);

    }
	@Test
    public void creatingString_twoSimpleNumbers_mustFail(){
        Number n = new Number();
        String result = n.stringCalc(1, 2);
        assertFalse(String.format("%d,%d", 1, 5), result);

    }
	@Test(expected=ArithmeticException.class)
	public void divideNumeros_cero(){
		Number n = new Number();
		n.divideNumeros(4,0)
		
	}
	@Test
	public void divideNumeros(){		
		Number n = new Number();
		assertEquals(5,n.divideNumeros(20,4))
		
		
	}
   
}