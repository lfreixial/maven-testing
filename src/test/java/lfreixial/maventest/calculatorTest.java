package test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class calculatorTest {

    calculator calculator = new calculator();
    
    @Test
    public void testMultiply()
    {
        
        assertEquals("Testing",20 ,calculator.multiply(4, 5), 0.000000001d);

    }
}
