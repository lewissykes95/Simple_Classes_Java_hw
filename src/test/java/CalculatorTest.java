import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;


    @Before
    public void before(){
        calculator = new Calculator(8, 7, 12.00, 3.00);
    }


    @Test
    public void canAdd (){
        assertEquals(15, calculator.getAdd());
    }

    @Test public void canSubtract () {
        assertEquals(1, calculator.getSubtract());
    }

    @Test public void canMultiply () {
        assertEquals(56, calculator.getMultiply());
    }

    @Test public void canDivide () {
        assertEquals(4.00, calculator.getDivide(), 0.0);
    }



}
