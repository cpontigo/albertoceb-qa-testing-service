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
	@Test
	public void divideNumeros_cero(){
		Number n = new Number();
		int x=5,y=0;
		Int result = n.intDivideNumeros(x,y);
		if(y==0) fail();
		
	}
	
	@Test
	public void divideNumeros(){
		Number n = new Number();
		Int result = n.intDivideNumeros(5,10);
		//assertEquals
		
	}
   
}