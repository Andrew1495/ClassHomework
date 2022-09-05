import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void before(){
        calc = new Calculator();
    }


    @Test
    public void add(){
        assertEquals(10, calc.add(5,5));
    }
    @Test
    public void subtract(){
        assertEquals(5, calc.sub(10,5));
    }
    @Test
    public void mutiply(){
        assertEquals(25, calc.mutiply(5,5));
    }
    @Test
    public void divide(){
        assertEquals(5, calc.divide(10,2), 0.0);
    }

}
